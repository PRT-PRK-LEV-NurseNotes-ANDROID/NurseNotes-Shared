package hu.unideb.nursenotes.commons.pojo.response;

import java.io.Serializable;

/**
 * Authentication error response.
 */
public class OAuthAuthErrorResponse implements Serializable {

    /**
     * Error message.
     */
    private String message;

    /**
     * Error exception.
     */
    private String exceptionClass;

    /**
     * Error code.
     */
    private String errorCode;

    /**
     * Contructor.
     */
    public OAuthAuthErrorResponse() {
    }

    /**
     * Message getter.
     *
     * @return message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Exception class getter.
     *
     * @return exception.
     */
    public String getExceptionClass() {
        return exceptionClass;
    }

    /**
     * Error code getter.
     *
     * @return error code.
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Response builder.
     *
     * @return response.
     */
    public static OAuthAuthErrorResponseBuilder builder() {

        return new OAuthAuthErrorResponseBuilder();
    }

    /**
     * Authentication error response builder.
     */
    public static final class OAuthAuthErrorResponseBuilder {

        private String message;
        private String exceptionClass;
        private String errorCode;

        private OAuthAuthErrorResponseBuilder() {
        }

        public static OAuthAuthErrorResponseBuilder
        anOAuthAuthErrorResponse() {
            return new OAuthAuthErrorResponseBuilder();
        }

        public OAuthAuthErrorResponseBuilder message(String message) {
            this.message = message;
            return this;
        }

        public OAuthAuthErrorResponseBuilder exceptionClass(
                String exceptionClass) {
            this.exceptionClass = exceptionClass;
            return this;
        }

        public OAuthAuthErrorResponseBuilder errorCode(
                String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public OAuthAuthErrorResponse build() {
            OAuthAuthErrorResponse oAuthAuthErrorResponse =
                    new OAuthAuthErrorResponse();
            oAuthAuthErrorResponse.message = this.message;
            oAuthAuthErrorResponse.exceptionClass = this.exceptionClass;
            oAuthAuthErrorResponse.errorCode = this.errorCode;
            return oAuthAuthErrorResponse;
        }
    }

    @Override
    public String toString() {
        return "OAuthAuthErrorResponse{" +
                "message='" + message + '\'' +
                ", exceptionClass='" + exceptionClass + '\'' +
                ", errorCode='" + errorCode + '\'' +
                '}';
    }
}

