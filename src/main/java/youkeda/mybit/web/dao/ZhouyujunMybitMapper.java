package youkeda.mybit.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import youkeda.mybit.web.dataobject.ZhouyujunMybit;
@Mapper
public interface ZhouyujunMybitMapper {
    @Delete({
        "delete from zhouyujun_mybit",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into zhouyujun_mybit (id, gmt_created, ",
        "gmt_modified, from_user, ",
        "to_user, number, ",
        "message)",
        "values (#{id,jdbcType=INTEGER}, now(), ",
        "now(), #{fromUser,jdbcType=VARCHAR}, ",
        "#{toUser,jdbcType=VARCHAR}, #{number,jdbcType=INTEGER}, ",
        "#{message,jdbcType=VARCHAR})"
    })
    int insert(ZhouyujunMybit record);

    @Select({
        "select",
        "id, gmt_created, gmt_modified, from_user, to_user, number, message",
        "from zhouyujun_mybit",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gmt_created", property="gmtCreated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="from_user", property="fromUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_user", property="toUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="number", property="number", jdbcType=JdbcType.INTEGER),
        @Result(column="message", property="message", jdbcType=JdbcType.VARCHAR)
    })
    ZhouyujunMybit selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, gmt_created, gmt_modified, from_user, to_user, number, message",
        "from zhouyujun_mybit"
    })

//1111

    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gmt_created", property="gmtCreated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="from_user", property="fromUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_user", property="toUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="number", property="number", jdbcType=JdbcType.INTEGER),
        @Result(column="message", property="message", jdbcType=JdbcType.VARCHAR)
    })
    List<ZhouyujunMybit> selectAll();

    @Update({
        "update zhouyujun_mybit",
        "set ",
          "gmt_modified =now(),",
          "from_user = #{fromUser,jdbcType=VARCHAR},",
          "to_user = #{toUser,jdbcType=VARCHAR},",
          "number = #{number,jdbcType=INTEGER},",
          "message = #{message,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ZhouyujunMybit record);
}