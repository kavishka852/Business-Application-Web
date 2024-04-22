package com.example.BusinessProject.dto;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name ="Clients")
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "customerid")
    private String customerid;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private int password;

    @Column(name = "workplacename")
    private String workplacename;

    @Column(name = "workplaceaddress")
    private String workplaceaddress;

    @Column(name = "regdate")
    private Date regdate;

    public Clients(int id, String customerid, String name, String username, int password, String workplacename, String workplaceaddress, Date regdate) {
        this.id = id;
        this.customerid = customerid;
        this.name = name;
        this.username = username;
        this.password = password;
        this.workplacename = workplacename;
        this.workplaceaddress = workplaceaddress;
        this.regdate = regdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getWorkplacename() {
        return workplacename;
    }

    public void setWorkplacename(String workplacename) {
        this.workplacename = workplacename;
    }

    public String getWorkplaceaddress() {
        return workplaceaddress;
    }

    public void setWorkplaceaddress(String workplaceaddress) {
        this.workplaceaddress = workplaceaddress;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
}
