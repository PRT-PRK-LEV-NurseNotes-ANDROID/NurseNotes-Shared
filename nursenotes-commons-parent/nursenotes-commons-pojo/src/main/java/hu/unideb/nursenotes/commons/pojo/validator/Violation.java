package hu.unideb.nursenotes.commons.pojo.validator;

import lombok.Data;
import java.io.Serializable;

/**
 * Class of Violations.
 */
@Data
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
    public Violation() {
    }

    /**
     * All arguments constructor.
     *
     * @param validationField validation field.
     * @param validationMessage message field.
     */
    public Violation(final String validationField, final String validationMessage) {
        this.validationField = validationField;
        this.validationMessage = validationMessage;
    }

    /**
     *
     * @return field.
     */
    private String getvalidationField() {
        return validationField;
    }

    /**
     *
     * @param validationField sets field.
     */
    private void setField(String validationField) {
        this.validationField = validationField;
    }

    /**
     *
     * @return validation message.
     */
    public String getValidationMessage() {
        return validationMessage;
    }

    /**
     *
     * @param validationMessage sets validation message.
     */
    public void setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
    }

    /**
     * Violation builder
     * @return violation.
     */
    public static ViolationBuilder builder() {
        return new ViolationBuilder();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("field:").append(validationField).append("->").append(validationMessage);
        return sb.toString();
    }

    /**
     * Violation class builder.
     */
    public static final class ViolationBuilder {
        private String validationField;
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
         * @param validationField violation field.
         * @return violtion.
         */
        public ViolationBuilder validationField(String validationField) {
            this.validationField = validationField;
            return this;
        }

        /**
         *
         * @param validationMessage vaidation message.
         * @return valdation message.
         */
        public ViolationBuilder validationMessage(String validationMessage) {
            this.validationMessage = validationMessage;
            return this;
        }

        /**
         *
         * @return violation message.
         */
        public Violation build() {
            Violation violation = new Violation();
            violation.setField(validationField);
            violation.setValidationMessage(validationMessage);
            return violation;
        }
    }
}
