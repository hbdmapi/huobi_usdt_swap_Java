package com.huobi.api.response.account;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class SwapFinancialRecordExactResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Data
    @Builder
    public static class DataBean{
        @SerializedName("remain_size")
        private Integer remainSize;
        @SerializedName("next_id")
        private Long nextId;
        @SerializedName("financial_record")
        private List<FinancialRecordBean> financialRecord;

        @AllArgsConstructor
        @Data
        @Builder
        public static class FinancialRecordBean{
            private Long id;
            private Long ts;
            private String asset;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("margin_account")
            private String marginAccount;
            @SerializedName("face_margin_account")
            private String faceMarginAccount;
            private Integer type;
            private BigDecimal amount;
            @SerializedName("trade_partition")
            private String tradePartition;
        }
    }
}
