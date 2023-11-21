package com.main.BankingApplicationCodingChallenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.BankingApplicationCodingChallenge.model.Account;
import com.main.BankingApplicationCodingChallenge.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@PostMapping("/add")
	public Account insertAccount(@RequestBody Account account) {
		return accountService.addAccount(account);
	}
	@GetMapping("/getallAccounts/{type}")
	public List<Account> findallAccounts(@PathVariable String type){
		List<Account> list=accountService.findall(type);
		return list;
	}
}
