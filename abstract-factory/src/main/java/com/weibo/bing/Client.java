/**
 * 
 */
package com.weibo.bing;

/**
 * 富士康的客户，提供订单。
 * @author hongbing
 * @date 14-11-15
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FoxconnFactory factory = new ZhengzhouFoxconnFactory();
		Phone phone = factory.createPhone();
		phone.setVersion("ipnohe 6");
		phone.setPrice(5342);
		phone.call();
	}

}
