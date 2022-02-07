package com.huobi.api.crossrequest.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@AllArgsConstructor
@Builder
public class SwapCrossOrderInfoRequest {
    private String orderId;//订单ID(多个订单ID中间以","分隔,一次最多允许查询50个订单)
    private String clientOrderId;//客户订单ID(多个订单ID中间以","分隔,一次最多允许查询50个订单)
    private String contractCode;//合约代码	"BTC-USDT"...
    private String pair;
}
