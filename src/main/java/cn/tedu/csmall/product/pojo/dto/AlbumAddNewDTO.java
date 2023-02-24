package cn.tedu.csmall.product.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class AlbumAddNewDTO implements Serializable {

    @ApiModelProperty(value = "相册名称",required = true ,example = "测试相册名称1")
    @NotNull(message = "必须填写相册名称！")
    private String name;

    @ApiModelProperty(value = "相册简介",required = true ,example = "测试相册简介1")
    @NotNull(message = "必须填写相册简介！")
    private String description;

    @NotNull(message = "必须填写相册序号！")
    @ApiModelProperty(value = "排序序号",required = true,example = "99")
    @Range(max = 255,message = "排序序号必须是[0,255]区间的数值")
    private Integer sort;
}
