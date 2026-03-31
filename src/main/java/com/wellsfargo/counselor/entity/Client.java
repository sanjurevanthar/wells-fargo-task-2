package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Advisor advisor;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String email;


    protected Client() {}


    public Client(Advisor advisor, String firstname, String lastname, String email){

        this.advisor = advisor;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    //Getters and Setters
    public long getClientId(){
        return clientId;
    }

    public Advisor getAdvisor(){
        return advisor;
    }

    public void setAdvisor(Advisor advisor){
        this.advisor = advisor;
    }

    public String getFirstName(){
        return firstname;
    }
    public void setFirstName(String firstname){
        this.firstname = firstname;
    }

    public String getLastName(){
        return lastname;
    }

    public void setLastName(String lastname){
        this.lastname = lastname;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    
}
