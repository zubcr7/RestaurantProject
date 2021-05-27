package com.example.demo.beans;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name="resturant1")
public class Resturant {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="res_id")
    private int resId;
    @Column(name="res_name")
    private String resName;
    @Column(name="res_loc")
    private String resLoc;
    @Column(name="res_rating")
    private float resRating ;
    
    @OneToMany
//    @JsonIgnore
    private List<Owner> owner1;

 

}
