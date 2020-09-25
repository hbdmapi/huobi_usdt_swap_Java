package com.huobi.api.request.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SwapMasterSubTransferRecordRequest {
    private String marginAccount;// 保证金账户	"BTC-USDT"...
    private String transferType;// 划转类型，不填查询全部类型,【查询多类型中间用，隔开】	转出到子账号合约账户：34， 从子账号合约账户转入：35
    private Integer createDate;// 可随意输入正整数，如果参数超过90则默认查询90天的数据
    private Integer pageIndex;// 页码，不填默认第1页
    private Integer pageSize;// 不填默认20，不得多于50
}
