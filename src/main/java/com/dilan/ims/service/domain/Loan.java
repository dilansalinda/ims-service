package com.dilan.ims.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * User: Dilan Salinda
 * Date: 6/23/2019
 * Time: 6:50 PM
 */
@Entity
@Table(name = "loan")
@Getter
@Setter
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
}
