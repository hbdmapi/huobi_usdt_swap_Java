package com.huobi.api.request.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SwapFinancialRecordRequest {
    private String marginAccount;//保证金账户 	"BTC-USDT"...
    private String type;//不填查询全部类型,【查询多类型中间用，隔开】	平多：3，平空：4，开仓手续费-吃单：5，开仓手续费-挂单：6，平仓手续费-吃单：7，平仓手续费-挂单：8，交割平多：9，交割平空：10，交割手续费：11，强制平多：12，强制平空：13，从币币转入：14，转出至币币：15，结算未实现盈亏-多仓：16，结算未实现盈亏-空仓：17，穿仓分摊：19，系统：26，活动奖励：28，返利：29，资金费-收入：30，资金费-支出：31, 转出到子账号合约账户: 34, 从子账号合约账户转入:35, 转出到母账号合约账户: 36, 从母账号合约账户转入: 37，从其他保证金账户转入：38，转出到其他保证金账户：39
    private Integer createDate;//可随意输入正整数，如果参数超过90则默认查询90天的数据，默认7
    private Integer pageIndex;//第几页,不填默认第一页
    private Integer pageSize;//不填默认20，不得多于50
}
