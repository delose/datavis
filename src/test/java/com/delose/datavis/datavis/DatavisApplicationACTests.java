package com.delose.datavis.datavis;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.Assert.fail;

import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Tests the Application's Context using @SpringBootTest
 * @author U51199
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {"management.port=0"})
public class DatavisApplicationACTests {

    @LocalServerPort
    private int port;

    @Value("($local.management.port)")
    private String mgmt;

    @Autowired
    private TestRestTemplate TestRestTemplate;

    @Test
    public void return200WhenSendingRequestToController() throws Exception {
        @SuppressWarnings("rawtypes")
        ResponseEntity<Map> entity = this.TestRestTemplate.getForEntity(
                "http://localhost:" + this.port + "/json", Map.class);
        then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Ignore
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
