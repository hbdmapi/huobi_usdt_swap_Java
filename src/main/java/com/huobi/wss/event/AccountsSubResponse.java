package com.huobi.wss.event;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class AccountsSubResponse {



    private String op;
    private String topic;
    private long ts;
    private String event;
    private String uid;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {

        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("margin_asset")
        private String marginAsset;
        @SerializedName("trade_partition")
        private String tradePartition;
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
        private Integer leverRate;
        @SerializedName("adjust_factor")
        private BigDecimal adjustFactor;
        @SerializedName("margin_mode")
        private String marginMode;
        @SerializedName("margin_account")
        private String marginAccount;


    }
}
