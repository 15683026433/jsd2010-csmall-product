package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class category_attribute_template implements Serializable {
    private Long id;
    private Long category_id;
    private Long attribute_template_id;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
