package com.example.listset;

import com.example.listset.exception.EmployerNotFoundException;
import com.example.listset.exception.EmployeeAlreadyAddedException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class InterfaceEmploeServImpl implements InterfaceEmploeServ {

    private final List<Employer> employerList;

    public InterfaceEmploeServImpl() {
        this.employerList = new ArrayList<>();
    }

    @Override
    public Employer add(String fio, int departament, int salary) {
        Employer employer = new Employer(fio, departament, salary);
        if (employerList.contains(employer)) {
            throw new EmployeeAlreadyAddedException();
        }
        employerList.add(employer);
        return null;
    }

    @Override
    public Employer remove(String fio, int departament, int salary) {
        Employer employer = new Employer(fio, departament, salary);
        if (employerList.contains(employer)) {
        employerList.remove(employer);
        return employer;
    }
    throw new EmployerNotFoundException();

}


    @Override
    public Employer find(String fio, int departament, int salary) {
        Employer employer = new Employer(fio, departament, salary);
        if (employerList.contains(employer)) {
            return employer;
        }
        throw new EmployerNotFoundException();
    }

    @Override
    public Collection<Employer> findAll() {
        return Collection.unmodifiableList(employerList);
    }
}
