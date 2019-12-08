package org.crazyit.app.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;
import java.util.Map;

public class AuthorityDownAction implements Action
{
    private String inputPath;
    public void setInputPath(String value){
        inputPath = value;
    }

    public InputStream getTargetFile() throws Exception {
        //ServletContext �ṩgetResourceAsStream()����
        //����ָ���ļ���Ӧ��������
        return ServletActionContext.getServletContext()
                .getResourceAsStream(inputPath);
    }

    public String execute() throws Exception {
        //ȡ��ActionContextʵ��
        ActionContext ctx = ActionContext.getContext();
        //ͨ��ActionContext�����û���HttpSession
        Map session = ctx.getSession();
        String user = (String) session.get("user");
        System.out.println(user);
        //�ж�Session���user�Ƿ�ͨ�����
        if (user != null && user.equals("crazyit.org")) {
            return SUCCESS;
        }
        ctx.put("tip", "����û�е�½�����ߵ�¼���û�������ȷ�������µ�¼��");
        return LOGIN;
    }

}
