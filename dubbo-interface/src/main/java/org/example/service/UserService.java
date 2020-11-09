package org.example.service;

import org.example.bean.UserAddress;

import java.util.List;

/**
 * @author WUDONGSHENG
 * @date 2020/11/3
 */
public interface UserService {
    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return List
     */
    public List<UserAddress> getUserAddressList(String userId);
}
