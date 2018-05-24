/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "user_details", catalog = "bank", schema = "")
@NamedQueries({
    @NamedQuery(name = "UserDetails.findAll", query = "SELECT u FROM UserDetails u")
    , @NamedQuery(name = "UserDetails.findById", query = "SELECT u FROM UserDetails u WHERE u.id = :id")
    , @NamedQuery(name = "UserDetails.findByFirstName", query = "SELECT u FROM UserDetails u WHERE u.firstName = :firstName")
    , @NamedQuery(name = "UserDetails.findByLastName", query = "SELECT u FROM UserDetails u WHERE u.lastName = :lastName")
    , @NamedQuery(name = "UserDetails.findByUserName", query = "SELECT u FROM UserDetails u WHERE u.userName = :userName")
    , @NamedQuery(name = "UserDetails.findByPassword", query = "SELECT u FROM UserDetails u WHERE u.password = :password")})
public class UserDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "LastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public UserDetails() {
    }

    public UserDetails(Integer id) {
	this.id = id;
    }

    public UserDetails(Integer id, String firstName, String lastName, String userName, String password) {
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.userName = userName;
	this.password = password;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	Integer oldId = this.id;
	this.id = id;
	changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	String oldFirstName = this.firstName;
	this.firstName = firstName;
	changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	String oldLastName = this.lastName;
	this.lastName = lastName;
	changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	String oldUserName = this.userName;
	this.userName = userName;
	changeSupport.firePropertyChange("userName", oldUserName, userName);
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	String oldPassword = this.password;
	this.password = password;
	changeSupport.firePropertyChange("password", oldPassword, password);
    }

    @Override
    public int hashCode() {
	int hash = 0;
	hash += (id != null ? id.hashCode() : 0);
	return hash;
    }

    @Override
    public boolean equals(Object object) {
	// TODO: Warning - this method won't work in the case the id fields are not set
	if (!(object instanceof UserDetails)) {
	    return false;
	}
	UserDetails other = (UserDetails) object;
	if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "BankManagement.UserDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
	changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
	changeSupport.removePropertyChangeListener(listener);
    }
    
}
