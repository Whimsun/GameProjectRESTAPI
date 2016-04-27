/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetprogrammeren.gameprojectrestapi;

import domain.ServiceFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author Tim
 */
@Configuration
@ComponentScan("internetprogrammeren.gameprojectrestapi.controller")
@EnableWebMvc  
public class ApplicationConfig { 
    @Bean
     public ServiceFacade service() {
         return new ServiceFacade("database");
     }
}
