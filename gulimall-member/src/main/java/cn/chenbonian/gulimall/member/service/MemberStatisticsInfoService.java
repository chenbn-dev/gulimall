package cn.chenbonian.gulimall.member.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.member.entity.MemberStatisticsInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:09
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
