/**
 * 
 */
package com.weibo.bing;

/**
 * 抽象产品-->Phone
 * @author hongbing
 * @date 14-11-15
 */
public abstract class Phone {

	public String brand;
	public Double screenSize;
	public int price;
	public String version;
	
	public abstract void call();
	
	public abstract void surfing();

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Double screenSize) {
		this.screenSize = screenSize;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "phone";
	}
		
}
