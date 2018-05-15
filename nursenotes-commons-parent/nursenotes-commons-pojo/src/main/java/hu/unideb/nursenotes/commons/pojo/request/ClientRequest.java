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
     * First name of the Client.
     */
    private String firstName;

    /**
     * Last name of the Client.
     */
    private String lastName;

    /**
     * Age of the Client.
     */
    private int age;

    /**
     * Signature of the Client.
     */
    private String signature;

    /**
     * Phone number of the Client.
     */
    private String phoneNumber;

    /**
     * Address of the Client.
     */
    private String address;

    /**
     * Wage of the Client.
     */
    private int wage;

}
