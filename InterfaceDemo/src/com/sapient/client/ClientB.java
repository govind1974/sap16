package com.sapient.client;

import com.sapient.beans.Agent;
import com.sapient.beans.MyUtil;

public class ClientB {

	public static void main(String[] args) {
		Agent agent = MyUtil.getAgent();
		agent.clearPdc();

	}

}
