package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapSubPositionInfoResponse {

    /**
     *
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         *
         */

        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        private BigDecimal volume;
        private BigDecimal available;
        private BigDecimal frozen;
        @SerializedName("cost_open")
        private BigDecimal costOpen;
        @SerializedName("cost_hold")
        private BigDecimal costHold;
        @SerializedName("profit_unreal")
        private BigDecimal profitUnreal;
        @SerializedName("profit_rate")
        private BigDecimal profitRate;
        private BigDecimal profit;
        @SerializedName("margin_asset")
        private String marginAsset;
        @SerializedName("position_margin")
        private BigDecimal positionMargin;
        @SerializedName("lever_rate")
        private Integer leverRate;
        private String direction;
        @SerializedName("last_price")
        private BigDecimal lastPrice;

    }
}
