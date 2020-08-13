package cn.chenbonian.gulimall.order.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.order.dao.OrderSettingDao;
import cn.chenbonian.gulimall.order.entity.OrderSettingEntity;
import cn.chenbonian.gulimall.order.service.OrderSettingService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("orderSettingService")
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingDao, OrderSettingEntity>
    implements OrderSettingService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OrderSettingEntity> page =
        this.page(
            new Query<OrderSettingEntity>().getPage(params),
            new QueryWrapper<OrderSettingEntity>());

    return new PageUtils(page);
  }
}
