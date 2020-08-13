package cn.chenbonian.gulimall.member.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.member.entity.MemberLevelEntity;
import cn.chenbonian.gulimall.member.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 会员等级
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:08
 */
@RestController
@RequestMapping("/member/memberlevel")
public class MemberLevelController {
  @Autowired private MemberLevelService memberLevelService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("member:memberlevel:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = memberLevelService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("member:memberlevel:info")
  public R info(@PathVariable("id") Long id) {
    MemberLevelEntity memberLevel = memberLevelService.getById(id);

    return R.ok().put("memberLevel", memberLevel);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("member:memberlevel:save")
  public R save(@RequestBody MemberLevelEntity memberLevel) {
    memberLevelService.save(memberLevel);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("member:memberlevel:update")
  public R update(@RequestBody MemberLevelEntity memberLevel) {
    memberLevelService.updateById(memberLevel);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("member:memberlevel:delete")
  public R delete(@RequestBody Long[] ids) {
    memberLevelService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
