package com.ajaz.SpringAssignment.configuration;

import com.ajaz.SpringAssignment.models.Address;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

    @Bean
    @ConfigurationProperties(prefix = "address.mumbai")
    public Address getAddressMumbai(){
        return new Address();
    }

    @Bean
    @ConfigurationProperties(prefix = "address.pune")
    public Address getAddressPune(){
        return new Address();
    }

    @Bean
    @ConfigurationProperties(prefix = "address.bangalore")
    public Address getAddressBangalore(){
        return new Address();
    }

}
