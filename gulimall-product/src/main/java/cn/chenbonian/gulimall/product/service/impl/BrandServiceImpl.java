package cn.chenbonian.gulimall.product.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.product.dao.BrandDao;
import cn.chenbonian.gulimall.product.entity.BrandEntity;
import cn.chenbonian.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<BrandEntity> page =
        this.page(new Query<BrandEntity>().getPage(params), new QueryWrapper<BrandEntity>());

    return new PageUtils(page);
  }
}
