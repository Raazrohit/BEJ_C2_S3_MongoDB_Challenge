package com.question.BEJ_C2_S3_MongoDB_Challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND , reason = "Artist not found")
public class ArtistNotFoundException extends Exception{
}
