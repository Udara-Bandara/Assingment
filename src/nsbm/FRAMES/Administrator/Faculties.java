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
@Table(name = "Faculties", catalog = "nsbm", schema = "")
@NamedQueries({
    @NamedQuery(name = "Faculties.findAll", query = "SELECT f FROM Faculties f"),
    @NamedQuery(name = "Faculties.findByFId", query = "SELECT f FROM Faculties f WHERE f.fId = :fId"),
    @NamedQuery(name = "Faculties.findByFName", query = "SELECT f FROM Faculties f WHERE f.fName = :fName")})
public class Faculties implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "f_id")
    private String fId;
    @Basic(optional = false)
    @Column(name = "f_name")
    private String fName;

    public Faculties() {
    }

    public Faculties(String fId) {
        this.fId = fId;
    }

    public Faculties(String fId, String fName) {
        this.fId = fId;
        this.fName = fName;
    }

    public String getFId() {
        return fId;
    }

    public void setFId(String fId) {
        String oldFId = this.fId;
        this.fId = fId;
        changeSupport.firePropertyChange("FId", oldFId, fId);
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        String oldFName = this.fName;
        this.fName = fName;
        changeSupport.firePropertyChange("FName", oldFName, fName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fId != null ? fId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faculties)) {
            return false;
        }
        Faculties other = (Faculties) object;
        if ((this.fId == null && other.fId != null) || (this.fId != null && !this.fId.equals(other.fId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nsbm.FRAMES.Administrator.Faculties[ fId=" + fId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
