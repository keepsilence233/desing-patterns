package qx.leizige.filter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BaseFilter implements Filter {

    @Override
    public void init(String request) {
        log.info("Initialize filter: {}", getClass().getSimpleName());
    }

    @Override
    public void destroy(String request) {
        log.info("Destroy filter: {}", getClass().getSimpleName());
    }

    @Override
    public void doFilter(String request) {
        log.info("do filter: {}", getClass().getSimpleName());
    }
}
