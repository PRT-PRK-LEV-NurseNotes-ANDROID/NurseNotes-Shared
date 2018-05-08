package hu.unideb.nursenotes.commons.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ClientRequest implements Serializable {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String address;

    private int age;

    private int wage;

}
