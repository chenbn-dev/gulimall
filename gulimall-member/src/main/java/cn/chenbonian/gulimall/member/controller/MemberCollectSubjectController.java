package cn.chenbonian.gulimall.member.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.member.entity.MemberCollectSubjectEntity;
import cn.chenbonian.gulimall.member.service.MemberCollectSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:09
 */
@RestController
@RequestMapping("/member/membercollectsubject")
public class MemberCollectSubjectController {
  @Autowired private MemberCollectSubjectService memberCollectSubjectService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("member:membercollectsubject:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = memberCollectSubjectService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("member:membercollectsubject:info")
  public R info(@PathVariable("id") Long id) {
    MemberCollectSubjectEntity memberCollectSubject = memberCollectSubjectService.getById(id);

    return R.ok().put("memberCollectSubject", memberCollectSubject);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("member:membercollectsubject:save")
  public R save(@RequestBody MemberCollectSubjectEntity memberCollectSubject) {
    memberCollectSubjectService.save(memberCollectSubject);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("member:membercollectsubject:update")
  public R update(@RequestBody MemberCollectSubjectEntity memberCollectSubject) {
    memberCollectSubjectService.updateById(memberCollectSubject);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("member:membercollectsubject:delete")
  public R delete(@RequestBody Long[] ids) {
    memberCollectSubjectService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
