package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SwapFeeResponse {

    /**
     * "status":"ok",
     * "data":[{"symbol":"ETH","contract_code":"ETH-USDT","open_maker_fee":"-0.00022","open_taker_fee":"0.0004","close_maker_fee":"-0.00012","close_taker_fee":"0.0005","fee_asset":"USDT"}],
     * "ts":1601013192499
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "symbol": "ETH",
         * "contract_code": "ETH-USDT",
         * "open_maker_fee": "-0.00022",
         * "open_taker_fee": "0.0004",
         * "close_maker_fee": "-0.00012",
         * "close_taker_fee": "0.0005",
         * "fee_asset": "USDT"
         */
        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("open_maker_fee")
        private String openMakerFee;
        @SerializedName("open_taker_fee")
        private String openTakerFee;
        @SerializedName("close_maker_fee")
        private String closeMakerFee;
        @SerializedName("close_taker_fee")
        private String closeTakerFee;
        @SerializedName("fee_asset")
        private String feeAsset;

    }
}
