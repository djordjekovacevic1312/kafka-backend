package com.shubh.kafka.model;

public class Message {
	
	private int source;
	private String system;
	private String systemDesc;
	private int level;
	private String code;
	private String shortMsg;
	private String desc;
	private long ts;
	
	public Message() {
		
	}

	@Override
	public String toString() {
		return "Message {" + 
				"source = " + source + " , system = " + system + " , systemDesc = " + systemDesc + " ,"
						+ " level = " + level + " , code = " + code + " , shortMsg = " + shortMsg + " ,"
								+ " desc = " + desc + " , ts = " + ts + "}";
	}
	
	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getSystemDesc() {
		return systemDesc;
	}

	public void setSystemDesc(String systemDesc) {
		this.systemDesc = systemDesc;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getShortMsg() {
		return shortMsg;
	}

	public void setShortMsg(String shortMsg) {
		this.shortMsg = shortMsg;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public long getTs() {
		return ts;
	}

	public void setTs(long ts) {
		this.ts = ts;
	}
}
