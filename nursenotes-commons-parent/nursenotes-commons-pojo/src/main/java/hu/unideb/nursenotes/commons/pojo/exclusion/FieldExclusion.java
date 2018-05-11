package hu.unideb.nursenotes.commons.pojo.exclusion;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Lombok for constructors.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Data
/**
 * Class of filed exclusions.
 */
public final class FieldExclusion {

    /**
     * Password value of field exclusions.
     */
    private static final String EXCLUDE_PASSWORD = "password";

}
