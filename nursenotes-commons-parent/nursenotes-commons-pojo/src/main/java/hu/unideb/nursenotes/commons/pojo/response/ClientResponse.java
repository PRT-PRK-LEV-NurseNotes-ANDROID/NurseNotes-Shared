package hu.unideb.nursenotes.commons.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Client response class.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientResponse implements Serializable {

    /**
     * Client ID.
     */
    private Long id;

    /**
     * Client first name.
     */
    private String firstName;

    /**
     * Client last name.
     */
    private String lastName;

    /**
     * Client age.
     */
    private int age;

    /**
     * Client signature.
     */
    private String signature;

    /**
     * Client phone number.
     */
    private String phoneNumber;

    /**
     * Client address.
     */
    private String address;

    /**
     * Client wage.
     */
    private int wage;
}
