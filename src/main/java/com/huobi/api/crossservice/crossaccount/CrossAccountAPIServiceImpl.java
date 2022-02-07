package com.huobi.api.crossservice.crossaccount;

import com.alibaba.fastjson.JSON;
import com.huobi.api.crossrequest.account.SwapCrossLeverPositionLimitRequest;
import com.huobi.api.crossrequest.account.SwapCrossUserSettlementRecordsRequest;
import com.huobi.api.crossresponse.account.*;
import com.huobi.api.exception.ApiException;
import com.huobi.api.response.account.SwapLeverPositionLimitResponse;
import com.huobi.api.response.account.SwapSubAccountInfoListResponse;
import com.huobi.api.swapcross.HuobiLinearSwapCrossAPIConstants;
import com.huobi.api.util.HbdmHttpClient;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class CrossAccountAPIServiceImpl implements CrossAccountAPIService {

    String api_key = ""; // huobi申请的apiKey
    String secret_key = ""; // huobi申请的secretKey
    String url_prex = "https://api.hbdm.com";

    Logger logger = LoggerFactory.getLogger(getClass());

    public CrossAccountAPIServiceImpl(String api_key, String secret_key) {
        this.api_key = api_key;
        this.secret_key = secret_key;
    }

    @Override
    public SwapCrossAccountInfoResponse getSwapCrossAccountInfo(String marginAccount,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(marginAccount)) {
                params.put("margin_account", marginAccount.toUpperCase().toUpperCase());
            }
            if (StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_ACCOUNT_INFO, params);
            logger.debug("body:{}", body);
            SwapCrossAccountInfoResponse response = JSON.parseObject(body, SwapCrossAccountInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossPositionInfoResponse getSwapCrossPositionInfo(String contractCode, String pair, String contractType,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase().toUpperCase());
            }
            if (StringUtils.isNotEmpty(pair)) {
                params.put("pair", pair.toUpperCase());
            }
            if (StringUtils.isNotEmpty(contractType)) {
                params.put("contract_type", contractType);
            }
            if (StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_POSITION_INFO, params);
            logger.debug("body:{}", body);
            SwapCrossPositionInfoResponse response = JSON.parseObject(body, SwapCrossPositionInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossAccountPositionInfoResponse getSwapCrossAccountPositionInfo(String marginAccount) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("margin_account", marginAccount.toUpperCase().toUpperCase());
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_ACCOUNT_POSITION_INFO, params);
            logger.debug("body:{}", body);
            SwapCrossAccountPositionInfoResponse response = JSON.parseObject(body, SwapCrossAccountPositionInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossSubAccountListResponse getSwapCrossSubAccountList(String marginAccount,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(marginAccount)) {
                params.put("margin_account", marginAccount.toUpperCase().toUpperCase());
            }
            if (StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_SUB_ACCOUNT_LIST, params);
            logger.debug("body:{}", body);
            SwapCrossSubAccountListResponse response = JSON.parseObject(body, SwapCrossSubAccountListResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossSubAccountInfoResponse getSwapCrossSubAccountInfo(String marginAccount, Long subUid,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(marginAccount)) {
                params.put("margin_account", marginAccount.toUpperCase().toUpperCase());
            }
            if (StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            params.put("sub_uid", subUid);
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_SUB_ACCOUNT_INFO, params);
            logger.debug("body:{}", body);
            SwapCrossSubAccountInfoResponse response = JSON.parseObject(body, SwapCrossSubAccountInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossSubPositionInfoResponse getSwapCrossSubPositionInfo(String contractCode, Long subUid, String pair, String contractType,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase().toUpperCase());
            }
            if (StringUtils.isNotEmpty(pair)) {
                params.put("pair", pair.toUpperCase());
            }
            if (contractType != null) {
                params.put("contract_type", contractType);
            }
            if (StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            params.put("sub_uid", subUid);
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_SUB_POSITION_INFO, params);
            logger.debug("body:{}", body);
            SwapCrossSubPositionInfoResponse response = JSON.parseObject(body, SwapCrossSubPositionInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }


    @Override
    public SwapCrossTransferLimitResponse getSwapCrossTransferLimitResponse(String marginAccount) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNoneEmpty(marginAccount)) {
                params.put("margin_account", marginAccount.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TRANSFER_LIMIT, params);
            logger.debug("body:{}", body);
            SwapCrossTransferLimitResponse response = JSON.parseObject(body, SwapCrossTransferLimitResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossPositionLimitResponse getSwapCrossPositionLimitResponse(String contractCode, String pair, String contractType,String businessType,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNoneEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            if (StringUtils.isNotEmpty(pair)){
                params.put("pair",pair.toUpperCase());
            }
            if (contractType!=null){
                params.put("contract_type",contractType);
            }
            if (businessType!=null){
                params.put("business_type",businessType);
            }
            if (StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_POSITION_LIMIT, params);
            logger.debug("body:{}", body);
            SwapCrossPositionLimitResponse response = JSON.parseObject(body, SwapCrossPositionLimitResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }


    @Override
    public SwapCrossAvailableLevelRateResponse getSwapCrossAvailableLevelRate(String contractCode,String tradePartition) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNoneEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            if (StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_AVAILABLE_LEVEL_RATE, params);
            logger.debug("body:{}", body);
            SwapCrossAvailableLevelRateResponse response = JSON.parseObject(body, SwapCrossAvailableLevelRateResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossUserSettlementRecordsResponse getSwapCrossUserSettlementRecords(SwapCrossUserSettlementRecordsRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            params.put("margin_account", request.getMarginAccount().toUpperCase());
            if (request.getStartTime() != null) {
                params.put("start_time", request.getStartTime());
            }
            if (request.getEndTime() != null) {
                params.put("end_time", request.getEndTime());
            }
            if (request.getPageIndex() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_USER_SETTLEMENT_RECORDS, params);
            logger.debug("body:{}", body);
            SwapCrossUserSettlementRecordsResponse response = JSON.parseObject(body, SwapCrossUserSettlementRecordsResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapSubAccountInfoListResponse getSwapCrossSubAccountInfoList(String marginAccount, Integer pageIndex, Integer pagesize,String tradePartition) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            params.put("margin_account", marginAccount);
            params.put("page_index", pageIndex);
            params.put("page_size", pagesize);
            if (StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_SUB_ACCOUNT_INFO_LIST, params);
            logger.debug("body:{}", body);
            SwapSubAccountInfoListResponse response = JSON.parseObject(body, SwapSubAccountInfoListResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapLeverPositionLimitResponse getSwapCrossLeverPositionLimit(SwapCrossLeverPositionLimitRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getBusinessType())){
                params.put("business_type",request.getBusinessType());
            }
            if (StringUtils.isNotEmpty(request.getContractType())){
                params.put("contract_type",request.getContractType());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair());
            }
            if (StringUtils.isNotEmpty(request.getContractCode())){
                params.put("contract_code",request.getContractCode());
            }
            if (request.getLeverRate()!=null && request.getLeverRate()!=0){
                params.put("lever_rate",request.getLeverRate());
            }
            if (StringUtils.isNotEmpty(request.getTradePartition())){
                params.put("trade_partition",request.getTradePartition());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_LEVER_POSITION_LIMIT, params);
            logger.debug("body:{}", body);
            SwapLeverPositionLimitResponse response = JSON.parseObject(body, SwapLeverPositionLimitResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

}
