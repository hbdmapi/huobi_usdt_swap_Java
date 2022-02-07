package com.huobi.api.crossrequest.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/*
 * 计划委托撤单
 * */

@Data
@AllArgsConstructor
@Builder
public class SwapCrossTriggerCancelRequest {
    private String contractCode;//合约代码	"BTC-USDT"
    private String orderId;//用户订单ID（多个订单ID中间以","分隔,一次最多允许撤消10个订单 ）
    private String pair;
    private String contractType;
}
