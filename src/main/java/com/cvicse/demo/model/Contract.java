package com.cvicse.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CONTRACT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contract {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "合同编号", nullable = false)
    private String contractId;

    @Column(name = "客户编号", nullable = false)
    private String clientId;

}
