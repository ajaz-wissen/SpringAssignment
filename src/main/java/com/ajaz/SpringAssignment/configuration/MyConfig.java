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

    @Value ("${address.mumbai.state}")
    private String mumbaiState;

    @Value ("${address.mumbai.city}")
    private String mumbaiCity;

    @Value("${address.mumbai.area}")
    private String mumbaiArea;

    @Value("${address.mumbai.businessPark}")
    private String mumbaiBusinessPark;

    @Value("${address.mumbai.building}")
    private String mumbaiBuilding;

    @Value("${address.mumbai.pin}")
    private int mumbaiPin;

    @Value ("${address.pune.state}")
    private String puneState;

    @Value ("${address.pune.city}")
    private String puneCity;

    @Value("${address.pune.area}")
    private String puneArea;

    @Value("${address.pune.businessPark}")
    private String puneBusinessPark;

    @Value("${address.pune.building}")
    private String puneBuilding;

    @Value("${address.pune.pin}")
    private int punePin;

    @Value ("${address.bangalore.state}")
    private String bangaloreState;

    @Value ("${address.bangalore.city}")
    private String bangaloreCity;

    @Value("${address.bangalore.area}")
    private String bangaloreArea;

    @Value("${address.bangalore.businessPark}")
    private String bangaloreBusinessPark;

    @Value("${address.bangalore.building}")
    private String bangaloreBuilding;

    @Value("${address.bangalore.pin}")
    private int bangalorePin;

    @Bean
    @Scope("prototype")
    @ConfigurationProperties(prefix = "address.mumbai")
    public Address getAddressMumbai(){
        return new Address(mumbaiState, mumbaiCity, mumbaiArea,
                mumbaiBusinessPark, mumbaiBuilding, mumbaiPin);
    }

    @Bean
    @ConfigurationProperties(prefix = "address.pune")
    public Address getAddressPune(){
        return new Address(puneState, puneCity, puneArea,
                puneBusinessPark, puneBuilding, punePin);
    }

    @Bean
    @ConfigurationProperties(prefix = "address.bangalore")
    public Address getAddressBangalore(){
        return new Address(puneState, puneCity, puneArea,
                puneBusinessPark, puneBuilding, punePin);
    }

}
