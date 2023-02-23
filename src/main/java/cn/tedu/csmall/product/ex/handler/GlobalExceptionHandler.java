package cn.tedu.csmall.product.ex.handler;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.web.JsonResult;
import cn.tedu.csmall.product.web.ServiceCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public JsonResult handleServiceException(ServiceException e){
        return JsonResult.fail(ServiceCode.ERROR, "出错了");
    }

    @ExceptionHandler
    public JsonResult handleNullPointerException(NullPointerException e){
        return JsonResult.fail(ServiceCode.ERROR, "出错了");
    }

    @ExceptionHandler
    public JsonResult handleRuntimeException(RuntimeException e){
        return JsonResult.fail(ServiceCode.ERROR, "出错了");
    }

    @ExceptionHandler
    public JsonResult handleThrowable(Throwable e){
        e.printStackTrace();//zhu
        return JsonResult.fail(ServiceCode.ERROR, "服务器忙");
    }


}
