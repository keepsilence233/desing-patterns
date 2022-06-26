package qx.leizige.filter;


import lombok.extern.slf4j.Slf4j;

/**
 * @author leizige
 */
@Slf4j
public class Target {

	public void execute(String request) {
		log.info("执行了请求:{}", request);
	}

}
