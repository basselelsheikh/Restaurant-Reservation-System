/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem.xmlhandling;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author beso_
 */
@XmlType (propOrder={"name","price","type"})
public class DishXml {
    private String name;
    private int price; 
    private String type;

    public String getName() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DishXml() {
    }

    public DishXml(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    
}
