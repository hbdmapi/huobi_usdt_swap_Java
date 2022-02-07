package com.huobi.api.service.market;

import com.huobi.api.request.account.LinearSwapBasisRequest;
import com.huobi.api.request.account.SwapLiquidationOrdersRequest;
import com.huobi.api.request.account.SwapMarketHistoryKlineRequest;
import com.huobi.api.response.market.*;

public interface MarketAPIService {
    SwapContractInfoResponse getSwapContractInfo(String contractCode, String supportMarginMode,String pair,String contractType,String businessType,String tradePartition);

    SwapIndexResponse getSwapIndex(String contractCode,String tradePartition);

    SwapPriceLimitResponse getSwapPriceLimit(String contractCode,String pair,String contractType,String businessType,String tradePartition);

    SwapOpenInterestResponse getSwapOpenInterest(String contractCode,String pair,String contractType,String businessType,String tradePartition);

    SwapMarketDepthResponse getSwapMarketDepth(String contractCode, String type);

    SwapMarketHistoryKlineResponse getSwapMarketHistoryKline(SwapMarketHistoryKlineRequest request);

    SwapMarketDetailMergedResponse getSwapMarketDetailMerged(String contractCode);

    SwapMarketTradeResponse getSwapMarketTrade(String contractCode,String businessType,String tradePartition);

    SwapMarketHistoryTradeResponse getSwapMarketHistoryTrade(String contractCode, Integer size);

    SwapRiskInfoResponse getSwapRiskInfo(String contractCode,String businessType,String tradePartition);

    SwapInsuranceFundResponse getSwapInsuranceFund(String contractCode, Integer pageIndex,Integer pageSize);

    SwapAdjustfactorResponse getSwapAdjustfactor(String contractCode,String tradePartition);

    SwapHisOpenInterestResponse getSwapHisOpenInterest(String contractCode,String pair,String contractType, String period, Integer size, Integer amountType);

    SwapEliteAccountRatioResponse getSwapEliteAccountRatio(String contractCode, String period);

    SwapElitePositionRatioResponse getSwapElitePositionRatio(String contractCode, String period);

    SwapApiStateResponse getSwapApiState(String contractCode,String tradePartition);

    SwapFundingRateResponse getSwapFundingRate(String contractCode);

    SwapHistoricalFundingRateResponse getSwapHistoricalFundingRate(String contractCode, Integer pageIndex, Integer pageSize);

    SwapLiquidationOrdersResponse getSwapLiquidationOrders(SwapLiquidationOrdersRequest request);

    LinearSwapPremiumIndexKlineResponse getLinearSwapPremiumIndexKline(String contractCode, String period, Integer size);

    LinearSwapEstimatedRateKlineResponse getLinearSwapEstimatedRateKline(String contractCode, String period, Integer size);

    LinearSwapBasisResponse getLinearSwapBasis(LinearSwapBasisRequest request);

    SwapEstimatedSettlementPriceResponse getSwapEstimatedSettlementPrice(String contractCode,String pair,String contractType,String businessType,String tradePartition);

    BatchMergedResponse getBatchMerged(String contractCode,String businessType,String tradePartition);

    LinearSwapMarkPriceKlineResponse getLinearSwapMarkPriceKline(String contractCode, String period, Integer size);

    SwapLadderMarginResponse getSwapLadderMargin(String contractCode,String tradePartition);

    SwapBatchFundingRateResponse getSwapBatchFundingRate(String contractCode,String tradePartition);

    MarketBboResponse getMarketBbo(String contractCode,String businessType, String tradePartition);

    SwapSettlementRecordsResponse getSwapSettlementRecords(String contractCode,Long startTime,Long endTime,Integer pageIndex,Integer pageSize);

}
