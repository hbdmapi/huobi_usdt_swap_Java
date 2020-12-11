package com.huobi.api.crossresponse.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapCrossSubAccountListResponse {

    private String status;
    private long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        @SerializedName("sub_uid")
        private Long subUid;
        private List<ListBean> list;

        @Data
        @AllArgsConstructor
        public static class ListBean {
            @SerializedName("margin_mode")
            private String marginMode;
            @SerializedName("margin_account")
            private String marginAccount;
            @SerializedName("margin_asset")
            private String marginAsset;
            @SerializedName("margin_balance")
            private BigDecimal marginBalance;
            @SerializedName("risk_rate")
            private BigDecimal riskRate;

        }
    }
}
