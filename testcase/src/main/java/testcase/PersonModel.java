package testcase;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import com.google.gson.annotations.SerializedName;

public class PersonModel implements Serializable {

    private UUID id;

    private String userName;

    private String userPassword;

    private String email;

    private String phoneNumber;

    private String name;

    @SerializedName("surname")
    private String surName;

    private Date brithDay;

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Date getBrithDay() {
        return this.brithDay;
    }

    public void setBrithDay(Date brithDay) {
        this.brithDay = brithDay;
    }

    public PersonModel id(UUID id) {
        this.id = id;
        return this;
    }

    public PersonModel userName(String userName) {
        this.userName = userName;
        return this;
    }

    public PersonModel userPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    public PersonModel email(String email) {
        this.email = email;
        return this;
    }

    public PersonModel phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PersonModel name(String name) {
        this.name = name;
        return this;
    }

    public PersonModel surName(String surName) {
        this.surName = surName;
        return this;
    }

    public PersonModel brithDay(Date brithDay) {
        this.brithDay = brithDay;
        return this;
    }
}