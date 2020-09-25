package com.huobi.api.response.trade;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SwapTriggerCancelallResponse {
    /**
     * "status":"ok",
     * "data":{"errors":[],"successes":"4696"},
     * "ts":1601021509092
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Builder
    @AllArgsConstructor
    @Data
    public static class DataBean {
        /**
         * "errors":[],
         * "successes":"4696"
         */
        private String successes;
        private List<ErrorsBean> errors;

        @Data
        @AllArgsConstructor
        @Builder
        public static class ErrorsBean {
            /**
             * "order_id":"3733",
             * "err_code":1056,
             * "err_msg":"In settlement. Your order can’t be placed/withdrew currently."
             */
            @SerializedName("order_id")
            private String orderId;
            @SerializedName("err_code")
            private Long errCode;
            @SerializedName("err_msg")
            private String errMsg;
        }
    }

}
