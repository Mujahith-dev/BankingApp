package com.java.BankingApp.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

//public class AccountDto {
//
//    private Long id;
//    private String accountHolderName;
//    private double balance;
//}

//we can use record class for dto,
public record AccountDto(Long id,
                         String accountHolderName,
                         double balance) {
}