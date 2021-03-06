/**
 * 
 */
package com.springDemo;

/**
 * This class is used to
 * 
 * @author Sumit 28-Oct-2013
 * 
 */
public class HelloWorld {

	String message = "";
	HelloWorldName propMsg = null;
	String helloMsg = "";
	AOPPrintObject aopPrintObject = null;

	/**
	 * CGLIB has a restriction of having a default constructor.
	 */
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	public HelloWorld(String message, HelloWorldName propMsg) {
		this.message = message;
		this.propMsg = propMsg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void printMessage() {
		System.out.println("Message : " + getMessage() + " . Prop Msg : "
				+ this.propMsg.getName());
	}

	public HelloWorldName getPropMsg() {
		return propMsg;
	}

	public void setPropMsg(HelloWorldName propMsg) {
		this.propMsg = propMsg;
	}

	public String getHelloMsg() {
		return helloMsg;
	}

	public void setHelloMsg(String helloMsg) {
		this.helloMsg = helloMsg;
	}

	public void printHelloMsg() {
		System.out.println("Hello Msg : " + getHelloMsg());
	}

	public AOPPrintObject getAopPrintObject() {
		return aopPrintObject;
	}

	public void setAopPrintObject(AOPPrintObject aopPrintObject) {
		this.aopPrintObject = aopPrintObject;
	}

}
