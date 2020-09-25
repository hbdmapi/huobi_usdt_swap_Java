package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SwapBatchorderResponse {

    /**
     * "status":"ok",
     * "data":{"errors":[{"index":1,"err_code":1056,"err_msg":"In settlement. Your order can’t be placed/withdrew currently."}],"success":[{"order_id":759077085095710720,"index":2,"order_id_str":"759077085095710720"}]},
     * "ts":1601019680091
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "errors":[{"index":1,"err_code":1056,"err_msg":"In settlement. Your order can’t be placed/withdrew currently."}],
         * "success":[{"order_id":759077085095710720,"index":2,"order_id_str":"759077085095710720"}
         */

        private List<ErrorsBean> errors;
        private List<SuccessBean> success;

        @Data
        @AllArgsConstructor
        public static class ErrorsBean {
            /**
             * "index":1,
             * "err_code":1056,
             * "err_msg":"In settlement. Your order can’t be placed/withdrew currently."
             */

            private Integer index;
            @SerializedName("err_code")
            private Integer errCode;
            @SerializedName("err_msg")
            private String errMsg;

        }

        @Data
        @AllArgsConstructor
        public static class SuccessBean {
            /**
             * "order_id":759077085095710720,
             * "index":2,
             * "order_id_str":"759077085095710720"
             */

            private Integer index;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            @SerializedName("client_order_id")
            private Long clientOrderId;

        }
    }
}
