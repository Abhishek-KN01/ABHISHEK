package com.abhi.spingBoot.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus(value  = HttpStatus.NOT_FOUND)
public class ResouraceNotFoundExecption extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public ResouraceNotFoundExecption(String msg) {
		
		super(msg);
	}
	

}
