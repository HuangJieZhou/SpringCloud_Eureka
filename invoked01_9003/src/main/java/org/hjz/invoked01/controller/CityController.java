package org.hjz.invoked01.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.hjz.invoked01.common.dao.AreaMapper;
import org.hjz.invoked01.common.model.Area;
import org.hjz.invoked01.entiry.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author:HuangJieZhou
 * @Description:
 * @Date:Created in 2020/6/14 18:51
 */
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
