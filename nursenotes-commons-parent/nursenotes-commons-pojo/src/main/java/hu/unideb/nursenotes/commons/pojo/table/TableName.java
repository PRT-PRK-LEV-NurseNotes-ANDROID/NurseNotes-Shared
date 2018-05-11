package hu.unideb.nursenotes.commons.pojo.table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Lombok for constructors.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TableName {

    /**
     * Login table.
     */
    private static final String TABLE_NAME_LOGIN = "login";

    /**
     * Clients table.
     */
    private static final String TABLE_NAME_CLIENT = "client";

    /**
     * Activities table.
     */
    private static final String TABLE_NAME_ACTIVITY = "activity";
}
