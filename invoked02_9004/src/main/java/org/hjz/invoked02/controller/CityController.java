package org.hjz.invoked02.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.hjz.invoked02.common.dao.AreaMapper;
import org.hjz.invoked02.common.model.Area;
import org.hjz.invoked02.entiry.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class CityController {

    @Resource
    private AreaMapper areaMapper;

    @HystrixCommand(fallbackMethod = "hystrixGet")
    @GetMapping("/select/city")
    public R getArea(BigDecimal areaId) {
        Area area = areaMapper.selectByPrimaryKey(areaId);
        return R.success(area);
    }

    //根据id查询备选方案(熔断)
    public R hystrixGet(BigDecimal areaId) {
        return R.failed("areaId为" + areaId + "在数据中不存在!");
    }
}
