package com.huobi.api.request.trade;

import com.huobi.api.enums.DirectionEnum;
import com.huobi.api.enums.OffsetEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 合约下单
 *
 * 备注
 *
 * "limit":限价，"post_only":只做maker单，ioc:IOC订单，fok：FOK订单 这四种类型需要传价格price，其他订单报价类型不需要传价格price。
 *
 * 开平方向
 * 开多：买入开多(direction用buy、offset用open)
 *
 * 平多：卖出平多(direction用sell、offset用close)
 *
 * 开空：卖出开空(direction用sell、offset用open)
 *
 * 平空：买入平空(direction用buy、offset用close)
 */
@Data
@AllArgsConstructor
@Builder
public class SwapOrderRequest {
    private String contractCode;//合约代码 	"BTC-USDT"...
    private Long clientOrderId;//客户自己填写和维护，必须为数字
    private BigDecimal price;//价格
    private Long volume;//委托数量(张)
    private DirectionEnum direction;//"buy":买 "sell":卖
    private OffsetEnum offset;//"open":开 "close":平
    private Integer leverRate;//杠杆倍数[“开仓”若有10倍多单，就不能再下20倍多单]
    private String orderPriceType;//订单报价类型	"limit":限价 "opponent":对手价 "post_only":只做maker单,post only下单只受用户持仓数量限制,optimal_5：最优5档、optimal_10：最优10档、optimal_20：最优20档，ioc:IOC订单，fok：FOK订单, "opponent_ioc": 对手价-IOC下单，"optimal_5_ioc": 最优5档-IOC下单，"optimal_10_ioc": 最优10档-IOC下单，"optimal_20_ioc"：最优20档-IOC下单，"opponent_fok"： 对手价-FOK下单，"optimal_5_fok"：最优5档-FOK下单，"optimal_10_fok"：最优10档-FOK下单，"optimal_20_fok"：最优20档-FOK下单
}
