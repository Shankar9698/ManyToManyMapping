package org.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
public class Emp {
    @Id
    int empId;
    String empName;
    @ManyToMany(mappedBy = "emp")//if not this mapped by 4 tables will be create in db
    private List<EmpAdd> empAdd;
}
