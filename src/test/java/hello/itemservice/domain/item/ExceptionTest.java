package hello.itemservice.domain.ExceptionTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ExceptionTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	void NOT_FOUND_테스트() throws Exception {
		mockMvc.perform(get("/1234").header(HttpHeaders.ACCEPT, MediaType.TEXT_HTML_VALUE))
			.andExpect(status().isNotFound())
			.andDo(print());
	}
	
	@Test
	void MultiPart_FORM_Data() throws Exception {
		mockMvc.perform(get("/1234").header(HttpHeaders.ACCEPT, MediaType.TEXT_HTML_VALUE))
		.andExpect(status().isNotFound())
		.andDo(print());
	}
	




}
