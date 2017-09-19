package net.board2.action;

import javax.servlet.http.*;

public interface Action {
	public ActionForward execute(
			HttpServletRequest request,
			HttpServletResponse response) throws Exception;
}
//인터페이스