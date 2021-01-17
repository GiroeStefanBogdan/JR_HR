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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ionut
 */
@Entity
@Table(name = "CANDIDATDATAINTERVIU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Candidatdatainterviu.findAll", query = "SELECT c FROM Candidatdatainterviu c")
    , @NamedQuery(name = "Candidatdatainterviu.findById", query = "SELECT c FROM Candidatdatainterviu c WHERE c.id = :id")
    , @NamedQuery(name = "Candidatdatainterviu.findByIdcandidat", query = "SELECT c FROM Candidatdatainterviu c WHERE c.idcandidat = :idcandidat")
    , @NamedQuery(name = "Candidatdatainterviu.findByIddata", query = "SELECT c FROM Candidatdatainterviu c WHERE c.iddata = :iddata")})
public class Candidatdatainterviu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "IDCANDIDAT")
    private Integer idcandidat;
    @Column(name = "IDDATA")
    private Integer iddata;

    public Candidatdatainterviu() {
    }

    public Candidatdatainterviu(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdcandidat() {
        return idcandidat;
    }

    public void setIdcandidat(Integer idcandidat) {
        this.idcandidat = idcandidat;
    }

    public Integer getIddata() {
        return iddata;
    }

    public void setIddata(Integer iddata) {
        this.iddata = iddata;
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
        if (!(object instanceof Candidatdatainterviu)) {
            return false;
        }
        Candidatdatainterviu other = (Candidatdatainterviu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jt.hr.backend_app.Candidatdatainterviu[ id=" + id + " ]";
    }
    
}
