package com.huobi.wss.event;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class PositionsSubResponse {

    private String op;
    private String topic;
    private Long ts;
    private String event;
    private String uid;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

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
        @SerializedName("position_margin")
        private BigDecimal positionMargin;
        @SerializedName("lever_rate")
        private Integer leverRate;
        private String direction;
        @SerializedName("last_price")
        private BigDecimal lastPrice;
        @SerializedName("margin_asset")
        private String marginAsset;


    }
}
