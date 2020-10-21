package com.huobi.api.service.market;

import com.alibaba.fastjson.JSON;
import com.huobi.api.swaps.HuobiLinearSwapAPIConstants;
import com.huobi.api.exception.ApiException;
import com.huobi.api.request.account.LinearSwapBasisRequest;
import com.huobi.api.request.account.SwapLiquidationOrdersRequest;
import com.huobi.api.request.account.SwapMarketHistoryKlineRequest;
import com.huobi.api.response.market.*;
import com.huobi.api.util.HbdmHttpClient;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class MarketAPIServiceImpl implements MarketAPIService {

    String url_prex = "https://api.hbdm.com";
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public SwapContractInfoResponse getSwapContractInfo(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNoneEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_CONTRACT_INFO, params);
            logger.debug("body:{}", body);
            SwapContractInfoResponse response = JSON.parseObject(body, SwapContractInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);

    }

    @Override
    public SwapIndexResponse getSwapIndex(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNoneEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_INDEX, params);
            logger.debug("body:{}", body);
            SwapIndexResponse response = JSON.parseObject(body, SwapIndexResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapPriceLimitResponse getSwapPriceLimit(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_PRICE_LIMIT, params);
            logger.debug("body:{}", body);
            SwapPriceLimitResponse response = JSON.parseObject(body, SwapPriceLimitResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapOpenInterestResponse getSwapOpenInterest(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNoneEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_OPEN_INTEREST, params);
            logger.debug("body:{}", body);
            SwapOpenInterestResponse response = JSON.parseObject(body, SwapOpenInterestResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapMarketDepthResponse getSwapMarketDepth(String contractCode, String type) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            params.put("type", type);
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_MARKET_DEPTH, params);
            logger.debug("body:{}", body);
            SwapMarketDepthResponse response = JSON.parseObject(body, SwapMarketDepthResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapMarketHistoryKlineResponse getSwapMarketHistoryKline(SwapMarketHistoryKlineRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", request.getContractCode().toUpperCase());
            params.put("period", request.getPeriod());
            if (request.getSize() != null) {
                params.put("size", request.getSize());
            }
            if (request.getTo() != null) {
                params.put("to", request.getTo());
            }
            if (request.getFrom() != null) {
                params.put("from", request.getFrom());
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_MARKET_HISTORY_KLINE, params);
            logger.debug("body:{}", body);
            SwapMarketHistoryKlineResponse response = JSON.parseObject(body, SwapMarketHistoryKlineResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }


    @Override
    public SwapMarketDetailMergedResponse getSwapMarketDetailMerged(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_MARKET_DETAIL_MERGED, params);
            logger.debug("body:{}", body);
            SwapMarketDetailMergedResponse response = JSON.parseObject(body, SwapMarketDetailMergedResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);

    }

    @Override
    public SwapMarketTradeResponse getSwapMarketTrade(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_MARKET_TRADE, params);
            logger.debug("body:{}", body);
            SwapMarketTradeResponse response = JSON.parseObject(body, SwapMarketTradeResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapMarketHistoryTradeResponse getSwapMarketHistoryTrade(String contractCode, Integer size) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            if (size != null) {
                params.put("size", size);
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_MARKET_HISTORY_TRADE, params);
            logger.debug("body:{}", body);
            SwapMarketHistoryTradeResponse response = JSON.parseObject(body, SwapMarketHistoryTradeResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    public SwapRiskInfoResponse getSwapRiskInfo(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_RISK_INFO, params);
            logger.debug("body:{}", body);
            SwapRiskInfoResponse response = JSON.parseObject(body, SwapRiskInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapInsuranceFundResponse getSwapInsuranceFund(String contractCode, Integer pageIndex, Integer pageSize) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            if (pageIndex != null) {
                params.put("page_index", pageIndex);
            }
            if (pageSize != null) {
                params.put("page_size", pageSize);
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_INSURANCE_FUND, params);
            logger.debug("body:{}", body);
            SwapInsuranceFundResponse response = JSON.parseObject(body, SwapInsuranceFundResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapAdjustfactorResponse getSwapAdjustfactor(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNoneEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_ADJUSTFACTOR, params);
            logger.debug("body:{}", body);
            SwapAdjustfactorResponse response = JSON.parseObject(body, SwapAdjustfactorResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapHisOpenInterestResponse getSwapHisOpenInterest(String contractCode, String period, Integer size, Integer amountType) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            params.put("period", period);
            if (size != null) {
                params.put("size", size);
            }
            if (amountType != null) {
                params.put("amount_type", amountType);
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_HIS_OPEN_INTEREST, params);
            logger.debug("body:{}", body);
            SwapHisOpenInterestResponse response = JSON.parseObject(body, SwapHisOpenInterestResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapEliteAccountRatioResponse getSwapEliteAccountRatio(String contractCode, String period) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            params.put("period", period);
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_ELITE_ACCOUNT_RATIO, params);
            logger.debug("body:{}", body);
            SwapEliteAccountRatioResponse response = JSON.parseObject(body, SwapEliteAccountRatioResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapElitePositionRatioResponse getSwapElitePositionRatio(String contractCode, String period) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            params.put("period", period);
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_ELITE_POSITION_RATIO, params);
            logger.debug("body:{}", body);
            SwapElitePositionRatioResponse response = JSON.parseObject(body, SwapElitePositionRatioResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapApiStateResponse getSwapApiState(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNoneEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_API_STATE, params);
            logger.debug("body:{}", body);
            SwapApiStateResponse response = JSON.parseObject(body, SwapApiStateResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapFundingRateResponse getSwapFundingRate(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_FUNDING_RATE, params);
            logger.debug("body:{}", body);
            SwapFundingRateResponse response = JSON.parseObject(body, SwapFundingRateResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    public SwapHistoricalFundingRateResponse getSwapHistoricalFundingRate(String contractCode, Integer pageIndex, Integer pageSize) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            if (pageIndex != null) {
                params.put("page_index", pageIndex);
            }
            if (pageSize != null) {
                params.put("page_size", pageSize);
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_HISTORICAL_FUNDING_RATE, params);
            logger.debug("body:{}", body);
            SwapHistoricalFundingRateResponse response = JSON.parseObject(body, SwapHistoricalFundingRateResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapLiquidationOrdersResponse getSwapLiquidationOrders(SwapLiquidationOrdersRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", request.getContractCode().toUpperCase());
            params.put("trade_type", request.getTradeType());
            params.put("create_date", request.getCreateDate());
            if (request.getPageIndex() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.SWAP_LIQUIDATION_ORDERS, params);
            logger.debug("body:{}", body);
            SwapLiquidationOrdersResponse response = JSON.parseObject(body, SwapLiquidationOrdersResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public LinearSwapPremiumIndexKlineResponse getLinearSwapPremiumIndexKline(String contractCode, String period, Integer size) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            params.put("period", period);
            params.put("size", size);
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.LINEAR_SWAP_PREMIUM_INDEX_KLINE, params);
            logger.debug("body:{}", body);
            LinearSwapPremiumIndexKlineResponse response = JSON.parseObject(body, LinearSwapPremiumIndexKlineResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public LinearSwapEstimatedRateKlineResponse getLinearSwapEstimatedRateKline(String contractCode, String period, Integer size) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase());
            params.put("period", period);
            params.put("size", size);
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.LINEAR_SWAP_ESTIMATED_RATE_KLINE, params);
            logger.debug("body:{}", body);
            LinearSwapEstimatedRateKlineResponse response = JSON.parseObject(body, LinearSwapEstimatedRateKlineResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public LinearSwapBasisResponse getLinearSwapBasis(LinearSwapBasisRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", request.getContractCode().toUpperCase());
            params.put("period", request.getPeriod());
            params.put("size", request.getSize());
            if (StringUtils.isNoneEmpty(request.getBasisPriceType())) {
                params.put("basis_price_type", request.getBasisPriceType());
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiLinearSwapAPIConstants.LINEAR_SWAP_BASIS, params);
            logger.debug("body:{}", body);
            LinearSwapBasisResponse response = JSON.parseObject(body, LinearSwapBasisResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

}