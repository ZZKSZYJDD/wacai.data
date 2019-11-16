package youkeda.mybit.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import youkeda.mybit.web.dao.ZhouyujunBillMapper;
import youkeda.mybit.web.dao.ZhouyujunBloggerMapper;
import youkeda.mybit.web.dataobject.ZhouyujunBill;
import youkeda.mybit.web.dataobject.ZhouyujunBlogger;

import java.util.List;
@RestController
public class BloggerController {

    @Autowired
    ZhouyujunBloggerMapper zhouyujunBloggerMapper;

    @RequestMapping(path = "/add")
    public String add(){
        ZhouyujunBlogger zhouyujunBlogger = new ZhouyujunBlogger();
        zhouyujunBlogger.setBloggerId(111);
        zhouyujunBlogger.setBloggerName("");

        zhouyujunBlogger.setBloggerPwd("");
        zhouyujunBlogger.setBloggerSex("");
        zhouyujunBlogger.setBloggerTel("");

        zhouyujunBloggerMapper.insert(zhouyujunBlogger);
        return "success";
    }
    @RequestMapping(path = "/selectAll")
    public List<ZhouyujunBlogger> selectAll(){
        List<ZhouyujunBlogger> zhouyujunBloggers = zhouyujunBloggerMapper.selectAll();
        return zhouyujunBloggers;
    }
    @RequestMapping(path = "/delete")
    public String dalete(){
        zhouyujunBloggerMapper.deleteByPrimaryKey(111);
        return "success";
    }
    @RequestMapping(path = "/update")
    public String update(){

        ZhouyujunBlogger zhouyujunBlogger = new ZhouyujunBlogger();
        zhouyujunBlogger.setBloggerId(111);
        zhouyujunBlogger.setBloggerName("");

        zhouyujunBlogger.setBloggerPwd("");
        zhouyujunBlogger.setBloggerSex("");
        zhouyujunBlogger.setBloggerTel("");
        return "success";

    }

}
