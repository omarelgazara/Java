package omar.java.model.models;

import java.util.List;

public class Post extends SocialData {

    //post ( id ,content ,image,video , user, List(like), List(comment) )

    private User user;
    private List<Like> likes;
    private List<Comment>comments;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
