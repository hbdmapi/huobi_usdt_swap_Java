package com.huobi.api.crossresponse.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapCrossTransferLimitResponse {

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
