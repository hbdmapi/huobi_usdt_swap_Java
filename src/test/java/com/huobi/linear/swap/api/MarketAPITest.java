package com.huobi.linear.swap.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.request.account.LinearSwapBasisRequest;
import com.huobi.api.request.account.SwapLiquidationOrdersRequest;
import com.huobi.api.request.account.SwapMarketHistoryKlineRequest;
import com.huobi.api.response.market.*;
import com.huobi.api.service.market.MarketAPIServiceImpl;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class MarketAPITest implements BaseTest {

    MarketAPIServiceImpl huobiAPIService = new MarketAPIServiceImpl();


    @Test
    public void getSwapContractInfo() {
        SwapContractInfoResponse result =
                huobiAPIService.getSwapContractInfo("BTC-USDT");
        logger.debug("1.获取合约信息：{}", JSON.toJSONString(result));
    }


    @Test
    public void getSwapIndex() {
        SwapIndexResponse result =
                huobiAPIService.getSwapIndex("btc-usdt");
        logger.debug("2.获取合约指数信息：{}", JSON.toJSONString(result));
        result =
                huobiAPIService.getSwapIndex("");
        logger.debug("2.获取合约指数信息：{}", JSON.toJSONString(result));
    }

    @Test
    public void getSwapPriceLimit() {
        SwapPriceLimitResponse result =
                huobiAPIService.getSwapPriceLimit("BTC-USDT");
        logger.debug("3.获取合约最高限价和最低限价：{}", JSON.toJSONString(result));
    }

    @Test
    public void getSwapOpenInterest() {
        SwapOpenInterestResponse result =
                huobiAPIService.getSwapOpenInterest("btc-usdt");
        logger.debug("4.获取当前可用合约总持仓量:{}", JSON.toJSONString(result));
        result = huobiAPIService.getSwapOpenInterest("");
        logger.debug("4.获取当前可用合约总持仓量:{}", JSON.toJSONString(result));
    }

    @Test
    public void getSwapMarketDepth() {
        SwapMarketDepthResponse result =
                huobiAPIService.getSwapMarketDepth("btc-usdt", "step15");
        logger.debug("5.获取行情深度数据：{}", JSON.toJSONString(result));
    }

    @Test
    public void getSwapMarketHistoryKline() {
        SwapMarketHistoryKlineRequest result = SwapMarketHistoryKlineRequest.builder()
                .contractCode("BTC-USDT")
                .period("15min")
                .size(1)
                //.from()
                //.to()
                .build();
        SwapMarketHistoryKlineResponse response = huobiAPIService.getSwapMarketHistoryKline(result);
        logger.debug("6.获取K线数据：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapMarketDetailMergedResponse() {
        SwapMarketDetailMergedResponse result =
                huobiAPIService.getSwapMarketDetailMerged("BTC-USDT");
        logger.debug("7.获取聚合行情：{}", JSON.toJSONString(result));
    }

    @Test
    public void getSwapMarketTradeResponse() {
        SwapMarketTradeResponse response = huobiAPIService.getSwapMarketTrade("BTC-USDT");
        logger.debug("8.获取市场最近成交记录:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapMarketHistoryTradeResponse() {
        SwapMarketHistoryTradeResponse response = huobiAPIService.getSwapMarketHistoryTrade("BTC-USDT", 1);
        logger.debug("9.批量获取最近的交易记录:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapRiskInfoResponse() {
        SwapRiskInfoResponse response = huobiAPIService.getSwapRiskInfo("");
        logger.debug("10.查询合约风险准备金余额和预估分摊比例:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapInsuranceFundResponse() {
        SwapInsuranceFundResponse response = huobiAPIService.getSwapInsuranceFund("BTC-USDT", 1, 10);
        logger.debug("11.查询合约风险准备金余额历史数据:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapAdjustfactorResponse() {
        SwapAdjustfactorResponse response = huobiAPIService.getSwapAdjustfactor("BTC-USDT");
        logger.debug("12.查询平台阶梯调整系数:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapHisOpenInterestResponse() {
        SwapHisOpenInterestResponse response = huobiAPIService.getSwapHisOpenInterest("BTC-USDT", "60min", 10, 1);
        logger.debug("13.平台持仓量的查询:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapEliteAccountRatioResponse() {
        SwapEliteAccountRatioResponse response = huobiAPIService.getSwapEliteAccountRatio("BTC-USDT", "60min");
        logger.debug("14.精英账户多空持仓对比-账户数:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapElitePositionRatioResponse() {
        SwapElitePositionRatioResponse response = huobiAPIService.getSwapElitePositionRatio("BTC-USDT", "60min");
        logger.debug("15.精英账户多空持仓对比-持仓量:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapApiStateResponse() {
        SwapApiStateResponse response = huobiAPIService.getSwapApiState("");
        logger.debug("16.查询系统状态:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapFundingRateResponse() {
        SwapFundingRateResponse response = huobiAPIService.getSwapFundingRate("BTC-USDT");
        logger.debug("17.获取合约的资金费率:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapHistoricalFundingRateResponse() {
        SwapHistoricalFundingRateResponse response = huobiAPIService.getSwapHistoricalFundingRate("BTC-USDT", 1, 10);
        logger.debug("18.获取合约的历史资金费率:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapLiquidationOrderResponse() {
        SwapLiquidationOrdersRequest request = SwapLiquidationOrdersRequest.builder()
                .contractCode("BTC-USDT")
                .tradeType(0)
                .createDate(90) //此字段只能填写 7 或 90，填写别的数字会报 1030
                .pageIndex(1)
                .pageSize(2)
                .build();
        SwapLiquidationOrdersResponse response = huobiAPIService.getSwapLiquidationOrders(request);
        logger.debug("19.获取强平订单:{}", JSON.toJSONString(response));
    }

    @Test
    public void getLinearSwapPremiumIndexKlineResponse() {
        LinearSwapPremiumIndexKlineResponse response =
                huobiAPIService.getLinearSwapPremiumIndexKline("BTC-USDT", "5min", 10);
        logger.debug("20.获取合约的溢价指数K线:{}", JSON.toJSONString(response));
    }

    @Test
    public void getLinearSwapEstimatedRateKlineResponse() {
        LinearSwapEstimatedRateKlineResponse response =
                huobiAPIService.getLinearSwapEstimatedRateKline("BTC-USDT", "5min", 10);
        logger.debug("21.获取实时预测资金费率的K线数据:{}", JSON.toJSONString(response));
    }

    @Test
    public void getLinearSwapBasisResponse() {
        LinearSwapBasisRequest request = LinearSwapBasisRequest.builder()
                .contractCode("BTC-USDT")
                .period("60min")
                .basisPriceType("open")
                .size(10)
                .build();
        LinearSwapBasisResponse response = huobiAPIService.getLinearSwapBasis(request);
        logger.debug("22.获取基差数据:{}", JSON.toJSONString(response));

    }
}
