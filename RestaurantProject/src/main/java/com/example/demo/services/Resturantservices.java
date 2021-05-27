package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.OwnerDAO;
import com.example.demo.DAO.ResturantDAO;
import com.example.demo.beans.Owner;
import com.example.demo.beans.Resturant;
import com.example.demo.util.UserInputException;

@Service
public class Resturantservices {
   
       @Autowired
       private ResturantDAO dao;
       
       @Autowired
       private OwnerDAO odao;
       
       public List<Resturant> displayResturants() {
           return dao.findAll();
           //List<Resturant> list=dao.findAll();
           //List<Resturant> list1=list.stream().filter(r -> r.getResRating()>3).collect(Collectors.toList());
           //return list1;
       }
       public  Resturant addResturant(Resturant resturant)  {
           odao.saveAll(resturant.getOwner1());
           return dao.saveAndFlush(resturant);
       }
       public  boolean deleteResturant(int id) throws UserInputException{
           if(dao.findById(id).isPresent()) {
               dao.deleteById(id);
               return true;
           }else
               throw new  UserInputException("ID dosen't exists can't delete");
       }
       public  boolean updateResturant(int id, Resturant resturant) throws UserInputException{
           if(dao.findById(id).isPresent()) {
                odao.saveAll(resturant.getOwner1());
                dao.saveAndFlush(resturant);
                return true;
           }else
               throw new  UserInputException("ID dosen't exists can't update");
       }
       public  Resturant searchResturant(int id3) throws UserInputException{
           if(dao.findById(id3).isPresent()) {
               return dao.findById(id3).get();
           }else
               throw new UserInputException("ID dosen't exists can't search");
       }
       
       public Resturant searchByResName(String resName) {
           return dao.findByResName(resName);
       }
       
       public List<Resturant> searchByResRating(float resRating) {
           return dao.findByResRating(resRating);
       }
       
       public List<Resturant> searchByResRating1(float resRating) {
           return dao.searchByResRating1(resRating);
       }
       //onwer
       public List<Owner> displayOwner() {
           return odao.findAll();
           
       }
       //addowner
      
   }
    
