package e.wolfsoft1.uiuxlabecommerce_jp_shop39.model;

public class Comment_model_Shop39 {
    private final Integer commenter_image;
    private final String commenter_name;
    private final String comment;
    private final String comment_time;

    public Integer getCommenter_image() {
        return commenter_image;
    }

    public String getCommenter_name() {
        return commenter_name;
    }

    public String getComment() {
        return comment;
    }

    public String getComment_time() {
        return comment_time;
    }

    public Comment_model_Shop39(Integer commenter_image, String commenter_name, String comment, String comment_time) {
        this.commenter_image=commenter_image;
        this.commenter_name=commenter_name;

        this.comment=comment;
        this.comment_time=comment_time;
    }
}
