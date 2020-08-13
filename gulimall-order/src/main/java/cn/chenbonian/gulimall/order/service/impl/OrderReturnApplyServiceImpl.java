package cn.chenbonian.gulimall.order.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.order.dao.OrderReturnApplyDao;
import cn.chenbonian.gulimall.order.entity.OrderReturnApplyEntity;
import cn.chenbonian.gulimall.order.service.OrderReturnApplyService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl
    extends ServiceImpl<OrderReturnApplyDao, OrderReturnApplyEntity>
    implements OrderReturnApplyService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OrderReturnApplyEntity> page =
        this.page(
            new Query<OrderReturnApplyEntity>().getPage(params),
            new QueryWrapper<OrderReturnApplyEntity>());

    return new PageUtils(page);
  }
}
