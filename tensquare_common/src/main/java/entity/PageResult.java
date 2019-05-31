package entity;

import java.util.List;

/**
 * @ClassName PageResult
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/31 0031 14:34
 * @Version 1.0
 **/
public class PageResult<T> {
    private long total;
    private List<T> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public PageResult() {
    }

    public PageResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
}
