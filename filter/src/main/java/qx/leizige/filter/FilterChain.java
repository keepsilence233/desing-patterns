package qx.leizige.filter;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author leizige
 */
public class FilterChain {

    private final List<Filter> filters = Lists.newLinkedList();

    private Target target;

    public void addFilter(Filter filter) {
        Objects.requireNonNull(filter, "filter");
        filters.add(filter);
    }

    public void doFilter(String request) {
        filters.forEach(filter -> {
            exec(filter, request);
        });
        target.execute(request);
    }

    private void exec(Filter filter, String request) {
        filter.init(request);
        filter.doFilter(request);
        filter.destroy(request);
    }

    void setTarget(Target target) {
        this.target = target;
    }
}
