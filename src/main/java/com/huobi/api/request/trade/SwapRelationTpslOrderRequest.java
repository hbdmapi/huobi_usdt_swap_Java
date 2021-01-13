package com.huobi.api.request.trade;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SwapRelationTpslOrderRequest {
    private String contractCode;
    private Long orderId;
}
