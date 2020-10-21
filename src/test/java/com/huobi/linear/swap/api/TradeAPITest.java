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
    public void swapOrderRequest() {
        SwapOrderRequest request = SwapOrderRequest.builder()
                .contractCode("ETH-USDT")
                .volume(100l)
                .price(BigDecimal.valueOf(455))
                .direction(DirectionEnum.SELL)
                .offset(OffsetEnum.OPEN)
                .leverRate(5)
                .orderPriceType("limit")
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
                .build();
        SwapTriggerHisordersResponse response = huobiAPIService.swapTriggerHisordersResponse(request);
        logger.debug("15.获取计划委托历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapSwitchLeverRateResponse(){
        SwapSwitchLeverRateResponse response=huobiAPIService.getSwapSwitchLeverRate("BTC-USDT",10);
        logger.debug("16.切换杠杆：{}", JSON.toJSONString(response));
    }

}
