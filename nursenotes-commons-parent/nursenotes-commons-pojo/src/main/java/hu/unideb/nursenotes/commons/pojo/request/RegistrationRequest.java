package hu.unideb.nursenotes.commons.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RegistrationRequest implements Serializable {

    private String username;

  //  private String email;

    private String password;

   // private String passwordConfirm;

    private String firstName;

    private String lastName;

}
