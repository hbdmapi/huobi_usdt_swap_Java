package com.huobi.api.service.transfer;

import com.alibaba.fastjson.JSON;
import com.huobi.api.swaps.HuobiLinearSwapAPIConstants;
import com.huobi.api.exception.ApiException;
import com.huobi.api.request.transfer.UsdtSwapTransferRequest;
import com.huobi.api.response.transfer.UsdtSwapTransferResponse;
import com.huobi.api.util.HbdmHttpClient;

import java.util.HashMap;
import java.util.Map;

public class TransferApiServiceImpl implements TransferApiService {

    String api_key = ""; // huobi申请的apiKey
    String secret_key = ""; // huobi申请的secretKey
    String url_prex = "https://api.huobi.pro";

    public TransferApiServiceImpl(String api_key, String secret_key) {
        this.api_key = api_key;
        this.secret_key = secret_key;
    }


    /**
     *
     */
    @Override
    public UsdtSwapTransferResponse transfer(UsdtSwapTransferRequest request) {
        String body = "";
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("from", request.getFrom());
            params.put("to", request.getTo());
            params.put("margin-account", request.getMargin_account());
            params.put("currency", request.getCurrency());
            params.put("amount", request.getAmount());
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiLinearSwapAPIConstants.USDT_SWAP_TRANSFER, params);
            UsdtSwapTransferResponse response = JSON.parseObject(body, UsdtSwapTransferResponse.class);
            return response;

        } catch (Exception e) {
            throw new ApiException(e);
        }
    }
}
