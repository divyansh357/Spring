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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // Spring container is created and config file is passed - which will be used by Spring to know what classes it has to manage
        // BeanFactory not initialized or already closed - call 'refresh' before accessing beans via the ApplicationContext
        Alien obj = (Alien) context.getBean("alien");
        obj.code();
    }
}
