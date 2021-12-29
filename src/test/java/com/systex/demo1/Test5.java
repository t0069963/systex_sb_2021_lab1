package com.systex.demo1;


import org.junit.jupiter.api.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

//標記為@Before的代碼在每次測試之前執行，而@BeforeAll則在整個測試夾具之前運行一次。
public class Test5 {
    private static Validator validator;
    @BeforeAll
    public static void setupValidationInstance() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
    @BeforeEach //這將在每次運行之前執行
    public  void prepare(){
        System.out.println("this will be executed before each run");

    }
    @AfterEach //這將在每次運行後執行
    public  void cleanup(){
        System.out.println("this will be executed after each run");

    }
    @AfterAll //最后清理工作
    public static void oneTermCleanup(){
        System.out.println("final cleanup");

    }


//    @Test
    public void test51() {
        NormalUser2 user = new NormalUser2("Mark");
        Set<ConstraintViolation<NormalUser2>>violations =  validator.validate(user);
        assertThat(violations.size()).isEqualTo(1);
    }
//    @Test
    public void test52() {
        NormalUser2 user = new NormalUser2("");
        Set<ConstraintViolation<NormalUser2>>violations =  validator.validate(user);
        assertThat(violations.size()).isEqualTo(1);
    }
//    @Test
    public void test53() {
        NormalUser2 user = new NormalUser2(null);
        Set<ConstraintViolation<NormalUser2>>violations =  validator.validate(user);
        assertThat(violations.size()).isEqualTo(0);

    }


}
