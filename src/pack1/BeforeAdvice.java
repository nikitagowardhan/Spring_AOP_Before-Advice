package pack1;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice
{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {

		System.out.println("Excecute Before Actual Logic");
	}

}
