package hu.unideb.nursenotes.commons.pojo.response;

import java.io.Serializable;

public class OAuthAuthErrorResponse implements Serializable {

    private String message;

    private String exceptionClass;

    private String errorCode;

    public OAuthAuthErrorResponse() {
    }

    public String getMessage() {
        return message;
    }

    public String getExceptionClass() {
        return exceptionClass;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public static OAuthAuthErrorResponseBuilder builder() {
        return new OAuthAuthErrorResponseBuilder();
    }

    public static final class OAuthAuthErrorResponseBuilder {

        private String message;
        private String exceptionClass;
        private String errorCode;

        private OAuthAuthErrorResponseBuilder() {
        }

        public static OAuthAuthErrorResponseBuilder anOAuthAuthErrorResponse() {
            return new OAuthAuthErrorResponseBuilder();
        }

        public OAuthAuthErrorResponseBuilder message(String message) {
            this.message = message;
            return this;
        }

        public OAuthAuthErrorResponseBuilder exceptionClass(String exceptionClass) {
            this.exceptionClass = exceptionClass;
            return this;
        }

        public OAuthAuthErrorResponseBuilder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public OAuthAuthErrorResponse build() {
            OAuthAuthErrorResponse oAuthAuthErrorResponse = new OAuthAuthErrorResponse();
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

