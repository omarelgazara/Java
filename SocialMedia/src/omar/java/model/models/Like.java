package omar.java.model.models;

import javax.security.auth.PrivateCredentialPermission;

public class Like extends BaseEntity {

  //  like (id,post,user)
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
