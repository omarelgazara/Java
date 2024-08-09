package omar.java.model.models;

import omar.java.model.enums.Roles;

//     role (id ,name)POLE_USER ,ROLE_ADMIN ,ROLE_MANAGER;
public class Role extends BaseEntity {


        private Roles name;

        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }

        private User user;


        public Roles getName() {
                return name;
        }

        public void setName(Roles name) {
                this.name = name;
        }
}
