package com.wenthkim.secondkill.dao;



import com.wenthkim.secondkill.entity.GoodsDetail;

import java.util.List;

public interface GoodsDetailDAO {
    List<GoodsDetail> findByGoodsId(Long goodsId);
}
