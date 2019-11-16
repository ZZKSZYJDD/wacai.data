package youkeda.mybit.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import youkeda.mybit.web.dao.ZhouyujunBillMapper;
import youkeda.mybit.web.dao.ZhouyujunBlogsMapper;
import youkeda.mybit.web.dataobject.ZhouyujunBill;
import youkeda.mybit.web.dataobject.ZhouyujunBlogs;

import java.util.List;
@RestController
public class BlogsController {

    @Autowired
    ZhouyujunBlogsMapper zhouyujunBlogsMapper;

    @RequestMapping(path = "/add")
    public String add(){
        ZhouyujunBlogs zhouyujunBlogs = new ZhouyujunBlogs();
        zhouyujunBlogs.setBlogsAuthor("");
        zhouyujunBlogs.setBlogsCollection(111);
        zhouyujunBlogs.setBlogsId(111);
        zhouyujunBlogs.setBlogsTitle("");
        zhouyujunBlogs.setBlogsTxt("");
        zhouyujunBlogs.setBlogsView(111);
        zhouyujunBlogs.setBlogsComment(111);

        zhouyujunBlogsMapper.insert(zhouyujunBlogs);
        return "success";
    }
    @RequestMapping(path = "/selectAll")
    public List<ZhouyujunBlogs> selectAll(){
        List<ZhouyujunBlogs> zhouyujunBlogs = zhouyujunBlogsMapper.selectAll();
        return zhouyujunBlogs;
    }
    @RequestMapping(path = "/delete")
    public String dalete(){
        zhouyujunBlogsMapper.deleteByPrimaryKey(111);
        return "success";
    }
    @RequestMapping(path = "/update")
    public String update(){
        ZhouyujunBlogs zhouyujunBlogs = new ZhouyujunBlogs();
        zhouyujunBlogs.setBlogsAuthor("");
        zhouyujunBlogs.setBlogsCollection(111);
        zhouyujunBlogs.setBlogsId(111);
        zhouyujunBlogs.setBlogsTitle("");
        zhouyujunBlogs.setBlogsTxt("");
        zhouyujunBlogs.setBlogsView(111);
        zhouyujunBlogs.setBlogsComment(111);
        zhouyujunBlogsMapper.updateByPrimaryKey(zhouyujunBlogs);
        return "success";

    }

}
