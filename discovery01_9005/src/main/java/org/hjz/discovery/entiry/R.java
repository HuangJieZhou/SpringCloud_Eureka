package org.hjz.discovery.entiry;

import lombok.*;
import lombok.experimental.Accessors;
import org.hjz.discovery.constant.ResultEnum;

import java.io.Serializable;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
//    @ApiModelProperty(value = "错误代码")
    private int code;

    @Getter
    @Setter
//    @ApiModelProperty(value = "错误信息")
    private String message;


    @Getter
    @Setter
//    @ApiModelProperty(value = "结果集")
    private T data;

    public static <T> R<T> success() {
        return restResult(null, ResultEnum.SUCCESS.getCode(), null);
    }

    public static <T> R<T> success(String msg) {
        return restResult(null, ResultEnum.SUCCESS.getCode(), msg);
    }

    public static <T> R<T> success(T data) {
        return restResult(data, ResultEnum.SUCCESS.getCode(), null);
    }

    public static <T> R<T> success(T data, String msg) {
        return restResult(data, ResultEnum.SUCCESS.getCode(), msg);
    }


    public static <T> R<T> failed() {
        return restResult(null, ResultEnum.FAILURE.getCode(), null);
    }

    public static <T> R<T> failed(int code, String msg) {
        return restResult(null, code, msg);
    }

    public static <T> R<T> failed(String msg) {
        return restResult(null, ResultEnum.FAILURE.getCode(), msg);
    }

    public static <T> R<T> failed(T data) {
        return restResult(data, ResultEnum.FAILURE.getCode(), null);
    }

    public static <T> R<T> failed(T data, int code, String msg) {
        return restResult(data, code, msg);
    }

    private static <T> R<T> restResult(T data, int code, String msg) {
        R<T> apiResult = new R<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMessage(msg);
        return apiResult;
    }
}
