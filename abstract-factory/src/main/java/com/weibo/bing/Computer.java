/**
 * 
 */
package com.weibo.bing;

/**
 * 抽象产品-->Computer
 * @author hongbing
 * @date 14-11-15
 * 
 */
public abstract class Computer {
	public String brand;
	public Double screenSize;
	public int price;
	public int memorySize;
	public int hardDiskSize;
	public String CPU;
	
	public abstract void surfing();
	
	public abstract void eMail();
	
}
