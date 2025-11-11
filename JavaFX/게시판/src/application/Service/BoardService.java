package application.Service;

import java.util.List;

import application.DTO.Board;

/**
 * 게시판 프로그램
 * 1. 데이터 목록
 * 2. 데이터 조회
 * 3. 데이터 등록
 * 4. 데이터 수정
 * 5. 데이터 삭제
 */
public interface BoardService {
	
	List<Board> list();
	Board select(int no);
	int insert(Board board);
	int update(Board board);
	int delete(int no);

}
