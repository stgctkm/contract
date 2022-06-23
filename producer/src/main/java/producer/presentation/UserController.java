package producer.presentation;

import producer.domain.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {

    @GetMapping("user")
    User user() {
        return new User("Bob", "yamamoto", 32);
    }
}
