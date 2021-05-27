package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Owner;

@Repository
public interface OwnerDAO  extends JpaRepository<Owner, Integer>{

 

}
 



