package fr.hoc.dap.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import fr.hoc.dap.server.service.Config;

/** . */
@SpringBootApplication
public class Application {
    /** . */
    // private static final Logger LOG = LogManager.getLogger();

    /**
     * .
     *
     * @param args arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * @return a default config
     */
    @Bean
    public Config createConf() {
        Config conf = new Config();
        return conf;
    }

    /**
     * @return .
     * @param ctx .
     */
    @Bean
    public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
        return args -> {

        };
    }
}
