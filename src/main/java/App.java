import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        // Получаем бин HelloWorld дважды
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        // Получаем бин Cat дважды
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        // Проверяем и выводим результаты сравнения по ссылке
        System.out.println("HelloWorld beans are the same: " + (bean1 == bean2));
        System.out.println("Cat beans are the same: " + (cat1 == cat2));
    }
}