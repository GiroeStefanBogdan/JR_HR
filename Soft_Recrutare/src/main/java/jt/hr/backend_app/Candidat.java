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
@Table(name = "CANDIDAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Candidat.findAll", query = "SELECT c.nume FROM Candidat c")
        , @NamedQuery(name = "Candidat.count", query = "SELECT count(c) FROM Candidat c")

        , @NamedQuery(name = "Candidat.findById", query = "SELECT c FROM Candidat c WHERE c.id = :id")
    , @NamedQuery(name = "Candidat.findByNume", query = "SELECT c FROM Candidat c WHERE c.nume = :nume")
    , @NamedQuery(name = "Candidat.findByTelefon", query = "SELECT c FROM Candidat c WHERE c.telefon = :telefon")
    , @NamedQuery(name = "Candidat.findByMobil", query = "SELECT c FROM Candidat c WHERE c.mobil = :mobil")
    , @NamedQuery(name = "Candidat.findByEmail", query = "SELECT c FROM Candidat c WHERE c.email = :email")
    , @NamedQuery(name = "Candidat.findByAdresa", query = "SELECT c FROM Candidat c WHERE c.adresa = :adresa")
    , @NamedQuery(name = "Candidat.findByRelocare", query = "SELECT c FROM Candidat c WHERE c.relocare = :relocare")
    , @NamedQuery(name = "Candidat.findByLinkcv", query = "SELECT c FROM Candidat c WHERE c.linkcv = :linkcv")})
public class Candidat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "NUME")
    private String nume;
    @Size(max = 255)
    @Column(name = "TELEFON")
    private String telefon;
    @Size(max = 255)
    @Column(name = "MOBIL")
    private String mobil;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 255)
    @Column(name = "ADRESA")
    private String adresa;
    @Column(name = "RELOCARE")
    private Boolean relocare;
    @Size(max = 255)
    @Column(name = "LINKCV")
    private String linkcv;

    public Candidat() {
    }

    public Candidat(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Boolean getRelocare() {
        return relocare;
    }

    public void setRelocare(Boolean relocare) {
        this.relocare = relocare;
    }

    public String getLinkcv() {
        return linkcv;
    }

    public void setLinkcv(String linkcv) {
        this.linkcv = linkcv;
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
        if (!(object instanceof Candidat)) {
            return false;
        }
        Candidat other = (Candidat) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "jt.hr.backend_app.Candidat[ id=" + id + " ]";
    }
    
}
