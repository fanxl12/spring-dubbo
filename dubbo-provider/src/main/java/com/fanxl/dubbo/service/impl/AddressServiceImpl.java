package com.fanxl.dubbo.service.impl;

import com.fanxl.dubbo.service.AddressService;
import org.apache.dubbo.config.annotation.Service;

@Service(group = "dubbo")
public class AddressServiceImpl implements AddressService {

    @Override
    public String getAddress(String detail) {
        return "湖北省武汉市" + detail;
    }
}
