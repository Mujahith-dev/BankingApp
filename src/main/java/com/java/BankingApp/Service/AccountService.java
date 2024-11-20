package com.java.BankingApp.Service;

import com.java.BankingApp.Dto.AccountDto;
import com.java.BankingApp.Dto.TransactionDto;
import com.java.BankingApp.Dto.TransferFundDto;
import com.java.BankingApp.Entity.Account;
import com.java.BankingApp.Repository.AccountRepository;
import com.java.BankingApp.Service.ServiceImpl.AccountServiceImpl;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

    void deleteAll();

    void transferFunds(TransferFundDto transferFundDto);

    List<TransactionDto> getAccountTransactions(Long accountId);
}
