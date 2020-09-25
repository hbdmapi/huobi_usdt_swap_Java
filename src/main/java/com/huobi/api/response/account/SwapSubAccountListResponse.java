package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapSubAccountListResponse {

    /**
     * "status":"ok",
     * "data":[{"sub_uid":114390100,"list":[{"symbol":"BTC","margin_balance":4924.455316934075342434,"liquidation_price":null,"risk_rate":238.337523181284512529,"contract_code":"BTC-USDT","margin_asset":"USDT"}]}],
     * "ts":1601015560631
     */

    private String status;
    private long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "sub_uid":114390100,
         * "list":[{"symbol":"BTC","margin_balance":4924.455316934075342434,"liquidation_price":null,"risk_rate":238.337523181284512529,"contract_code":"BTC-USDT","margin_asset":"USDT"}]
         */

        @SerializedName("sub_uid")
        private Long subUid;
        private List<ListBean> list;

        @Data
        @AllArgsConstructor
        public static class ListBean {
            /**
             * "symbol": "BTC",
             * "margin_balance": 4924.455316934075342434,
             * "liquidation_price": null,
             * "risk_rate": 238.337523181284512529,
             * "contract_code": "BTC-USDT",
             * "margin_asset": "USDT"
             */

            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("margin_asset")
            private String marginAsset;
            @SerializedName("margin_balance")
            private BigDecimal marginBalance;
            @SerializedName("liquidation_price")
            private BigDecimal liquidationPrice;
            @SerializedName("risk_rate")
            private BigDecimal riskRate;

        }
    }
}
