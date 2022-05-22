package com.nowcoder.community.entity;

import java.util.List;

public class EsResult {
    
    private List<DiscussPost> list;
    private long total;

    public List<DiscussPost> getList() {
        return list;
    }

    public void setList(List<DiscussPost> list) {
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "EsResult{" +
                "list=" + list +
                ", total=" + total +
                '}';
    }
}
