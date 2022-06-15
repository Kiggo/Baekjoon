package org.zerock.mapper;

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
public class BoardMapperTests {
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
/*	
	  @Test public void testGetList() {
	  mapper.getList().forEach(board->log.info(board)); }
	 	
	@Test
	public void testInsert() {
		BoardVO vo=new BoardVO();
		vo.setTitle("java 글");
		vo.setContent("java 글 java 글java 글java 글java 글java 글");
		vo.setWriter("javajava");
		mapper.insert(vo);
		log.info(vo);
	} */
	@Test
	public void testRead() {
		BoardVO board=mapper.read(5L);
		log.info(board);
	}
/*
	@Test
	public void testUpdate() {
		BoardVO board=new BoardVO();
		board.setBno(5L);
		board.setTitle("변경된 제목");
		board.setContent("변경된 내용");
		board.setWriter("user00");
		int count=mapper.update(board);
		log.info("Update Count :"+count);
	}*/
	@Test
	public void testDelete() {
		log.info("Delete count : "+mapper.delete(2L));
	}
}
