package local.myworktech.formrouter.entity;

import lombok.Data;

import java.text.MessageFormat;

//@Entity
@Data
public class User extends PersistableEntity {
    private static User testUser = getTestUserInner();
    //    @Id
//    @GeneratedValue
    private Integer id;
    private Credentials credentials;
    private String lastName;
    private String firstName;
    private String middleName;
    private Gender gender;
    private String email;
    private String phone;

    private static User getTestUserInner() {
        User user = new User();
        user.setFirstName("Joe");
        user.setLastName("Gunner");
        user.setMiddleName("Johnson");
        user.setGender(Gender.Male);
        user.setEmail("joe@friends.com");
        user.setPhone("+7 999 123-44-55");
        user.setCredentials(new Credentials("joe", "god"));
        return user;
    }

    public static User getTestUser() {
        return testUser;
    }

    public String getShortUserInfo() {
        return MessageFormat.format("{0} {1} [{2}]", firstName, lastName, email);
    }

}
