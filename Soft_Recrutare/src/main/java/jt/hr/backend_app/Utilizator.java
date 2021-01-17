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
@Table(name = "UTILIZATOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilizator.findAll", query = "SELECT u FROM Utilizator u")
    , @NamedQuery(name = "Utilizator.findById", query = "SELECT u FROM Utilizator u WHERE u.id = :id")
    , @NamedQuery(name = "Utilizator.findByIdfunctie", query = "SELECT u FROM Utilizator u WHERE u.idfunctie = :idfunctie")
    , @NamedQuery(name = "Utilizator.findByNume", query = "SELECT u FROM Utilizator u WHERE u.nume = :nume")
    , @NamedQuery(name = "Utilizator.findByTelefon", query = "SELECT u FROM Utilizator u WHERE u.telefon = :telefon")
    , @NamedQuery(name = "Utilizator.findByEmail", query = "SELECT u FROM Utilizator u WHERE u.email = :email")
    , @NamedQuery(name = "Utilizator.findByMobil", query = "SELECT u FROM Utilizator u WHERE u.mobil = :mobil")
    , @NamedQuery(name = "Utilizator.findByNumeutilizator", query = "SELECT u FROM Utilizator u WHERE u.numeutilizator = :numeutilizator")})
public class Utilizator implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "IDFUNCTIE")
    private Integer idfunctie;
    @Size(max = 255)
    @Column(name = "NUME")
    private String nume;
    @Size(max = 255)
    @Column(name = "TELEFON")
    private String telefon;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 255)
    @Column(name = "MOBIL")
    private String mobil;
    @Size(max = 255)
    @Column(name = "NUMEUTILIZATOR")
    private String numeutilizator;

    public Utilizator() {
    }

    public Utilizator(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdfunctie() {
        return idfunctie;
    }

    public void setIdfunctie(Integer idfunctie) {
        this.idfunctie = idfunctie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getNumeutilizator() {
        return numeutilizator;
    }

    public void setNumeutilizator(String numeutilizator) {
        this.numeutilizator = numeutilizator;
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
        if (!(object instanceof Utilizator)) {
            return false;
        }
        Utilizator other = (Utilizator) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jt.hr.backend_app.Utilizator[ id=" + id + " ]";
    }
    
}
