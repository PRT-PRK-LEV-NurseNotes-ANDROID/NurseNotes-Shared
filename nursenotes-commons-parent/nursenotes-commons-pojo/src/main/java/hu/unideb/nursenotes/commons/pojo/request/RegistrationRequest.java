package hu.unideb.nursenotes.commons.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Lombok for constructors.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
/**
 * Registration request class.
 */
public class RegistrationRequest implements Serializable {

    /**
     * Username of emloyee.
     */
    private String username;

    /**
     * Password of employee.
     */
    private String password;

    /**
     * First name of employee.
     */
    private String firstName;

    /**
     * Last name of employee.
     */
    private String lastName;

}
