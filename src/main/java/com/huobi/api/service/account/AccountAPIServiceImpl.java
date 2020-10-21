package com.huobi.api.service.account;

import com.alibaba.fastjson.JSON;
import com.huobi.api.swaps.HuobiLinearSwapAPIConstants;
import com.huobi.api.exception.ApiException;
import com.huobi.api.request.account.SwapFinancialRecordRequest;
import com.huobi.api.request.account.SwapMasterSubTransferRecordRequest;
import com.huobi.api.request.account.SwapMasterSubTransferRequest;
import com.huobi.api.response.account.*;
import com.huobi.api.util.HbdmHttpClient;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AccountAPIServiceImpl implements AccountAPIService {

    String api_key = ""; // huobi申请的apiKey
    String secret_key = ""; // huobi申请的secretKey
    String url_prex = "https://api.hbdm.com";

    Logger logger = LoggerFactory.getLogger(getClass());

    public AccountAPIServiceImpl(String api_key, String secret_key) {
        this.api_key = api_key;
        this.secret_key = secret_key;
    }


    @Override
    public SwapAccountInfoResponse getSwapAccountInfo(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase().toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_ACCOUNT_INFO, params);
            logger.debug("body:{}", body);
            SwapAccountInfoResponse response = JSON.parseObject(body, SwapAccountInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapPositionInfoResponse getSwapPositionInfo(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase().toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_POSITION_INFO, params);
            logger.debug("body:{}", body);
            SwapPositionInfoResponse response = JSON.parseObject(body, SwapPositionInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapAccountPositionInfoResponse getSwapAccountPositionInfo(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", contractCode.toUpperCase().toUpperCase());
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_ACCOUNT_POSITION_INFO, params);
            logger.debug("body:{}", body);
            SwapAccountPositionInfoResponse response = JSON.parseObject(body, SwapAccountPositionInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapSubAccountListResponse getSwapSubAccountList(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase().toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_SUB_ACCOUNT_LIST, params);
            logger.debug("body:{}", body);
            SwapSubAccountListResponse response = JSON.parseObject(body, SwapSubAccountListResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapSubAccountInfoResponse getSwapSubAccountInfo(String contractCode, Long subUid) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase().toUpperCase());
            }
            params.put("sub_uid", subUid);
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_SUB_ACCOUNT_INFO, params);
            logger.debug("body:{}", body);
            SwapSubAccountInfoResponse response = JSON.parseObject(body, SwapSubAccountInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapSubPositionInfoResponse getSwapSubPositionInfo(String contractCode, Long subUid) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase().toUpperCase());
            }
            params.put("sub_uid", subUid);
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_SUB_POSITION_INFO, params);
            logger.debug("body:{}", body);
            SwapSubPositionInfoResponse response = JSON.parseObject(body, SwapSubPositionInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapFinancialRecordResponse getSwapFinancialRecord(SwapFinancialRecordRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("margin_account", request.getMarginAccount().toUpperCase());
            if (StringUtils.isNoneEmpty(request.getType())) {
                params.put("type", request.getType());
            }
            if (request.getCreateDate() != null) {
                params.put("create_date", request.getCreateDate());
            }
            if (request.getPageIndex() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_FINANCIAL_RECORD, params);
            logger.debug("body:{}", body);
            SwapFinancialRecordResponse response = JSON.parseObject(body, SwapFinancialRecordResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapOrderLimitResponse getSwapOrderLimitResponse(String contractCode, String orderPriceType) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNoneEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            params.put("order_price_type", orderPriceType);
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_ORDER_LIMIT, params);
            logger.debug("body:{}", body);
            SwapOrderLimitResponse response = JSON.parseObject(body, SwapOrderLimitResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapFeeResponse getSwapFeeResponse(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNoneEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_FEE, params);
            logger.debug("body:{}", body);
            SwapFeeResponse response = JSON.parseObject(body, SwapFeeResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapTransferLimitResponse getSwapTransferLimitResponse(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNoneEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_TRANSFER_LIMIT, params);
            logger.debug("body:{}", body);
            SwapTransferLimitResponse response = JSON.parseObject(body, SwapTransferLimitResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapPositionLimitResponse getSwapPositionLimitResponse(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNoneEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_POSITION_LIMIT, params);
            logger.debug("body:{}", body);
            SwapPositionLimitResponse response = JSON.parseObject(body, SwapPositionLimitResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapMasterSubTransferResponse getSwapMasterSubTransferResponse(SwapMasterSubTransferRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("sub_uid", request.getSubUid());
            params.put("asset", request.getAsset().toUpperCase());
            params.put("from_margin_account", request.getFromMarginAccount().toUpperCase());
            params.put("to_margin_account", request.getToMarginAccount().toUpperCase());
            params.put("amount", request.getAmount());
            params.put("type", request.getType());
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_MASTER_SUB_TRANSFER, params);
            logger.debug("body:{}", body);
            SwapMasterSubTransferResponse response = JSON.parseObject(body, SwapMasterSubTransferResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapMasterSubTransferRecordResponse getSwapMasterSubTransferRecordResponse(SwapMasterSubTransferRecordRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("margin_account", request.getMarginAccount().toUpperCase());
            if (request.getTransferType() != null) {
                params.put("transfer_type", request.getTransferType());
            }
            params.put("create_date", request.getCreateDate());
            if (request.getPageIndex() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_MASTER_SUB_TRANSFER_RECORD, params);
            logger.debug("body:{}", body);
            SwapMasterSubTransferRecordResponse response = JSON.parseObject(body, SwapMasterSubTransferRecordResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapTransferInnerResponse getSwapTransferInner(String asset, String fromMarginAccount, String toMarginAccount, BigDecimal amount) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("asset", asset);
            params.put("from_margin_account", fromMarginAccount);
            params.put("to_margin_account", toMarginAccount);
            params.put("amount", amount);
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_TRANSFER_INNER, params);
            logger.debug("body:{}", body);
            SwapTransferInnerResponse response = JSON.parseObject(body, SwapTransferInnerResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapApiTradingStatusResponse getSwapApiTradingStatusResponse() {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            body = HbdmHttpClient.getInstance().doGetKey(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_API_TRADING_STATUS, params);
            logger.debug("body:{}", body);
            SwapApiTradingStatusResponse response = JSON.parseObject(body, SwapApiTradingStatusResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapAvailableLevelRateResponse getSwapAvailableLevelRate(String contractCode) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNoneEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.SWAP_AVAILABLE_LEVEL_RATE, params);
            logger.debug("body:{}", body);
            SwapAvailableLevelRateResponse response = JSON.parseObject(body, SwapAvailableLevelRateResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

}
