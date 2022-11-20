/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.classes;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author beso_
 */
//@XmlType (propOrder={"name","role","username","password","table_number"})
@XmlRootElement
public class Customer extends User{
    
    private Table table;
    private double total;
    private ArrayList<Order> orders = new ArrayList<>();

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
    
    public Customer()
    {
        
    }

    public Customer(String name, String username, String password) {
        super(name, username, password);
    }
    
    

 @XmlElementWrapper(name="orders")
    @XmlElement(name="order")
    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

 
    
}
