import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean == bean1);
        Cat beanForCat = (Cat) applicationContext.getBean("cat");
        Cat beanForCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanForCat.getCat());
        System.out.println(beanForCat == beanForCat1);

    }
}