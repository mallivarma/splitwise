package com.pailee.mega.splitwise.controller;

import com.pailee.mega.splitwise.model.Expenses;
import com.pailee.mega.splitwise.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SplitwiseController {

    @Autowired
    private ExpenseService service;

    @GetMapping("/hello")
    public String getHello(){
        return "hi";
    }
    @PostMapping("expense/addExpense")
    public Expenses addExpense(@RequestBody Expenses exp){
        return service.saveExpense(exp);
    }

    @PostMapping("expense/addExpenses")
    public List<Expenses> addExpense(@RequestBody List<Expenses> exps){
        return service.saveExpenseAll(exps);
    }

    @GetMapping("/expense/id/{id}")
    public Expenses getExpenseById(@PathVariable  int id){
        return service.getExpensesById(id);
    }


    @GetMapping("/expensesAll")
    public List<Expenses> getExpenseAll(){
        return service.getExpenses();
    }

    @GetMapping("/expense/name/{name}")
    public Expenses getExpenseByName(@PathVariable  String name){
        return service.getExpensesByName(name);
    }

    @DeleteMapping("/expense/{id}")
    public String deleteExpenseById(@PathVariable int id){
        return this.service.deleteExpense(id);
    }
}
