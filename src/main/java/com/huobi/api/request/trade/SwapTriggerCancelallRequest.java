package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/*
*计划委托全部撤单
* */

@Data
@AllArgsConstructor
@Builder
public class SwapTriggerCancelallRequest {
    private String contractCode;//合约代码	"BTC-USDT"

}
