package com.huobi.api.service.market;

import com.huobi.api.request.account.LinearSwapBasisRequest;
import com.huobi.api.request.account.SwapLiquidationOrdersRequest;
import com.huobi.api.request.account.SwapMarketHistoryKlineRequest;
import com.huobi.api.response.market.*;

public interface MarketAPIService {
    SwapContractInfoResponse getSwapContractInfo(String contractCode);

    SwapIndexResponse getSwapIndex(String contractCode);

    SwapPriceLimitResponse getSwapPriceLimit(String contractCode);

    SwapOpenInterestResponse getSwapOpenInterest(String contractCode);

    SwapMarketDepthResponse getSwapMarketDepth(String contractCode,String type);

    SwapMarketHistoryKlineResponse getSwapMarketHistoryKline(SwapMarketHistoryKlineRequest request);

    SwapMarketDetailMergedResponse getSwapMarketDetailMerged(String contractCode);

    SwapMarketTradeResponse getSwapMarketTrade(String contractCode);

    SwapMarketHistoryTradeResponse getSwapMarketHistoryTrade(String contractCode,Integer size);

    SwapRiskInfoResponse getSwapRiskInfo(String contractCode);

    SwapInsuranceFundResponse getSwapInsuranceFund(String contractCode,Integer pageIndex,Integer pageSize);

    SwapAdjustfactorResponse getSwapAdjustfactor(String contractCode);

    SwapHisOpenInterestResponse getSwapHisOpenInterest(String contractCode,String period,Integer size,Integer amountType);

    SwapEliteAccountRatioResponse getSwapEliteAccountRatio(String contractCode,String period);

    SwapElitePositionRatioResponse getSwapElitePositionRatio(String contractCode, String period);

    SwapApiStateResponse getSwapApiState(String contractCode);

    SwapFundingRateResponse getSwapFundingRate(String contractCode);

    SwapHistoricalFundingRateResponse getSwapHistoricalFundingRate(String contractCode,Integer pageIndex,Integer pageSize);

    SwapLiquidationOrdersResponse getSwapLiquidationOrders(SwapLiquidationOrdersRequest request);

    LinearSwapPremiumIndexKlineResponse getLinearSwapPremiumIndexKline(String contractCode,String period,Integer size);

    LinearSwapEstimatedRateKlineResponse getLinearSwapEstimatedRateKline(String contractCode,String period,Integer size);

    LinearSwapBasisResponse getLinearSwapBasis(LinearSwapBasisRequest request);
}
