package com.anish.zeppelin.scatterplot;

import org.apache.zeppelin.helium.Application;
import org.apache.zeppelin.helium.ApplicationContext;
import org.apache.zeppelin.helium.ApplicationException;
import org.apache.zeppelin.interpreter.dev.ZeppelinApplicationDevServer;
import org.apache.zeppelin.resource.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Scatter extends Application{
	
	private final Logger logger = LoggerFactory.getLogger(Scatter.class);
	
	public Scatter(ApplicationContext context){
		super(context);
	}

	@Override
	public void run(ResourceSet resources) throws ApplicationException{
		
		try{
			context().out.writeResource("appresources/scatter.html");
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
		
		ZeppelinApplicationDevServer devServer = new ZeppelinApplicationDevServer(Scatter.class.getName(), pool.getAll());
		
		devServer.start();
		devServer.join();
	}
}
