package com.example.RealEstateCRM.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private Date createdOn;
    private String createdBy;
    private String employeeCode;
    private String employeeName;
    private String prefLocation;
    private String employeeMobile;
    private String alterMobile;
    private String employeeEmail;
    private Date dob;
    private String gender;
    private String designation;
    private String companyName;
    private Long companyId;
    private String userName;
    private String password;
    private String address1;
    private String address2;
    private String area;
    private String city;
    private String district;
    private String state;
    private String pinCode;
    private String avatar;
    private boolean isActive;

}

