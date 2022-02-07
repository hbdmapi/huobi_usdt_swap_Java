package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SwapTransferInnerResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean{
        @SerializedName("order_id")
        private Long orderId;
        @SerializedName("client_order_id")
        private Long clientOrderId;
    }
}
