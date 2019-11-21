/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author acarr
 */
@Entity
@Table(name = "planeta_editable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanetaEditable.findAll", query = "SELECT p FROM PlanetaEditable p")
    , @NamedQuery(name = "PlanetaEditable.findByIdPlaneta", query = "SELECT p FROM PlanetaEditable p WHERE p.idPlaneta = :idPlaneta")
    , @NamedQuery(name = "PlanetaEditable.findByNombreSistema", query = "SELECT p FROM PlanetaEditable p WHERE p.nombreSistema = :nombreSistema")
    , @NamedQuery(name = "PlanetaEditable.findByNombrePlaneta", query = "SELECT p FROM PlanetaEditable p WHERE p.nombrePlaneta = :nombrePlaneta")
    , @NamedQuery(name = "PlanetaEditable.findByDiametro", query = "SELECT p FROM PlanetaEditable p WHERE p.diametro = :diametro")
    , @NamedQuery(name = "PlanetaEditable.findByDistEstrella", query = "SELECT p FROM PlanetaEditable p WHERE p.distEstrella = :distEstrella")
    , @NamedQuery(name = "PlanetaEditable.findBySatelites", query = "SELECT p FROM PlanetaEditable p WHERE p.satelites = :satelites")
    , @NamedQuery(name = "PlanetaEditable.findByTipo", query = "SELECT p FROM PlanetaEditable p WHERE p.tipo = :tipo")
    , @NamedQuery(name = "PlanetaEditable.findByMasa", query = "SELECT p FROM PlanetaEditable p WHERE p.masa = :masa")
    , @NamedQuery(name = "PlanetaEditable.findByEnano", query = "SELECT p FROM PlanetaEditable p WHERE p.enano = :enano")
    , @NamedQuery(name = "PlanetaEditable.findByVerificado", query = "SELECT p FROM PlanetaEditable p WHERE p.verificado = :verificado")})
public class PlanetaEditable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PLANETA")
    private Long idPlaneta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_SISTEMA")
    private String nombreSistema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_PLANETA")
    private String nombrePlaneta;
    @Lob
    @Column(name = "IMAGEN")
    private byte[] imagen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DIAMETRO")
    private int diametro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DIST_ESTRELLA")
    private int distEstrella;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SATELITES")
    private int satelites;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MASA")
    private String masa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ENANO")
    private boolean enano;
    @Column(name = "VERIFICADO")
    private Boolean verificado;

    public PlanetaEditable() {
    }

    public PlanetaEditable(Long idPlaneta) {
        this.idPlaneta = idPlaneta;
    }

    public PlanetaEditable(Long idPlaneta, String nombreSistema, String nombrePlaneta, int diametro, int distEstrella, int satelites, String tipo, String masa, boolean enano) {
        this.idPlaneta = idPlaneta;
        this.nombreSistema = nombreSistema;
        this.nombrePlaneta = nombrePlaneta;
        this.diametro = diametro;
        this.distEstrella = distEstrella;
        this.satelites = satelites;
        this.tipo = tipo;
        this.masa = masa;
        this.enano = enano;
    }

    public Long getIdPlaneta() {
        return idPlaneta;
    }

    public void setIdPlaneta(Long idPlaneta) {
        this.idPlaneta = idPlaneta;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }

    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistEstrella() {
        return distEstrella;
    }

    public void setDistEstrella(int distEstrella) {
        this.distEstrella = distEstrella;
    }

    public int getSatelites() {
        return satelites;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public boolean getEnano() {
        return enano;
    }

    public void setEnano(boolean enano) {
        this.enano = enano;
    }

    public Boolean getVerificado() {
        return verificado;
    }

    public void setVerificado(Boolean verificado) {
        this.verificado = verificado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlaneta != null ? idPlaneta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanetaEditable)) {
            return false;
        }
        PlanetaEditable other = (PlanetaEditable) object;
        if ((this.idPlaneta == null && other.idPlaneta != null) || (this.idPlaneta != null && !this.idPlaneta.equals(other.idPlaneta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.codejava.modelo.PlanetaEditable[ idPlaneta=" + idPlaneta + " ]";
    }
    
}
