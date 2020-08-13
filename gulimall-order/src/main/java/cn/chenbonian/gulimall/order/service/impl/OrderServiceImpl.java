package cn.chenbonian.gulimall.order.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.order.dao.OrderDao;
import cn.chenbonian.gulimall.order.entity.OrderEntity;
import cn.chenbonian.gulimall.order.service.OrderService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao, OrderEntity> implements OrderService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OrderEntity> page =
        this.page(new Query<OrderEntity>().getPage(params), new QueryWrapper<OrderEntity>());

    return new PageUtils(page);
  }
}
