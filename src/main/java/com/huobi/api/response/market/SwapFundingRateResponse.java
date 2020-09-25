package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SwapFundingRateResponse {
    /**
     * "status":"ok",
     * "data":{"estimated_rate":null,"funding_rate":"-0.003750000000000000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT","funding_time":"1600943400000","next_funding_time":"1600972200000"},
     * "ts":1601017977976
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "estimated_rate": null,
         * "funding_rate": "-0.003750000000000000",
         * "contract_code": "BTC-USDT",
         * "symbol": "BTC",
         * "fee_asset": "USDT",
         * "funding_time": "1600943400000",
         * "next_funding_time": "1600972200000"
         */
        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("fee_asset")
        private String feeAsset;
        @SerializedName("funding_time")
        private String fundingTime;
        @SerializedName("funding_rate")
        private String fundingRate;
        @SerializedName("estimated_rate")
        private String estimatedRate;
        @SerializedName("next_funding_time")
        private String nextFundingTime;

    }
}
