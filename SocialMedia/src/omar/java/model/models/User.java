package omar.java.model.models;


import java.util.List;

public class User extends BaseEntity {

     private String  fullName;
     private String  email;
     private String  password;
     private String  phone;
     private List <Role> role;

     public List<Massage> getMassage() {
          return massage;
     }

     public void setMassage(List<Massage> massage) {
          this.massage = massage;
     }

     private List<Friend>friend;
     private List<Chat>chat;
     private List<Massage>massage;

     public List<Chat> getChat() {
          return chat;
     }

     public void setChat(List<Chat> chat) {
          this.chat = chat;
     }

     public List<Role> getRole() {
          return role;
     }

     public List<Friend> getFriend() {
          return friend;
     }

     public void setFriend(List<Friend> friend) {
          this.friend = friend;
     }

     public void setFullName(String fullName) {
          this.fullName = fullName;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }

     public String getPhone() {
          return phone;
     }

     public void setPhone(String phone) {
          this.phone = phone;
     }

     public String getFullName() {
          return fullName;
     }

     public void setRole(List<Role> role) {
          this.role = role;
     }



}
