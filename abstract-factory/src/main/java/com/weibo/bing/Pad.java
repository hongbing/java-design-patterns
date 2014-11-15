/**
 * 
 */
package com.weibo.bing;

/**
 * 抽象产品-->Pad
 * @author hongbing
 * @date 14-11-15
 */
public abstract class Pad {

	public String brand;
	public Double screenSize;
	public int price;
	
	public abstract void call();
	
	public abstract void surfing();
	
	public abstract void playGame();
}
