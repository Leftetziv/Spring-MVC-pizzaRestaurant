/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Leyteris
 */
@Entity
@Table(name = "size")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Size1.findAll", query = "SELECT s FROM Size1 s"),
    @NamedQuery(name = "Size1.findById", query = "SELECT s FROM Size1 s WHERE s.id = :id"),
    @NamedQuery(name = "Size1.findBySname", query = "SELECT s FROM Size1 s WHERE s.sname = :sname")})
public class Size1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "sname")
    private String sname;
//    @OneToMany(mappedBy = "sizeId")
//    private List<Pizza> pizzaList;

    public Size1() {
    }

    public Size1(Integer id) {
        this.id = id;
    }

    public Size1(Integer id, String sname) {
        this.id = id;
        this.sname = sname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

//    @XmlTransient
//    public List<Pizza> getPizzaList() {
//        return pizzaList;
//    }
//
//    public void setPizzaList(List<Pizza> pizzaList) {
//        this.pizzaList = pizzaList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Size1)) {
            return false;
        }
        Size1 other = (Size1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Size1{id=").append(id);
        sb.append(", sname=").append(sname);
//        sb.append(", pizzaList=").append(pizzaList);
        sb.append('}');
        return sb.toString();
    }

    
    
}
