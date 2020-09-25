package com.huobi.api.response.market;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapAdjustfactorResponse {
    /**
     * "status":"ok",
     * "data":[{"symbol":"BTC","contract_code":"BTC-USDT","list":[{"lever_rate":125,"ladders":[{"ladder":0,"min_size":0,"max_size":111,"adjust_factor":0.250000000000000000},{"ladder":1,"min_size":112,"max_size":222,"adjust_factor":0.310000000000000000},{"ladder":2,"min_size":223,"max_size":333,"adjust_factor":0.360000000000000000},{"ladder":3,"min_size":334,"max_size":1999,"adjust_factor":0.410000000000000000},{"ladder":4,"min_size":2000,"max_size":9999,"adjust_factor":0.800000000000000000},{"ladder":5,"min_size":10000,"max_size":null,"adjust_factor":0.950000000000000000}]},{"lever_rate":100,"ladders":[{"ladder":0,"min_size":0,"max_size":1999,"adjust_factor":0.550000000000000000},{"ladder":1,"min_size":2000,"max_size":9999,"adjust_factor":0.700000000000000000},{"ladder":2,"min_size":10000,"max_size":null,"adjust_factor":0.850000000000000000}]},{"lever_rate":75,"ladders":[{"ladder":0,"min_size":0,"max_size":1000,"adjust_factor":0.200000000000000000},{"ladder":1,"min_size":1001,"max_size":2000,"adjust_factor":0.600000000000000000},{"ladder":2,"min_size":2001,"max_size":null,"adjust_factor":0.800000000000000000}]},{"lever_rate":50,"ladders":[{"ladder":0,"min_size":0,"max_size":1999,"adjust_factor":0.350000000000000000},{"ladder":1,"min_size":2000,"max_size":9999,"adjust_factor":0.550000000000000000},{"ladder":2,"min_size":10000,"max_size":null,"adjust_factor":0.750000000000000000}]},{"lever_rate":30,"ladders":[{"ladder":0,"min_size":0,"max_size":99,"adjust_factor":0.050000000000000000},{"ladder":1,"min_size":100,"max_size":999,"adjust_factor":0.100000000000000000},{"ladder":2,"min_size":1000,"max_size":null,"adjust_factor":0.100000000000000000}]},{"lever_rate":20,"ladders":[{"ladder":0,"min_size":0,"max_size":10,"adjust_factor":0.150000000000000000},{"ladder":1,"min_size":11,"max_size":20,"adjust_factor":0.250000000000000000},{"ladder":2,"min_size":21,"max_size":30,"adjust_factor":0.300000000000000000},{"ladder":3,"min_size":31,"max_size":40,"adjust_factor":0.400000000000000000},{"ladder":4,"min_size":41,"max_size":50,"adjust_factor":0.500000000000000000},{"ladder":5,"min_size":51,"max_size":null,"adjust_factor":0.600000000000000000}]},{"lever_rate":10,"ladders":[{"ladder":0,"min_size":0,"max_size":999,"adjust_factor":0.075000000000000000},{"ladder":1,"min_size":1000,"max_size":9999,"adjust_factor":0.125000000000000000},{"ladder":2,"min_size":10000,"max_size":19999,"adjust_factor":0.150000000000000000},{"ladder":3,"min_size":20000,"max_size":29999,"adjust_factor":0.200000000000000000},{"ladder":4,"min_size":30000,"max_size":null,"adjust_factor":0.250000000000000000}]},{"lever_rate":5,"ladders":[{"ladder":0,"min_size":0,"max_size":999,"adjust_factor":0.040000000000000000},{"ladder":1,"min_size":1000,"max_size":9999,"adjust_factor":0.060000000000000000},{"ladder":2,"min_size":10000,"max_size":19999,"adjust_factor":0.075000000000000000},{"ladder":3,"min_size":20000,"max_size":29999,"adjust_factor":0.100000000000000000},{"ladder":4,"min_size":30000,"max_size":null,"adjust_factor":0.125000000000000000}]},{"lever_rate":3,"ladders":[{"ladder":0,"min_size":0,"max_size":999,"adjust_factor":0.025000000000000000},{"ladder":1,"min_size":1000,"max_size":9999,"adjust_factor":0.035000000000000000},{"ladder":2,"min_size":10000,"max_size":19999,"adjust_factor":0.045000000000000000},{"ladder":3,"min_size":20000,"max_size":29999,"adjust_factor":0.060000000000000000},{"ladder":4,"min_size":30000,"max_size":null,"adjust_factor":0.070000000000000000}]},{"lever_rate":2,"ladders":[{"ladder":0,"min_size":0,"max_size":999,"adjust_factor":0.015000000000000000},{"ladder":1,"min_size":1000,"max_size":9999,"adjust_factor":0.025000000000000000},{"ladder":2,"min_size":10000,"max_size":19999,"adjust_factor":0.030000000000000000},{"ladder":3,"min_size":20000,"max_size":29999,"adjust_factor":0.040000000000000000},{"ladder":4,"min_size":30000,"max_size":null,"adjust_factor":0.050000000000000000}]},{"lever_rate":1,"ladders":[{"ladder":0,"min_size":0,"max_size":999,"adjust_factor":0.005000000000000000},{"ladder":1,"min_size":1000,"max_size":9999,"adjust_factor":0.010000000000000000},{"ladder":2,"min_size":10000,"max_size":19999,"adjust_factor":0.015000000000000000},{"ladder":3,"min_size":20000,"max_size":29999,"adjust_factor":0.020000000000000000},{"ladder":4,"min_size":30000,"max_size":null,"adjust_factor":0.025000000000000000}]}]}],
     * "ts":1601016942280
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "symbol":"BTC",
         * "contract_code":"BTC-USDT",
         * "list":[{"lever_rate":125,"ladders":[{"ladder":0,"min_size":0,"max_size":111,"adjust_factor":0.250000000000000000},{"ladder":1,"min_size":112,"max_size":222,"adjust_factor":0.310000000000000000},{"ladder":2,"min_size":223,"max_size":333,"adjust_factor":0.360000000000000000},{"ladder":3,"min_size":334,"max_size":1999,"adjust_factor":0.410000000000000000},{"ladder":4,"min_size":2000,"max_size":9999,"adjust_factor":0.800000000000000000},{"ladder":5,"min_size":10000,"max_size":null,"adjust_factor":0.950000000000000000}]},{"lever_rate":100,"ladders":[{"ladder":0,"min_size":0,"max_size":1999,"adjust_factor":0.550000000000000000},{"ladder":1,"min_size":2000,"max_size":9999,"adjust_factor":0.700000000000000000},{"ladder":2,"min_size":10000,"max_size":null,"adjust_factor":0.850000000000000000}]},{"lever_rate":75,"ladders":[{"ladder":0,"min_size":0,"max_size":1000,"adjust_factor":0.200000000000000000},{"ladder":1,"min_size":1001,"max_size":2000,"adjust_factor":0.600000000000000000},{"ladder":2,"min_size":2001,"max_size":null,"adjust_factor":0.800000000000000000}]},{"lever_rate":50,"ladders":[{"ladder":0,"min_size":0,"max_size":1999,"adjust_factor":0.350000000000000000},{"ladder":1,"min_size":2000,"max_size":9999,"adjust_factor":0.550000000000000000},{"ladder":2,"min_size":10000,"max_size":null,"adjust_factor":0.750000000000000000}]},{"lever_rate":30,"ladders":[{"ladder":0,"min_size":0,"max_size":99,"adjust_factor":0.050000000000000000},{"ladder":1,"min_size":100,"max_size":999,"adjust_factor":0.100000000000000000},{"ladder":2,"min_size":1000,"max_size":null,"adjust_factor":0.100000000000000000}]},{"lever_rate":20,"ladders":[{"ladder":0,"min_size":0,"max_size":10,"adjust_factor":0.150000000000000000},{"ladder":1,"min_size":11,"max_size":20,"adjust_factor":0.250000000000000000},{"ladder":2,"min_size":21,"max_size":30,"adjust_factor":0.300000000000000000},{"ladder":3,"min_size":31,"max_size":40,"adjust_factor":0.400000000000000000},{"ladder":4,"min_size":41,"max_size":50,"adjust_factor":0.500000000000000000},{"ladder":5,"min_size":51,"max_size":null,"adjust_factor":0.600000000000000000}]},{"lever_rate":10,"ladders":[{"ladder":0,"min_size":0,"max_size":999,"adjust_factor":0.075000000000000000},{"ladder":1,"min_size":1000,"max_size":9999,"adjust_factor":0.125000000000000000},{"ladder":2,"min_size":10000,"max_size":19999,"adjust_factor":0.150000000000000000},{"ladder":3,"min_size":20000,"max_size":29999,"adjust_factor":0.200000000000000000},{"ladder":4,"min_size":30000,"max_size":null,"adjust_factor":0.250000000000000000}]},{"lever_rate":5,"ladders":[{"ladder":0,"min_size":0,"max_size":999,"adjust_factor":0.040000000000000000},{"ladder":1,"min_size":1000,"max_size":9999,"adjust_factor":0.060000000000000000},{"ladder":2,"min_size":10000,"max_size":19999,"adjust_factor":0.075000000000000000},{"ladder":3,"min_size":20000,"max_size":29999,"adjust_factor":0.100000000000000000},{"ladder":4,"min_size":30000,"max_size":null,"adjust_factor":0.125000000000000000}]},{"lever_rate":3,"ladders":[{"ladder":0,"min_size":0,"max_size":999,"adjust_factor":0.025000000000000000},{"ladder":1,"min_size":1000,"max_size":9999,"adjust_factor":0.035000000000000000},{"ladder":2,"min_size":10000,"max_size":19999,"adjust_factor":0.045000000000000000},{"ladder":3,"min_size":20000,"max_size":29999,"adjust_factor":0.060000000000000000},{"ladder":4,"min_size":30000,"max_size":null,"adjust_factor":0.070000000000000000}]},{"lever_rate":2,"ladders":[{"ladder":0,"min_size":0,"max_size":999,"adjust_factor":0.015000000000000000},{"ladder":1,"min_size":1000,"max_size":9999,"adjust_factor":0.025000000000000000},{"ladder":2,"min_size":10000,"max_size":19999,"adjust_factor":0.030000000000000000},{"ladder":3,"min_size":20000,"max_size":29999,"adjust_factor":0.040000000000000000},{"ladder":4,"min_size":30000,"max_size":null,"adjust_factor":0.050000000000000000}]},{"lever_rate":1,"ladders":[{"ladder":0,"min_size":0,"max_size":999,"adjust_factor":0.005000000000000000},{"ladder":1,"min_size":1000,"max_size":9999,"adjust_factor":0.010000000000000000},{"ladder":2,"min_size":10000,"max_size":19999,"adjust_factor":0.015000000000000000},{"ladder":3,"min_size":20000,"max_size":29999,"adjust_factor":0.020000000000000000},{"ladder":4,"min_size":30000,"max_size":null,"adjust_factor":0.025000000000000000}]}]
         */

        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        private List<DataList> list;

        @Data
        @AllArgsConstructor
        public static class DataList {
            /**
             * "lever_rate":125,
             * "ladders":[{"ladder":0,"min_size":0,"max_size":111,"adjust_factor":0.250000000000000000}]
             */
            @SerializedName("lever_rate")
            private BigDecimal leverRate;
            private List<Ladders> ladders;

            @Data
            @AllArgsConstructor
            public static class Ladders {
                /**
                 * "ladder":5,
                 * "min_size":10000,
                 * "max_size":null,
                 * "adjust_factor":0.95
                 */
                @SerializedName("max_size")
                private BigDecimal maxSize;
                @SerializedName("min_size")
                private BigDecimal minSize;
                private Integer ladder;
                @SerializedName("adjust_factor")
                private BigDecimal adjustFactor;

            }
        }
    }
}
