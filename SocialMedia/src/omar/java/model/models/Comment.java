package omar.java.model.models;

public class Comment extends SocialData{

    //comment (id , content ,image ,video ,post,user)

    private Post post;
    private User user;



    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
