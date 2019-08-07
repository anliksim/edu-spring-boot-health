package edu.boot.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyServiceHealthIndicator extends AbstractHealthIndicator {

    private static final AtomicInteger COUNT = new AtomicInteger();

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        if (COUNT.incrementAndGet() % 5 == 0) {
            throw new Exception("Service is down");
        } else if (COUNT.incrementAndGet() % 3 == 0) {
            builder.down().withDetail("service", "Something is broken");
        } else {
            builder.up().withDetail("service", "Running");
        }
    }
}
