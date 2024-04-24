package com.bronya.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCodeEnum {

    /**
     * 正常
     */
    OK(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase()),

    /**
     * 没有权限
     */
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED.value(), HttpStatus.UNAUTHORIZED.getReasonPhrase()),

    /**
     * 客户端错误
     */
    BAD_REQUEST(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase()),

    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()),


    CREATED(HttpStatus.CREATED.value(), HttpStatus.CREATED.getReasonPhrase());

    private final Integer code;

    private final String message;

}
