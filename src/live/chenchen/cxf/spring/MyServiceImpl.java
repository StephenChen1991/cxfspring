package live.chenchen.cxf.spring;

public class MyServiceImpl implements MyService
{
	@Override
	public String hello(String username)
	{
		System.out.println("hello is invoked");

		return "Hello " + username;
	}

}
