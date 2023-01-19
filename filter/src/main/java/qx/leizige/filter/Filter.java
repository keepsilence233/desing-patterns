package qx.leizige.filter;

/**
 * @author leizige
 */
public interface Filter {

	void init(String request);

	void destroy(String request);

	void doFilter(String request);
}
