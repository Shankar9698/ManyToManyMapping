package org.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
public class Emp {
    @Id
    int empId;
    String empName;
    @ManyToMany(mappedBy = "emp", fetch = FetchType.EAGER)//if not this mapped by 4 tables will be create in db
    private List<EmpAdd> empAdd;// fetch type eager is for eager loading sql query generated only once(default : lazy) we can write lazy also..{FetchType.LAZY}
}
