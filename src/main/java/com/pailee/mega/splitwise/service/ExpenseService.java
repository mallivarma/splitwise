package com.pailee.mega.splitwise.service;

import com.pailee.mega.splitwise.model.Expenses;
import com.pailee.mega.splitwise.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpensesRepository repository;

    public Expenses saveExpense(Expenses exp){
        return repository.save(exp);
    }

    public List<Expenses> saveExpenseAll(List<Expenses> exp){
        return repository.saveAll(exp);
    }

    public List<Expenses>  getExpenses(){
        return repository.findAll();
    }

    public Expenses getExpensesById(int id){
        return repository.findById(id).orElse(null);
    }

    public Expenses getExpensesByName(String name){
        return repository.findByName(name);
    }

    public String deleteExpense(int id){
        repository.deleteById(id);
        return  "Expense deleted"+id;
    }

    public Expenses updateExpense(Expenses expenses){
        Expenses  exp = repository.findById((int) expenses.getId()).orElse(null);
        exp.setName(expenses.getName());
        exp.setAmount(expenses.getAmount());
        exp.setName(expenses.getName());
        return repository.save(exp);
    }

}
