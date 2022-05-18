package jdbc.board;

public class BoardVO {
	private String title;
	private String content;
	private String writer;
	
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}
	
	public BoardVO(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "BoardVO [제목: " + title + ", 내용: " + content + ", 작성자: " + writer + "]";
	}
	
}
