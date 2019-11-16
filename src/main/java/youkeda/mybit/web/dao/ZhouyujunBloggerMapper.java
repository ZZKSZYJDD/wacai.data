package youkeda.mybit.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import youkeda.mybit.web.dataobject.ZhouyujunBlogger;
@Mapper
public interface ZhouyujunBloggerMapper {
    @Delete({
        "delete from zhouyujun_blogger",
        "where blogger_id = #{bloggerId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer bloggerId);

    @Insert({
        "insert into zhouyujun_blogger (blogger_id, blogger_name, ",
        "blogger_tel, blogger_pwd, ",
        "blogger_sex)",
        "values (#{bloggerId,jdbcType=INTEGER}, #{bloggerName,jdbcType=VARCHAR}, ",
        "#{bloggerTel,jdbcType=VARCHAR}, #{bloggerPwd,jdbcType=VARCHAR}, ",
        "#{bloggerSex,jdbcType=VARCHAR})"
    })
    int insert(ZhouyujunBlogger record);

    @Select({
        "select",
        "blogger_id, blogger_name, blogger_tel, blogger_pwd, blogger_sex",
        "from zhouyujun_blogger",
        "where blogger_id = #{bloggerId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="blogger_id", property="bloggerId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="blogger_name", property="bloggerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="blogger_tel", property="bloggerTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="blogger_pwd", property="bloggerPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="blogger_sex", property="bloggerSex", jdbcType=JdbcType.VARCHAR)
    })
    ZhouyujunBlogger selectByPrimaryKey(Integer bloggerId);

    @Select({
        "select",
        "blogger_id, blogger_name, blogger_tel, blogger_pwd, blogger_sex",
        "from zhouyujun_blogger"
    })
    @Results({
        @Result(column="blogger_id", property="bloggerId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="blogger_name", property="bloggerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="blogger_tel", property="bloggerTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="blogger_pwd", property="bloggerPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="blogger_sex", property="bloggerSex", jdbcType=JdbcType.VARCHAR)
    })
    List<ZhouyujunBlogger> selectAll();

    @Update({
        "update zhouyujun_blogger",
        "set blogger_name = #{bloggerName,jdbcType=VARCHAR},",
          "blogger_tel = #{bloggerTel,jdbcType=VARCHAR},",
          "blogger_pwd = #{bloggerPwd,jdbcType=VARCHAR},",
          "blogger_sex = #{bloggerSex,jdbcType=VARCHAR}",
        "where blogger_id = #{bloggerId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ZhouyujunBlogger record);
}