package hu.unideb.nursenotes.commons.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginSuccessResponse {

    private Object data;
    private MetaResponse meta;

}
