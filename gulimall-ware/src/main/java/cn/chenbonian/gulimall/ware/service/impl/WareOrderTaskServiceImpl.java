package cn.chenbonian.gulimall.ware.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.ware.dao.WareOrderTaskDao;
import cn.chenbonian.gulimall.ware.entity.WareOrderTaskEntity;
import cn.chenbonian.gulimall.ware.service.WareOrderTaskService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("wareOrderTaskService")
public class WareOrderTaskServiceImpl extends ServiceImpl<WareOrderTaskDao, WareOrderTaskEntity>
    implements WareOrderTaskService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WareOrderTaskEntity> page =
        this.page(
            new Query<WareOrderTaskEntity>().getPage(params),
            new QueryWrapper<WareOrderTaskEntity>());

    return new PageUtils(page);
  }
}
