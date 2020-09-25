package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import com.sun.imageio.plugins.common.BogusColorSpace;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapAccountPositionInfoResponse {
    /**
     * "status":"ok",
     * "ts":1601012818626
     * "data":[{"symbol":"ETH","contract_code":"ETH-USDT","margin_balance":5018.308273184124880112,"margin_position":1.739876274000000000,"margin_frozen":0,"margin_available":5007.414260318062440056,"profit_real":0E-18,"profit_unreal":0E-18,"risk_rate":2884.230307406148858210,"withdraw_available":5016.568396910124880112000000000000000000,"liquidation_price":165579.962271216234522793,"lever_rate":5,"adjust_factor":0.060000000000000000,"margin_static":5018.308273184124880112,"positions":[{"symbol":"ETH","contract_code":"ETH-USDT","volume":3.000000000000000000,"available":3.000000000000000000,"frozen":0E-18,"cost_open":393.000000000000000000,"cost_hold":289.979379000000000000,"profit_unreal":0E-18,"profit_rate":1.310694923664122140,"lever_rate":5,"position_margin":1.739876274000000000,"direction":"sell","profit":3.090618630000000000,"last_price":289.979379,"margin_asset":"USDT"}],"margin_asset":"USDT"}]
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
         * "margin_balance": 5018.308273184124880112,
         * "margin_position": 1.739876274000000000,
         * "margin_frozen": 0,
         * "margin_available": 5007.414260318062440056,
         * "profit_real": 0E-18,
         * "profit_unreal": 0E-18,
         * "risk_rate": 2884.230307406148858210,
         * "withdraw_available": 5016.568396910124880112000000000000000000,
         * "liquidation_price": 165579.962271216234522793,
         * "lever_rate": 5,
         * "adjust_factor": 0.060000000000000000,
         * "margin_static": 5018.308273184124880112,
         * "margin_asset": "USDT"
         * "positions":[{"symbol":"ETH","contract_code":"ETH-USDT","volume":3.000000000000000000,"available":3.000000000000000000,"frozen":0E-18,"cost_open":393.000000000000000000,"cost_hold":289.979379000000000000,"profit_unreal":0E-18,"profit_rate":1.310694923664122140,"lever_rate":5,"position_margin":1.739876274000000000,"direction":"sell","profit":3.090618630000000000,"last_price":289.979379,"margin_asset":"USDT"}]
         */
        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("margin_asset")
        private String marginAsset;
        @SerializedName("margin_balance")
        private BigDecimal marginBalance;
        @SerializedName("margin_static")
        private BigDecimal marginStatic;
        @SerializedName("margin_position")
        private BigDecimal marginPosition;
        @SerializedName("margin_frozen")
        private BigDecimal marginFrozen;
        @SerializedName("margin_position")
        private BigDecimal marginAvailable;
        @SerializedName("profit_real")
        private BigDecimal profitReal;
        @SerializedName("profit_unreal")
        private BigDecimal profitUnreal;
        @SerializedName("risk_rate")
        private BigDecimal riskRate;
        @SerializedName("liquidation_price")
        private BigDecimal liquidationPrice;
        @SerializedName("withdraw_available")
        private BigDecimal withdrawAvailable;
        @SerializedName("lever_rate")
        private BigDecimal leverRate;
        @SerializedName("adjust_factor")
        private BigDecimal adjustFactor;
        private List<Positions> positions;

        @Data
        @AllArgsConstructor
        public static class Positions {
            /**
             * "symbol": "ETH",
             * "contract_code": "ETH-USDT",
             * "volume": 3.000000000000000000,
             * "available": 3.000000000000000000,
             * "frozen": 0E-18,
             * "cost_open": 393.000000000000000000,
             * "cost_hold": 289.979379000000000000,
             * "profit_unreal": 0E-18,
             * "profit_rate": 1.310694923664122140,
             * "lever_rate": 5,
             * "position_margin": 1.739876274000000000,
             * "direction": "sell",
             * "profit": 3.090618630000000000,
             * "last_price": 289.979379,
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
            private Integer leverRate;
            private String direction;
            @SerializedName("last_price")
            private BigDecimal lastPrice;
        }
    }
}

