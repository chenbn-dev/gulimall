package cn.chenbonian.gulimall.ware.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.ware.dao.PurchaseDetailDao;
import cn.chenbonian.gulimall.ware.entity.PurchaseDetailEntity;
import cn.chenbonian.gulimall.ware.service.PurchaseDetailService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("purchaseDetailService")
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailDao, PurchaseDetailEntity>
    implements PurchaseDetailService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<PurchaseDetailEntity> page =
        this.page(
            new Query<PurchaseDetailEntity>().getPage(params),
            new QueryWrapper<PurchaseDetailEntity>());

    return new PageUtils(page);
  }
}
