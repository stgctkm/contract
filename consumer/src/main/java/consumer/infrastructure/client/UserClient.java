package consumer.infrastructure.client;

import consumer.domain.model.User;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserClient {

    private final RestTemplate restTemplate;

    UserClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate =
                    restTemplateBuilder
                .build();
    }

//    UserClient() {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.NON_PRIVATE);
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        converter.setObjectMapper(mapper);
//
    // TODO NG RestTemplateBuilder を new してはいけない
//        this.restTemplate =
//                new RestTemplateBuilder()
//                        .messageConverters(converter)
//                        .build();
//    }

    public User user() {
        ResponseEntity<User> response = restTemplate.getForEntity("http://localhost:8082/user", User.class);

        return response.getBody();
    }
}
