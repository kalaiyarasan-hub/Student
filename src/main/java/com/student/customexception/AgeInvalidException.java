package com.student.customexception;

public class AgeInvalidException extends Exception {

	public AgeInvalidException(String sms) {
		super(sms);
	}
}
