package cn.chenbonian.gulimall.member.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.member.dao.MemberLevelDao;
import cn.chenbonian.gulimall.member.entity.MemberLevelEntity;
import cn.chenbonian.gulimall.member.service.MemberLevelService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("memberLevelService")
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelDao, MemberLevelEntity>
    implements MemberLevelService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberLevelEntity> page =
        this.page(
            new Query<MemberLevelEntity>().getPage(params), new QueryWrapper<MemberLevelEntity>());

    return new PageUtils(page);
  }
}
