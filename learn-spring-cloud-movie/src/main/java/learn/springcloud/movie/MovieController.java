package learn.springcloud.movie;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final RestTemplate restTemplate;
    private final DiscoveryClient discoveryClient;

    @GetMapping("/account/{id}")
    public Account findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://localhost:8080/accounts/" + id, Account.class);
    }

    @GetMapping("/account/info")
    public List<ServiceInstance> userInfo() {
        return discoveryClient.getInstances("account");
    }
}
