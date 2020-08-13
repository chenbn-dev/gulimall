package cn.chenbonian.gulimall.member.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.member.entity.GrowthChangeHistoryEntity;
import cn.chenbonian.gulimall.member.service.GrowthChangeHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:09
 */
@RestController
@RequestMapping("/member/growthchangehistory")
public class GrowthChangeHistoryController {
  @Autowired private GrowthChangeHistoryService growthChangeHistoryService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("member:growthchangehistory:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = growthChangeHistoryService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("member:growthchangehistory:info")
  public R info(@PathVariable("id") Long id) {
    GrowthChangeHistoryEntity growthChangeHistory = growthChangeHistoryService.getById(id);

    return R.ok().put("growthChangeHistory", growthChangeHistory);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("member:growthchangehistory:save")
  public R save(@RequestBody GrowthChangeHistoryEntity growthChangeHistory) {
    growthChangeHistoryService.save(growthChangeHistory);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("member:growthchangehistory:update")
  public R update(@RequestBody GrowthChangeHistoryEntity growthChangeHistory) {
    growthChangeHistoryService.updateById(growthChangeHistory);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("member:growthchangehistory:delete")
  public R delete(@RequestBody Long[] ids) {
    growthChangeHistoryService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
