package consumer.infrastructure.client;

import consumer.domain.model.User;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserClient {

    private final RestTemplate restTemplate;

    UserClient() {
        this.restTemplate = new RestTemplateBuilder().build();
    }

    public User user() {
        ResponseEntity<User> response = restTemplate.getForEntity("http://localhost:8082/user", User.class);

        return response.getBody();
    }
}
