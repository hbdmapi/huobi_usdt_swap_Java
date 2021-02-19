package com.huobi.api.response.account;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
public class SwapSubAccountInfoListResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Builder
    @Data
    public static class DataBean{
        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("total_size")
        private Integer totalSize;
        @SerializedName("sub_list")
        private List<SubListBean> subList;

        @AllArgsConstructor
        @Builder
        @Data
        public static class SubListBean{
            @SerializedName("sub_uid")
            private String subUid;
            @SerializedName("account_info_list")
            private List<AccountInfoListBean> accountInfoList;

            @AllArgsConstructor
            @Builder
            @Data
            public static class AccountInfoListBean{
                private String symbol;
                @SerializedName("contract_code")
                private String contractCode;
                @SerializedName("margin_account")
                private String marginAccount;
                @SerializedName("margin_mode")
                private String marginMode;
                @SerializedName("margin_asset")
                private String marginAsset;
                @SerializedName("margin_balance")
                private BigDecimal marginBalance;
                @SerializedName("liquidation_price")
                private BigDecimal LiquidationPrice;
                @SerializedName("risk_rate")
                private BigDecimal riskRate;

            }
        }
    }
}
