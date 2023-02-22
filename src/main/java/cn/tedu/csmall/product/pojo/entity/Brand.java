package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Brand implements Serializable {

    private Long id;
    private String name;
    private String pinyin;
    private String logo;
    private String description;
    private String keywords;
    private Integer sort;
    private Integer sales;
    private Integer product_count;
    private Integer comment_count;
    private Integer positive_comment_count;
    private Integer enable;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}
