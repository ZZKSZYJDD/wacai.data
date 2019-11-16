package youkeda.mybit.web.dataobject;

import java.util.Date;

/**
 * 
 * @date 2019/11/16
 */
public class ZhouyujunBill {
    /**
     * 编号
     */
    private Integer billId;

    /**
     * 名称
     */
    private String billName;

    /**
     * 日期
     */
    private Date billDate;

    /**
     * 金额
     */
    private Double billMoney;

    /**
     * 内容
     */
    private String billContent;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Double getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(Double billMoney) {
        this.billMoney = billMoney;
    }

    public String getBillContent() {
        return billContent;
    }

    public void setBillContent(String billContent) {
        this.billContent = billContent;
    }
}