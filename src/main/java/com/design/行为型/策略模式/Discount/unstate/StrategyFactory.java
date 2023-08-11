package com.design.行为型.策略模式.Discount.unstate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname StrategyFactory
 * @Description 策略工厂
 * @Date 2021/5/9 16:53
 */
public class StrategyFactory {
    private static final Map<String, DiscountStrategy> DISCOUNT_STRATEGY_MAP = new HashMap<>();

    static {
        DISCOUNT_STRATEGY_MAP.put("FIX", new fixDiscountStrategy());
        DISCOUNT_STRATEGY_MAP.put("ZERO", new ZeroDiscountStrategy());
        DISCOUNT_STRATEGY_MAP.put("PERCENTAGE", new PercentageDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(String type) {
        return DISCOUNT_STRATEGY_MAP.get(type);
    }
}
