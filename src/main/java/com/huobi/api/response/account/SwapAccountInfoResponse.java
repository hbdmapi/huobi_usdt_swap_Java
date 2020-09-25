package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapAccountInfoResponse {
    /**
     * "status": "ok",
     * "ts": 1601012593623
     * "data":[{"symbol":"BTC","margin_balance":987751.572823845245237901,"margin_position":8077.364020000000000000,"margin_frozen":22218.000000000000000000,"margin_available":957456.208803845245237901,"profit_real":-11.671496092307692307,"profit_unreal":-72.561788557692307693,"risk_rate":32.564050315149348888,"withdraw_available":957456.208803845245237901000000000000000000,"liquidation_price":289952.498194378595081075,"lever_rate":5,"adjust_factor":0.040000000000000000,"margin_static":987824.134612402937545594,"contract_code":"BTC-USDT","margin_asset":"USDT"}]
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "symbol": "BTC",
         * "margin_balance": 987751.572823845245237901,
         * "margin_position": 8077.364020000000000000,
         * "margin_frozen": 22218.000000000000000000,
         * "margin_available": 957456.208803845245237901,
         * "profit_real": -11.671496092307692307,
         * "profit_unreal": -72.561788557692307693,
         * "risk_rate": 32.564050315149348888,
         * "withdraw_available": 957456.208803845245237901000000000000000000,
         * "liquidation_price": 289952.498194378595081075,
         * "lever_rate": 5,
         * "adjust_factor": 0.040000000000000000,
         * "margin_static": 987824.134612402937545594,
         * "contract_code": "BTC-USDT",
         * "margin_asset": "USDT"
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
        private BigDecimal lever_rate;
        @SerializedName("adjust_factor")
        private BigDecimal adjustFactor;


    }
}
