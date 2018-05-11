package hu.unideb.nursenotes.commons.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Lombok for constructors.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
/**
 * Client request class.
 */
public class ClientRequest implements Serializable {

    /**
     * First name of Client.
     */
    private String firstName;

    /**
     * Last name of Client.
     */
    private String lastName;

    /**
     * Phone number of Client.
     */
    private String phoneNumber;

    /**
     * Address of Client.
     */
    private String address;

    /**
     * Age of Client.
     */
    private int age;

    /**
     * Wage of Client.
     */
    private int wage;

}
