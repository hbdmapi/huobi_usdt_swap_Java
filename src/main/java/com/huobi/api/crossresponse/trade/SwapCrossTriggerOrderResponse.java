package com.huobi.api.crossresponse.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class SwapCrossTriggerOrderResponse {

    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Data
    public static class DataBean {

        @SerializedName("order_id")
        private Long orderId;
        @SerializedName("order_id_str")
        private String orderIdStr;
    }
}
