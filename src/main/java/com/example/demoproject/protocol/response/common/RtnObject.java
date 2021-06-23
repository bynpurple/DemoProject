package com.example.demoproject.protocol.response.common;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

public class RtnObject<T> {
    private T contents;
    private boolean success = false;
    private String message;

    private boolean first;
    private boolean last;
    private Integer number;
    private Long numberOfElements;
    private Integer size;
    private Sort sort;
    private Long totalElements;
    private Integer totalPages;

    public RtnObject() {
        super();
    }

    public RtnObject(T contents, boolean success, String message) {
        this.contents = contents;
        this.success = success;
        this.message = message;
    }

    public RtnObject(Page<T> contents, boolean success, String message) {
        if (contents != null) {
            this.contents = (T) contents.getContent();
            setPageInfo(contents);
        }
        this.success = success;
        this.message = message;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public void setPageInfo(Page pageInfo) {
        setFirst(pageInfo.isFirst());
        setLast(pageInfo.isLast());
        setNumber(pageInfo.getNumber());
        setNumberOfElements(pageInfo.getTotalElements());
        setSize(pageInfo.getSize());
        setSort(pageInfo.getSort());
        setTotalElements(pageInfo.getTotalElements());
        setTotalPages(pageInfo.getTotalPages());
    }
}
