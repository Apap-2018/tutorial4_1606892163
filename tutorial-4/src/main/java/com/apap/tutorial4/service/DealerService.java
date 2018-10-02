package com.apap.tutorial4.service;

import java.util.Optional;
import com.apap.tutorial4.model.DealerModel;

/**
 * DealerService
 * @author rico.putra
 * @version 2/10/18
 */
public interface DealerService {
	Optional<DealerModel> getDealerDetailById(Long id);
	
	void addDealer(DealerModel dealer);
}
