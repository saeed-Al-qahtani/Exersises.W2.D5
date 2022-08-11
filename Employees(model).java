package com.example.day6.model;

import lombok.AllArgsConstructor;
import lombok.Data;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@AllArgsConstructor @Data
    public class Employees {

        @NotEmpty(message = "Name can't be empty")
        @Size(min=4 , max=4)
        private String Name;

        @NotNull(message = "Id can't be null and It has to be number")
        @Size (min = 2 , max =2)
        private int ID;


        @Size (min = 25 , max = 30)
        @NotNull(message = "Cannot be null" )
        @Pattern(regexp = ("^\\d+$"))
        private int Age;

        private boolean onLeave = false ;

        @Size(min=2000 , max = 2022)
        @NotNull(message = "Cannot be null")
        @Pattern(regexp = ("^\\d+$"))
        private int employmentYear;

        @NotNull(message = "Cannot be null")
        @Pattern(regexp = ("/^(?=.{6,20}$)\\D*\\d/\n"))
        private int annualLeave;

    }


