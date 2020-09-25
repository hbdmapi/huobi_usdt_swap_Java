package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 备注
 *"limit":限价，"post_only":只做maker单，ioc:IOC订单，fok：FOK订单 这四种类型需要传价格price，其他订单报价类型不需要传价格price。
 *一次最多允许10个订单。
 */
@Data
@AllArgsConstructor
@Builder
public class SwapBatchorderRequest {
    private List<SwapOrderRequest> list;

}
