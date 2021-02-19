package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 获取用户的当前未成交委托
 */

@Data
@AllArgsConstructor
@Builder
public class SwapOpenordersRequest {
    private String contractCode;//合约代码	"BTC-USDT" ...
    private Integer pageIndex;//第几页,不填第一页
    private Integer pageSize;//不填默认20，不得多于50
    private String sortBy;
    private Integer tradeType;
}
