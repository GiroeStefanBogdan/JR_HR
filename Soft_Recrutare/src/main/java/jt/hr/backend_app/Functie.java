/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jt.hr.backend_app;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ionut
 */
@Entity
@Table(name = "FUNCTIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Functie.findAll", query = "SELECT f FROM Functie f")
    , @NamedQuery(name = "Functie.findById", query = "SELECT f FROM Functie f WHERE f.id = :id")
    , @NamedQuery(name = "Functie.findByFunctie", query = "SELECT f FROM Functie f WHERE f.functie = :functie")})
public class Functie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "FUNCTIE")
    private String functie;

    public Functie() {
    }

    public Functie(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
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
        if (!(object instanceof Functie)) {
            return false;
        }
        Functie other = (Functie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jt.hr.backend_app.Functie[ id=" + id + " ]";
    }
    
}
