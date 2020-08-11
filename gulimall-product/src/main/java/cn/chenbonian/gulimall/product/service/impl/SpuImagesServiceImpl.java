package cn.chenbonian.gulimall.product.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.product.dao.SpuImagesDao;
import cn.chenbonian.gulimall.product.entity.SpuImagesEntity;
import cn.chenbonian.gulimall.product.service.SpuImagesService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity>
    implements SpuImagesService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SpuImagesEntity> page =
        this.page(
            new Query<SpuImagesEntity>().getPage(params), new QueryWrapper<SpuImagesEntity>());

    return new PageUtils(page);
  }
}
