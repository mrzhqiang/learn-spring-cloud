package learn.springcloud.account;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("accounts")
public class AccountController {

    private final AccountRepository accountRepository;

    @GetMapping("/{id}")
    public Account findById(@PathVariable Long id) {
        return accountRepository.findOne(id);
    }
}
