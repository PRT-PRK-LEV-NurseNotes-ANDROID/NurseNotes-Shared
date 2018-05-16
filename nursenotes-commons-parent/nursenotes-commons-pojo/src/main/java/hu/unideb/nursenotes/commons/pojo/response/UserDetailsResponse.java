package hu.unideb.nursenotes.commons.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * User details response class.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetailsResponse implements Serializable {

    /**
     * Employee ID.
     */
    private Long id;

    /**
     * Employee username.
     */
    private String username;

    /**
     * Employee email.
     */
    private String email;

    /**
     * Employee first name.
     */
    private String firstName;

    /**
     * Employee last name.
     */
    private String lastName;

    /**
     * Date of creation.
     */
    private LocalDate createdDate;
}
