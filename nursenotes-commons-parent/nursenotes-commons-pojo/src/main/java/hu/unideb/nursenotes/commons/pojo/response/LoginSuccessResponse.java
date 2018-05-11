package hu.unideb.nursenotes.commons.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Lombok for constructors.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * Response of successful login.
 */
public class LoginSuccessResponse {

    /**
     * Data.
     */
    private Object data;

    /**
     * Meta.
     */
    private MetaResponse meta;

}
