package hu.unideb.nursenotes.commons.pojo.exceptions;

import hu.unideb.nursenotes.commons.pojo.validator.Violation;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Violation exception class.
 */
@Data
@NoArgsConstructor
public final class ViolationException extends BaseException {

    /**
     * List of errors.
     */
    private List<Violation> errors;

    /**
     *
     * @param violationList is the list of violations.
     */
    private ViolationException(final List<Violation> violationList) {
        this.errors = violationList;
    }

    /**
     *
     * @return Violation list.
     */
    private List<Violation> getViolationList() {
        return this.errors;
    }

    @Override
    public String toString() {
        return "ViolationException{"
                + "errors=" + this.errors
                + '}';
    }
}
