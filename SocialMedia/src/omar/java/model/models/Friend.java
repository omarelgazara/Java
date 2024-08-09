package omar.java.model.models;

import java.util.List;

public class Friend extends SocialData{
     private String Name;
     private List <User>user;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
