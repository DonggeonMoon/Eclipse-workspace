package test11.dto;

public class TestDTO {
	private int boardno;
	private String boardtitle;
	private String boardwrite;
	private String boardcontent;
	private String boarddate;
	
	public TestDTO() {
		super();
	}

	public TestDTO(int boardno, String boardtitle, String boardwrite, String boardcontent, String boarddate) {
		super();
		this.boardno = boardno;
		this.boardtitle = boardtitle;
		this.boardwrite = boardwrite;
		this.boardcontent = boardcontent;
		this.boarddate = boarddate;
	}

	public int getBoardno() {
		return boardno;
	}

	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}

	public String getBoardtitle() {
		return boardtitle;
	}

	public void setBoardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}

	public String getBoardwrite() {
		return boardwrite;
	}

	public void setBoardwrite(String boardwrite) {
		this.boardwrite = boardwrite;
	}

	public String getBoardcontent() {
		return boardcontent;
	}

	public void setBoardcontent(String boardcontent) {
		this.boardcontent = boardcontent;
	}

	public String getBoarddate() {
		return boarddate;
	}

	public void setBoarddate(String boarddate) {
		this.boarddate = boarddate;
	}
}
