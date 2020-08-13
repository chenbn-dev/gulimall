package cn.chenbonian.gulimall.member.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.member.dao.GrowthChangeHistoryDao;
import cn.chenbonian.gulimall.member.entity.GrowthChangeHistoryEntity;
import cn.chenbonian.gulimall.member.service.GrowthChangeHistoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("growthChangeHistoryService")
public class GrowthChangeHistoryServiceImpl
    extends ServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistoryEntity>
    implements GrowthChangeHistoryService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<GrowthChangeHistoryEntity> page =
        this.page(
            new Query<GrowthChangeHistoryEntity>().getPage(params),
            new QueryWrapper<GrowthChangeHistoryEntity>());

    return new PageUtils(page);
  }
}
