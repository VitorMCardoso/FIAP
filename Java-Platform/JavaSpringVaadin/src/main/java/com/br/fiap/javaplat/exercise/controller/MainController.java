package com.br.fiap.javaplat.exercise.controller;

import com.br.fiap.javaplat.exercise.controller.REST.GreetingController;
import com.br.fiap.javaplat.exercise.model.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    //private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
    
    @GetMapping("/rest/greeting")
    public Greeting restGreeting(@RequestBody Greeting greetingRequest) {
        return new GreetingController().greeting(greetingRequest);
    }

    // @Bean
    // public CommandLineRunner loadData(CustomerRepository repository) {
    //     return (args) -> {
    //         // save a couple of customers
    //         repository.save(new Customer("Jack", "Bauer"));
    //         repository.save(new Customer("Chloe", "O'Brian"));
    //         repository.save(new Customer("Kim", "Bauer"));
    //         repository.save(new Customer("David", "Palmer"));
    //         repository.save(new Customer("Michelle", "Dessler"));

    //         // fetch all customers
    //         log.info("Customers found with findAll():");
    //         log.info("-------------------------------");
    //         for (Customer customer : repository.findAll()) {
    //             log.info(customer.toString());
    //         }
    //         log.info("");

    //         // fetch an individual customer by ID
    //         Customer customer = repository.findById(1L).get();
    //         log.info("Customer found with findOne(1L):");
    //         log.info("--------------------------------");
    //         log.info(customer.toString());
    //         log.info("");

    //         // fetch customers by last name
    //         log.info("Customer found with findByLastNameStartsWithIgnoreCase('Bauer'):");
    //         log.info("--------------------------------------------");
    //         for (Customer bauer : repository.findByLastNameStartsWithIgnoreCase("Bauer")) {
    //             log.info(bauer.toString());
    //         }
    //         log.info("");
    //     };
    // }
}