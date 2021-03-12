package learn.springcloud.account;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.MessageSourceAccessor;

@RequiredArgsConstructor
@Configuration
public class AuthenticationConfiguration {

    private final MessageSource messageSource;

    @Bean
    public MessageSourceAccessor accessor() {
        return new MessageSourceAccessor(messageSource);
    }

}
