package edu.personal.cameldemo.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileMoverRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:///tmp/camel")
                .log("header=${headers}")
                .log("body=${body}")
                .to("file:///tmp/camel/processed");
    }
}
