package local.myworktech.formrouter.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"username"}))
public class Credentials extends PersistableEntity{

    @Id
    @GeneratedValue
    private Integer id;

    private String username;
    private String password;

    public void checkExistance() {

    }

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
