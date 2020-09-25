package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Data
public class SwapInsuranceFundResponse {
    /**
     * "status":"ok",
     * "data":{"total_page":1,"current_page":1,"total_size":7,"symbol":"BTC","contract_code":"BTC-USDT","tick":[{"insurance_fund":41963.382117457142308280,"ts":1600848000000},{"insurance_fund":42316.933563632142308280,"ts":1600761600000},{"insurance_fund":0.304558816785937313,"ts":1600675200000},{"insurance_fund":31.571897276974710720,"ts":1600588800000},{"insurance_fund":30.893039931974710720,"ts":1600502400000},{"insurance_fund":177.291633869887498433,"ts":1600416000000},{"insurance_fund":0E-18,"ts":1600329600000}]},
     * "ts":1601018382189
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Data
    public static class DataBean {
        /**
         * "total_page":1,
         * "current_page":1,
         * "total_size":7,
         * "symbol":"BTC",
         * "contract_code":"BTC-USDT",
         * "tick":[{"insurance_fund":41963.382117457142308280,"ts":1600848000000},{"insurance_fund":42316.933563632142308280,"ts":1600761600000},{"insurance_fund":0.304558816785937313,"ts":1600675200000},{"insurance_fund":31.571897276974710720,"ts":1600588800000},{"insurance_fund":30.893039931974710720,"ts":1600502400000},{"insurance_fund":177.291633869887498433,"ts":1600416000000}]
         */
        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_size")
        private Integer totalSize;
        private List<DataTick> tick;

        @AllArgsConstructor
        @Data
        public static class DataTick {
            /**
             * "insurance_fund": 41963.382117457142308280,
             * "ts": 1600848000000
             */
            @SerializedName("insurance_fund")
            private BigDecimal insuranceFund;
            private Long ts;
        }

    }
}
