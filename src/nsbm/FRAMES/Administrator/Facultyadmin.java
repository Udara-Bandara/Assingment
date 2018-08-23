/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm.FRAMES.Administrator;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ubandara
 */
@Entity
@Table(name = "Faculty_admin", catalog = "nsbm", schema = "")
@NamedQueries({
    @NamedQuery(name = "Facultyadmin.findAll", query = "SELECT f FROM Facultyadmin f"),
    @NamedQuery(name = "Facultyadmin.findByUser", query = "SELECT f FROM Facultyadmin f WHERE f.user = :user"),
    @NamedQuery(name = "Facultyadmin.findByPassword", query = "SELECT f FROM Facultyadmin f WHERE f.password = :password"),
    @NamedQuery(name = "Facultyadmin.findByUserId", query = "SELECT f FROM Facultyadmin f WHERE f.userId = :userId"),
    @NamedQuery(name = "Facultyadmin.findByFId", query = "SELECT f FROM Facultyadmin f WHERE f.fId = :fId")})
public class Facultyadmin implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "User")
    private String user;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Id
    @Basic(optional = false)
    @Column(name = "user_id")
    private String userId;
    @Basic(optional = false)
    @Column(name = "f_id")
    private String fId;

    public Facultyadmin() {
    }

    public Facultyadmin(String userId) {
        this.userId = userId;
    }

    public Facultyadmin(String userId, String user, String password, String fId) {
        this.userId = userId;
        this.user = user;
        this.password = password;
        this.fId = fId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        String oldUser = this.user;
        this.user = user;
        changeSupport.firePropertyChange("user", oldUser, user);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        String oldUserId = this.userId;
        this.userId = userId;
        changeSupport.firePropertyChange("userId", oldUserId, userId);
    }

    public String getFId() {
        return fId;
    }

    public void setFId(String fId) {
        String oldFId = this.fId;
        this.fId = fId;
        changeSupport.firePropertyChange("FId", oldFId, fId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facultyadmin)) {
            return false;
        }
        Facultyadmin other = (Facultyadmin) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nsbm.FRAMES.Administrator.Facultyadmin[ userId=" + userId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
