package com.pailee.mega.splitwise.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EXPENSES")
public class Expenses {

    //This is just BO class
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String type;
    private float amount;
    private String groupName;
    private Date date;
    private String comments;
    private String description;


}
