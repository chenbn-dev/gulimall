package cn.chenbonian.gulimall.member.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:08
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
