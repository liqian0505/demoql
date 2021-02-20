package com.cvicse.demo.repository;

import com.cvicse.demo.model.Risk;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RiskRepository extends CrudRepository<Risk, String> {
    public Iterable<Risk> findByContractIdOrderByDateDesc(String contractId);
    
    @Query(nativeQuery = true, value="SELECT b.* FROM (SELECT 合同编号, MAX(认定日期) as 认定日期  FROM RISK GROUP BY 合同编号) a   JOIN ( SELECT * FROM RISK)  b on (a.合同编号=b.合同编号 AND a.认定日期=b.认定日期) WHERE 认定结果=?1")
    public Iterable<Risk> findLastestRisks(String level);
}