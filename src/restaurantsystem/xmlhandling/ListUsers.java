/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem.xmlhandling;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author beso_
 */
@XmlRootElement(name="users")
public class ListUsers {
    
    private ArrayList<UserXml> listuser = new ArrayList<>();
    @XmlElement(name="user")
    public ArrayList<UserXml> getListuser() {
        return listuser;
    }

    public void setListuser(ArrayList<UserXml> listuser) {
        this.listuser = listuser;
    }
    
}
