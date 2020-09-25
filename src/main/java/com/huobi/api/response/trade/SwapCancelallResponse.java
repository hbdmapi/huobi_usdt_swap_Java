package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SwapCancelallResponse {
    /**
     * "status":"ok",
     * "data":{"errors":[],"successes":"759077984358682624"},
     * "ts":1601019981727
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "errors":[],
         * "successes":"759077984358682624"
         */
        private List<ErrorsBean> errors;
        private String successes;

        @Data
        @AllArgsConstructor
        public static class ErrorsBean {
            /**
             *
             */

            @SerializedName("order_id")
            private String orderId;
            @SerializedName("err_code")
            private Integer errCode;
            @SerializedName("err_msg")
            private String errMsg;

        }
    }
}
