package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class SwapSwitchLeverRateResponse {
    private String status;
    private Long ts;
    @SerializedName("err_code")
    private Integer errCode;
    @SerializedName("err_msg")
    private String errMag;
    private List<DataBean> data;

    @AllArgsConstructor
    @Data
    public static class DataBean{
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("lever_rate")
        private Integer leverRate;
        @SerializedName("margin_mode")
        private String marginMode;
        @SerializedName("trade_partition")
        private String tradePartition;
    }
}
