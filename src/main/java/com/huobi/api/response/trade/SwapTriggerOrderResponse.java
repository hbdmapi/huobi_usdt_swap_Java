package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.checkerframework.checker.units.qual.A;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class SwapTriggerOrderResponse {

    /**
     * "status":"ok",
     * "data":{"order_id":4696,"order_id_str":"4696"},
     * "ts":1601021412709
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Data
    public static class DataBean {
        /**
         * "order_id":4696,
         * "order_id_str":"4696"
         */

        @SerializedName("order_id")
        private Long orderId;
        @SerializedName("order_id_str")
        private String orderIdStr;
    }
}
