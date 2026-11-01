package com.divyansh.config;

import com.divyansh.Alien;
import com.divyansh.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name={"com2","desktop1","Beast"})  // Bean Name : We can call by any one of the name
    //@Scope("prototype") // to set the scope , by default its singleton
    public Desktop desktop(){
        return  new Desktop();
    }

    @Bean
    public Alien alien(@Autowired Desktop com){
        Alien obj = new Alien();
        obj.setAge(21);
        obj.setCom(com);
        return obj;
    }
}
