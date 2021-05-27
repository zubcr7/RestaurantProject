package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Resturant;

@Repository
public interface ResturantDAO extends JpaRepository<Resturant, Integer>{
    public Resturant findByResName(String resName);
    public List<Resturant> findByResRating(float resRating);
    
    @Query(value="select * from resturant where res_rating >:rating",nativeQuery = true)
    public List<Resturant> searchByResRating1(@Param("rating") float rating);
    //public Resturant findByResName(String res_name);
}
 
