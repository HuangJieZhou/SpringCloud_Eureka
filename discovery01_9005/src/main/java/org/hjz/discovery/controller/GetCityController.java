package org.hjz.discovery.controller;

import org.hjz.discovery.entiry.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

/**
 * @Author:HuangJieZhou
 * @Description:
 * @Date:Created in 2020/6/14 18:51
 */
@RestController
public class GetCityController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get/city")
    public R getCity(BigDecimal areaId) {
        //问题：为什么调用远程服务，使用的使用实例名，而不是IP。
        //答：因为以后我们配置高可用的时候，同一个实例名的实例认为是同一个集群的实例
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://invoked/get/city?areaId={areaId}", String.class,areaId);
        return R.success(responseEntity.getBody());
    }
}
