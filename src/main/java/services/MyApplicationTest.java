package services;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "services")
public class MyApplicationTest {
    private AnnotationConfigApplicationContext context = null;

    @Bean
    public MessageService getMessageService() {
        return new MessageService() {
            @Override
            public boolean sendMessage(String msg, String rec) {
                System.out.println("Mock Service");
                return true;
            }
        };
    }

//    @Before
//    public void setUp() throws Exception {
//        context = new AnnotationConfigApplicationContext(MyApplication.class);
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        context.close();
//    }
//
//    @Test
//    public void test() {
//        MyApplication app = context.getBean(MyApplication.class);
//        Assert.assertTrue(app.processMessage("Hi Elgordo", "elgordo@gmail.com"));
//    }
}
