package cn.chenbonian.gulimall.member.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.member.dao.MemberDao;
import cn.chenbonian.gulimall.member.entity.MemberEntity;
import cn.chenbonian.gulimall.member.service.MemberService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberDao, MemberEntity>
    implements MemberService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberEntity> page =
        this.page(new Query<MemberEntity>().getPage(params), new QueryWrapper<MemberEntity>());

    return new PageUtils(page);
  }
}
