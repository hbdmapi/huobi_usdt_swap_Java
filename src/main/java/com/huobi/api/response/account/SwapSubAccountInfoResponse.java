package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapSubAccountInfoResponse {

    /**
     * "status":"ok",
     * "data":[{"symbol":"ETH","margin_balance":10,"margin_position":0,"margin_frozen":0,"margin_available":10.000000000000000000,"profit_real":0,"profit_unreal":0,"risk_rate":null,"withdraw_available":10.000000000000000000,"liquidation_price":null,"lever_rate":5,"adjust_factor":0.060000000000000000,"margin_static":10,"contract_code":"ETH-USDT","margin_asset":"USDT"}],
     * "ts":1601015400967
     */

    private String status;
    private long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "symbol": "ETH",
         * "margin_balance": 10,
         * "margin_position": 0,
         * "margin_frozen": 0,
         * "margin_available": 10.000000000000000000,
         * "profit_real": 0,
         * "profit_unreal": 0,
         * "risk_rate": null,
         * "withdraw_available": 10.000000000000000000,
         * "liquidation_price": null,
         * "lever_rate": 5,
         * "adjust_factor": 0.060000000000000000,
         * "margin_static": 10,
         * "contract_code": "ETH-USDT",
         * "margin_asset": "USDT"
         */

        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("margin_asset")
        private String marginAsset;
        @SerializedName("margin_balance")
        private BigDecimal marginBalance;
        @SerializedName("margin_position")
        private BigDecimal marginPosition;
        @SerializedName("margin_frozen")
        private BigDecimal marginFrozen;
        @SerializedName("margin_available")
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
        @SerializedName("margin_static")
        private BigDecimal marginStatic;

    }
}
