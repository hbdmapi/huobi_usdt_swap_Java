package com.huobi.linear.swap.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.enums.DirectionEnum;
import com.huobi.api.enums.OffsetEnum;
import com.huobi.api.request.trade.*;
import com.huobi.api.response.trade.*;
import com.huobi.api.service.trade.TradeAPIServiceImpl;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@FixMethodOrder(MethodSorters.JVM)
public class TradeAPITest implements BaseTest {

    TradeAPIServiceImpl huobiAPIService = new TradeAPIServiceImpl("", "");

    @Test
    public void swapSwitchPositionMode(){
        SwapSwitchPositionModeResponse response=huobiAPIService.swapSwitchPositionModeResponse("btc-usdt","dual_side");
        logger.debug("切换持仓模式:{}", JSON.toJSONString(response));
    }

    @Test
    public void swapOrderRequest() {
        SwapOrderRequest request = SwapOrderRequest.builder()
                .contractCode("xrp-usdt")
                .volume(1l)
                .price(BigDecimal.valueOf(0.2))
                .direction(DirectionEnum.BUY)
                .offset(OffsetEnum.OPEN)
                .leverRate(10)
                .orderPriceType("post_only")
                .tpTriggerPrice(BigDecimal.valueOf(0.5))
                .tpOrderPrice(BigDecimal.valueOf(0.5))
                .tpOrderPriceType("limit")
                .slTriggerPrice(BigDecimal.valueOf(0.1))
                .slOrderPrice(BigDecimal.valueOf(0.1))
                .slOrderPriceType("limit")
                .reduceOnly(1)
                .build();
        SwapOrderResponse response =
                huobiAPIService.swapOrderRequest(request);
        logger.debug("1合约下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapBatchorderRequest() {
        List<SwapOrderRequest> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            SwapOrderRequest request = SwapOrderRequest.builder()
                    .contractCode("ETH-USDT")
                    .volume(100l)
                    .price(BigDecimal.valueOf(456))
                    .direction(DirectionEnum.SELL)
                    .offset(OffsetEnum.OPEN)
                    .leverRate(5)
                    .orderPriceType("limit")
                    .build();
            list.add(request);
        }
        SwapBatchorderRequest request = SwapBatchorderRequest.builder()
                .list(list)
                .build();
        SwapBatchorderResponse response =
                huobiAPIService.swapBatchorderRequest(request);
        logger.debug("2.合约批量下单：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapCancelRequest() {
        SwapCancelRequest request = SwapCancelRequest.builder()
                .contractCode("eth-usdt")
                .orderId("759098746146705408")
                //.clientOrderId("")
                .build();
        SwapCancelResponse response =
                huobiAPIService.swapCancelRequest(request);
        logger.debug("3.撤销订单：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapCancelallRequest() {
        SwapCancelallRequest request = SwapCancelallRequest.builder()
                .contractCode("eth-usdt")
                .build();
        SwapCancelallResponse response =
                huobiAPIService.swapCancelallRequest(request);
        logger.debug("4全部撤单：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapOrderInfoRequest() {
        SwapOrderInfoRequest request = SwapOrderInfoRequest.builder()
                .contractCode("BTC-USDT")
                //.clientOrderId("")
                .orderId("758644298199887872")
                .build();
        SwapOrderInfoResponse response =
                huobiAPIService.swapOrderInfoRequest(request);
        logger.debug("5获取合约订单信息：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapOrderDetailRequest() {
        SwapOrderDetailRequest request = SwapOrderDetailRequest.builder()
                .contractCode("BTC-usdt")
                .orderId(758644298199887872l)
                // .createdAt(System.currentTimeMillis())
                //.orderType(1)
                //.pageIndex(1)
                //.pageSize(20)
                .build();
        SwapOrderDetailResponse response =
                huobiAPIService.swapOrderDetailRequest(request);
        logger.debug("6.获取订单明细信息：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapOpenordersRequest() {
        SwapOpenordersRequest request = SwapOpenordersRequest.builder()
                .contractCode("btc-usdt")
                .pageIndex(1)
                .pageSize(20)
                .build();
        SwapOpenordersResponse response =
                huobiAPIService.swapOpenordersRequest(request);
        logger.debug("7.获取合约当前未成交委托：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapHisordersRequest() {
        SwapHisordersRequest request = SwapHisordersRequest.builder()
                .contractCode("ETH-USDT")
                .tradeType(0)
                .type(1)
                .status(0)
                .createDate(10)
                .pageIndex(1)
                .pageSize(5)
                .sortBy("update_time")
                .build();
        SwapHisordersResponse response =
                huobiAPIService.swapHisordersRequest(request);
        logger.debug("8.获取合约历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapMatchresultsRequest() {
        SwapMatchresultsRequest request = SwapMatchresultsRequest.builder()
                .contractCode("btc-usdt")
                .tradeType(0)
                .createDate(90)
                .pageIndex(1)
                .pageSize(5)
                .build();
        SwapMatchresultsResponse response =
                huobiAPIService.swapMatchresultsRequest(request);
        logger.debug("9.获取历史成交记录：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapLightningClosePositionRequest() {
        SwapLightningClosePositionRequest request = SwapLightningClosePositionRequest.builder()
                .contractCode("ETH-USDT")
                .direction("sell")
                .volume(1)
                .build();
        SwapLightningClosePositionResponse response =
                huobiAPIService.swapLightningClosePositionRequest(request);
        logger.debug("10.闪电平仓下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTriggerOrderRequest() {
        SwapTriggerOrderRequest request = SwapTriggerOrderRequest.builder()
                .contractCode("ETH-USDT")
                .triggerType("ge")
                .triggerPrice(BigDecimal.valueOf(377))
                .orderPrice(BigDecimal.valueOf(377))
                .orderPriceType("limit")
                .volume(BigDecimal.valueOf(1))
                .direction(DirectionEnum.BUY)
                .offset(OffsetEnum.OPEN)
                .leverRate(5)
                .build();
        SwapTriggerOrderResponse response = huobiAPIService.swapTriggerOrderResponse(request);
        logger.debug("11.计划委托下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void optionTriggerCancelRequest() {
        SwapTriggerCancelRequest request = SwapTriggerCancelRequest.builder()
                .orderId("4699")
                .contractCode("eth-usdt")
                .build();
        SwapTriggerCancelResponse response = huobiAPIService.swapTriggerCancelResponse(request);
        logger.debug("12.计划委托撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void optionTriggerCancelallRequest() {
        SwapTriggerCancelallRequest request = SwapTriggerCancelallRequest.builder()
                .contractCode("eth-usdt")
                .build();
        SwapTriggerCancelallResponse response = huobiAPIService.swapTriggerCancelallResponse(request);
        logger.debug("13.计划委托全部撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void optionTriggerOpenordersRequest() {
        SwapTriggerOpenordersRequest request = SwapTriggerOpenordersRequest.builder()
                .contractCode("btc-usdt")
                .pageIndex(1)
                .pageSize(10)
                .build();
        SwapTriggerOpenordersResponse response = huobiAPIService.swapTriggerOpenordersResponse(request);
        logger.debug("14.获取计划委托当前委托：{}", JSON.toJSONString(response));

    }

    @Test
    public void optionTriggerHisordersRequest() {
        SwapTriggerHisordersRequest request = SwapTriggerHisordersRequest.builder()
                .tradeType(0)
                .status("0")
                .createDate(10)
                .contractCode("btc-usdt")
                .pageIndex(1)
                .pageSize(1)
                .sortBy("update_time")
                .build();
        SwapTriggerHisordersResponse response = huobiAPIService.swapTriggerHisordersResponse(request);
        logger.debug("15.获取计划委托历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapSwitchLeverRateResponse() {
        SwapSwitchLeverRateResponse response = huobiAPIService.getSwapSwitchLeverRate("BTC-USDT", 10);
        logger.debug("16.切换杠杆：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTpslOrderRequest() {
        SwapTpslOrderRequest request = SwapTpslOrderRequest.builder()
                .contractCode("xrp-usdt")
                .direction("buy")
                .volume(BigDecimal.valueOf(1))
                .tpTriggerPrice(BigDecimal.valueOf(0.2))
                .tpOrderPrice(BigDecimal.valueOf(0.2))
                .tpOrderPriceType("limit")
                .slTriggerPrice(BigDecimal.valueOf(0.5))
                .slOrderPrice(BigDecimal.valueOf(0.5))
                .slOrderPriceType("limit")
                .build();
        SwapTpslOrderResponse response = huobiAPIService.swapTpslOrderResponse(request);
        logger.debug("17.对仓位设置止盈止损订单：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapTpslCancelRequest() {
        SwapTpslCancelRequest request = SwapTpslCancelRequest.builder()
                .contractCode("xrp-usdt")
                .orderId("798593423673294849,798593423673294823")
                .build();
        SwapTpslCancelResponse response = huobiAPIService.swapTpslCancelResponse(request);
        logger.debug("18.止盈止损订单撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTpslCancelallRequest() {
        SwapTpslCancelallRequest request = SwapTpslCancelallRequest.builder()
                .contractCode("xrp-usdt")
                .build();
        SwapTpslCancelallResponse response = huobiAPIService.swapTpslCancelallResponse(request);
        logger.debug("19.止盈止损订单全部撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTpslOpenorderRequest() {
        SwapTpslOpenordersRequest request = SwapTpslOpenordersRequest.builder()
                .contractCode("xrp-usdt")
                .pageIndex(1)
                .pageSize(20)
                .build();
        SwapTpslOpenordersResponse response = huobiAPIService.swapTpslOpenordersResponse(request);
        logger.debug("20.查询止盈止损订单当前委托：{}", JSON.toJSONString(response));

    }

    @Test
    public void swapTpslHisordersRequest() {
        SwapTpslHisordersRequset requset = SwapTpslHisordersRequset.builder()
                .contractCode("xrp-usdt")
                .status("0")
                .createDate(10l)
                .pageIndex(1)
                .pageSize(20)
                .sortBy("update_time")
                .build();
        SwapTpslHisordersResponse response = huobiAPIService.swapTpslHisordersResponse(requset);
        logger.debug("21.查询止盈止损订单历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapRelationTpslOrder() {
        SwapRelationTpslOrderRequest request = SwapRelationTpslOrderRequest.builder()
                .contractCode("xrp-usdt")
                .orderId(798606585433096192l)
                .build();
        SwapRelationTpslOrderResponse response = huobiAPIService.swapRelationTpslOrderResponse(request);
        logger.debug("22.查询开仓单关联的止盈止损订单详情：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapHisordersExact() {
        SwapHisordersExactRequest request = SwapHisordersExactRequest.builder()
                .contractCode("btc-usdt")
                .tradeType(0)
                .type(1)
                .status("0")
                //.orderPriceType("limit")
                //.startTime(1l)
                //.endTime(1l)
                //.fromId(1l)
                //.size(20)
                //.direct("")
                .build();
        SwapHisordersExactResponse response = huobiAPIService.swapHisordersExactResponse(request);
        logger.debug("23.组合查询合约历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapMatchresUltsExact() {
        SwapMatchresultsExactRequest request = SwapMatchresultsExactRequest.builder()
                .contractCode("btc-usdt")
                .tradeType(0)
                //.startTime(1l)
                //.endTime(1l)
                //.fromId(1l)
                //.size(20)
                //.direct("")
                .build();
        SwapMatchresultsExactResponse response = huobiAPIService.swapMatchresultsExactResponse(request);
        logger.debug("24.组合查询用户历史成交记录：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTrackOrders(){
        SwapTrackOrderRequest request=SwapTrackOrderRequest.builder()
                .contractCode("BTC-usdt")
                .direction("buy")
                .offset("open")
                .leverRate(5)
                .volume(BigDecimal.valueOf(1))
                .activePrice(BigDecimal.valueOf(48000))
                .callbackRate(BigDecimal.valueOf(0.1))
                .orderPriceType("optimal_10")
                .build();
        SwapTrackOrderResponse response=huobiAPIService.swapTrackOrderResponse(request);
        logger.debug("25.跟踪委托订单下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTrackCancel(){
        SwapTrackCancelRequest request= SwapTrackCancelRequest.builder()
                .orderId("827126893407870976,827126893407870977")
                .contractCode("btc-usdt")
                .build();
        SwapTrackCancelResponse response=huobiAPIService.swapTrackCancelResponse(request);
        logger.debug("26.跟踪委托订单撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTrackCancelall(){
        SwapTrackCancelallRequest request= SwapTrackCancelallRequest.builder()
                .contractCode("btc-usdt")
                .direction("buy")
                .offset("")
                .build();
        SwapTrackCancelallResponse response=huobiAPIService.swapTrackCancelallResponse(request);
        logger.debug("27.跟踪委托订单全部撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTrackOpenorders(){
        SwapTrackOpenordersRequest request=SwapTrackOpenordersRequest.builder()
                .contractCode("btc-usdt")
                .tradeType(0)
                .pageIndex(1)
                .pageSize(2)
                .build();
        SwapTrackOpenordersResponse response=huobiAPIService.swapTrackOpenordersResponse(request);
        logger.debug("28.跟踪委托订单当前委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTrackHisorders(){
        SwapTrackHisordersRequest request= SwapTrackHisordersRequest.builder()
                .contractCode("btc-usdt")
                .status("0")
                .tradeType(0)
                .createDate(10l)
                .pageIndex(1)
                .pageSize(1)
                .sortBy("")
                .build();
        SwapTrackHisordersResponse response=huobiAPIService.swapTrackHisordersResponse(request);
        logger.debug("29.跟踪委托订单当前委托：{}", JSON.toJSONString(response));
    }
}
