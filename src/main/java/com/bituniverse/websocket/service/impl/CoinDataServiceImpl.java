package com.bituniverse.websocket.service.impl;

import com.bituniverse.websocket.dao.CoinDataMapper;
import com.bituniverse.websocket.entity.CoinData;
import com.bituniverse.websocket.service.CoinDataService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 20:12:38
 **/ 
@Service("coinDataService")
public class CoinDataServiceImpl implements CoinDataService {
    @Resource
    private CoinDataMapper coinDataMapper;

    private static final Logger logger = LoggerFactory.getLogger(CoinDataServiceImpl.class);

    @Override
    public int insert(CoinData record) {
        return this.coinDataMapper.insert(record);
    }

    @Override
    public int insertSelective(CoinData record) {
        return this.coinDataMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(CoinData record) {
        return this.coinDataMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(CoinData record) {
        return this.coinDataMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.coinDataMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CoinData selectByPrimaryKey(Integer id) {
        return this.coinDataMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CoinData> selectAll(Map<Object, Object> param) {
        return this.coinDataMapper.selectAll(param);
    }

    @Override
    public List<CoinData> selectPaging(Map<Object, Object> param) {
        return this.coinDataMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.coinDataMapper.selectCount(param);
    }

    @Override
    public void saveOrUpdate(CoinData coinData) {
        if(coinData.getId()==null){
            coinDataMapper.insert(coinData);
        }else{
            coinDataMapper.updateByPrimaryKey(coinData);
        }
    }
}