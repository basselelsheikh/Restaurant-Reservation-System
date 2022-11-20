/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.classes;


/**
 *
 * @author beso_
 */
public class Appetizer extends Dish{  
    
    public Appetizer() {
    }

    public Appetizer(String name, int price) {
        super(name, price);
    }

    @Override
    public double Tax() {
        return 1.1;
    }
    
  
}



