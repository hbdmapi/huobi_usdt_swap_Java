package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 闪电平仓下单
 */
@Data
@AllArgsConstructor
@Builder
public class SwapLightningClosePositionRequest {
    private String contractCode;//合约代码	"BTC-USDT"...
    private Integer volume;//委托数量（张）
    private String direction;//“buy”:买，“sell”:卖
    private Long clientOrderId;//（API）客户自己填写和维护，必须保持唯一
    private String orderPriceType;//订单报价类型	不填，默认为“闪电平仓”，"lightning"：闪电平仓，"lightning_ioc"：闪电平仓-IOC，"lightning_fok"：闪电平仓-FOK
}
