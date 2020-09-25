package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class LinearSwapBasisResponse {
    /**
     * "ch":"market.BTC-USDT.basis.1min.open",
     * "data":[{"basis":"-324.0100000000002","basis_rate":"-0.030414563996275287","contract_price":"10329.11","id":1601016420,"index_price":"10653.12"},{"basis":"-321.39999999999964","basis_rate":"-0.030176958662073424","contract_price":"10329.11","id":1601016480,"index_price":"10650.51"}],
     * "status":"ok",
     * "ts":1601016487806
     */
    private String status;
    private String ch;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "basis": "-321.39999999999964",
         * "basis_rate": "-0.030176958662073424",
         * "contract_price": "10329.11",
         * "id": 1601016480,
         * "index_price": "10650.51"
         */
        private Long id;
        @SerializedName("contract_price")
        private String contractPrice;
        @SerializedName("index_price")
        private String indexPrice;
        private String basis;
        @SerializedName("basis_rate")
        private String basisRate;
    }
}
