package ku.kinkao.dto;

import ku.kinkao.validation.ValidPassword;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class SignupDto {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
