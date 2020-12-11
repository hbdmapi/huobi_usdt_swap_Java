package com.huobi.api.crossresponse.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapCrossSubAccountInfoResponse {

    private String status;
    private long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        @SerializedName("margin_mode")
        private String marginMode;
        @SerializedName("margin_account")
        private String marginAccount;
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
        @SerializedName("profit_real")
        private BigDecimal profitReal;
        @SerializedName("profit_unreal")
        private BigDecimal profitUnreal;
        @SerializedName("withdraw_available")
        private BigDecimal withdrawAvailable;
        @SerializedName("risk_rate")
        private BigDecimal riskRate;
        @SerializedName("contract_detail")
        private List<ContractDetailBean> contractDetail;

        @Data
        @AllArgsConstructor
        public static class ContractDetailBean {
            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("margin_position")
            private BigDecimal marginPosition;
            @SerializedName("margin_frozen")
            private BigDecimal marginFrozen;
            @SerializedName("margin_available")
            private BigDecimal marginAvailable;
            @SerializedName("profit_unreal")
            private BigDecimal profitUnreal;
            @SerializedName("liquidation_price")
            private BigDecimal liquidationPrice;
            @SerializedName("lever_rate")
            private BigDecimal leverRate;
            @SerializedName("adjust_factor")
            private BigDecimal adjustFactor;

        }

    }
}
