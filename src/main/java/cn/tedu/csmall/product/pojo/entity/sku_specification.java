package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class sku_specification implements Serializable {
    private Long id;
    private Long sku_id;
    private Long attribute_id;
    private String attribute_name;
    private String attribute_value;
    private String unit;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
