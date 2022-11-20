/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem.xmlhandling;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import inheritance.classes.Dish;

/**
 *
 * @author beso_
 */
@XmlRootElement(name="dishes")
public class ListDishes {
    
    private ArrayList<DishXml> listdish = new ArrayList<>();
@XmlElement(name="dish")
    public ArrayList<DishXml> getListdish() {
        return listdish;
    }

    public void setListdish(ArrayList<DishXml> listdish) {
        this.listdish = listdish;
    }
    
}
