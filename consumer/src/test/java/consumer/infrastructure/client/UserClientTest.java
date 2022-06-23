package consumer.infrastructure.client;

import consumer.domain.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(
        ids = {"contract:producer:+:stubs:8082"},
//        ids = {"contract:producer:0.0.1-SNAPSHOT:stubs:8082"},
        stubsMode = StubRunnerProperties.StubsMode.LOCAL
)
class UserClientTest {

    @Autowired
    UserClient userClient;

    @Test
    public void validateUserStub() {

        User user = userClient.user();

        assertEquals(user.lastName(), "yamamoto");
        assertEquals(user.firstName(), "Bob");
        assertEquals(user.age(), 32);
    }

}