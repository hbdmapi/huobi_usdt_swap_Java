package com.huobi.api.response.transfer;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsdtSwapTransferResponse {

    /**
     * 参数名称	    是否必须	类型	    描述	                取值范围
     * status	    true	string	状态	                ok, error
     * data	        true	long	生成的划转订单id
     * err-code	    true	string	错误码	            具体错误码请见列表
     * err-msg	    true	string	错误消息	            具体错误码请见列表
     */

    private String status;
    private Long data;
    private String errCode;
    private String errMsg;

}
