/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.edu.br.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author magno
 */
@Entity
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findById", query = "SELECT p FROM Produto p WHERE p.id = :id"),
    @NamedQuery(name = "Produto.findByCodigo", query = "SELECT p FROM Produto p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Produto.findByDescricao", query = "SELECT p FROM Produto p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produto.findByUnidade", query = "SELECT p FROM Produto p WHERE p.unidade = :unidade"),
    @NamedQuery(name = "Produto.findByPesoBruto", query = "SELECT p FROM Produto p WHERE p.pesoBruto = :pesoBruto"),
    @NamedQuery(name = "Produto.findByPesoLiqido", query = "SELECT p FROM Produto p WHERE p.pesoLiqido = :pesoLiqido")})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "unidade")
    private Integer unidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "peso_bruto")
    private BigDecimal pesoBruto;
    @Column(name = "peso_liqido")
    private BigDecimal pesoLiqido;
    @JoinColumn(name = "fk_familia", referencedColumnName = "id")
    @ManyToOne
    private Familia fkFamilia;

    public Produto() {
    }

    public Produto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getUnidade() {
        return unidade;
    }

    public void setUnidade(Integer unidade) {
        this.unidade = unidade;
    }

    public BigDecimal getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public BigDecimal getPesoLiqido() {
        return pesoLiqido;
    }

    public void setPesoLiqido(BigDecimal pesoLiqido) {
        this.pesoLiqido = pesoLiqido;
    }

    public Familia getFkFamilia() {
        return fkFamilia;
    }

    public void setFkFamilia(Familia fkFamilia) {
        this.fkFamilia = fkFamilia;
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
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utfpr.edu.br.model.Produto[ id=" + id + " ]";
    }
    
}
