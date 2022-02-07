package com.huobi.api.crossrequest.trade;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/*
* 获取计划委托当前委托
* */

@Data
@AllArgsConstructor
@Builder
public class SwapCrossTriggerOpenordersRequest {
    private String contractCode;//合约代码	BTC-USDT
    private Integer pageIndex;//第几页，不填默认第一页
    private Integer pageSize;//不填默认20，不得多于50
    private Integer tradeType;
    private String pair;
    private String tradePartition;
}
