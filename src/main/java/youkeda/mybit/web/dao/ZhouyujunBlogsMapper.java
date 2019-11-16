package youkeda.mybit.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import youkeda.mybit.web.dataobject.ZhouyujunBlogs;
@Mapper
public interface ZhouyujunBlogsMapper {
    @Delete({
        "delete from zhouyujun_blogs",
        "where blogs_id = #{blogsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer blogsId);

    @Insert({
        "insert into zhouyujun_blogs (blogs_id, blogs_title, ",
        "blogs_author, blogs_date, ",
        "blogs_view, blogs_comment, ",
        "blogs_collection, blogs_txt)",
        "values (#{blogsId,jdbcType=INTEGER}, #{blogsTitle,jdbcType=VARCHAR}, ",
        "#{blogsAuthor,jdbcType=VARCHAR}, now(), ",
        "#{blogsView,jdbcType=INTEGER}, #{blogsComment,jdbcType=INTEGER}, ",
        "#{blogsCollection,jdbcType=INTEGER}, #{blogsTxt,jdbcType=LONGVARCHAR})"
    })
    int insert(ZhouyujunBlogs record);

    @Select({
        "select",
        "blogs_id, blogs_title, blogs_author, blogs_date, blogs_view, blogs_comment, ",
        "blogs_collection, blogs_txt",
        "from zhouyujun_blogs",
        "where blogs_id = #{blogsId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="blogs_id", property="blogsId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="blogs_title", property="blogsTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="blogs_author", property="blogsAuthor", jdbcType=JdbcType.VARCHAR),
        @Result(column="blogs_date", property="blogsDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="blogs_view", property="blogsView", jdbcType=JdbcType.INTEGER),
        @Result(column="blogs_comment", property="blogsComment", jdbcType=JdbcType.INTEGER),
        @Result(column="blogs_collection", property="blogsCollection", jdbcType=JdbcType.INTEGER),
        @Result(column="blogs_txt", property="blogsTxt", jdbcType=JdbcType.LONGVARCHAR)
    })
    ZhouyujunBlogs selectByPrimaryKey(Integer blogsId);

    @Select({
        "select",
        "blogs_id, blogs_title, blogs_author, blogs_date, blogs_view, blogs_comment, ",
        "blogs_collection, blogs_txt",
        "from zhouyujun_blogs"
    })
    @Results({
        @Result(column="blogs_id", property="blogsId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="blogs_title", property="blogsTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="blogs_author", property="blogsAuthor", jdbcType=JdbcType.VARCHAR),
        @Result(column="blogs_date", property="blogsDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="blogs_view", property="blogsView", jdbcType=JdbcType.INTEGER),
        @Result(column="blogs_comment", property="blogsComment", jdbcType=JdbcType.INTEGER),
        @Result(column="blogs_collection", property="blogsCollection", jdbcType=JdbcType.INTEGER),
        @Result(column="blogs_txt", property="blogsTxt", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ZhouyujunBlogs> selectAll();

    @Update({
        "update zhouyujun_blogs",
        "set blogs_title = #{blogsTitle,jdbcType=VARCHAR},",
          "blogs_author = #{blogsAuthor,jdbcType=VARCHAR},",

          "blogs_view = #{blogsView,jdbcType=INTEGER},",
          "blogs_comment = #{blogsComment,jdbcType=INTEGER},",
          "blogs_collection = #{blogsCollection,jdbcType=INTEGER},",
          "blogs_txt = #{blogsTxt,jdbcType=LONGVARCHAR}",
        "where blogs_id = #{blogsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ZhouyujunBlogs record);
}