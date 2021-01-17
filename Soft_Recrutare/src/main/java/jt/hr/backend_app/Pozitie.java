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
@Table(name = "POZITIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pozitie.findAll", query = "SELECT p FROM Pozitie p")
    , @NamedQuery(name = "Pozitie.findById", query = "SELECT p FROM Pozitie p WHERE p.id = :id")
    , @NamedQuery(name = "Pozitie.findByNumepozitie", query = "SELECT p FROM Pozitie p WHERE p.numepozitie = :numepozitie")
    , @NamedQuery(name = "Pozitie.findByNumarpersoane", query = "SELECT p FROM Pozitie p WHERE p.numarpersoane = :numarpersoane")
    , @NamedQuery(name = "Pozitie.findByIdpersoanadeschisfunctie", query = "SELECT p FROM Pozitie p WHERE p.idpersoanadeschisfunctie = :idpersoanadeschisfunctie")
    , @NamedQuery(name = "Pozitie.findByIddescriere", query = "SELECT p FROM Pozitie p WHERE p.iddescriere = :iddescriere")})
public class Pozitie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "NUMEPOZITIE")
    private String numepozitie;
    @Column(name = "NUMARPERSOANE")
    private Integer numarpersoane;
    @Column(name = "IDPERSOANADESCHISFUNCTIE")
    private Integer idpersoanadeschisfunctie;
    @Column(name = "IDDESCRIERE")
    private Integer iddescriere;

    public Pozitie() {
    }

    public Pozitie(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumepozitie() {
        return numepozitie;
    }

    public void setNumepozitie(String numepozitie) {
        this.numepozitie = numepozitie;
    }

    public Integer getNumarpersoane() {
        return numarpersoane;
    }

    public void setNumarpersoane(Integer numarpersoane) {
        this.numarpersoane = numarpersoane;
    }

    public Integer getIdpersoanadeschisfunctie() {
        return idpersoanadeschisfunctie;
    }

    public void setIdpersoanadeschisfunctie(Integer idpersoanadeschisfunctie) {
        this.idpersoanadeschisfunctie = idpersoanadeschisfunctie;
    }

    public Integer getIddescriere() {
        return iddescriere;
    }

    public void setIddescriere(Integer iddescriere) {
        this.iddescriere = iddescriere;
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
        if (!(object instanceof Pozitie)) {
            return false;
        }
        Pozitie other = (Pozitie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jt.hr.backend_app.Pozitie[ id=" + id + " ]";
    }
    
}
