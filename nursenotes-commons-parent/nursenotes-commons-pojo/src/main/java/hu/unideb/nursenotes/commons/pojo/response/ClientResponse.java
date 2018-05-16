package hu.unideb.nursenotes.commons.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientResponse {

    private Long id;

    private String firstName;

    private String lastName;

    private int age;

    private String signature;

    private String phoneNumber;

    private String address;

    private int wage;
}
