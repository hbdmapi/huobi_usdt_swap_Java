package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class SwapTrackCancelallRequest {
    private String contractCode;
    private String direction;
    private String offset;
}
