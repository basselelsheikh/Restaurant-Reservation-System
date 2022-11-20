/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem.xmlhandling;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author beso_
 */
@XmlType (propOrder={"number","no_of_seats","smoking"})
public class TableXml {
    private int number;
    private int no_of_seats;
    private boolean smoking;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
@XmlElement(name="number_of_seats")
    public int getNo_of_seats() {
        return no_of_seats;
    }

    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }
    
}
