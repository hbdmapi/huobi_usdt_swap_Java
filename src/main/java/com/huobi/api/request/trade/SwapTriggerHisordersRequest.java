package com.huobi.api.request.trade;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
* 获取计划委托历史委托
* */

@Data
@AllArgsConstructor
@Builder
public class SwapTriggerHisordersRequest {
    private String contractCode;//合约代码	BTC-USDT
    private Integer tradeType;//交易类型		0:全部,1:买入开多,2: 卖出开空,3: 买入平空,4: 卖出平多；后台是根据该值转换为offset和direction，然后去查询的； 其他值无法查询出结果
    private String status;//多个以英文逗号隔开，计划委托单状态：0:全部（表示全部结束状态的订单）、4:已委托、5:委托失败、6:已撤单
    private Integer createDate;//可随意输入正整数，如果参数超过90则默认查询90天的数据
    private Integer pageIndex;//第几页，不填默认第一页
    private Integer pageSize;//不填默认20，不得多于50

}
