package com.fanxl.dubbo.rest;

import com.fanxl.dubbo.service.AddressService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/address")
public class AddressRestController {

    @Reference(group = "dubbo")
    private AddressService addressService;

    @GetMapping("{detail}")
    public String get(@PathVariable String detail) {
        return addressService.getAddress(detail);
    }

}
