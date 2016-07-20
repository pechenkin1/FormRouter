package local.myworktech.formrouter.entity;

import lombok.Data;

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
        user.setFirstName("Joey");
        user.setLastName("Tribbiani");
        user.setMiddleName("Francis");
        user.setGender(Gender.Мужской);
        user.setEmail("joey@friends.com");
        user.setPhone("+7 999 123-44-55");
        user.setCredentials(new Credentials("test", "test"));
        return user;
    }

    public static User getTestUser() {
        return testUser;
    }

}
