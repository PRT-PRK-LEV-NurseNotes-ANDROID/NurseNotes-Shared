package hu.unideb.nursenotes.commons.pojo.table;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Column name provider.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ColumnName {

    /**
     * Lombok for constructors.
     */
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class UserColumName {

        /**
         * User ID column name.
         */
        public static final String COLUMN_NAME_USER_ID = "user_id";

        /**
         * Username column.
         */
        public static final String COLUMN_NAME_USERNAME = "username";

        /**
         * Email column.
         */
        public static final String COLUMN_NAME_EMAIL = "email";

        /**
         * Password column.
         */
        public static final String COLUMN_NAME_PASSWORD = "password";

        /**
         * First name column.
         */
        public static final String COLUMN_NAME_FIRST_NAME = "first_name";

        /**
         * Last name column.
         */
        public static final String COLUMN_NAME_LAST_NAME = "last_name";

        /**
         * Create date column.
         */
        public static final String COLUMN_NAME_CREATED_DATE = "created_date";
    }

    /**
     * Lombok for constructors.
     */
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class AcitivityColumName {

        /**
         * Activity ID.
         */
        public static final String
                COLUMN_NAME_ACTIVITY_ID = "activity_id";

        /**
         * Time spent on traveling column.
         */
        public static final String
                COLUMN_NAME_ACTIVITY_TRAVELTIME = "travel_time";

        /**
         * Time spent on the activity column.
         */
        public static final String COLUMN_NAME_ACTIVITY_TIMESPENT = "time_spent";

        /**
         * Type of activity column.
         */
        public static final String COLUMN_NAME_ACTIVITY_TYPE = "type";

        /**
         * Date of activity column.
         */
        public static final String COLUMN_NAME_ACTIVITY_DATE = "date";

    }

    /**
     * Lombok for constructors.
     */
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class ClientdataColumName {

        /**
         * Client ID.
         */
        public static final String
                COLUMN_NAME_CLIENT_ID = "client_id";

        /**
         * Client first name column.
         */
        public static final String
                COLUMN_NAME_CLIENT_FIRSTNAME = "first_name";

        /**
         * Client last name column.
         */
        public static final String
                COLUMN_NAME_CLIENT_LASTNAME = "last_name";

        /**
         * Age of the Client column.
         */
        public static final String COLUMN_NAME_CLIENT_AGE = "age";

        /**
         * Signature of the Client column.
         */
        public static final String
                COLUMN_NAME_CLIENT_SIGNATURE = "signature";

        /**
         * Phone number of the Client column.
         */
        public static final String
                COLUMN_NAME_CLIENT_PHONENUMBER = "phone_number";

        /**
         * Address of the Client column.
         */
        public static final String COLUMN_NAME_CLIENT_ADDRESS = "address";

        /**
         * Price of activity column.
         */
        public static final String COLUMN_NAME_CLIENT_WAGE = "wage";
    }
}
