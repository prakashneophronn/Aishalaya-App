package com.example.RealEstateCRM.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long companyId;
    @Column
    private String companyName;
    @Column
    private String companyShortName;
    @Column
     private String address1;
    @Column
    private String address2;
    @Column
    private String area;
    @Column
    private String district;
    @Column
    private String stateCode;
    @Column
    private String gstNo;
    @Column
    private String cinNo;
    @Column
    private int pincode;
    @Column
    private String contact;
    @Column
    private String phone;
    @Column
    private String mobile ;
    @Column
    private String email;
    @Column
    private byte[] logo;
    @Column
    private byte[] signature;
    @Column
    private byte[] companySeal;
    @Column
    private String salesMail;
    @Column
    private String panNo;
    @Column
    private String bankName;
    @Column
    private String accNo;
    @Column
    private String branchName;
    @Column
    private String ifscCode;
    @Column
    private String upiId;
    @Column
    private String upiNumber;

}
