package com.msb;

/**
 * Created by 17081290 on 2021/1/4.
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason="名字错误", value= HttpStatus.NOT_ACCEPTABLE)
public class UsernameException extends RuntimeException{
}
