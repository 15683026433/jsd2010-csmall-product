package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Spu implements Serializable {
    private Long id;
    private String name;
    private String type_number;
    private String title;
    private String description;
    private BigDecimal list_price;
    private Integer stock;
    private Integer stock_threshold;
    private String unit;
    private BigDecimal brand_id;
    private String brand_name;
    private BigDecimal category_id;
    private String category_name;
    private BigDecimal attribute_template_id;
    private BigDecimal album_id;
    private String pictures;
    private String keywords;
    private String tags;
    private Integer sales;
    private Integer comment_count;
    private Integer positive_comment_count;
    private Integer sort;
    private Integer is_deleted;
    private Integer is_published;
    private Integer is_new_arrival;
    private Integer is_recommend;
    private Integer is_checked;
    private String check_user;
    private LocalDateTime gmtCheck;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
