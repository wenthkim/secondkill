package com.wenthkim.secondkill.dao;



import com.wenthkim.secondkill.entity.GoodsParam;

import java.util.List;

public interface GoodsParamDAO {
    List<GoodsParam> findByGoodsId(Long goodsId);
}
