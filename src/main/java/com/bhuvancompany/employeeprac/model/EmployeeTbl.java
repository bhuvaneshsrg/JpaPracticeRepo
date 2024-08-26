package com.bhuvancompany.employeeprac.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="empTbl")
public class EmployeeTbl {

    @Id
    @GeneratedValue
    private int empID;

    @Column(name = "empName", nullable = false, length = 100)
    @Size(min = 2, max = 100)
    @NotNull
    private String empName;

    private Long empSalary;

    @Column(name = "empDepartment", columnDefinition = "SMALLINT")
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private int empDepart;

}

//@Entity
//@Table(name="empTbl")
//class Department {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//}
