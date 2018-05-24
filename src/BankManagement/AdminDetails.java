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
@Table(name = "admin_details", catalog = "bank", schema = "")
@NamedQueries({
    @NamedQuery(name = "AdminDetails.findAll", query = "SELECT a FROM AdminDetails a")
    , @NamedQuery(name = "AdminDetails.findById", query = "SELECT a FROM AdminDetails a WHERE a.id = :id")
    , @NamedQuery(name = "AdminDetails.findByName", query = "SELECT a FROM AdminDetails a WHERE a.name = :name")
    , @NamedQuery(name = "AdminDetails.findByUserName", query = "SELECT a FROM AdminDetails a WHERE a.userName = :userName")
    , @NamedQuery(name = "AdminDetails.findByPassword", query = "SELECT a FROM AdminDetails a WHERE a.password = :password")})
public class AdminDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;

    public AdminDetails() {
    }

    public AdminDetails(Integer id) {
	this.id = id;
    }

    public AdminDetails(Integer id, String name, String userName, String password) {
	this.id = id;
	this.name = name;
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

    public String getName() {
	return name;
    }

    public void setName(String name) {
	String oldName = this.name;
	this.name = name;
	changeSupport.firePropertyChange("name", oldName, name);
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
	if (!(object instanceof AdminDetails)) {
	    return false;
	}
	AdminDetails other = (AdminDetails) object;
	if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "BankManagement.AdminDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
	changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
	changeSupport.removePropertyChangeListener(listener);
    }
    
}
