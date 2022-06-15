package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTest2 {
	@Setter(onMethod_ =@Autowired )
	private BoardService service;
/*	
	@Test
	public void testRegister() {
		BoardVO board=new BoardVO();
		board.setTitle("새로 등록한 제목");
		board.setContent("새로 등록한 내용....");
		board.setWriter("newJava");
		service.register(board);
		
		log.info("생성된 게시물 번호 :"+board.getBno());
	}*/
	@Test
	public void testDelete() {
		log.info("Remove Result :"+service.remove(6L));
	}
}
