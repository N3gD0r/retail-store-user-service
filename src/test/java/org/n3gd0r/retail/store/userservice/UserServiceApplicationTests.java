package org.n3gd0r.retail.store.userservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class UserServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
