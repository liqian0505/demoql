package com.cvicse.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CBALANCE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Balance {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "合同编号", nullable = false)
    private String contractId;
    
    @Column(name = "公司编号", nullable = false)
    private String corpId;

    @Column(name = "公司名称", nullable = false)
    private String corpName;

    @Column(name = "账簿编号", nullable = false)
    private String ledgerId;

    @Column(name = "账簿名称", nullable = false)
    private String ledgerName;

    @Column(name = "科目编号", nullable = false)
    private String subjectId;

    @Column(name = "科目名称", nullable = false)
    private String subjectName;

    @Column(name = "账户年份", nullable = false)
    private String year;

    @Column(name = "期次", nullable = false)
    private String month;

    @Column(name = "期末余额", nullable = false)
    private String balance;

}
