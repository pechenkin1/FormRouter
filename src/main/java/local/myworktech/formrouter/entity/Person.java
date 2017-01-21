package local.myworktech.formrouter.entity;


import local.myworktech.formrouter.tables.ShowInTable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@Getter
@Setter
public class Person extends PersistableEntity {
    @Id
    @GeneratedValue
    private Integer id;
    @OneToOne
    private House house;
    @ShowInTable(displayName = "Город")
    private String lastName;
    private String firstName;
    private String middleName;
    private Gender gender;
    private String email;
    private String phone;
    private Date birthday;

}
