package cn.chenbonian.gulimall.member.dao;

import cn.chenbonian.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:08
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
