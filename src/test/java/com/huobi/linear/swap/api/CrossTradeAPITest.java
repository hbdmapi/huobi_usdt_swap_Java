package com.huobi.linear.swap.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.crossrequest.trade.*;
import com.huobi.api.crossresponse.trade.*;
import com.huobi.api.crossservice.crosstrade.CrossTradeAPIServiceImpl;
import com.huobi.api.enums.DirectionEnum;
import com.huobi.api.enums.OffsetEnum;
import com.huobi.api.request.trade.*;
import com.huobi.api.response.trade.*;
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
    public void swapCrossSwitchPositionMode(){
        SwapSwitchPositionModeResponse response=huobiCrossAPIService.swapCrossSwitchPositionModeResponse("usdt","dual_side");
        logger.debug("切换持仓模式:{}", JSON.toJSONString(response));
    }

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
                .sortBy("update_time")
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
                .sortBy("update_time")
                .build();
        SwapCrossTriggerHisordersResponse response = huobiCrossAPIService.swapCrossTriggerHisordersResponse(request);
        logger.debug("15.获取计划委托历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossSwitchLeverRateResponse() {
        SwapCrossSwitchLeverRateResponse response = huobiCrossAPIService.getSwapCrossSwitchLeverRate("ETH-USDT", 10,"","");
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
        SwapTpslOrderResponse response = huobiCrossAPIService.swapCrossTpslOrderResponse(request);
        logger.debug("17.对仓位设置止盈止损订单：{}", JSON.toJSONString(response));
    }


    @Test
    public void swapTpslCancelRequest() {
        SwapTpslCancelRequest request = SwapTpslCancelRequest.builder()
                .contractCode("xrp-usdt")
                .orderId("798618423818387460,798593423673294823")
                .build();
        SwapTpslCancelResponse response = huobiCrossAPIService.swapCrossTpslCancelResponse(request);
        logger.debug("18.止盈止损订单撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTpslCancelallRequest() {
        SwapTpslCancelallRequest request = SwapTpslCancelallRequest.builder()
                .contractCode("xrp-usdt")
                .build();
        SwapTpslCancelallResponse response = huobiCrossAPIService.swapCrossTpslCancelallResponse(request);
        logger.debug("19.止盈止损订单全部撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapTpslOpenorderRequest() {
        SwapTpslOpenordersRequest request = SwapTpslOpenordersRequest.builder()
                .contractCode("xrp-usdt")
                .pageIndex(1)
                .pageSize(20)
                .build();
        SwapTpslOpenordersResponse response = huobiCrossAPIService.swapCrossTpslOpenordersResponse(request);
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
        SwapTpslHisordersResponse response = huobiCrossAPIService.swapCrossTpslHisordersResponse(requset);
        logger.debug("21.查询止盈止损订单历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapRelationTpslOrder() {
        SwapRelationTpslOrderRequest request = SwapRelationTpslOrderRequest.builder()
                .contractCode("xrp-usdt")
                .orderId(798617480003518464l)
                .build();
        SwapRelationTpslOrderResponse response = huobiCrossAPIService.swapCrossRelationTpslOrderResponse(request);
        logger.debug("22.查询开仓单关联的止盈止损订单详情：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossHisordersExact() {
        SwapHisordersExactRequest request = SwapHisordersExactRequest.builder()
                .contractCode("aave-usdt")
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
        SwapHisordersExactResponse response = huobiCrossAPIService.swapCrossHisordersResponse(request);
        logger.debug("23.组合查询合约历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossMatchresultsExact() {
        SwapMatchresultsExactRequest request = SwapMatchresultsExactRequest.builder()
                .contractCode("aave-usdt")
                .tradeType(0)
                //.startTime(1l)
                //.endTime(1l)
                //.fromId(1l)
                //.size(20)
                //.direct("")
                .build();
        SwapMatchresultsExactResponse response = huobiCrossAPIService.swapCrossMatchresultsResponse(request);
        logger.debug("24.组合查询用户历史成交记录：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossTrackOrders(){
        SwapTrackOrderRequest request=SwapTrackOrderRequest.builder()
                .contractCode("btc-usdt")
                .direction("buy")
                .offset("open")
                .leverRate(5)
                .volume(BigDecimal.valueOf(1))
                .activePrice(BigDecimal.valueOf(390))
                .callbackRate(BigDecimal.valueOf(0.1))
                .orderPriceType("optimal_5")
                .build();
        SwapTrackOrderResponse response=huobiCrossAPIService.swapCrossTrackOrderResponse(request);
        logger.debug("25.跟踪委托订单下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossTrackCancel(){
        SwapTrackCancelRequest request= SwapTrackCancelRequest.builder()
                .orderId("827232952382566400")
                .contractCode("btc-usdt")
                .build();
        SwapTrackCancelResponse response=huobiCrossAPIService.swapCrossTrackCancelResponse(request);
        logger.debug("26.跟踪委托订单撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossTrackCancelall(){
        SwapTrackCancelallRequest request= SwapTrackCancelallRequest.builder()
                .contractCode("btc-usdt")
                .direction("")
                .offset("")
                .build();
        SwapTrackCancelallResponse response=huobiCrossAPIService.swapCrossTrackCancelallResponse(request);
        logger.debug("27.跟踪委托订单全部撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossTrackOpenorders(){
        SwapTrackOpenordersRequest request=SwapTrackOpenordersRequest.builder()
                .contractCode("btc-usdt")
                .tradeType(0)
                .pageIndex(1)
                .pageSize(2)
                .build();
        SwapTrackOpenordersResponse response=huobiCrossAPIService.swapCrossTrackOpenordersResponse(request);
        logger.debug("28.跟踪委托订单当前委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void swapCrossTrackHisorders(){
        SwapTrackHisordersRequest request= SwapTrackHisordersRequest.builder()
                .contractCode("btc-usdt")
                .status("0")
                .tradeType(0)
                .createDate(10l)
                .pageIndex(1)
                .pageSize(1)
                .sortBy("")
                .build();
        SwapTrackHisordersResponse response=huobiCrossAPIService.swapCrossTrackHisordersResponse(request);
        logger.debug("29.跟踪委托订单当前委托：{}", JSON.toJSONString(response));
    }
}
