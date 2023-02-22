package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Category_Attribute_Template implements Serializable {
    private Long id;
    private Long category_id;
    private Long attribute_template_id;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
