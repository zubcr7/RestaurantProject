package com.example.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="owner1")
public class Owner {
	
	
	    
	            @Id
	            @GeneratedValue(strategy=GenerationType.AUTO)
	            @Column(name="oid" )
	            private int oid;
	            @Column(name="ownerName",nullable=false)
	            private String ownerName;
	            
	           // @OneToOne
	           // private Resturant resturant;
	           
	           //@ManyToOne
	          // @JsonIgnore
	          // private Resturant resturant1;
	            
	           
	    
	     

}
