package learn.springcloud.account;

import learn.springcloud.movie.User;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Account {

    private Long id;
    private String username;
    private String password;
    private Boolean enabled = true;
    private LocalDateTime expired;
    private LocalDateTime lockedExpired;
    private LocalDateTime passwordExpired;

    private User user;
}
