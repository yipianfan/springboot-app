package com.lihai.controller;

import com.lihai.entity.ResponseResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import static com.lihai.constant.BusinessCode.*;

@RestControllerAdvice
public class ErrorHandler extends BaseController {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseResult<?> processValidationError() {
        return parameterError(PARAMETER_ERROR.code(), PARAMETER_ERROR.msg());
    }
}