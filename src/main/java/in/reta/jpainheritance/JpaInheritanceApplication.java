package in.reta.jpainheritance;

import in.reta.jpainheritance.joined.JoinedTableService;
import in.reta.jpainheritance.singlejsonb.SingleJBlobTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaInheritanceApplication {

    @Autowired
    JoinedTableService joinedTableService;

    @Autowired
    SingleJBlobTableService singleJBlobTableService;

    public static void main(String[] args) {
        SpringApplication.run(JpaInheritanceApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
//            joinedTableService.execute();
            singleJBlobTableService.execute();
        };
    }
}
