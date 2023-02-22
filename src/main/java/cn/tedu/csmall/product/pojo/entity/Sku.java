package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Sku implements Serializable {
    private Long id;
    private Long spu_id;
    private String title;
    private String bar_code;
    private Long attribute_template_id;
    private String specifications;
    private Long album_id;
    private String pictures;
    private BigDecimal price;
    private Integer stock;
    private Integer stock_threshold;
    private Integer sales;
    private Integer comment_count;
    private Integer positive_comment_count;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
