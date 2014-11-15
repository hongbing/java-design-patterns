/**
 * 
 */
package com.weibo.bing;

/**
 * 苹果手机
 * @author hongbing
 * @date 14-11-15
 */
public class ApplePhone extends Phone {

	/* (non-Javadoc)
	 * @see com.weibo.bing.Phone#call()
	 */
	@Override
	public void call() {
		System.out.println("Hi,I'm using " + this + " " + getVersion()
				+ " calling you.");
	}

	/* (non-Javadoc)
	 * @see com.weibo.bing.Phone#surfing()
	 */
	@Override
	public void surfing() {
		System.out.println("I'm using " + this + " " + "surfing"
				+ ",it cost me $" + getPrice());
	}
	
}
