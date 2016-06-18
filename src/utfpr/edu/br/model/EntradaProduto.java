/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.edu.br.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author magno
 */
@Entity
@Table(name = "entrada_produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EntradaProduto.findAll", query = "SELECT e FROM EntradaProduto e"),
    @NamedQuery(name = "EntradaProduto.findById", query = "SELECT e FROM EntradaProduto e WHERE e.id = :id"),
    @NamedQuery(name = "EntradaProduto.findByFkSetor", query = "SELECT e FROM EntradaProduto e WHERE e.fkSetor = :fkSetor"),
    @NamedQuery(name = "EntradaProduto.findByOperacao", query = "SELECT e FROM EntradaProduto e WHERE e.operacao = :operacao"),
    @NamedQuery(name = "EntradaProduto.findByDt", query = "SELECT e FROM EntradaProduto e WHERE e.dt = :dt")})
public class EntradaProduto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fk_setor")
    private Integer fkSetor;
    @Column(name = "operacao")
    private Boolean operacao;
    @Column(name = "dt")
    private Serializable dt;

    public EntradaProduto() {
    }

    public EntradaProduto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkSetor() {
        return fkSetor;
    }

    public void setFkSetor(Integer fkSetor) {
        this.fkSetor = fkSetor;
    }

    public Boolean getOperacao() {
        return operacao;
    }

    public void setOperacao(Boolean operacao) {
        this.operacao = operacao;
    }

    public Serializable getDt() {
        return dt;
    }

    public void setDt(Serializable dt) {
        this.dt = dt;
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
        if (!(object instanceof EntradaProduto)) {
            return false;
        }
        EntradaProduto other = (EntradaProduto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utfpr.edu.br.model.EntradaProduto[ id=" + id + " ]";
    }
    
}
