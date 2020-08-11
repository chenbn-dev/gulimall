package cn.chenbonian.gulimall.product.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.product.dao.SkuImagesDao;
import cn.chenbonian.gulimall.product.entity.SkuImagesEntity;
import cn.chenbonian.gulimall.product.service.SkuImagesService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImagesEntity>
    implements SkuImagesService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SkuImagesEntity> page =
        this.page(
            new Query<SkuImagesEntity>().getPage(params), new QueryWrapper<SkuImagesEntity>());

    return new PageUtils(page);
  }
}
