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
        public static final String COLUMN_NAME_USER = "Username";

        /**
         * Password column.
         */
        public static final String COLUMN_NAME_PASSWORD = "Password";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class AcitivityColumName {

        /**
         * Time spent on traveling.
         */
        public static final String COLUMN_NAME_ACTIVITY_TRAVELTIME = "TravelTime";

        /**
         * Time spent on the activity.
         */
        public static final String COLUMN_NAME_ACTIVITY_TIMESPENT = "TimeSpent";

        /**
         * Type of activity column.
         */
        public static final String COLUMN_NAME_ACTIVITY_TYPE = "Type";

        /**
         * Clientname column.
         */
        public static final String COLUMN_NAME_ACTIVITY_CLIENTNAME = "ClientName";

        /**
         * Price of activity column.
         */
        public static final String COLUMN_NAME_ACTIVITY_WAGE = "Wage";

        /**
         * Cost of activity column.
         */
        public static final String COLUMN_NAME_ACTIVITY_COST = "Cost";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class ClientdataColumName {

        /**
         * Name column.
         */

        public static final String COLUMN_NAME_CLIENTDATA_NAME = "Name";

        /**
         * Age column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_AGE = "Age";

        /**
         * Signature column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_SIGNATURE = "Signature";

        /**
         * Phone number column.
         */
        public static final String COLUMN_NAME_CLIENTDATA_PHONE_NUMBER = "PhoneNumber";
    }
}