
package com.github.derickfelix.bankapplication.repositories;

import com.github.derickfelix.bankapplication.models.Operation;
import java.util.List;
import java.util.Optional;

public interface OperationRepository {


    
    List<Operation> findAllDeposits();



    List<Operation> findAllByAccountNumber(String accountNumber);

    List<Operation> findAllDepositsByAccountNumber(String accountNumber);



    void deposit(String accountNumber, double amount);



    Optional<Double> currentBalance(String accountNumber);
        
}
