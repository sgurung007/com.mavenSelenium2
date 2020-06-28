package com.vaadin.suraj.backend.service;

import com.vaadin.suraj.backend.entity.Company;
import com.vaadin.suraj.backend.repositories.ComanyRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private ComanyRepositories companyRepositories;

    public CompanyService(ComanyRepositories companyRepositories) {
        this.companyRepositories = companyRepositories;
    }

    public List<Company> findAll(){
        return companyRepositories.findAll();
    }
}
