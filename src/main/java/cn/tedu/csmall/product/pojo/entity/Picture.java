package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Picture implements Serializable {
    private Long id;
    private Long album_id;
    private String url;
    private String description;
    private Integer width;
    private Integer height;
    private Integer is_cover;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}
