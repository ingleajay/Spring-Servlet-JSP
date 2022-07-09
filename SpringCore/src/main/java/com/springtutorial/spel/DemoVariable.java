package com.springtutorial.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dv")
public class DemoVariable {

	@Value("#{22+44}")
	int x;
	
	@Value("#{8>0}")
	boolean y;
	
	@Value("#{ 12%2==0 ? 'Even NO' : 'Odd No' }")
	String z;
	
	@Value("#{s}")
	List<Integer> id;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public boolean getY() {
		return y;
	}

	public void setY(boolean y) {
		this.y = y;
	}
	

	public List<Integer> getId() {
		return id;
	}

	public void setId(List<Integer> id) {
		this.id = id;
	}
	
	

	public String getZ() {
		return z;
	}

	public void setZ(String z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "DemoVariable [x=" + x + ", y=" + y + ", z=" + z + ", id=" + id + "]";
	}

	
	
	
	
}
