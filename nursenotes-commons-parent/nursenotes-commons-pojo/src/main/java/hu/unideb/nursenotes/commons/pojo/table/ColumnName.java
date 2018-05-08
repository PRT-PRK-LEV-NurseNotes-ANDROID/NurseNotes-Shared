package hu.unideb.nursenotes.commons.pojo.table;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ColumnName {

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class LoginColumName {

        /**
         * Username of the employee column.
         */
        public static final String COLUMN_NAME_USER = "userName";

        /**
         * Password of the employee column.
         */
        public static final String COLUMN_NAME_PASSWORD = "password";

        /**
         * First name of the employee column.
         */
        public static final String COLUMN_NAME_FIRSTNAME = "firstName";

        /**
         * Last name of the employee column.
         */
        public static final String COLUMN_NAME_LASTNAME = "lastName";

        /**
         * E-mail address of the employee column.
         */
        public static final String COLUMN_NAME_EMAIL = "email";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class AcitivityColumName {

        /**
         * Time spent on traveling column.
         */
        public static final String COLUMN_NAME_ACTIVITY_TRAVELTIME = "travelTime";

        /**
         * Time spent on the activity column.
         */
        public static final String COLUMN_NAME_ACTIVITY_TIMESPENT = "timeSpent";

        /**
         * Type of activity column.
         */
        public static final String COLUMN_NAME_ACTIVITY_TYPE = "type";

        /**
         * Date of activity column.
         */
        public static final String COLUMN_NAME_ACTIVITY_DATE = "date";

    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class ClientdataColumName {

        /**
         * Client first name column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_CLIENTFIRSTNAME = "firstName";

        /**
         * Client last name column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_CLIENTLASTNAME = "lastName";

        /**
         * Age of the Client column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_AGE = "age";

        /**
         * Signature of the Client column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_SIGNATURE = "signature";

        /**
         * Phone number of the Client column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_PHONE_NUMBER = "phoneNumber";

        /**
         * Address of the Client column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_ADDRESS = "address";

        /**
         * Price of activity column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_WAGE = "wage";
    }
}