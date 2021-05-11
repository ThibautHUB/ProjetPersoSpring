package com.mycompany.bilbiotheque.entity;

import java.util.Date;

public class Client {

    private int idClient;
    private String prenom;
    private String getPrenom;
    private Date dateNaissance;

    public Client(){

    }

    public Client(String prenom, String getPrenom, Date dateNaissance) {
        this.prenom = prenom;
        this.getPrenom = getPrenom;
        this.dateNaissance = dateNaissance;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGetPrenom() {
        return getPrenom;
    }

    public void setGetPrenom(String getPrenom) {
        this.getPrenom = getPrenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
