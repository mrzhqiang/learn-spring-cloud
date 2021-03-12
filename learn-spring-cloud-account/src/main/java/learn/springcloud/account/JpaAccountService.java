package learn.springcloud.account;

import lombok.RequiredArgsConstructor;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JpaAccountService implements AccountService {

    private final AccountRepository repository;
    private final MessageSourceAccessor accessor;
/*
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(accessor.getMessage("account.username.not-found")));
    }*/
}
