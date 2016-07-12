package local.myworktech.formrouter.entity;

import lombok.Data;

//@Entity
@Data
public class User extends PersistableEntity {
    //    @Id
//    @GeneratedValue
    private Integer id;
    private String username;
    private String password;
    private String lastName;
    private String firstName;
    private String middleName;
    private Gender gender;
    private String email;
    private String phone;


}
