package com.novatronic.util;

public interface Constante {

	interface Generico{
		String QUEUE_LOCATION = "localhost:1099";
	}
	
	interface Type{
		String ASYNCRONOUS = "ASYNCRONOUS";
		String SYNCRONOUS = "SYNCRONOUS";
		String UNASYNCRONOUS = "UNASYNCRONOUS";
	}
	
	interface Atributo{
		String CLASS_MANAGER_ROUTERS = "com.novatronic.sixadc.manager.RoutersManager";
		String CLASS_MANAGER_DRIVERS = "com.novatronic.sixadc.manager.DriversManager";
		String CLASS_MANAGER_BALANCERS = "com.novatronic.sixadc.manager.BalancersManager";
		String CLASS_MANAGER_CHANNEL = "com.novatronic.sixadc.manager.ChannelManager";
	}
}
