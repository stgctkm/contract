package consumer.presentation;

import consumer.domain.model.User;
import consumer.infrastructure.client.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ConsumerController {

    UserClient client;

    ConsumerController(UserClient client) {
        this.client = client;
    }

    @GetMapping("sample")
    User user() {
        return client.user();
    }
}
