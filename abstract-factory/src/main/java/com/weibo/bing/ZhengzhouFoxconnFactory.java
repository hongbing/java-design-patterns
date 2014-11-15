/**
 * 
 */
package com.weibo.bing;

/**
 * 郑州富士康代工厂
 * @author hongbing
 * @date 14-11-15
 */
public class ZhengzhouFoxconnFactory extends FoxconnFactory {

	/* (non-Javadoc)
	 * @see com.weibo.bing.FoxconnFactory#createPhone()
	 */
	@Override
	public Phone createPhone() {
		return new ApplePhone();
	}

	/* (non-Javadoc)
	 * @see com.weibo.bing.FoxconnFactory#createPad()
	 */
	@Override
	public Pad createPad() {
		return new XiaoMiPad();
	}

	/* (non-Javadoc)
	 * @see com.weibo.bing.FoxconnFactory#createComputer()
	 */
	@Override
	public Computer createComputer() {
		return new LenovoComputer();
	}

}
