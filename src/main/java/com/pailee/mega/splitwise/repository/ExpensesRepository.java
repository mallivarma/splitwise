package com.pailee.mega.splitwise.repository;

import com.pailee.mega.splitwise.model.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpensesRepository extends JpaRepository<Expenses,Integer> {

    Expenses findByName(String name);

}
