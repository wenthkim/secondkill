package com.wenthkim.secondkill.dao;



import com.wenthkim.secondkill.entity.GoodsCover;

import java.util.List;

public interface GoodsCoverDAO {
    List<GoodsCover> findByGoodsId(Long goodsId);
}
