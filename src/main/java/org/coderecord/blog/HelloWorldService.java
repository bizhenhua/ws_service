package org.coderecord.blog;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@WebService
@SOAPBinding(style = Style.RPC)
@Service
public class HelloWorldService implements IHelloWorld {
	@Autowired
	private MessageService messageService;

	@WebMethod
	public String sayHi(String who) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("sayHi");
		return null;
	}

	@WebMethod
	public String sayMessage(String who) {
		// TODO Auto-generated method stub
		System.out.println("wsServer:" + who);
		return who;
	}

}
