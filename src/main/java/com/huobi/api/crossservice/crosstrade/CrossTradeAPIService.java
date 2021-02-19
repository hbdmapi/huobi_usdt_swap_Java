package com.huobi.api.crossservice.crosstrade;

import com.huobi.api.crossrequest.trade.*;
import com.huobi.api.crossresponse.trade.*;
import com.huobi.api.request.trade.*;
import com.huobi.api.response.trade.*;

public interface CrossTradeAPIService {
    SwapCrossOrderResponse swapCrossOrderRequest(SwapCrossOrderRequest request);//合约下单（全仓模式）

    SwapCrossBatchorderResponse swapCrossBatchorderRequest(SwapCrossBatchorderRequest request);//合约批量下单（全仓模式）

    SwapCrossCancelResponse swapCrossCancelRequest(SwapCrossCancelRequest request);//撤销订单（全仓模式）

    SwapCrossCancelallResponse swapCrossCancelallRequest(SwapCrossCancelallRequest request);//全部撤单（全仓模式）

    SwapCrossOrderInfoResponse swapCrossOrderInfoRequest(SwapCrossOrderInfoRequest request);//获取合约订单信息（全仓模式）

    SwapCrossOrderDetailResponse swapCrossOrderDetailRequest(SwapCrossOrderDetailRequest request);//获取订单明细信息（全仓模式）

    SwapCrossOpenordersResponse swapCrossOpenordersRequest(SwapCrossOpenordersRequest request);//获取合约当前未成交委托（全仓模式）

    SwapCrossHisordersResponse swapCrossHisordersRequest(SwapCrossHisordersRequest request);//获取合约历史委托（全仓模式）

    SwapCrossMatchresultsResponse swapCrossMatchresultsRequest(SwapCrossMatchresultsRequest request);//获取历史成交记录（全仓模式）

    SwapCrossLightningClosePositionResponse swapCrossLightningClosePositionRequest(SwapCrossLightningClosePositionRequest request);//闪电平仓下单（全仓模式）

    SwapCrossTriggerOrderResponse swapCrossTriggerOrderResponse(SwapCrossTriggerOrderRequest request);//计划委托下单（全仓模式）

    SwapCrossTriggerCancelResponse swapCrossTriggerCancelResponse(SwapCrossTriggerCancelRequest request);//计划委托撤单（全仓模式）

    SwapCrossTriggerCancelallResponse swapCrossTriggerCancelallResponse(SwapCrossTriggerCancelallRequest request);//计划委托合部撤单（全仓模式）

    SwapCrossTriggerOpenordersResponse swapCrossTriggerOpenordersResponse(SwapCrossTriggerOpenordersRequest request);//获取计划委托当前委托（全仓模式）

    SwapCrossTriggerHisordersResponse swapCrossTriggerHisordersResponse(SwapCrossTriggerHisordersRequest request);//获取计划委托历史委托（全仓模式）

    SwapCrossSwitchLeverRateResponse getSwapCrossSwitchLeverRate(String contractCode, Integer lever_rate);//切换杠杆（全仓模式）

    SwapTpslOrderResponse swapCrossTpslOrderResponse(SwapTpslOrderRequest request);

    SwapTpslCancelResponse swapCrossTpslCancelResponse(SwapTpslCancelRequest request);

    SwapTpslCancelallResponse swapCrossTpslCancelallResponse(SwapTpslCancelallRequest request);

    SwapTpslOpenordersResponse swapCrossTpslOpenordersResponse(SwapTpslOpenordersRequest request);

    SwapTpslHisordersResponse swapCrossTpslHisordersResponse(SwapTpslHisordersRequset request);

    SwapRelationTpslOrderResponse swapCrossRelationTpslOrderResponse(SwapRelationTpslOrderRequest request);

    SwapHisordersExactResponse swapCrossHisordersResponse(SwapHisordersExactRequest request);

    SwapMatchresultsExactResponse swapCrossMatchresultsResponse(SwapMatchresultsExactRequest request);

}
