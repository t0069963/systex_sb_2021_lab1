package com.systex.demo1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NormalUser2 {
    @NotEmpty(message = "name should not be Empty")//不能為null，而且長度必須大於0
    private String name;
}
