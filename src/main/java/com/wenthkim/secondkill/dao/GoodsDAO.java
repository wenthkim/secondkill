package com.wenthkim.secondkill.dao;


import com.wenthkim.secondkill.entity.Goods;

public interface GoodsDAO {
     Goods findById(Long goodsId);
}
