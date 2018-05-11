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
 * Response of meta.
 */
public class MetaResponse {

    /**
     * Token.
     */
    private String token;

}
