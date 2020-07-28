import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.MyApplication;

public class ClientApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);

        app.processMessage("Hi Gordon", "gordon@gmail.com");

        context.close();
    }
}
