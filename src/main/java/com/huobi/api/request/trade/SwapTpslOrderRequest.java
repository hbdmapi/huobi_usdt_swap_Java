package com.huobi.api.request.trade;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class SwapTpslOrderRequest {
    private String contractCode;
    private String direction;
    private BigDecimal volume;
    private BigDecimal tpTriggerPrice;
    private BigDecimal tpOrderPrice;
    private String tpOrderPriceType;
    private BigDecimal slTriggerPrice;
    private BigDecimal slOrderPrice;
    private String slOrderPriceType;
}
