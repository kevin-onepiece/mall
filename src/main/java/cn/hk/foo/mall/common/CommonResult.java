package cn.hk.foo.mall.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author foo
 * @date 2022-02-23 16:44
 * @description
 */
@Data
@AllArgsConstructor
public class CommonResult<T> {

    private Long code;
    private String message;
    private T data;

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), message, data);
    }

    public static <T> CommonResult<T> failed(T data) {
        return new CommonResult<T>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(), data);
    }

    public static <T> CommonResult<T> failed(T data, String message) {
        return new CommonResult<T>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(), data);
    }
}
