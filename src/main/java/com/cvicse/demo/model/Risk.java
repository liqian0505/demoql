package com.cvicse.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RISK")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Risk {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "合同编号", nullable = false)
    private String contractId;

    @Column(name = "认定年份", nullable = false)
    private String year;

    @Column(name = "认定期次", nullable = false)
    private String month;

    @Column(name = "认定结果", nullable = false)
    private String level;

    @Column(name = "认定日期", nullable = false)
    private String date;
}
