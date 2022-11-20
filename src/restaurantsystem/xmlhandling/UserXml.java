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
@XmlType (propOrder={"name","role","username","password"})
public class UserXml {
    private String name;
    private String role;
    private String username;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserXml() {
    }

    public UserXml(String name, String role, String username, String password) {
        this.name = name;
        this.role = role;
        this.username = username;
        this.password = password;
    }
    
    
}
