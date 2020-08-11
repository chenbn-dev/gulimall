package cn.chenbonian.gulimall.product.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.product.dao.SpuCommentDao;
import cn.chenbonian.gulimall.product.entity.SpuCommentEntity;
import cn.chenbonian.gulimall.product.service.SpuCommentService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity>
    implements SpuCommentService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SpuCommentEntity> page =
        this.page(
            new Query<SpuCommentEntity>().getPage(params), new QueryWrapper<SpuCommentEntity>());

    return new PageUtils(page);
  }
}
