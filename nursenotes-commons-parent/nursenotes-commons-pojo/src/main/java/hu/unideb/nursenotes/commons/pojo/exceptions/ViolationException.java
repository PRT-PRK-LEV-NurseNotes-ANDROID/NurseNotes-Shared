package hu.unideb.nursenotes.commons.pojo.exceptions;

import hu.unideb.nursenotes.commons.pojo.validator.Violation;

import java.util.List;

/**
 * Violation exception class.
 */
public class ViolationException extends BaseException {

    /**
     * List of errors.
     */
    public List<Violation> errors;

    /**
     * @param violationList is the list of violations.
     */
    public ViolationException(List<Violation> violationList) {
        this.errors = violationList;
    }

    /**
     * @return Violation list.
     */
    public List<Violation> getViolationList() {
        return this.errors;
    }

    @Override
    public String toString() {
        return "ViolationException{"
                + "errors=" + this.errors
                + '}';
    }
}
