package cn.chenbonian.gulimall.member.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.member.entity.MemberLoginLogEntity;
import cn.chenbonian.gulimall.member.service.MemberLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 会员登录记录
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:08
 */
@RestController
@RequestMapping("/member/memberloginlog")
public class MemberLoginLogController {
  @Autowired private MemberLoginLogService memberLoginLogService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("member:memberloginlog:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = memberLoginLogService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("member:memberloginlog:info")
  public R info(@PathVariable("id") Long id) {
    MemberLoginLogEntity memberLoginLog = memberLoginLogService.getById(id);

    return R.ok().put("memberLoginLog", memberLoginLog);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("member:memberloginlog:save")
  public R save(@RequestBody MemberLoginLogEntity memberLoginLog) {
    memberLoginLogService.save(memberLoginLog);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("member:memberloginlog:update")
  public R update(@RequestBody MemberLoginLogEntity memberLoginLog) {
    memberLoginLogService.updateById(memberLoginLog);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("member:memberloginlog:delete")
  public R delete(@RequestBody Long[] ids) {
    memberLoginLogService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
