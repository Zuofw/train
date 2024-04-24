package com.bronya.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author liaodezhi
 * @date 2023/07/05
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BusinessException extends RuntimeException {

    private final Integer code;

    private final String message;

    private final String description;

    public BusinessException(ErrorCodeEnum errorCodeEnum, String description) {
        this.code = errorCodeEnum.getCode();
        this.message = errorCodeEnum.getMessage();
        this.description = description;
    }

}
