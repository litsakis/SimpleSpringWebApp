package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstaintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	
			//define def course cose
	public String value() default "LUV";
	//define error message
	public String message() default "must start with LUV";
	//define default groups
	public Class<?>[] groups() default{};
	//define def payload
	public Class<? extends Payload>[] payload() default{};

}
