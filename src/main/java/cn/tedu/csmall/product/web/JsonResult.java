package cn.tedu.csmall.product.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonResult implements Serializable {

    /**
     * 操作结果的状态码（状态标识）
     */
    private Integer state;
    /**
     * 操作失败的提示文本
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    public static JsonResult ok(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.state = ServiceCode.OK.getValue();
        return jsonResult;
    }
    public static JsonResult fail(ServiceCode serviceCode,String message){
        JsonResult jsonResult = new JsonResult();
        jsonResult.state = serviceCode.getValue();
        jsonResult.message = message;
        return jsonResult;

    }
}
