package net.reser.action;
 
import javax.servlet.http.*;

import net.reser.action.ActionForward;

public interface Action {
    public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception;
}//인터페이스