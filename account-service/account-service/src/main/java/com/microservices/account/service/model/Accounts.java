package com.microservices.account.service.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table(name="account_table")
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="account_number")
    private int accountNumber;
    @Column(name="account_holder")
    private String accountHolderName;
    @Column(name="account_balance")
    private double accountBalance;
    @Column(name="active_status")
    private boolean isActive;

    public Accounts(String accountHolderName, double accountBalance, boolean isActive) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.isActive = isActive;
    }
}
