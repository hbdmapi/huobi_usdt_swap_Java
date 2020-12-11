package com.huobi.linear.swap.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.crossrequest.trade.*;
import com.huobi.api.crossresponse.trade.*;
import com.huobi.api.crossservice.crosstrade.CrossTradeAPIServiceImpl;
import com.huobi.api.enums.DirectionEnum;
import com.huobi.api.enums.OffsetEnum;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@FixMethodOrder(MethodSorters.JVM)
public class CrossTradeAPITest implements BaseTest {

    CrossTradeAPIServiceImpl huobiCrossAPIService = new CrossTradeAPIServiceImpl("", "");

    @Test
    public void swapCrossOrderRequest() {
        SwapCrossOrderRequest request = SwapCrossOrderRequest.builder()
                .contractCode("BTC-USDT")
                .volume(1l)
                //.price(BigDecimal.valueOf(455))
                .direction(DirectionEnum.BUY)
                .offset(OffsetEnum.CLOSE)
                .leverRate(50)
                .orderPriceType("optimal_10_ioc")
                .build();
        SwapCrossOrderResponse response =
                huobiCrossAPIService.swapCrossOrderRequest(request);
        logger.debug("1合约下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossBatchorderRequest() {
        List<SwapCrossOrderRequest> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            SwapCrossOrderRequest request = SwapCrossOrderRequest.builder()
                    .contractCode("ETH-USDT")
                    .volume(1l)
                    .price(BigDecimal.valueOf(456))
                    .direction(DirectionEnum.SELL)
                    .offset(OffsetEnum.OPEN)
                    .leverRate(30)
                    .orderPriceType("limit")
                    .build();
            list.add(request);
            request = SwapCrossOrderRequest.builder()
                    .contractCode("BTC-USDT")
                    .volume(1l)
                    .price(BigDecimal.valueOf(45600))
                    .direction(DirectionEnum.SELL)
                    .offset(OffsetEnum.OPEN)
                    .leverRate(50)
                    .orderPriceType("limit")
                    .build();
            list.add(request);
        }
        SwapCrossBatchorderRequest request = SwapCrossBatchorderRequest.builder()
                .list(list)
                .build();
        SwapCrossBatchorderResponse response =
                huobiCrossAPIService.swapCrossBatchorderRequest(request);
        logger.debug("2.合约批量下单：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapCrossCancelRequest() {
        SwapCrossCancelRequest request = SwapCrossCancelRequest.builder()
                .contractCode("btc-usdt")
                .orderId("786547455839219712")
                //.clientOrderId("")
                .build();
        SwapCrossCancelResponse response =
                huobiCrossAPIService.swapCrossCancelRequest(request);
        logger.debug("3.撤销订单：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapCrossCancelallRequest() {
        SwapCrossCancelallRequest request = SwapCrossCancelallRequest.builder()
                .contractCode("eth-usdt")
                .build();
        SwapCrossCancelallResponse response =
                huobiCrossAPIService.swapCrossCancelallRequest(request);
        logger.debug("4全部撤单：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapCrossOrderInfoRequest() {
        SwapCrossOrderInfoRequest request = SwapCrossOrderInfoRequest.builder()
                .contractCode("ETH-USDT")
                //.clientOrderId("")
                .orderId("786547455839219712")
                .build();
        SwapCrossOrderInfoResponse response =
                huobiCrossAPIService.swapCrossOrderInfoRequest(request);
        logger.debug("5获取合约订单信息：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapOrderDetailRequest() {
        SwapCrossOrderDetailRequest request = SwapCrossOrderDetailRequest.builder()
                .contractCode("ETH-USDT")
                .orderId(786550830160982016l)
                //.createdAt(System.currentTimeMillis())
                //.orderType(1)
                //.pageIndex(1)
                //.pageSize(20)
                .build();
        SwapCrossOrderDetailResponse response =
                huobiCrossAPIService.swapCrossOrderDetailRequest(request);
        logger.debug("6.获取订单明细信息：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapCrossOpenordersRequest() {
        SwapCrossOpenordersRequest request = SwapCrossOpenordersRequest.builder()
                .contractCode("eth-usdt")
                .pageIndex(1)
                .pageSize(20)
                .build();
        SwapCrossOpenordersResponse response =
                huobiCrossAPIService.swapCrossOpenordersRequest(request);
        logger.debug("7.获取合约当前未成交委托：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapCrossHisordersRequest() {
        SwapCrossHisordersRequest request = SwapCrossHisordersRequest.builder()
                .contractCode("BTC-USDT")
                .tradeType(0)
                .type(1)
                .status("3,4,5")
                .createDate(10)
                .pageIndex(1)
                .pageSize(5)
                .build();
        SwapCrossHisordersResponse response =
                huobiCrossAPIService.swapCrossHisordersRequest(request);
        logger.debug("8.获取合约历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossMatchresultsRequest() {
        SwapCrossMatchresultsRequest request = SwapCrossMatchresultsRequest.builder()
                .contractCode("btc-usdt")
                .tradeType(0)
                .createDate(90)
                .pageIndex(1)
                .pageSize(5)
                .build();
        SwapCrossMatchresultsResponse response =
                huobiCrossAPIService.swapCrossMatchresultsRequest(request);
        logger.debug("9.获取历史成交记录：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossLightningClosePositionRequest() {
        SwapCrossLightningClosePositionRequest request = SwapCrossLightningClosePositionRequest.builder()
                .contractCode("ETH-USDT")
                .direction("buy")
                .volume(1)
                .build();
        SwapCrossLightningClosePositionResponse response =
                huobiCrossAPIService.swapCrossLightningClosePositionRequest(request);
        logger.debug("10.闪电平仓下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossTriggerOrderRequest() {
        SwapCrossTriggerOrderRequest request = SwapCrossTriggerOrderRequest.builder()
                .contractCode("ETH-USDT")
                .triggerType("ge")
                .triggerPrice(BigDecimal.valueOf(377))
                .orderPrice(BigDecimal.valueOf(377))
                .orderPriceType("limit")
                .volume(BigDecimal.valueOf(1))
                .direction(DirectionEnum.BUY)
                .offset(OffsetEnum.OPEN)
                .leverRate(30)
                .build();
        SwapCrossTriggerOrderResponse response = huobiCrossAPIService.swapCrossTriggerOrderResponse(request);
        logger.debug("11.计划委托下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossTriggerCancelRequest() {
        SwapCrossTriggerCancelRequest request = SwapCrossTriggerCancelRequest.builder()
                .orderId("1884,1883")
                .contractCode("eth-usdt")
                .build();
        SwapCrossTriggerCancelResponse response = huobiCrossAPIService.swapCrossTriggerCancelResponse(request);
        logger.debug("12.计划委托撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossTriggerCancelallRequest() {
        SwapCrossTriggerCancelallRequest request = SwapCrossTriggerCancelallRequest.builder()
                .contractCode("eth-usdt")
                .build();
        SwapCrossTriggerCancelallResponse response = huobiCrossAPIService.swapCrossTriggerCancelallResponse(request);
        logger.debug("13.计划委托全部撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossTriggerOpenordersRequest() {
        SwapCrossTriggerOpenordersRequest request = SwapCrossTriggerOpenordersRequest.builder()
                .contractCode("eth-usdt")
                .pageIndex(1)
                .pageSize(10)
                .build();
        SwapCrossTriggerOpenordersResponse response = huobiCrossAPIService.swapCrossTriggerOpenordersResponse(request);
        logger.debug("14.获取计划委托当前委托：{}", JSON.toJSONString(response));

    }

    @Test
    public void swapCrossTriggerHisordersRequest() {
        SwapCrossTriggerHisordersRequest request = SwapCrossTriggerHisordersRequest.builder()
                .tradeType(0)
                .status("0")
                .createDate(10)
                .contractCode("eth-usdt")
                .pageIndex(1)
                .pageSize(1)
                .build();
        SwapCrossTriggerHisordersResponse response = huobiCrossAPIService.swapCrossTriggerHisordersResponse(request);
        logger.debug("15.获取计划委托历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossSwitchLeverRateResponse() {
        SwapCrossSwitchLeverRateResponse response = huobiCrossAPIService.getSwapCrossSwitchLeverRate("ETH-USDT", 10);
        logger.debug("16.切换杠杆：{}", JSON.toJSONString(response));
    }
}
