package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Attribute implements Serializable {
    private Long id;
    private Long template_id;
    private String name;
    private String description;
    private Integer type;
    private Integer input_type;
    private String value_list;
    private String unit;
    private Integer sort;
    private Integer is_allow_customize;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
