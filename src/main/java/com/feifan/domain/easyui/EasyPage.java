package com.feifan.domain.easyui;

import java.util.List;

/**
 * Created by Lidd on 2018/3/10.
 */
public class EasyPage {
    private long total;

    private List<Object> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<Object> getRows() {
        return rows;
    }

    public void setRows(List<Object> rows) {
        this.rows = rows;
    }
}
