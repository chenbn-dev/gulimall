package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.AttrAttrgroupRelationEntity;
import cn.chenbonian.gulimall.product.service.AttrAttrgroupRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
@RestController
@RequestMapping("porduct/attrattrgrouprelation")
public class AttrAttrgroupRelationController {
  @Autowired private AttrAttrgroupRelationService attrAttrgroupRelationService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:attrattrgrouprelation:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = attrAttrgroupRelationService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("porduct:attrattrgrouprelation:info")
  public R info(@PathVariable("id") Long id) {
    AttrAttrgroupRelationEntity attrAttrgroupRelation = attrAttrgroupRelationService.getById(id);

    return R.ok().put("attrAttrgroupRelation", attrAttrgroupRelation);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:attrattrgrouprelation:save")
  public R save(@RequestBody AttrAttrgroupRelationEntity attrAttrgroupRelation) {
    attrAttrgroupRelationService.save(attrAttrgroupRelation);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:attrattrgrouprelation:update")
  public R update(@RequestBody AttrAttrgroupRelationEntity attrAttrgroupRelation) {
    attrAttrgroupRelationService.updateById(attrAttrgroupRelation);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:attrattrgrouprelation:delete")
  public R delete(@RequestBody Long[] ids) {
    attrAttrgroupRelationService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
