package spittr.web;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HomeControllerTest {
	
	@Test
	public void testHomePage() throws Exception{
		
		HomeController homeController = new HomeController();
		
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();//Set up MockMvc
		
		mockMvc.perform(get("/")).andExpect(view().name("home"));//Perform GET and Expect home view
		
		
		
		//assertEquals("home",homeController.home());
	}

}
