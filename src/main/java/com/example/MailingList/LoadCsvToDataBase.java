package com.example.MailingList;

import jakarta.annotation.PostConstruct;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoadCsvToDataBase {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AdministratorRepository administratorRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @PostConstruct
    public void loadData() throws Exception {
        List<Employee> employees = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();
        List<Administrator> administrators = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/templates/persons.csv"))){
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) !=null){
                String[]values = line.split((","));
                if (values.length < 4)continue;
                Long id = Long.parseLong(values[0].trim());
                String type = values[2].trim().toLowerCase();
                String mail = values[3].trim();

                    switch (type){
                        case "employee" -> employees.add(new Employee( mail));
                        case "customer"  -> customers.add(new Customer( mail));
                        case "administrator" -> administrators.add(new Administrator(mail));
                }

            }

        }
        employeeRepository.deleteAll();
        customerRepository.deleteAll();
        administratorRepository.deleteAll();

        employeeRepository.saveAll(employees);
        customerRepository.saveAll(customers);
        administratorRepository.saveAll(administrators);

        System.out.println("successful load from CSV");
    }



}
