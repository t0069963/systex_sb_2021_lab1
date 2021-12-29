package com.systex.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NormalUser1 {
    @NotNull(message = "name should not be null")//不能為null，但可以為empty
    private String name;
    //private String name2;


}
