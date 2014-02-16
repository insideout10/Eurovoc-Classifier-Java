package io.insideout.eurovoc.http.models;

public class TrackingSummary {

    private Long total;
    private Long recent;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getRecent() {
        return recent;
    }

    public void setRecent(Long recent) {
        this.recent = recent;
    }
}
