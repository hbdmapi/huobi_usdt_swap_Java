package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapPositionLimitResponse {

    /**
     * "status":"ok",
     * "data":[{"symbol":"ETH","contract_code":"ETH-USDT","buy_limit":1234567.000000000000000000,"sell_limit":7654321.000000000000000000},{"symbol":"LTC","contract_code":"LTC-USDT","buy_limit":20000000.000000000000000000,"sell_limit":9999999999.000000000000000000},{"symbol":"EOS","contract_code":"EOS-USDT","buy_limit":111.000000000000000000,"sell_limit":222.000000000000000000},{"symbol":"BTC","contract_code":"BTC-USDT","buy_limit":98765432.000000000000000000,"sell_limit":999999999.000000000000000000}],
     * "ts":1601015282669
     */

    private String status;
    private long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "symbol": "ETH",
         * "contract_code": "ETH-USDT",
         * "buy_limit": 1234567.000000000000000000,
         * "sell_limit": 7654321.000000000000000000
         */

        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("buy_limit")
        private BigDecimal buyLimit;
        @SerializedName("sell_limit")
        private BigDecimal sellLimit;
    }
}
