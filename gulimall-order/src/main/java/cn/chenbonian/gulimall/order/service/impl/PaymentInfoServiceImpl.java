package cn.chenbonian.gulimall.order.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.order.dao.PaymentInfoDao;
import cn.chenbonian.gulimall.order.entity.PaymentInfoEntity;
import cn.chenbonian.gulimall.order.service.PaymentInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("paymentInfoService")
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoDao, PaymentInfoEntity>
    implements PaymentInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<PaymentInfoEntity> page =
        this.page(
            new Query<PaymentInfoEntity>().getPage(params), new QueryWrapper<PaymentInfoEntity>());

    return new PageUtils(page);
  }
}
