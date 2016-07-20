package local.myworktech.formrouter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Credentials {

    private String username;
    private String password;

    public void checkExistance() {

    }

}
