package hu.unideb.nursenotes.commons.pojo.validator;

import lombok.Data;
import java.io.Serializable;

/**
 * Class of Violations.
 */
public class Violation implements Serializable {

    /**
     * Violation filed.
     */
    private String validationField;

    /**
     * Validation message.
     */
    private String validationMessage;

    /**
     * Empty constructor.
     */
    private Violation() {
    }

    /**
     * All arguments constructor.
     *
     * @param valField validation field.
     * @param valMessage message field.
     */
    public Violation(final String valField,
                     final String valMessage) {
        this.validationField = valField;
        this.validationMessage = valMessage;
    }

    /**
     *
     * @return field.
     */
    private String getValField() {
        return validationField;
    }

    /**
     *
     * @param valField sets field.
     */
    private void setField(final String valField) {
        this.validationField = valField;
    }

    /**
     *
     * @return validation message.
     */
    private String getValidationMessage() {
        return validationMessage;
    }

    /**
     *
     * @param valMessage sets validation message.
     */
    private void setValidationMessage(final String valMessage) {
        this.validationMessage = valMessage;
    }

    /**
     * Violation builder.
     * @return violation.
     */
    public static ViolationBuilder builder() {
        return new ViolationBuilder();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("field:").append(validationField)
                .append("->").append(validationMessage);
        return sb.toString();
    }

    /**
     * Violation class builder.
     */
    public static final class ViolationBuilder {
        /**
         * Validation field string.
         */
        private String vField;
        /**
         * Validation message string.
         */
        private String validationMessage;

        /**
         * Empty violation builder.
         */
        private ViolationBuilder() {
        }

        /**
         *
         * @return Violation builder.
         */
        public static ViolationBuilder aViolation() {
            return new ViolationBuilder();
        }

        /**
         *
         * @param valField violation field.
         * @return violtion.
         */
        public ViolationBuilder vField(
                final String valField) {
            this.vField = valField;
            return this;
        }

        /**
         *
         * @param valMessage vaidation message.
         * @return valdation message.
         */
        public ViolationBuilder validationMessage(
                final String valMessage) {
            this.validationMessage = valMessage;
            return this;
        }

        /**
         *
         * @return violation message.
         */
        public Violation build() {
            Violation violation = new Violation();
            violation.setField(vField);
            violation.setValidationMessage(validationMessage);
            return violation;
        }
    }
}
