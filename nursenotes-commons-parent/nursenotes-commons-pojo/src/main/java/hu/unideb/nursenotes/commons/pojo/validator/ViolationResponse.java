package hu.unideb.nursenotes.commons.pojo.validator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Lombok for constructors.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
/**
 * This class is the response of Violation class.
 */
public class ViolationResponse implements Serializable {

    /**
     * Violation list.
     */
    private List<Violation> errors;

    /**
     * @return a Violation response.
     */
    public static ViolationResponseBuilder builder() {
        return new ViolationResponseBuilder();
    }

    /**
     * Violation response builder class.
     */
    public static final class ViolationResponseBuilder {
        /**
         * Violation response.
         */
        private ViolationResponse violationResponse;

        /**
         * Violation response builder constructor.
         */
        private ViolationResponseBuilder() {
            violationResponse = new ViolationResponse();
        }

        /**
         * @return a new violation response.
         */
        public static ViolationResponseBuilder aViolationResponse() {
            return new ViolationResponseBuilder();
        }

        /**
         * @param violationList a list of violations.
         * @return the list of violations.
         */
        public ViolationResponseBuilder violationList(
                final List<Violation> violationList) {
            violationResponse.setErrors(violationList);
            return this;
        }

        /**
         * @return built violation response.
         */
        public ViolationResponse build() {
            return violationResponse;
        }
    }
}
