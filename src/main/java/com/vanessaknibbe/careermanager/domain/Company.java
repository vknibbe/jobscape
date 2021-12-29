package com.vanessaknibbe.careermanager.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Company {

    //fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String url;

    @Column
    private String address; //could make a seperate address object

    @Column
    private String size; //could make these enums

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    private List<Position> positions;

    //constructors

    public Company() {
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
