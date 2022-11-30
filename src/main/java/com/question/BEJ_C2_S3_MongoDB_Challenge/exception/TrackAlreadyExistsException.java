package com.question.BEJ_C2_S3_MongoDB_Challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT , reason = "Track already exists")
public class TrackAlreadyExistsException extends Exception{
}
