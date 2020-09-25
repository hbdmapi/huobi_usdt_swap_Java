package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapPositionInfoResponse {
    /**
     * "status":"ok",
     * "data":[{"symbol":"ETH","contract_code":"ETH-USDT","volume":3.000000000000000000,"available":3.000000000000000000,"frozen":0E-18,"cost_open":393.000000000000000000,"cost_hold":289.979379000000000000,"profit_unreal":0.299381370000000000,"profit_rate":1.437659033078880410,"lever_rate":5,"position_margin":1.680000000000000000,"direction":"sell","profit":3.390000000000000000,"last_price":280,"margin_asset":"USDT"}],
     * "ts":1601015114151
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
         * "volume": 3.000000000000000000,
         * "available": 3.000000000000000000,
         * "frozen": 0E-18,
         * "cost_open": 393.000000000000000000,
         * "cost_hold": 289.979379000000000000,
         * "profit_unreal": 0.299381370000000000,
         * "profit_rate": 1.437659033078880410,
         * "lever_rate": 5,
         * "position_margin": 1.680000000000000000,
         * "direction": "sell",
         * "profit": 3.390000000000000000,
         * "last_price": 280,
         * "margin_asset": "USDT"
         */
        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        private BigDecimal volume;
        private BigDecimal available;
        private BigDecimal frozen;
        @SerializedName("cost_open")
        private BigDecimal costOpen;
        @SerializedName("cost_hold")
        private BigDecimal costHold;
        @SerializedName("profit_unreal")
        private BigDecimal profitUnreal;
        @SerializedName("profit_rate")
        private BigDecimal profitRate;
        private BigDecimal profit;
        @SerializedName("margin_asset")
        private String marginAsset;
        @SerializedName("position_margin")
        private BigDecimal positionMargin;
        @SerializedName("lever_rate")
        private Integer LeverRate;
        private String direction;
        @SerializedName("last_price")
        private BigDecimal lastPrice;
    }
}
