package qx.leizige.filter.filter;

import lombok.extern.slf4j.Slf4j;
import qx.leizige.filter.BaseFilter;
import qx.leizige.filter.Filter;

@Slf4j
public class AuthenticationFilter extends BaseFilter {

	@Override
	public void init(String request) {
		// ignore
	}

	@Override
	public void doFilter(String request) {
		log.info("认证拦截器:{}", request);
	}

	@Override
	public void destroy(String request) {
		// ignore
	}
}
