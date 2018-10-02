package com.apap.tutorial4.repository;

import com.apap.tutorial4.model.DealerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * DealerDb
 * @author rico.putra
 * @version 2/10/18
 */
@Repository
public interface DealerDb extends JpaRepository<DealerModel, Long> {
	
}
