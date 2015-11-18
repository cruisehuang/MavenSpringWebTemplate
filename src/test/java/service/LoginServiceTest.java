package service;

import static org.junit.Assert.assertEquals; 

import org.junit.BeforeClass; 
import org.junit.Test; 
import org.junit.runner.RunWith; 
import org.springframework.context.ApplicationContext; 
import org.springframework.test.context.ContextConfiguration; 
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import service.LoginService;

/*   SPRING STYLE  */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")

public class LoginServiceTest
{
	@Autowired
	private LoginService service;

/*   OLD STYLE  */
//	 @BeforeClass 
//	 public static void init()
//	 { 
//	   ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/applicationContext.xml"); 
//	   service = (LoginService)context.getBean("LoginService"); 
//	 }
	 
	 @Test 
	 public void testAcccounValidation()
	 {
	   assertEquals(false, service.isAccountValid("user", "wrongPwd"));
       assertEquals(true, service.isAccountValid("user", "password"));
	 }
		

}
