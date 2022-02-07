package com.example.mils.demo.web.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqUserNameValidator.class)
public @interface UniqueUserName {
    String message() default "既に同じUser名を利用されている方がいます。別のUser名を作成してください。";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
