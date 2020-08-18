package cn.chenbonian.gulimall.member.feign;

import cn.chenbonian.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chbn
 * @create 2020-08-18
 */
@FeignClient("/coupon/coupon/gulimall-coupon")
public interface CouponFeignService {

  @RequestMapping("/member/list")
  public R membercoupons();
}
