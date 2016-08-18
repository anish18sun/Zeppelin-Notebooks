package com.anish.zeppelin.congestion;

import org.apache.zeppelin.helium.Application;
import org.apache.zeppelin.helium.ApplicationContext;
import org.apache.zeppelin.helium.ApplicationException;
import org.apache.zeppelin.interpreter.dev.ZeppelinApplicationDevServer;
import org.apache.zeppelin.resource.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class CongestionMap extends Application{
	
	private final Logger logger = LoggerFactory.getLogger(CongestionMap.class);
	
	public CongestionMap(ApplicationContext context){
		super(context);
	}

	@Override
	public void run(ResourceSet resources) throws ApplicationException{
		
		try{
			context().out.writeResource("appresources/euromap.html");
		}
		catch(IOException e){
			throw new ApplicationException(e);
		}
	}
	
	@Override
	public void unload() throws ApplicationException{
		//nothing to unload
	}
	
	public static void main(String args[]) throws Exception{
		LocalResourcePool pool = new LocalResourcePool("dev");
		
		ZeppelinApplicationDevServer devServer = new ZeppelinApplicationDevServer(CongestionMap.class.getName(), pool.getAll());
		
		devServer.start();
		devServer.join();
	}
}
