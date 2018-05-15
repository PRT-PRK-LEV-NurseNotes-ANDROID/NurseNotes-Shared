package hu.unideb.nursenotes.commons.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetailsResponse implements Serializable {

    private Long id;

    private String username;

    private String email;

    private String firstName;

    private String lastName;

    private LocalDate createdDate;
}
