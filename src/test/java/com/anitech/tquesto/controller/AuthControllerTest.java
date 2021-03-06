package com.anitech.tquesto.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.anitech.tquesto.auth.TokenProvider;
import com.anitech.tquesto.service.MailService;
import com.anitech.tquesto.service.UserService;

/**
 * Auth controller test
 * 
 * @author Tapas
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(AuthController.class)
public class AuthControllerTest {

	@Autowired
    MockMvc mockMvc;
	
    @MockBean
    UserService userServiceMock;
    
    @MockBean
    MailService mailServiceMock;
    
    @MockBean
    TokenProvider tokenProviderMock;
    
    @Test
    public void testUserAuthentication() throws Exception {
    	
    }
    
}
