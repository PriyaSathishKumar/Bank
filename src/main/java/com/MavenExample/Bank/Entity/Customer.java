package com.MavenExample.Bank.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="custdetails1")
public class Customer {
    @Id
    @GeneratedValue
    int accnumber;
    String custName;
    int panCardNo;
}
