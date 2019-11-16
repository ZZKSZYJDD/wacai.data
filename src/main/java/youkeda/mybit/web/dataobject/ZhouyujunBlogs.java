package youkeda.mybit.web.dataobject;

import java.util.Date;

/**
 * 
 * @date 2019/11/16
 */
public class ZhouyujunBlogs {
    /**
     * 编号
     */
    private Integer blogsId;

    /**
     * 标题
     */
    private String blogsTitle;

    /**
     * 作者
     */
    private String blogsAuthor;

    /**
     * 日期
     */
    private Date blogsDate;

    /**
     * 浏览量
     */
    private Integer blogsView;

    /**
     * 评论量
     */
    private Integer blogsComment;

    /**
     * 收藏量
     */
    private Integer blogsCollection;

    /**
     * 内容
     */
    private String blogsTxt;

    public Integer getBlogsId() {
        return blogsId;
    }

    public void setBlogsId(Integer blogsId) {
        this.blogsId = blogsId;
    }

    public String getBlogsTitle() {
        return blogsTitle;
    }

    public void setBlogsTitle(String blogsTitle) {
        this.blogsTitle = blogsTitle;
    }

    public String getBlogsAuthor() {
        return blogsAuthor;
    }

    public void setBlogsAuthor(String blogsAuthor) {
        this.blogsAuthor = blogsAuthor;
    }

    public Date getBlogsDate() {
        return blogsDate;
    }

    public void setBlogsDate(Date blogsDate) {
        this.blogsDate = blogsDate;
    }

    public Integer getBlogsView() {
        return blogsView;
    }

    public void setBlogsView(Integer blogsView) {
        this.blogsView = blogsView;
    }

    public Integer getBlogsComment() {
        return blogsComment;
    }

    public void setBlogsComment(Integer blogsComment) {
        this.blogsComment = blogsComment;
    }

    public Integer getBlogsCollection() {
        return blogsCollection;
    }

    public void setBlogsCollection(Integer blogsCollection) {
        this.blogsCollection = blogsCollection;
    }

    public String getBlogsTxt() {
        return blogsTxt;
    }

    public void setBlogsTxt(String blogsTxt) {
        this.blogsTxt = blogsTxt;
    }
}