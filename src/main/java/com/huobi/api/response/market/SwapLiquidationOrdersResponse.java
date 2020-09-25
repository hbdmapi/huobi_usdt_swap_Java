package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapLiquidationOrdersResponse {
    /**
     * "status":"ok",
     * "data":{"orders":[{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":23.000000000000000000,"price":10328.572000000000000000,"created_at":1600830703914},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":25.000000000000000000,"price":10722.568000000000000000,"created_at":1600828041370},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"sell","offset":"close","volume":100.000000000000000000,"price":10002.078000000000000000,"created_at":1600690922043},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"sell","offset":"close","volume":1.000000000000000000,"price":21033.111000000000000000,"created_at":1600679036268},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":1.000000000000000000,"price":19832.308000000000000000,"created_at":1600678799886},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":201.000000000000000000,"price":15632.480000000000000000,"created_at":1600676530877},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":599.000000000000000000,"price":10282.900000000000000000,"created_at":1600657031742},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"sell","offset":"close","volume":471.000000000000000000,"price":10520.375000000000000000,"created_at":1600655949031},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":358.000000000000000000,"price":9194.132000000000000000,"created_at":1600655647171},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":222.000000000000000000,"price":9471.500000000000000000,"created_at":1600655142536},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"sell","offset":"close","volume":21.000000000000000000,"price":9232.214000000000000000,"created_at":1600654913815},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"sell","offset":"close","volume":619.000000000000000000,"price":9919.489000000000000000,"created_at":1600423072360},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"sell","offset":"close","volume":8.000000000000000000,"price":8928.000000000000000000,"created_at":1600422505990}],"total_page":1,"current_page":1,"total_size":13},
     * "ts":1601018556060
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "orders":[{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":23.000000000000000000,"price":10328.572000000000000000,"created_at":1600830703914},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":25.000000000000000000,"price":10722.568000000000000000,"created_at":1600828041370},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"sell","offset":"close","volume":100.000000000000000000,"price":10002.078000000000000000,"created_at":1600690922043},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"sell","offset":"close","volume":1.000000000000000000,"price":21033.111000000000000000,"created_at":1600679036268},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":1.000000000000000000,"price":19832.308000000000000000,"created_at":1600678799886},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":201.000000000000000000,"price":15632.480000000000000000,"created_at":1600676530877},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":599.000000000000000000,"price":10282.900000000000000000,"created_at":1600657031742},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"sell","offset":"close","volume":471.000000000000000000,"price":10520.375000000000000000,"created_at":1600655949031},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":358.000000000000000000,"price":9194.132000000000000000,"created_at":1600655647171},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"buy","offset":"close","volume":222.000000000000000000,"price":9471.500000000000000000,"created_at":1600655142536},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"sell","offset":"close","volume":21.000000000000000000,"price":9232.214000000000000000,"created_at":1600654913815},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"sell","offset":"close","volume":619.000000000000000000,"price":9919.489000000000000000,"created_at":1600423072360},{"contract_code":"BTC-USDT","symbol":"BTC","direction":"sell","offset":"close","volume":8.000000000000000000,"price":8928.000000000000000000,"created_at":1600422505990}],
         * "total_page":1,
         * "current_page":1,
         * "total_size":13
         */
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_size")
        private Integer totalSize;
        private List<Orders> orders;

        @Data
        @AllArgsConstructor
        public static class Orders {
            /**
             * "contract_code": "BTC-USDT",
             * "symbol": "BTC",
             * "direction": "buy",
             * "offset": "close",
             * "volume": 23.000000000000000000,
             * "price": 10328.572000000000000000,
             * "created_at": 1600830703914
             */
            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("created_at")
            private Long createdAt;
            private String direction;
            private String offset;
            private BigDecimal price;
            private BigDecimal volume;

        }
    }
}
