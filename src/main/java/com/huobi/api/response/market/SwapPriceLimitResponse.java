package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapPriceLimitResponse {

    /**
     * "status":"ok",
     * "data":[{"symbol":"BTC","contract_code":"BTC-USDT","high_limit":13426.521000000000000000000000000000000000,"low_limit":7229.666000000000000000000000000000000000}],
     * "ts":1601019419740
     */

    private String status;
    private Long ts;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "symbol":"BTC",
         * "contract_code":"BTC-USDT",
         * "high_limit":13426.521,
         * "low_limit":7229.666
         */
        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("high_limit")
        private BigDecimal highLimit;
        @SerializedName("low_limit")
        private BigDecimal lowLimit;

    }
}
