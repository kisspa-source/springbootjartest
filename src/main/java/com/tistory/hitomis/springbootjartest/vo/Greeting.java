package com.tistory.hitomis.springbootjartest.vo;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Greeting {

    @NotNull
    @DecimalMin("0")
    @DecimalMax("100")
    private long id;

    @NotNull
    @Size(min = 1)
    private String content;
}
