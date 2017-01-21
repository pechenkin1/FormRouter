package local.myworktech.formrouter.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.text.MessageFormat;

@Entity
@Getter
@Setter
public class User extends PersistableEntity {

    @Id
    @GeneratedValue
    private Integer id;
    @JoinColumn
    @ManyToOne(cascade = CascadeType.ALL)
    private Credentials credentials;
    private String lastName;
    private String firstName;
    private String middleName;
    private Gender gender;
    private String email;
    private String phone;

    public String getShortUserInfo() {
        return MessageFormat.format("{0} {1} [{2}]", firstName, lastName, email);
    }

}
