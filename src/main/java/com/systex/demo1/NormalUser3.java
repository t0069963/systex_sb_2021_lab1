package com.systex.demo1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NormalUser3 {
    @NotBlank(message = "name should not be Blank")//只能作用在String上，不能为null，而且调用trim()后，长度必须大于0
    private String name;
}
