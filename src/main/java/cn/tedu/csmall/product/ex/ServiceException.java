package cn.tedu.csmall.product.ex;

import lombok.Getter;

public class ServiceException extends RuntimeException {

    @Getter
    private Integer code;

    public ServiceException(Integer code, String message){
        super(message);
        this.code = code;
    }
}
