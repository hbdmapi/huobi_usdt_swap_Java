package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SwapLightningClosePositionResponse {
    /**
     * "status":"ok",
     * "data":{"order_id":759080404761497600,"order_id_str":"759080404761497600"},
     * "ts":1601020471588
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "order_id":759080404761497600,
         * "order_id_str":"759080404761497600"
         */

        @SerializedName("order_id")
        private Long orderId;
        @SerializedName("order_id_str")
        private String orderIdStr;
        @SerializedName("client_order_id")
        private Long clientOrderId;

    }
}
