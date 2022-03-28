package com.huobi.api.crossservice.crosstrade;

import com.alibaba.fastjson.JSON;
import com.huobi.api.crossrequest.trade.*;
import com.huobi.api.crossresponse.trade.*;
import com.huobi.api.exception.ApiException;
import com.huobi.api.request.trade.*;
import com.huobi.api.response.trade.*;
import com.huobi.api.swapcross.HuobiLinearSwapCrossAPIConstants;
import com.huobi.api.util.HbdmHttpClient;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrossTradeAPIServiceImpl implements CrossTradeAPIService {


    String api_key = ""; // huobi申请的apiKey
    String secret_key = ""; // huobi申请的secretKey
    String url_prex = "https://api.hbdm.com";

    Logger logger = LoggerFactory.getLogger(getClass());

    public CrossTradeAPIServiceImpl(String api_key, String secret_key) {
        this.api_key = api_key;
        this.secret_key = secret_key;
    }


    @Override
    public SwapSwitchPositionModeResponse swapCrossSwitchPositionModeResponse(String marginAccount, String positionMode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("margin_account", marginAccount);
            params.put("position_mode", positionMode);
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_SWITCH_POSITION_MODE, params);
            logger.debug("body:{}", body);
            SwapSwitchPositionModeResponse response = JSON.parseObject(body, SwapSwitchPositionModeResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossOrderResponse swapCrossOrderRequest(SwapCrossOrderRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();

            params.put("volume", request.getVolume());
            params.put("direction", request.getDirection().getValue());
            if (request.getOffset()!=null) {
                params.put("offset", request.getOffset().getValue());
            }
            params.put("order_price_type", request.getOrderPriceType());
            params.put("lever_rate", request.getLeverRate());
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())) {
                params.put("pair", request.getPair().toUpperCase());
            }
            if (request.getContractType() != null) {
                params.put("contract_type", request.getContractType());
            }
            if (request.getPrice() != null) {
                params.put("price", request.getPrice());
            }
            if (request.getClientOrderId() != null) {
                params.put("client_order_id", request.getClientOrderId());
            }
            if (request.getTpTriggerPrice() != null && request.getTpTriggerPrice() != BigDecimal.valueOf(0)) {
                params.put("tp_trigger_price", request.getTpTriggerPrice());
            }
            if (request.getTpOrderPrice() != null && request.getTpOrderPrice() != BigDecimal.valueOf(0)) {
                params.put("tp_order_price", request.getTpOrderPrice());
            }
            if (request.getTpOrderPriceType() != null) {
                params.put("tp_order_price_type", request.getTpOrderPriceType());
            }
            if (request.getSlTriggerPrice() != null && request.getSlTriggerPrice() != BigDecimal.valueOf(0)) {
                params.put("sl_trigger_price", request.getSlTriggerPrice());
            }
            if (request.getSlOrderPrice() != null && request.getSlOrderPrice() != BigDecimal.valueOf(0)) {
                params.put("sl_order_price", request.getSlOrderPrice());
            }
            if (request.getSlOrderPriceType() != null) {
                params.put("sl_order_price_type", request.getSlOrderPriceType());
            }
            if(request.getReduceOnly()!=null){
                params.put("reduce_only",request.getReduceOnly());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_ORDER, params);
            logger.debug("body:{}", body);
            SwapCrossOrderResponse response = JSON.parseObject(body, SwapCrossOrderResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossBatchorderResponse swapCrossBatchorderRequest(SwapCrossBatchorderRequest request) {
        List<Map<String, Object>> listMap = new ArrayList<>();
        String body;
        try {

            request.getList().stream()
                    .forEach(e -> {
                        Map<String, Object> params = new HashMap<>();
                        params.put("volume", e.getVolume());
                        params.put("direction", e.getDirection().getValue());
                        if (e.getOffset()!=null) {
                            params.put("offset", e.getOffset().getValue());
                        }
                        params.put("order_price_type", e.getOrderPriceType());
                        params.put("lever_rate", e.getLeverRate());
                        if (StringUtils.isNotEmpty(e.getContractCode())) {
                            params.put("contract_code", e.getContractCode().toUpperCase());
                        }
                        if (StringUtils.isNotEmpty(e.getPair())) {
                            params.put("pair", e.getPair().toUpperCase());
                        }
                        if (e.getContractType() != null) {
                            params.put("contract_type", e.getContractType());
                        }
                        if (e.getPrice() != null) {
                            params.put("price", e.getPrice());
                        }
                        if (e.getClientOrderId() != null) {
                            params.put("client_order_id", e.getClientOrderId());
                        }
                        if (e.getTpTriggerPrice() != null && e.getTpTriggerPrice() != BigDecimal.valueOf(0)) {
                            params.put("tp_trigger_price", e.getTpTriggerPrice());
                        }
                        if (e.getTpOrderPrice() != null && e.getTpOrderPrice() != BigDecimal.valueOf(0)) {
                            params.put("tp_order_price", e.getTpOrderPrice());
                        }
                        if (e.getTpOrderPriceType() != null) {
                            params.put("tp_order_price_type", e.getTpOrderPriceType());
                        }
                        if (e.getSlTriggerPrice() != null && e.getSlTriggerPrice() != BigDecimal.valueOf(0)) {
                            params.put("sl_trigger_price", e.getSlTriggerPrice());
                        }
                        if (e.getSlOrderPrice() != null && e.getSlOrderPrice() != BigDecimal.valueOf(0)) {
                            params.put("sl_order_price", e.getSlOrderPrice());
                        }
                        if (e.getSlOrderPriceType() != null) {
                            params.put("sl_order_price_type", e.getSlOrderPriceType());
                        }
                        if(e.getReduceOnly()!=null){
                            params.put("reduce_only",e.getReduceOnly());
                        }
                        listMap.add(params);
                    });
            Map<String, Object> params = new HashMap<>();

            params.put("orders_data", listMap);

            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_BATCHORDER, params);
            logger.debug("body:{}", body);
            SwapCrossBatchorderResponse response = JSON.parseObject(body, SwapCrossBatchorderResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    /**
     * 撤销订单（全仓模式）
     */
    @Override
    public SwapCrossCancelResponse swapCrossCancelRequest(SwapCrossCancelRequest request) {
        String body = "";
        try {
            Map<String, Object> params = new HashMap<>();
            if (request.getOrderId() != null) {
                params.put("order_id", request.getOrderId());
            }
            if (request.getClientOrderId() != null) {
                params.put("client_order_id", request.getClientOrderId());
            }
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())) {
                params.put("pair", request.getPair().toUpperCase());
            }
            if (request.getContractType() != null) {
                params.put("contract_type", request.getContractType());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_CANCEL, params);
            logger.debug("body:{}", body);
            SwapCrossCancelResponse response = JSON.parseObject(body, SwapCrossCancelResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            System.out.println("body:" + body);
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    /**
     * 全部撤单（全仓模式）
     */
    @Override
    public SwapCrossCancelallResponse swapCrossCancelallRequest(SwapCrossCancelallRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())) {
                params.put("pair", request.getPair().toUpperCase());
            }
            if (request.getContractType() != null) {
                params.put("contract_type", request.getContractType());
            }
            if (request.getDirection() != null) {
                params.put("direction", request.getDirection());
            }
            if (request.getOffset() != null) {
                params.put("offset", request.getOffset());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_CANCELALL, params);
            logger.debug("body:{}", body);
            SwapCrossCancelallResponse response = JSON.parseObject(body, SwapCrossCancelallResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossOrderInfoResponse swapCrossOrderInfoRequest(SwapCrossOrderInfoRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())) {
                params.put("pair", request.getPair().toUpperCase());
            }
            if (request.getClientOrderId() != null) {
                params.put("client_order_id", request.getClientOrderId());
            }
            if (request.getOrderId() != null) {
                params.put("order_id", request.getOrderId());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_ORDER_INFO, params);
            logger.debug("body:{}", body);
            SwapCrossOrderInfoResponse response = JSON.parseObject(body, SwapCrossOrderInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    /**
     * 获取订单明细信息（全仓模式）
     */
    @Override
    public SwapCrossOrderDetailResponse swapCrossOrderDetailRequest(SwapCrossOrderDetailRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())) {
                params.put("pair", request.getPair().toUpperCase());
            }
            params.put("order_id", request.getOrderId());
            if (request.getCreatedAt() != null) {
                params.put("created_at", request.getCreatedAt());
            }
            if (request.getOrderType() != null) {
                params.put("order_type", request.getOrderType());
            }
            if (request.getPageIndex() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_ORDER_DETAIL, params);
            logger.debug("body:{}", body);
            SwapCrossOrderDetailResponse response = JSON.parseObject(body, SwapCrossOrderDetailResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    /**
     * 获取合约当前未成交委托（全仓模式）
     */
    @Override
    public SwapCrossOpenordersResponse swapCrossOpenordersRequest(SwapCrossOpenordersRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (request.getPageIndex() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            if (request.getSortBy() != null) {
                params.put("sort_by", request.getSortBy());
            }
            if (request.getTradeType() != null) {
                params.put("trade_type", request.getTradeType());
            }
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())) {
                params.put("pair", request.getPair().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getTradePartition())){
                params.put("trade_partition",request.getTradePartition());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_OPENORDERS, params);
            logger.debug("body:{}", body);
            SwapCrossOpenordersResponse response = JSON.parseObject(body, SwapCrossOpenordersResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossHisordersResponse swapCrossHisordersRequest(SwapCrossHisordersRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("trade_type", request.getTradeType());
            params.put("type", request.getType());
            params.put("status", request.getStatus());
            params.put("create_date", request.getCreateDate());
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())) {
                params.put("pair", request.getPair().toUpperCase());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            if (request.getContractCode() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getSortBy() != null) {
                params.put("sort_by", request.getSortBy());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_HISORDERS, params);
            logger.debug("body:{}", body);
            SwapCrossHisordersResponse response = JSON.parseObject(body, SwapCrossHisordersResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossMatchresultsResponse swapCrossMatchresultsRequest(SwapCrossMatchresultsRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("trade_type", request.getTradeType());
            params.put("create_date", request.getCreateDate());
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())) {
                params.put("pair", request.getPair().toUpperCase());
            }
            if (request.getPageIndex() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_MATCHRESULTS, params);
            logger.debug("body:{}", body);
            SwapCrossMatchresultsResponse response = JSON.parseObject(body, SwapCrossMatchresultsResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossLightningClosePositionResponse swapCrossLightningClosePositionRequest(SwapCrossLightningClosePositionRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(request.getOrderPriceType())) {
                params.put("order_price_type", request.getOrderPriceType());
            }
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())) {
                params.put("pair", request.getPair().toUpperCase());
            }
            if (request.getContractType() != null) {
                params.put("contract_type", request.getContractType());
            }
            params.put("direction", request.getDirection());
            params.put("volume", request.getVolume());
            if (request.getClientOrderId() != null) {
                params.put("client_order_id", request.getClientOrderId());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_LIGHTNING_CLOSE_POSITION, params);
            logger.debug("body:{}", body);
            SwapCrossLightningClosePositionResponse response = JSON.parseObject(body, SwapCrossLightningClosePositionResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    public SwapCrossTriggerOrderResponse swapCrossTriggerOrderResponse(SwapCrossTriggerOrderRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            if (request.getContractType()!=null){
                params.put("contract_type",request.getContractType());
            }
            params.put("trigger_type", request.getTriggerType());
            params.put("trigger_price", request.getTriggerPrice());
            params.put("volume", request.getVolume());
            params.put("direction", request.getDirection());
            if (request.getOffset()!=null) {
                params.put("offset", request.getOffset());
            }
            if (request.getOrderPrice() != null) {
                params.put("order_price", request.getOrderPrice());
            }
            if (request.getOrderPriceType() != null) {
                params.put("order_price_type", request.getOrderPriceType());
            }
            if (request.getLeverRate() != null) {
                params.put("lever_rate", request.getLeverRate());
            }
            if(request.getReduceOnly()!=null){
                params.put("reduce_only",request.getReduceOnly());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TRIGGER_ORDER, params);
            logger.debug("body:{}", body);
            SwapCrossTriggerOrderResponse response = JSON.parseObject(body, SwapCrossTriggerOrderResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossTriggerCancelResponse swapCrossTriggerCancelResponse(SwapCrossTriggerCancelRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            if (request.getContractType()!=null){
                params.put("contract_type",request.getContractType());
            }
            params.put("order_id", request.getOrderId());
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TRIGGER_CANCEL, params);
            logger.debug("body:{}", body);
            SwapCrossTriggerCancelResponse response = JSON.parseObject(body, SwapCrossTriggerCancelResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);

    }

    @Override
    public SwapCrossTriggerCancelallResponse swapCrossTriggerCancelallResponse(SwapCrossTriggerCancelallRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            if (request.getContractType()!=null){
                params.put("contract_type",request.getContractType());
            }
            if (request.getDirection() != null) {
                params.put("direction", request.getDirection());
            }
            if (request.getOffset() != null) {
                params.put("offset", request.getOffset());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TRIGGER_CANCELALL, params);
            logger.debug("body:{}", body);
            SwapCrossTriggerCancelallResponse response = JSON.parseObject(body, SwapCrossTriggerCancelallResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossTriggerOpenordersResponse swapCrossTriggerOpenordersResponse(SwapCrossTriggerOpenordersRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            if (request.getPageIndex() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            if (request.getTradeType() != null) {
                params.put("trade_type", request.getTradeType());
            }
            if (StringUtils.isNotEmpty(request.getTradePartition())){
                params.put("trade_partition",request.getTradePartition());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TRIGGER_OPENORDERS, params);
            logger.debug("body:{}", body);
            SwapCrossTriggerOpenordersResponse response = JSON.parseObject(body, SwapCrossTriggerOpenordersResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossTriggerHisordersResponse swapCrossTriggerHisordersResponse(SwapCrossTriggerHisordersRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            params.put("trade_type", request.getTradeType());
            params.put("status", request.getStatus());
            params.put("create_date", request.getCreateDate());
            if (request.getPageIndex() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            if (request.getSortBy() != null) {
                params.put("sort_by", request.getSortBy());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TRIGGER_HISORDERS, params);
            logger.debug("body:{}", body);
            SwapCrossTriggerHisordersResponse response = JSON.parseObject(body, SwapCrossTriggerHisordersResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapCrossSwitchLeverRateResponse getSwapCrossSwitchLeverRate(String contractCode, Integer leverRate, String pair, String contractType) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            if (StringUtils.isNotEmpty(pair)) {
                params.put("pair", pair.toUpperCase());
            }
            if (contractType != null) {
                params.put("contract_type", contractType);
            }
            params.put("lever_rate", leverRate);
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_SWITCH_LEVER_RATE, params);
            logger.debug("body:{}", body);
            SwapCrossSwitchLeverRateResponse response = JSON.parseObject(body, SwapCrossSwitchLeverRateResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapTpslOrderResponse swapCrossTpslOrderResponse(SwapTpslOrderRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            if (request.getContractType()!=null){
                params.put("contract_type",request.getContractType());
            }
            params.put("direction", request.getDirection());
            params.put("volume", request.getVolume());
            if (request.getTpTriggerPrice() != null && request.getTpTriggerPrice() != BigDecimal.valueOf(0)) {
                params.put("tp_trigger_price", request.getTpTriggerPrice());
            }
            if (request.getTpOrderPrice() != null && request.getTpOrderPrice() != BigDecimal.valueOf(0)) {
                params.put("tp_order_price", request.getTpOrderPrice());
            }
            if (request.getTpOrderPriceType() != null) {
                params.put("tp_order_price_type", request.getTpOrderPriceType());
            }
            if (request.getSlTriggerPrice() != null && request.getSlTriggerPrice() != BigDecimal.valueOf(0)) {
                params.put("sl_trigger_price", request.getSlTriggerPrice());
            }
            if (request.getSlOrderPrice() != null && request.getSlOrderPrice() != BigDecimal.valueOf(0)) {
                params.put("sl_order_price", request.getSlOrderPrice());
            }
            if (request.getSlOrderPriceType() != null) {
                params.put("sl_order_price_type", request.getSlOrderPriceType());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TPSL_ORDER, params);
            logger.debug("body:{}", body);
            SwapTpslOrderResponse response = JSON.parseObject(body, SwapTpslOrderResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapTpslCancelResponse swapCrossTpslCancelResponse(SwapTpslCancelRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            if (request.getContractType()!=null){
                params.put("contract_type",request.getContractType());
            }
            params.put("order_id", request.getOrderId());
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TPSL_CANCEL, params);
            logger.debug("body:{}", body);
            SwapTpslCancelResponse response = JSON.parseObject(body, SwapTpslCancelResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapTpslCancelallResponse swapCrossTpslCancelallResponse(SwapTpslCancelallRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            if (request.getContractType()!=null){
                params.put("contract_type",request.getContractType());
            }
            if (request.getDirection() != null) {
                params.put("direction", request.getDirection());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TPSL_CANCELALL, params);
            logger.debug("body:{}", body);
            SwapTpslCancelallResponse response = JSON.parseObject(body, SwapTpslCancelallResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapTpslOpenordersResponse swapCrossTpslOpenordersResponse(SwapTpslOpenordersRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            if (request.getPageIndex() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            if (request.getTradeType() != null) {
                params.put("trade_type", request.getTradeType());
            }
            if (StringUtils.isNotEmpty(request.getTradePartition())){
                params.put("trade_partition",request.getTradePartition());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TPSL_OPENORDERS, params);
            logger.debug("body:{}", body);
            SwapTpslOpenordersResponse response = JSON.parseObject(body, SwapTpslOpenordersResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapTpslHisordersResponse swapCrossTpslHisordersResponse(SwapTpslHisordersRequset request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            params.put("status", request.getStatus());
            params.put("create_date", request.getCreateDate());
            if (request.getPageIndex() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            if (StringUtils.isNotEmpty(request.getSortBy())) {
                params.put("sort_by", request.getSortBy());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TPSL_HISORDERS, params);
            logger.debug("body:{}", body);
            SwapTpslHisordersResponse response = JSON.parseObject(body, SwapTpslHisordersResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapRelationTpslOrderResponse swapCrossRelationTpslOrderResponse(SwapRelationTpslOrderRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            params.put("order_id", request.getOrderId());
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_RELATION_TPSL_ORDER, params);
            logger.debug("body:{}", body);
            SwapRelationTpslOrderResponse response = JSON.parseObject(body, SwapRelationTpslOrderResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapHisordersExactResponse swapCrossHisordersResponse(SwapHisordersExactRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())) {
                params.put("pair", request.getPair().toUpperCase());
            }
            params.put("trade_type", request.getTradeType());
            params.put("type", request.getType());
            params.put("status", request.getStatus());
            if (request.getOrderPriceType() != null) {
                params.put("order_price_type", request.getOrderPriceType());
            }
            if (request.getStartTime() != null) {
                params.put("start_time", request.getStartTime());
            }
            if (request.getEndTime() != null) {
                params.put("end_time", request.getEndTime());
            }
            if (request.getFromId() != null) {
                params.put("from_id", request.getFromId());
            }
            if (request.getSize() != null) {
                params.put("size", request.getDirect());
            }
            if (request.getDirect() != null) {
                params.put("direct", request.getDirect());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_HISORDERS_EXACT, params);
            logger.debug("body:{}", body);
            SwapHisordersExactResponse response = JSON.parseObject(body, SwapHisordersExactResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapMatchresultsExactResponse swapCrossMatchresultsResponse(SwapMatchresultsExactRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())) {
                params.put("pair", request.getPair().toUpperCase());
            }
            params.put("trade_type", request.getTradeType());
            if (request.getStartTime() != null) {
                params.put("start_time", request.getStartTime());
            }
            if (request.getEndTime() != null) {
                params.put("end_time", request.getEndTime());
            }
            if (request.getFromId() != null) {
                params.put("from_id", request.getFromId());
            }
            if (request.getSize() != null) {
                params.put("size", request.getDirect());
            }
            if (request.getDirect() != null) {
                params.put("direct", request.getDirect());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_MATCHRESULTS_EXACT, params);
            logger.debug("body:{}", body);
            SwapMatchresultsExactResponse response = JSON.parseObject(body, SwapMatchresultsExactResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapTrackOrderResponse swapCrossTrackOrderResponse(SwapTrackOrderRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())) {
                params.put("pair", request.getPair().toUpperCase());
            }
            if(request.getContractType()!=null){
                params.put("contract_type",request.getContractType());
            }
            params.put("direction", request.getDirection());
            if (request.getOffset()!=null) {
                params.put("offset", request.getOffset());
            }
            if (request.getLeverRate() != null && request.getLeverRate() != 0) {
                params.put("lever_rate", request.getLeverRate());
            }
            params.put("volume", request.getVolume());
            params.put("callback_rate", request.getCallbackRate());
            params.put("active_price", request.getActivePrice());
            params.put("order_price_type", request.getOrderPriceType());
            if(request.getReduceOnly()!=null){
                params.put("reduce_only",request.getReduceOnly());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TRACK_ORDER, params);
            logger.debug("body:{}", body);
            SwapTrackOrderResponse response = JSON.parseObject(body, SwapTrackOrderResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapTrackCancelResponse swapCrossTrackCancelResponse(SwapTrackCancelRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            if (request.getContractType()!=null){
                params.put("contract_type",request.getContractType());
            }
            params.put("order_id", request.getOrderId());
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TRACK_CANCEL, params);
            logger.debug("body:{}", body);
            SwapTrackCancelResponse response = JSON.parseObject(body, SwapTrackCancelResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())){
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapTrackCancelallResponse swapCrossTrackCancelallResponse(SwapTrackCancelallRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            if (request.getContractType()!=null){
                params.put("contract_type",request.getContractType());
            }
            if (request.getDirection()!=null) {
                params.put("direction", request.getDirection());
            }
            if (request.getOffset()!=null) {
                params.put("offset", request.getOffset());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TRACK_CANCELALL, params);
            logger.debug("body:{}", body);
            SwapTrackCancelallResponse response = JSON.parseObject(body, SwapTrackCancelallResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())){
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapTrackOpenordersResponse swapCrossTrackOpenordersResponse(SwapTrackOpenordersRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            if (request.getTradeType()!=null) {
                params.put("trade_type", request.getTradeType());
            }
            if (request.getPageIndex()!=null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize()!=null){
                params.put("page_size",request.getPageSize());
            }
            if (StringUtils.isNotEmpty(request.getTradePartition())){
                params.put("trade_partition",request.getTradePartition());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TRACK_OPENORDERS, params);
            logger.debug("body:{}", body);
            SwapTrackOpenordersResponse response = JSON.parseObject(body, SwapTrackOpenordersResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())){
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public SwapTrackHisordersResponse swapCrossTrackHisordersResponse(SwapTrackHisordersRequest request) {
        String body;
        Map<String, Object> params = new HashMap<>();
        try {
            if (StringUtils.isNotEmpty(request.getContractCode())) {
                params.put("contract_code", request.getContractCode().toUpperCase());
            }
            if (StringUtils.isNotEmpty(request.getPair())){
                params.put("pair",request.getPair().toUpperCase());
            }
            params.put("status",request.getStatus());
            params.put("trade_type", request.getTradeType());
            params.put("create_date",request.getCreateDate());
            if (request.getPageIndex()!=null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize()!=null){
                params.put("page_size",request.getPageSize());
            }
            if (request.getSortBy()!=null){
                params.put("sort_by",request.getSortBy());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapCrossAPIConstants.SWAP_CROSS_TRACK_HISORDERS, params);
            logger.debug("body:{}", body);
            SwapTrackHisordersResponse response = JSON.parseObject(body, SwapTrackHisordersResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())){
                return response;
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }
}
