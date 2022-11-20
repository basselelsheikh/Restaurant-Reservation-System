/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.classes;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author beso_
 */
@XmlRootElement
@XmlJavaTypeAdapter(DishAdapter.class)
//@XmlType (propOrder={"name","price"})
 public abstract class  Dish {
    
    
    private String name;
    private int price; 
   

    public Dish() {
    }

    public Dish(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
     public abstract double Tax();
    
}


