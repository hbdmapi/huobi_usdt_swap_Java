package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@Data
public class SwapTrackOrderRequest {
    private String contractCode;
    private String direction;
    private String offset;
    private Integer leverRate;
    private BigDecimal volume;
    private BigDecimal callbackRate;
    private BigDecimal activePrice;
    private String orderPriceType;
}
