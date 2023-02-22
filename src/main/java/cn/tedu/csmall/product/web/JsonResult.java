package cn.tedu.csmall.product.web;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResult implements Serializable {

    /**
     *
     */
    private Integer state;
    /**
     * 操作失败的提示文本
     */
    private String message;

    public static JsonResult ok(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.state = ServiceCode.OK;
        return jsonResult;
    }
    public static JsonResult fail(Integer state,String message){
        JsonResult jsonResult = new JsonResult();
        jsonResult.state = state;
        jsonResult.message = message;
        return jsonResult;

    }
}
