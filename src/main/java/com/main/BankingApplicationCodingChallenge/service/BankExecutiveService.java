package com.main.BankingApplicationCodingChallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.BankingApplicationCodingChallenge.model.BankExecutive;
import com.main.BankingApplicationCodingChallenge.repository.BankExecutiveRepository;

@Service
public class BankExecutiveService {

	@Autowired
	private BankExecutiveRepository bankExecutiveRepository;
	
	public BankExecutive add(BankExecutive bankExecutive) {
		// TODO Auto-generated method stub
		return bankExecutiveRepository.save(bankExecutive);
	}

	public BankExecutive getById(int eid) {
		// TODO Auto-generated method stub
		return bankExecutiveRepository.getById(eid);
	}

}
