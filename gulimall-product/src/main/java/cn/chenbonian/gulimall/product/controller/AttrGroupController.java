package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.AttrGroupEntity;
import cn.chenbonian.gulimall.product.service.AttrGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 属性分组
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
@RestController
@RequestMapping("/porduct/attrgroup")
public class AttrGroupController {
  @Autowired private AttrGroupService attrGroupService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:attrgroup:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = attrGroupService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{attrGroupId}")
  // @RequiresPermissions("porduct:attrgroup:info")
  public R info(@PathVariable("attrGroupId") Long attrGroupId) {
    AttrGroupEntity attrGroup = attrGroupService.getById(attrGroupId);

    return R.ok().put("attrGroup", attrGroup);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:attrgroup:save")
  public R save(@RequestBody AttrGroupEntity attrGroup) {
    attrGroupService.save(attrGroup);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:attrgroup:update")
  public R update(@RequestBody AttrGroupEntity attrGroup) {
    attrGroupService.updateById(attrGroup);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:attrgroup:delete")
  public R delete(@RequestBody Long[] attrGroupIds) {
    attrGroupService.removeByIds(Arrays.asList(attrGroupIds));

    return R.ok();
  }
}
