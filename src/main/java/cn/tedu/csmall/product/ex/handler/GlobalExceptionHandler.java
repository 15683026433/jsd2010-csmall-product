package cn.tedu.csmall.product.ex.handler;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.web.JsonResult;
import cn.tedu.csmall.product.web.ServiceCode;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public JsonResult handleServiceException(ServiceException e){
        return JsonResult.fail(e.getServiceCode(), e.getMessage());
    }

    @ExceptionHandler
    public JsonResult handleBindException(BindException e){
        String message = e.getFieldError().getDefaultMessage();

//        StringBuilder stringBuilder = new StringBuilder();
//        List<FieldError> fieldErrors = e.getFieldErrors();
//        for (FieldError fieldError : fieldErrors) {
//            stringBuilder.append(fieldError.getDefaultMessage());
//        }
//        String message = stringBuilder.toString();
        return JsonResult.fail(ServiceCode.ERROR_BAD_REQUEST, message);
    }

    @ExceptionHandler
    public JsonResult handleConstraintViolationException(ConstraintViolationException e) {
        StringBuilder stringBuilder = new StringBuilder();
        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        for (ConstraintViolation<?> constraintViolation : constraintViolations) {
            stringBuilder.append(constraintViolation.getMessage());
        }
        String message = stringBuilder.toString();
        return JsonResult.fail(ServiceCode.ERROR_BAD_REQUEST, message);
    }

    @ExceptionHandler
    public JsonResult handleRuntimeException(RuntimeException e){
        String message = "服务器忙，请稍后再次尝试！";
        return JsonResult.fail(ServiceCode.ERROR_UNKNOWN, message);
    }

    @ExceptionHandler
    public JsonResult handleThrowable(Throwable e){
        String message = "服务器忙，请稍后再次尝试！";
        e.printStackTrace();//zhu
        return JsonResult.fail(ServiceCode.ERROR_UNKNOWN, message);
    }


}
