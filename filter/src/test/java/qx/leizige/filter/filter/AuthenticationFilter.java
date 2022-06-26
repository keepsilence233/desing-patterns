package qx.leizige.filter.filter;

import lombok.extern.slf4j.Slf4j;
import qx.leizige.filter.Filter;

@Slf4j
public class AuthenticationFilter implements Filter {
	@Override
	public void execute(String request) {
		log.info("认证拦截器:{}", request);
	}
}
