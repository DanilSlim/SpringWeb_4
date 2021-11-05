package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import spittr.data.SpitterRepository;
import spittr.domain.Spitter;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class SpitterControllerTest {
	
	
	 @Test
	  public void shouldShowRegistration() throws Exception {
		 
		SpitterController controller = new SpitterController();
	    
	    MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	    
	    mockMvc.perform(get("/spitter/register")).andExpect(view().name("registerForm"));
	  }
	 
	 @Test
	 public void shouldProcessRegistration() throws Exception {
		 
		 SpitterRepository mockRepository =mock(SpitterRepository.class);//Set up mock repository
		 
		 Spitter unsaved = new Spitter("jbauer", "24hours", "Jack", "Bauer");
		 
		 Spitter saved = new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer");
		 
		 when(mockRepository.save(unsaved)).thenReturn(saved);
		 
		 SpitterController controller = new SpitterController(mockRepository);
		 
		 MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();//Set up MockMvc
		 
		 mockMvc.perform(post("/spitter/register")//Perform request
				 .param("firstName", "Jack")
				 .param("lastName", "Bauer")
				 .param("userName", "jbauer")
				 .param("password", "24hours"))
				 .andExpect(redirectedUrl("/spitter/jbauer"));
		 
				 verify(mockRepository, atLeastOnce()).save(unsaved);//Verify save
	 }

}
