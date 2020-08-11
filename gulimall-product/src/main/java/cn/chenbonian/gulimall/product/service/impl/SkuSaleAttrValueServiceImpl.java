package cn.chenbonian.gulimall.product.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.product.dao.SkuSaleAttrValueDao;
import cn.chenbonian.gulimall.product.entity.SkuSaleAttrValueEntity;
import cn.chenbonian.gulimall.product.service.SkuSaleAttrValueService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("skuSaleAttrValueService")
public class SkuSaleAttrValueServiceImpl
    extends ServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity>
    implements SkuSaleAttrValueService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SkuSaleAttrValueEntity> page =
        this.page(
            new Query<SkuSaleAttrValueEntity>().getPage(params),
            new QueryWrapper<SkuSaleAttrValueEntity>());

    return new PageUtils(page);
  }
}
