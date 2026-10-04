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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // BeanFactory not initialized or already closed - call 'refresh' before accessing beans via the ApplicationContext
        Alien obj = (Alien) context.getBean("alien");
        obj.code();
    }
}
