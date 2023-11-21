package com.main.BankingApplicationCodingChallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.BankingApplicationCodingChallenge.model.AccountHolder;
import com.main.BankingApplicationCodingChallenge.repository.AccountHolderRepository;

@Service
public class AccountHolderService {
	@Autowired
	private AccountHolderRepository accountHolderRepository;

	public AccountHolder addAccountHolder(AccountHolder accountHolder) {
		
		return accountHolderRepository.save(accountHolder);
	}

	public AccountHolder getby(int ahid) {
		// TODO Auto-generated method stub
		return accountHolderRepository.getById(ahid);
	}

	

}
