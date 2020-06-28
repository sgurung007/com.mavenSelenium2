package com.vaadin.suraj.backend.service;

import com.vaadin.suraj.backend.entity.Company;
import com.vaadin.suraj.backend.entity.Contact;
import com.vaadin.suraj.backend.repositories.ComanyRepositories;
import com.vaadin.suraj.backend.repositories.ContactRepositories;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ContactService {
    private static final Logger LOGGER = Logger.getLogger(ContactService.class.getName());
    private ContactRepositories contactRepositories;
    private ComanyRepositories companyRepositories;

    public ContactService(ContactRepositories contactRepositories, ComanyRepositories companyRepositories) {
        this.contactRepositories = contactRepositories;
        this.companyRepositories = companyRepositories;
    }

    public List<Contact> findAll() {
        return contactRepositories.findAll();
    }

    public List<Contact> findAll(String filterText) {
        if (filterText == null || filterText == null) {
            return contactRepositories.findAll();
        } else {
            return contactRepositories.search(filterText);
        }

    }

    public Long cout() {
        return contactRepositories.count();
    }

    public void delete(Contact contact) {
        contactRepositories.delete(contact);
    }

    public void save(Contact contact) {
        if (contact == null) {
            LOGGER.log(Level.SEVERE, "Contact is null. Have your contacted your form to the application");
            return;
        }
        contactRepositories.save(contact);

    }


    @PostConstruct
    public void populateTestData() {
        if (companyRepositories.count() == 0) {
            companyRepositories.saveAll(
                    Stream.of("Path-Way Electronics", "E-Tech Management", "Path-E-Tech Management")
                            .map(Company::new)
                            .collect(Collectors.toList()));
        }

        if (contactRepositories.count() == 0) {
            Random r = new Random(0);
            List<Company> companies = companyRepositories.findAll();
            contactRepositories.saveAll(
                    Stream.of("Gabrielle Patel", "Brian Robinson", "Eduardo Haugen",
                            "Koen Johansen", "Alejandro Macdonald", "Angel Karlsson", "Yahir Gustavsson", "Haiden Svensson",
                            "Emily Stewart", "Corinne Davis", "Ryann Davis", "Yurem Jackson", "Kelly Gustavsson",
                            "Eileen Walker", "Katelyn Martin", "Israel Carlsson", "Quinn Hansson", "Makena Smith",
                            "Danielle Watson", "Leland Harris", "Gunner Karlsen", "Jamar Olsson", "Lara Martin",
                            "Ann Andersson", "Remington Andersson", "Rene Carlsson", "Elvis Olsen", "Solomon Olsen",
                            "Jaydan Jackson", "Bernard Nilsen")
                            .map(name -> {
                                String[] split = name.split(" ");
                                Contact contact = new Contact();
                                contact.setFirstName(split[0]);
                                contact.setLastName(split[1]);
                                contact.setCompany(companies.get(r.nextInt(companies.size())));
                                contact.setStatus(Contact.Status.values()[r.nextInt(Contact.Status.values().length)]);
                                String email = (contact.getFirstName() + "." + contact.getLastName() + "@" + contact.getCompany().getName().replaceAll("[\\s-]", "") + ".com").toLowerCase();
                                contact.setEmail(email);
                                return contact;
                            }).collect(Collectors.toList()));
        }
    }
}
