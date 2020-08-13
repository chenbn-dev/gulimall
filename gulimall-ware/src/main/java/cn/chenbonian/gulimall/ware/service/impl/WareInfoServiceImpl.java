package cn.chenbonian.gulimall.ware.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.ware.dao.WareInfoDao;
import cn.chenbonian.gulimall.ware.entity.WareInfoEntity;
import cn.chenbonian.gulimall.ware.service.WareInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("wareInfoService")
public class WareInfoServiceImpl extends ServiceImpl<WareInfoDao, WareInfoEntity>
    implements WareInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WareInfoEntity> page =
        this.page(new Query<WareInfoEntity>().getPage(params), new QueryWrapper<WareInfoEntity>());

    return new PageUtils(page);
  }
}
