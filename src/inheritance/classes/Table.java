

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.classes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author beso_
 */

//@XmlType (propOrder={"id","no_of_seats","smoking"})
@XmlJavaTypeAdapter(TableAdapter.class)
public abstract class Table {
    
    protected int id;
    protected int no_of_seats;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNo_of_seats() {
        return no_of_seats;
    }

    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }
   
}
