package com.springdeveloper.batch;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
    "spring.batch.jdbc.initialize-schema=always",
    "spring.batch.job.enabled=false"
})
class BootApp4ApplicationTests {

	@Test
	void contextLoads() {
	}

}
