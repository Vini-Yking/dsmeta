package com.devsuperior.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.backend.entities.Sale;
import com.devsuperior.backend.repository.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;

	public List<Sale> findSales() {
		return saleRepository.findAll();
	}
}
