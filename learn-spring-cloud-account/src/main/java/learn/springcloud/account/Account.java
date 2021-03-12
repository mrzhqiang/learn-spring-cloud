package learn.springcloud.account;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private Boolean enabled = true;
    private LocalDateTime expired;
    private LocalDateTime lockedExpired;
    private LocalDateTime passwordExpired;

    @OneToOne
    private User user;
/*
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public boolean isAccountNonExpired() {
        return expired == null || LocalDateTime.now().isAfter(expired);
    }

    @Override
    public boolean isAccountNonLocked() {
        return lockedExpired == null || LocalDateTime.now().isAfter(lockedExpired);
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return passwordExpired == null || LocalDateTime.now().isAfter(passwordExpired);
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }*/
}
