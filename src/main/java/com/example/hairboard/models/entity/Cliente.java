package com.example.hairboard.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable{

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message="No puede estar vacio.")
    @Size(min=1)
    @Column(nullable = false)
    private String firstName;
    @NotEmpty(message="No puede estar vacio.")
    private String lastName;
    @NotEmpty(message="No puede estar vacio.")
    @Email
    @Column(nullable = false,unique = true)
    private String email;
    @NotEmpty(message="No puede estar vacio.")
    @Column(nullable = false,unique = true)
    private String phoneNumber;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;
    private String foto;
    @PrePersist
    public void prePersist(){
        createAt = new Date();
    }
    public Cliente(Long id, String firstName, String lastName, String email, String phoneNumber, Date createAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.createAt = createAt;
    }

    public Cliente() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}














