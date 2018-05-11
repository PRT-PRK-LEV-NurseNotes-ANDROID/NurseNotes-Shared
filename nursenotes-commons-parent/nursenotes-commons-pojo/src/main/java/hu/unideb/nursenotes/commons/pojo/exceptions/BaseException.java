package hu.unideb.nursenotes.commons.pojo.exceptions;

/**
 * This class contains base exceptions.
 */
public class BaseException extends Exception {

    /**
     * Base exception empty constructor.
     */
    public BaseException() {
        super();
    }

    /**
     * Base exception single element constructor.
     * @param message the exception message.
     */
    public BaseException(final String message) {
        super(message);
    }

    /**
     * Bsse exception two element constructor.
     *
     * @param message the exception message.
     * @param cause the exception cause.
     */
    public BaseException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Bsse exception two element constructor.
     *
     * @param cause the exception cause.
     */
    public BaseException(final Throwable cause) {
        super(cause);
    }

    /**
     * All arguments constructor.
     *
     * @param message the exception message.
     * @param cause the exception cause.
     * @param enableSuppression enables Supression.
     * @param writableStackTrace writable StackTrace.
     */
    protected BaseException(final String message, final Throwable cause,
        final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
