package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.checkerframework.checker.units.qual.A;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SwapTriggerCancelResponse {
    /**
     * "status":"ok",
     * "data":{"errors":[],"successes":"4697"},
     * "ts":1601021769369
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
         * "successes":"4697"
         */
        private String successes;
        private List<ErrorsBean> errors;

        @Builder
        @AllArgsConstructor
        @Data
        public static class ErrorsBean {
            @SerializedName("order_id")
            private String orderId;
            @SerializedName("err_code")
            private Long errCode;
            @SerializedName("err_msg")
            private String errMsg;
        }
    }
}
