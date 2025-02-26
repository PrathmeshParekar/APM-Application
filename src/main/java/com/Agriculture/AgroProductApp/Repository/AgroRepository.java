package com.Agriculture.AgroProductApp.Repository;

import com.Agriculture.AgroProductApp.Entity.AgroProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgroRepository extends JpaRepository<AgroProduct, Long> {

}
