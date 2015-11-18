package br.com.portalsolidario.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NaturalId;
 
@Entity
public class Profile {
 
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    @NaturalId
    private String email;
    private String sexy;
    private Date birth;
    private String endereco;
    private String codigoEntidade;
    
 
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    private User user;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
     
 
    public User getUser() {
        return user;
    }
 
    public void setUser(User user) {
        this.user = user;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getSexy() {
        return sexy;
    }
 
    public void setSexy(String sexy) {
        this.sexy = sexy;
    }
 
    public Date getBirth() {
        return birth;
    }
 
    public void setBirth(Date birth) {
        this.birth = birth;
    }

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCodigoEntidade() {
		return codigoEntidade;
	}

	public void setCodigoEntidade(String codigoEntidade) {
		this.codigoEntidade = codigoEntidade;
	}
}
