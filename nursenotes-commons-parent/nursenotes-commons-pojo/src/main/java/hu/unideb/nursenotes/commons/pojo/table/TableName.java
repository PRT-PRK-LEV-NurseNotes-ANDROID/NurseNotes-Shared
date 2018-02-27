package hu.unideb.nursenotes.commons.pojo.table;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TableName {

    /**
     * Login table.
     */
    public static final String TABLE_NAME_LOGIN = "Login";

    /**
     * Clients table
     */
    public static final String TABLE_NAME_CLIENTS = "Clients";

    /**
     * Activities table
     */
    public static final String TABLE_NAME_ACTIVITIES = "Activities";
}
