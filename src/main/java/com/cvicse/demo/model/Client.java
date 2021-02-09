package com.cvicse.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CLIENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "客户编号", nullable = false)
    private String clientId;

    @Column(name = "客户名称", nullable = false)
    private String clientName;
}
