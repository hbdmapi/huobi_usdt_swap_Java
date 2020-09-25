package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 获取订单明细信息
 *
 * 获取订单明细接口查询撤单数据时，如果传“created_at”和“order_type”参数则能查询最近90天数据，如果不传“created_at”和“order_type”参数只能查询到最近24小时数据。
 *
 * order_id返回是18位，nodejs和javascript默认解析18有问题，nodejs和javascript里面JSON.parse默认是int，超过18位的数字用json-bigint的包解析。
 *
 * created_at使用13位long类型时间戳（包含毫秒时间），如果输入准确的时间戳，查询性能将会提升。例如:"2019/10/18 10:26:22"转换为时间戳为：1571365582123。也可以直接从contract_order下单接口返回的ts中获取时间戳查询对应的订单。
 *
 *
 */
@Data
@AllArgsConstructor
@Builder
public class SwapOrderDetailRequest {
    private String contractCode;//合约代码	"BTC-USDT"...
    private Long orderId;//订单id
    private Long createdAt;//下单时间戳
    private Integer orderType;//订单类型，1:报单 、 2:撤单  、4:交割
    private Integer pageIndex;//第几页,不填第一页
    private Integer pageSize;//不填默认20，不得多于50
}
