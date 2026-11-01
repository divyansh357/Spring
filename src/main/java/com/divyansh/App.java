package com.divyansh;

import com.divyansh.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Configuring the Spring application through the XML Based Config
        // this is the object creation step , all the beans with the bean tag are created in this step
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // Spring container is created and config file is passed - which will be used by Spring to know what classes it has to manage
        // BeanFactory not initialized or already closed - call 'refresh' before accessing beans via the ApplicationContext
       // Creating two references for a single bean - they will share the same object
        // Scopes in Spring Core
//        Alien obj1 = (Alien) context.getBean("alien1");
//        obj1.age = 21;
//        System.out.println(obj1.age);
//        obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien1");
//        System.out.println(obj2.age);
//        obj2.code();

        // Setter Injection

//        Alien obj2 = (Alien) context.getBean("alien1");
//        System.out.println(obj2.getAge());
//        obj2.code();

        // For LazyInit Bean
//        Desktop obj = (Desktop) context.getBean("com2");
//        obj.compile();

        // GetBean By Type
//        Alien obj2 = context.getBean("alien1",Alien.class);
//        System.out.println(obj2.getAge());
//        obj2.code();

//        Desktop obj = context.getBean(Desktop.class);
//        obj.compile();
//
//        Computer obj3 = context.getBean(Computer.class); // this returns the object of the primary Bean(if multiple present) which belongs to the class implementing Computer Interface


        // Java Based Configuration

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Bean Name
//        Desktop desk = context.getBean("Beast",Desktop.class); // we can call bean by name
//        desk.compile();


        // Scope Annotation
//        Desktop desk = context.getBean(Desktop.class);
//        desk.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();

        // Autowired

        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();

    }
}
