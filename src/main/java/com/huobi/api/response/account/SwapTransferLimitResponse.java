package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapTransferLimitResponse {
    /**
     * "status":"ok",
     * "data":[{"symbol":"BTC","contract_code":"BTC-USDT","transfer_in_max_each":1000000.000000000000000000,"transfer_in_min_each":2.000000000000000000,"transfer_out_max_each":2000000.000000000000000000,"transfer_out_min_each":1.000000000000000000,"transfer_in_max_daily":800000000.000000000000000000,"transfer_out_max_daily":12345678.000000000000000000,"net_transfer_in_max_daily":4000000000.000000000000000000,"net_transfer_out_max_daily":7000000000.000000000000000000}],
     * "ts":1601016197241
     */

    private String status;
    private long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "symbol": "BTC",
         * "contract_code": "BTC-USDT",
         * "transfer_in_max_each": 1000000.000000000000000000,
         * "transfer_in_min_each": 2.000000000000000000,
         * "transfer_out_max_each": 2000000.000000000000000000,
         * "transfer_out_min_each": 1.000000000000000000,
         * "transfer_in_max_daily": 800000000.000000000000000000,
         * "transfer_out_max_daily": 12345678.000000000000000000,
         * "net_transfer_in_max_daily": 4000000000.000000000000000000,
         * "net_transfer_out_max_daily": 7000000000.000000000000000000
         */

        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("transfer_in_max_each")
        private BigDecimal transferInMaxEach;
        @SerializedName("transfer_in_min_each")
        private BigDecimal transferInMinEach;
        @SerializedName("transfer_out_max_each")
        private BigDecimal transferOutMaxEach;
        @SerializedName("transfer_out_min_each")
        private BigDecimal transferOutMinEach;
        @SerializedName("transfer_in_max_daily")
        private BigDecimal transferInMaxDaily;
        @SerializedName("transfer_out_max_daily")
        private BigDecimal transferOutMaxDaily;
        @SerializedName("net_transfer_in_max_daily")
        private BigDecimal netTransferInMaxDaily;
        @SerializedName("net_transfer_out_max_daily")
        private BigDecimal netTransferOutMaxDaily;

    }
}
