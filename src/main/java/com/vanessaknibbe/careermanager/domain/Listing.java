package com.vanessaknibbe.careermanager.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Listing implements ProcessStep{

    //fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private Position position;

    @Column
    private String contact; // could make person object

    @Column
    private String listingSite;

    @Column
    private String applicationSite;

    @Column
    private boolean requiresCv;

    @Column
    private boolean requiresCoverLetter;

    @Column
    private Date dateListed;

    @Column
    private Date dateFound;

    @Column
    private String description;


    //constructors

    public Listing() {
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getListingSite() {
        return listingSite;
    }

    public void setListingSite(String listingSite) {
        this.listingSite = listingSite;
    }

    public String getApplicationSite() {
        return applicationSite;
    }

    public void setApplicationSite(String applicationSite) {
        this.applicationSite = applicationSite;
    }

    public boolean isRequiresCv() {
        return requiresCv;
    }

    public void setRequiresCv(boolean requiresCv) {
        this.requiresCv = requiresCv;
    }

    public boolean isRequiresCoverLetter() {
        return requiresCoverLetter;
    }

    public void setRequiresCoverLetter(boolean requiresCoverLetter) {
        this.requiresCoverLetter = requiresCoverLetter;
    }

    public Date getDateListed() {
        return dateListed;
    }

    public void setDateListed(Date dateListed) {
        this.dateListed = dateListed;
    }

    public Date getDateFound() {
        return dateFound;
    }

    public void setDateFound(Date dateFound) {
        this.dateFound = dateFound;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
