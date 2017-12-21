package com.learing.service;

import com.github.pagehelper.PageInfo;
import com.learing.common.ServerResponse;
import com.learing.pojo.Shipping;

/**
 * 
 * @author Gloria
 *
 */
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId,Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);

}
