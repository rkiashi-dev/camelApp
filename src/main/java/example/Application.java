package example;

import org.apache.camel.impl.DefaultCamelContext;

public class Application {

    public static void main(String[] args) throws Exception {

        DefaultCamelContext context = new DefaultCamelContext();
        context.start();
    }
}
