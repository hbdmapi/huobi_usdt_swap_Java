package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapContractInfoResponse {


    /**
     * "status":"ok",
     * "data":[{"symbol":"BTC","contract_code":"BTC-USDT","contract_size":0.010000000000000000,"price_tick":0.001000000000000000,"create_date":"20200917","contract_status":7,"settlement_date":"1600943400000"}],
     * "ts":1601017671678
     */

    private String status;
    private Long ts;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "symbol": "BTC",
         * "contract_code": "BTC-USDT",
         * "contract_size": 0.010000000000000000,
         * "price_tick": 0.001000000000000000,
         * "create_date": "20200917",
         * "contract_status": 7,
         * "settlement_date": "1600943400000",
         * "supportMarginMode":"all"
         */

        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("contract_size")
        private BigDecimal contractSize;
        @SerializedName("price_tick")
        private BigDecimal priceTick;
        @SerializedName("settlement_date")
        private String settlementDate;
        @SerializedName("create_date")
        private String createDate;
        @SerializedName("contract_status")
        private Integer contractStatus;
        @SerializedName("support_margin_mode")
        private String supportMarginMode;
        @SerializedName("delivery_time")
        private Long deliveryTime;
        private String pair;
        @SerializedName("business_type")
        private String businessType;
        @SerializedName("delivery_date")
        private String deliveryDate;
        @SerializedName("contract_type")
        private String contractType;
        @SerializedName("trade_partition")
        private String tradePartition;

    }
}
