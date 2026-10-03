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
        ApplicationContext context = new ClassPathXmlApplicationContext();
        // BeanFactory not initialized or already closed - call 'refresh' before accessing beans via the ApplicationContext
        Alien obj = (Alien) context.getBean("alien");
        obj.code();
    }
}
