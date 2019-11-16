package youkeda.mybit.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import youkeda.mybit.web.dao.ZhouyujunBillMapper;
import youkeda.mybit.web.dataobject.ZhouyujunBill;

import javax.validation.constraints.Min;
import java.util.List;

@RestController
public class BillController {
    @Autowired
    ZhouyujunBillMapper zhouyujunBillMapper;

    @RequestMapping(path = "/add")
    public String add(){
        ZhouyujunBill zhouyujunBill = new ZhouyujunBill();
        zhouyujunBill.setBillId(111);
        zhouyujunBill.setBillContent("浙江电信10元手机充值");

        zhouyujunBill.setBillMoney(10.0);
        zhouyujunBill.setBillName("生活其他");
        zhouyujunBillMapper.insert(zhouyujunBill);
        return "success";
    }
    @RequestMapping(path = "/selectAll")
    public List<ZhouyujunBill> selectAll(){
        List<ZhouyujunBill> zhouyujunBills = zhouyujunBillMapper.selectAll();
        return zhouyujunBills;
    }
    @RequestMapping(path = "/delete")
    public String dalete(){
        zhouyujunBillMapper.deleteByPrimaryKey(111);
        return "success";
    }
    @RequestMapping(path = "/update")
    public String update(){
        ZhouyujunBill zhouyujunBill = new ZhouyujunBill();
        zhouyujunBill.setBillId(111);
        zhouyujunBill.setBillContent("浙江电信10元手机充值");

        zhouyujunBill.setBillMoney(120.0);
        zhouyujunBill.setBillName("生活其他");
        zhouyujunBillMapper.updateByPrimaryKey(zhouyujunBill);
        return "success";

    }

}
