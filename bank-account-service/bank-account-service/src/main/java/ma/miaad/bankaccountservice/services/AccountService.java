package ma.miaad.bankaccountservice.services;


import ma.miaad.bankaccountservice.dto.BankAccountRequestDTO;
import ma.miaad.bankaccountservice.dto.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
    public BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);

}
