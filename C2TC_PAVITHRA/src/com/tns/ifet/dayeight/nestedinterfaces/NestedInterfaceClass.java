package com.tns.ifet.dayeight.nestedinterfaces;
public class NestedInterfaceClass implements MyInterface.MyInnerInterface{
	@Override
	public void print() {
		 System.out.println("Print method of nested interface");
	}
}