package com.main.BankingApplicationCodingChallenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.BankingApplicationCodingChallenge.model.Account;
import com.main.BankingApplicationCodingChallenge.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	public Account addAccount(Account account) {
	
		return accountRepository.save(account);
	}
	public List<Account> findall(String type) {
		
		return accountRepository.findAll(type);
	}
	public Account getById(int aid) throws Exception{
		Optional<Account> optional = accountRepository.findById(aid);
		if(!optional.isPresent())
			throw new Exception("");
		return optional.get();
	}
	public Account update(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}

}
