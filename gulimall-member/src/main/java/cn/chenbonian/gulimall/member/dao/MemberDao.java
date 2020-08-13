package cn.chenbonian.gulimall.member.dao;

import cn.chenbonian.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
