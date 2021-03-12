package learn.springcloud.movie;

import learn.springcloud.account.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final RestTemplate restTemplate;

    @GetMapping("/account/{id}")
    public Account findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://localhost:8080/accounts/" + id, Account.class);
    }
}
