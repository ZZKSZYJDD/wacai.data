package youkeda.mybit.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import youkeda.mybit.web.dataobject.ZhouyujunBill;
@Mapper
public interface ZhouyujunBillMapper {
    @Delete({
        "delete from zhouyujun_bill",
        "where bill_id = #{billId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer billId);

    @Insert({
        "insert into zhouyujun_bill (bill_id, bill_name, ",
        "bill_date, bill_money, ",
        "bill_content)",
        "values (#{billId,jdbcType=INTEGER}, #{billName,jdbcType=VARCHAR}, ",
        "#{billDate,jdbcType=TIMESTAMP}, now(), ",
        "#{billContent,jdbcType=LONGVARCHAR})"
    })
    int insert(ZhouyujunBill record);

    @Select({
        "select",
        "bill_id, bill_name, bill_date, bill_money, bill_content",
        "from zhouyujun_bill",
        "where bill_id = #{billId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="bill_id", property="billId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bill_name", property="billName", jdbcType=JdbcType.VARCHAR),
        @Result(column="bill_date", property="billDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="bill_money", property="billMoney", jdbcType=JdbcType.DOUBLE),
        @Result(column="bill_content", property="billContent", jdbcType=JdbcType.LONGVARCHAR)
    })
    ZhouyujunBill selectByPrimaryKey(Integer billId);

    @Select({
        "select",
        "bill_id, bill_name, bill_date, bill_money, bill_content",
        "from zhouyujun_bill"
    })
    @Results({
        @Result(column="bill_id", property="billId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bill_name", property="billName", jdbcType=JdbcType.VARCHAR),
        @Result(column="bill_date", property="billDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="bill_money", property="billMoney", jdbcType=JdbcType.DOUBLE),
        @Result(column="bill_content", property="billContent", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ZhouyujunBill> selectAll();

    @Update({
        "update zhouyujun_bill",
        "set bill_name = #{billName,jdbcType=VARCHAR},",
          "bill_date = #{billDate,jdbcType=TIMESTAMP},",
          "bill_money = #{billMoney,jdbcType=DOUBLE},",
          "bill_content = #{billContent,jdbcType=LONGVARCHAR}",
        "where bill_id = #{billId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ZhouyujunBill record);
}