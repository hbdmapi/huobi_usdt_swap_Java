package com.huobi.api.crossrequest.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SwapCrossOrderDetailRequest {
    private String contractCode;//合约代码	"BTC-USDT"...
    private Long orderId;//订单id
    private Long createdAt;//下单时间戳
    private Integer orderType;//订单类型，1:报单 、 2:撤单  、4:交割
    private Integer pageIndex;//第几页,不填第一页
    private Integer pageSize;//不填默认20，不得多于50
    private String pair;
}
