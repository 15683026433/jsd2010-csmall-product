package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Brand_Category implements Serializable {

    private Long id;
    private Long brand_id;
    private Long category_id;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}
