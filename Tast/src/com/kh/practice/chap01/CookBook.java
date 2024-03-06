package com.kh.practice.chap01;

public class CookBook extends Book{
	
	private boolean coupon;

	public CookBook() {
		super();
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook [coupon=" + coupon + "]";
	}

	
	
	

}
