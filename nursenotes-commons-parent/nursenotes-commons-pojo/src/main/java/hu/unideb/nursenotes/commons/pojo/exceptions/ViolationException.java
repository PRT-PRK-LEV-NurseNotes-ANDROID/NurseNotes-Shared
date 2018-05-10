package hu.unideb.nursenotes.commons.pojo.exceptions;

import hu.unideb.nursenotes.commons.pojo.validator.Violation;

import java.util.List;

public class ViolationException extends BaseException {

    private List<Violation> errors;

    public ViolationException(List<Violation> violationList) {
        this.errors = violationList;
    }

    public List<Violation> getViolationList() {
        return this.errors;
    }

//    public String toString() {
//        return "ViolationException{errors=" + this.errors.toString() + '}';
//    }

    @Override
    public String toString() {
        return "ViolationException{" +
                "errors=" + this.errors +
                '}';
    }
}
