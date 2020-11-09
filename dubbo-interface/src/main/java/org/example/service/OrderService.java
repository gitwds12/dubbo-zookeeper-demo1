package org.example.service;

import org.example.bean.UserAddress;

import java.util.List;

/**
 * @author WUDONGSHENG
 * @date 2020/11/3
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     * @return List
     */
    public List<UserAddress> initOrder(String userId);
}
