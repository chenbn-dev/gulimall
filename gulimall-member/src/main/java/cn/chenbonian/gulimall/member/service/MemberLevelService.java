package cn.chenbonian.gulimall.member.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 会员等级
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:08
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
