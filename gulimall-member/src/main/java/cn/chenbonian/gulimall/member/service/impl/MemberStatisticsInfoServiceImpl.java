package cn.chenbonian.gulimall.member.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.member.dao.MemberStatisticsInfoDao;
import cn.chenbonian.gulimall.member.entity.MemberStatisticsInfoEntity;
import cn.chenbonian.gulimall.member.service.MemberStatisticsInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("memberStatisticsInfoService")
public class MemberStatisticsInfoServiceImpl
    extends ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfoEntity>
    implements MemberStatisticsInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberStatisticsInfoEntity> page =
        this.page(
            new Query<MemberStatisticsInfoEntity>().getPage(params),
            new QueryWrapper<MemberStatisticsInfoEntity>());

    return new PageUtils(page);
  }
}
