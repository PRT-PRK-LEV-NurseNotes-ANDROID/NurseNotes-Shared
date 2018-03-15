package hu.unideb.nursenotes.commons.pojo.table;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TableName {

    /**
     * Login table.
     */
    public static final String TABLE_NAME_LOGIN = "login";

    /**
     * Clients table
     */
    public static final String TABLE_NAME_CLIENT = "client";

    /**
     * Activities table
     */
    public static final String TABLE_NAME_ACTIVITY = "activity";
}
