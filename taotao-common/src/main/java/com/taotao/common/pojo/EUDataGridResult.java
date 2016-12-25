package com.taotao.common.pojo;

import java.util.List;

/**
 *响应json数据格式
 * json格式为{total:?,rows:{key:value....}}
 * Created by smmit on 2016-12-24.
 */
public class EUDataGridResult {

    private Long total;
    private List<?> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
