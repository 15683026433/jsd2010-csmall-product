package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class category implements Serializable {
    private Long id;
    private String name;
    private Long parent_id;
    private Integer depth;
    private String keywords;
    private Integer sort;
    private String icon;
    private Integer enable;
    private Integer is_parent;
    private Integer is_display;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}
