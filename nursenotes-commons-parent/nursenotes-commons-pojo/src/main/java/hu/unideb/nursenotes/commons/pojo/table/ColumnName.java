package hu.unideb.nursenotes.commons.pojo.table;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ColumnName {

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class LoginColumName {

        /**
         * User column.
         */
        public static final String COLUMN_NAME_USER = "username";

        /**
         * Password column.
         */
        public static final String COLUMN_NAME_PASSWORD = "password";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class AcitivityColumName {

        /**
         * Time spent on traveling.
         */
        public static final String COLUMN_NAME_ACTIVITY_TRAVELTIME = "travelTime";

        /**
         * Time spent on the activity.
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
         * Clientfirstname column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_CLIENTFIRSTNAME = "clientFirstName";

        /**
         * Clientlastname column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_CLIENTLASTNAME = "clientLastName";

        /**
         * Age column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_AGE = "age";

        /**
         * Signature column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_SIGNATURE = "signature";

        /**
         * Phone number column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_PHONE_NUMBER = "phoneNumber";

        /**
         * Price of activity column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_WAGE = "wage";
    }
}