package com.java.sd.projectboot.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.sd.projectboot.model.entities.Cliente;

public interface SbRepository extends JpaRepository<Cliente,Integer> {

}
