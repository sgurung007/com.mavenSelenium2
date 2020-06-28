package com.vaadin.suraj.backend.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.LinkedList;
import java.util.List;
@Entity
public class Company extends AbstractEntity{
    private String name;
    @OneToMany(mappedBy = "company",fetch = FetchType.EAGER)
    private List<Contact> employee=new LinkedList<>();

    public Company() {
    }

    public Company(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getEmployee() {
        return employee;
    }
}
