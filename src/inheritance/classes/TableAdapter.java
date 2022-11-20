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
public class TableAdapter extends XmlAdapter<TableAdapter.AdaptedTable, Table> {

    @Override
    public Table unmarshal(AdaptedTable at) throws Exception {
        if (at == null) {
            return null;
        }
        if (at.isSmoking() == true) {

            SmokingTable t = new SmokingTable();
            t.setId(at.getId());
            t.setNo_of_seats(at.getNo_of_seats());
            return t;
        } else {
            NonSmokingTable t2 = new NonSmokingTable();
            t2.setId(at.getId());
            t2.setNo_of_seats(at.getNo_of_seats());
            return t2;

        }
    }

    @Override
    public AdaptedTable marshal(Table bt) throws Exception {

        if (bt == null) {
            return null;
        }
        AdaptedTable at = new AdaptedTable();
        if (bt instanceof SmokingTable) {
            SmokingTable st = (SmokingTable) bt;
            at.setId(st.getId());
            at.setNo_of_seats(st.getNo_of_seats());
            at.setSmoking(true);
        } else {
            NonSmokingTable nt = (NonSmokingTable) bt;
            at.setId(nt.getId());
            at.setNo_of_seats(nt.getNo_of_seats());
            at.setSmoking(false);
        }
        return at;
    }
    
// This class must be static for the Adapter to work 
    static class AdaptedTable
    {
private int id;
    private int no_of_seats;
    private boolean smoking;

    public AdaptedTable() {
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public int getNo_of_seats() {
        return no_of_seats;
    }

    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    public boolean isSmoking() {
        return smoking;
    }

    @XmlElement
    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }
    }

}
