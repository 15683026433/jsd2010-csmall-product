package cn.tedu.csmall.product.web;

public enum ServiceCode {

    OK(20000),
    ERROR_BAD_REQUEST(40000),
    ERROR_NOT_FOUND(40400),
    ERROR_CONFLICT(40900),
    ERROR_UNKNOWN(99999);

    private Integer value;

    ServiceCode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

}
