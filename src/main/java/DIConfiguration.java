import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import services.EmailService;
import services.MessageService;
import services.TwitterService;

@Configuration
@ComponentScan(value = {"services"})
public class DIConfiguration {

    @Bean
    public MessageService getMessageService() {
        return new TwitterService();
    }
}
