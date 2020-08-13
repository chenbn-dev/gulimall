package cn.chenbonian.gulimall.member.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.member.dao.MemberCollectSubjectDao;
import cn.chenbonian.gulimall.member.entity.MemberCollectSubjectEntity;
import cn.chenbonian.gulimall.member.service.MemberCollectSubjectService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("memberCollectSubjectService")
public class MemberCollectSubjectServiceImpl
    extends ServiceImpl<MemberCollectSubjectDao, MemberCollectSubjectEntity>
    implements MemberCollectSubjectService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberCollectSubjectEntity> page =
        this.page(
            new Query<MemberCollectSubjectEntity>().getPage(params),
            new QueryWrapper<MemberCollectSubjectEntity>());

    return new PageUtils(page);
  }
}
