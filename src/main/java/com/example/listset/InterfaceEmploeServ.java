package com.example.listset;

import java.util.Collection;

public interface InterfaceEmploeServ {


   Employer add(String fio, int departament, int salary);

   Employer remove(String fio, int departament, int salary);
   Employer find(String fio, int departament, int salary);

   Collection<Employer> findAll();
}
