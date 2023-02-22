package cn.tedu.csmall.product.pojo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AlbumAddNewDTO implements Serializable {
    private String name;
    private String description;
    private Integer sort;
}
