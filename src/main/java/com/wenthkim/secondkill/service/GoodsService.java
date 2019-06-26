package com.wenthkim.secondkill.service;


import com.wenthkim.secondkill.dao.GoodsCoverDAO;
import com.wenthkim.secondkill.dao.GoodsDAO;
import com.wenthkim.secondkill.dao.GoodsDetailDAO;
import com.wenthkim.secondkill.dao.GoodsParamDAO;
import com.wenthkim.secondkill.entity.Goods;
import com.wenthkim.secondkill.entity.GoodsCover;
import com.wenthkim.secondkill.entity.GoodsDetail;
import com.wenthkim.secondkill.entity.GoodsParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsService {
    @Resource
    private GoodsDAO goodsDAO;
    @Resource
    private GoodsCoverDAO goodsCoverDAO;
    @Resource
    private GoodsDetailDAO goodsDetailDAO;
    @Resource
    private GoodsParamDAO goodsParamDAO;

    public Goods getGoods(Long goodsId) {
        return goodsDAO.findById(goodsId);
    }

    public List<GoodsCover> findCovers(Long goodsId){
        return goodsCoverDAO.findByGoodsId(goodsId);
    }

    public List<GoodsDetail> findDetails(Long goodsId){
        return  goodsDetailDAO.findByGoodsId(goodsId);
    }

    public List<GoodsParam> findParams(Long goodsId){
        List list =  goodsParamDAO.findByGoodsId(goodsId);
        return list;
    }

}
