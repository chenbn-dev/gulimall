package cn.chenbonian.gulimall.coupon.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.coupon.dao.HomeSubjectDao;
import cn.chenbonian.gulimall.coupon.entity.HomeSubjectEntity;
import cn.chenbonian.gulimall.coupon.service.HomeSubjectService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("homeSubjectService")
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectDao, HomeSubjectEntity>
    implements HomeSubjectService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<HomeSubjectEntity> page =
        this.page(
            new Query<HomeSubjectEntity>().getPage(params), new QueryWrapper<HomeSubjectEntity>());

    return new PageUtils(page);
  }
}
