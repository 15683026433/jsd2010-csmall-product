package cn.tedu.csmall.product.service;

import cn.tedu.csmall.product.pojo.dto.AlbumAddNewDTO;

public interface IAlbumService {
    void addNew(AlbumAddNewDTO albumAddNewDTO);

    /**
     *
     * @param id
     */
    void delete(Long id);
}
