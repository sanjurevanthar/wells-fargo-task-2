package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.Date;

@Entity
public class Portfolio {
    
    @Id
    @GeneratedValue
    private long portfolioId;

    @OneToOne
    @JoinColumn(nullable = false)
    private Client client;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date createdDate;

    protected Portfolio() {}

    public Portfolio(Client client, String name, Date createdDate){

        this.client = client;
        this.name = name;
        this.createdDate = createdDate;

    }

    public long getPortfolioId(){
        return portfolioId;
    } 

    public Client getClient(){
        return client;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getCreatedDate(){
        return createdDate;
    }

    public void setCreatedDate(Date createdDate){
        this.createdDate = createdDate;
    }


}