package com.huobi.api.crossrequest.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/*
*计划委托全部撤单
* */

@Data
@AllArgsConstructor
@Builder
public class SwapCrossTriggerCancelallRequest {
    private String contractCode;//合约代码	"BTC-USDT"
    private String direction;
    private String offset;
    private String pair;
    private String contractType;
}
