package org.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
public class EmpAdd {
    @Id
    int aId;
    String addName;
    @ManyToMany
   private List<Emp> emp;
}
