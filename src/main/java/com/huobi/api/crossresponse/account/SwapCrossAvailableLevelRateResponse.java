package com.huobi.api.crossresponse.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SwapCrossAvailableLevelRateResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean{
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("available_level_rate")
        private String availableLevelRate;
        @SerializedName("margin_mode")
        private String marginMode;
        private String pair;
        @SerializedName("business_type")
        private String businessType;
        @SerializedName("contract_type")
        private String contractType;
        @SerializedName("trade_partition")
        private String tradePartition;
    }
}
