package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Spu_detail implements Serializable {
    private Long id;
    private Long spu_id;
    private String detail;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
