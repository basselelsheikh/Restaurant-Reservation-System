/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.classes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author beso_
 */
public class DishAdapter extends XmlAdapter<DishAdapter.Adapted, Dish> {

    @Override
    public Dish unmarshal(Adapted ad) throws Exception {
        if (ad==null) {
            return null;
        }
        if (ad.getType().equals("main_course")) {
            MainCourse m = new MainCourse();
            m.setName(ad.getName());
            m.setPrice(ad.getPrice());
            return m;
        } else if(ad.getType().equals("appetizer")){
            Appetizer a = new Appetizer();
            a.setName(ad.getName());
            a.setPrice(ad.getPrice());
            return a;
        
        } else {
            Dessert d = new Dessert();
            d.setName(ad.getName());
            d.setPrice(ad.getPrice());
            return d;
        }
        
    }

    @Override
    public Adapted marshal(Dish bt) throws Exception {
        if(bt == null)
        {
            return null;
        }
        Adapted ad = new Adapted();
        if(bt instanceof MainCourse)
        {
            MainCourse m1 = (MainCourse) bt;
            ad.setName(m1.getName());
            ad.setPrice(m1.getPrice());
            ad.setType("main_course");
            
        }
        else if (bt instanceof Appetizer){
            Appetizer a1 = (Appetizer) bt;
            ad.setName(a1.getName());
            ad.setPrice(a1.getPrice());
            ad.setType("appetizer");
        }
else {
            Dessert d1 = (Dessert) bt;
            ad.setName(d1.getName());
            ad.setPrice(d1.getPrice());
            ad.setType("dessert");
        }
        return ad;
    }
    
    
// This class must be static for the Adapter to work 
    static class Adapted {

       
        private String name;

        
        private int price;

        
        private String type;
 @XmlElement
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
@XmlElement
        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
@XmlElement
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

    }
   
    
}

