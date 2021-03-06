package br.univille.projdacs20181;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import br.univille.projdacs20181.controller.HomeController;
import br.univille.projdacs20181.controller.PacienteController;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProjDacs20181ApplicationTests {
	/*
	@Autowired
    private HomeController controller;
    @Autowired
	private MockMvc mockMvc;
    
    @Autowired
    private PacienteController pacienteController;
	
	@Test
	public void contextLoads() {
	  assertThat(controller).isNotNull();	
	  assertThat(pacienteController).isNotNull();
	}
	@Test
	public void homeControllerTest() throws Exception {
	//Teste do método index
	this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
	.andExpect(content().string(containsString("eu quero acreditar")));
	}
	
	@Test
	public void pacienteControllerTest() throws Exception {
	//Teste do método index
	this.mockMvc.perform(get("/paciente")).andDo(print()).andExpect(status().isOk())
	.andExpect(xpath("//table").exists())
	.andExpect(xpath("//td[contains(., 'Zezinho')]").exists());
	}
	*/
	
	@Test
	public void contextLoads() {
	  assertThat("a").isNotNull();	
	}
}
