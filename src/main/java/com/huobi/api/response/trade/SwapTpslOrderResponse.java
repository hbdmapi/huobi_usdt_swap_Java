package com.huobi.api.response.trade;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
public class SwapTpslOrderResponse {
    private String status;
    private Long ts;
    @SerializedName("err_code")
    private Integer errCode;
    @SerializedName("err_mag")
    private String errMag;
    private List<DataBean> data;

    @Builder
    @AllArgsConstructor
    @Data
    public static class DataBean{
        @SerializedName("tp_order")
        private List<tpOrderBean> tpOrder;
        @SerializedName("sl_order")
        private List<slOrderBean> slOrder;

        @Builder
        @AllArgsConstructor
        @Data
        public static class tpOrderBean{
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
        }

        @Builder
        @AllArgsConstructor
        @Data
        public static class slOrderBean{
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
        }
    }
}
