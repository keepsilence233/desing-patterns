package qx.leizige.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author leizige
 */
public class FilterChain {

	private List<Filter> filters = new ArrayList<>();

	private Target target;

	public void addFilter(Filter filter) {
		Objects.requireNonNull(filter, "filter");
		filters.add(filter);
	}


	public void execute(String request) {
		filters.forEach(filter -> filter.execute(request));
		target.execute(request);
	}

	void setTarget(Target target) {
		this.target = target;
	}
}
