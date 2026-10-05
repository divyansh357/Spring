package com.divyansh;

import org.springframework.context.ApplicationContext;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // Spring container is created and config file is passed - which will be used by Spring to know what classes it has to manage
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

        Alien obj2 = (Alien) context.getBean("alien1");
        System.out.println(obj2.getAge());

    }
}
