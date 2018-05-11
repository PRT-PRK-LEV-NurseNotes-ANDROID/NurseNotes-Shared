package hu.unideb.nursenotes.commons.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Response of successful registration.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationResponse implements Serializable {

    /**
     * Errors.
     */
    private Error errors;

}
