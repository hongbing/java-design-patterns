/**
 * 
 */
package com.weibo.bing;

/**
 * 富士康工厂只是一个品牌，真正的代工厂在重庆，郑州等地。
 * 富士康接收订单，然后将相应的订单交给下面的代工厂生产。
 * 富士康可以代工手机/平板/电脑等等电子产品，而相应的电子产品有不同
 * 的品牌厂家。
 * 抽象工厂-->FoxconnFactory
 * 
 * 使用抽象工厂的优劣：
 * 	很方便的增加具体工厂的数量，工厂的扩展符合“开放-闭合”原则
 *  但是，如果要扩展工厂内部生产产品线，比如添加一个电冰箱，则需要修改所有的工厂代码。
 * @author hongbing
 * @date 14-11-15
 */
public abstract class FoxconnFactory {

	public abstract Phone createPhone();
	
	public abstract Pad createPad();
	
	public abstract Computer createComputer();
}
