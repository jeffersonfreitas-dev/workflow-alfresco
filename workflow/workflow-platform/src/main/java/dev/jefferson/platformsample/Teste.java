package dev.jefferson.platformsample;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;


public class Teste implements TaskListener{
	private static final long serialVersionUID = 1L;

	@Override
	public void notify(DelegateTask arg0) {
		System.out.println(">>>>>>>>>>>>>>>LOG FROM CLASS JAVA<<<<<<<<<<<<<<");
	}
	


}
