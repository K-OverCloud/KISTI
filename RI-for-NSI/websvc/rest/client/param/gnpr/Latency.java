package com.netmng.websvc.rest.client.param.gnpr;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Latency {
	@XmlValue
	public String value;
	@XmlAttribute(name="unit")
	public String unit = "ms";
}
