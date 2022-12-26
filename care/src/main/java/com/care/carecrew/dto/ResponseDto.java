package com.care.carecrew.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ResponseDto<T> {

	private boolean status;

	private String message;

	private String id;

	private String errorCode;

	private T data;

	private int httpStatusCode;

	private ResponseDto(boolean status) {
		this.status = status;
	}

	protected ResponseDto(boolean status, String message) {
		this(status);
		this.message = message;
	}

	protected ResponseDto(boolean status, String message, T data) {
		this(status, message);
		this.data = data;
	}

	private ResponseDto(boolean status, String message, T data, String id) {
		this(status, message, data);
		this.id = id;
	}

	private ResponseDto(boolean status, String message, T data, String id, String errorCode) {
		this(status, message, data, id);
		this.errorCode = errorCode;
	}

	private ResponseDto(boolean status, String message, int httpStatusCode) {
		this(status, message);
		this.httpStatusCode = httpStatusCode;
	}

	public static <T> ResponseDto<T> success(T data) {
		return new ResponseDto<>(true, null, data);
	}

	public static <T> ResponseDto<T> success(String message) {
		return new ResponseDto<>(true, message, null);
	}

	public static <T> ResponseDto<T> success(String message, T data) {
		return new ResponseDto<>(true, message, data);
	}

	public static <T> ResponseDto<T> success(String message, T data, String id) {
		return new ResponseDto<>(true, message, data, id);
	}

	public static <T> ResponseDto<T> success(String message, T data, String id, String errorCode) {
		return new ResponseDto<>(true, message, data, id, errorCode);
	}

	public static <T> ResponseDto<T> failure(String message) {
		return new ResponseDto<>(false, message);
	}

	public static <T> ResponseDto<T> failure(String message, String errorCode) {
		return new ResponseDto<>(false, message, null, errorCode);
	}

	public static <T> ResponseDto<T> failure(String message, String id, String errorCode) {
		return new ResponseDto<>(false, message, null, id, errorCode);
	}

	public static <T> ResponseDto<T> failure(String message, T data) {
		return new ResponseDto<>(false, message, data);
	}

	public static <T> ResponseDto<T> failure(String message, T data, String id) {
		return new ResponseDto<>(false, message, data, id);
	}

	public static <T> ResponseDto<T> failure(String message, T data, String id, String errorCode) {
		return new ResponseDto<>(false, message, data, id, errorCode);
	}

	public static <T> ResponseDto<T> failure(String message, int httpStatusCode) {
		return new ResponseDto<>(false, message, httpStatusCode);
	}
}