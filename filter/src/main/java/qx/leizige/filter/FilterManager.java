package qx.leizige.filter;

/**
 * @author leizige
 */
public class FilterManager {

    private static final FilterChain filterChain = new FilterChain();

    public FilterManager(Target target) {
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void process(String request) {
        filterChain.doFilter(request);
    }
}
