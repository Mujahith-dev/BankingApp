package com.java.BankingApp.Dto;

public record TransferFundDto(
        Long fromAccountId,
        Long toAccountId,
        double amount) {
}
