package net.reser.action;
 
public class ActionForward {
    private boolean isRedirect=false;
    private String path=null;
    
    public boolean isRedirect(){
        return isRedirect;
    }
    
    public String getPath(){
        return path;
    }
    
    public void setRedirect(boolean b){
        isRedirect=b;
    }
    
    public void setPath(String string){
        path=string;
    }
}//redirect방식인지 아닌지 판단 forward방식인지 구별 , path