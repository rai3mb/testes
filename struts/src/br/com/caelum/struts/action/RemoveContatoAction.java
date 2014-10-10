package br.com.caelum.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.caelum.struts.form.RemoveContatoForm;

public class RemoveContatoAction extends Action {
	@Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                    HttpServletRequest request, HttpServletResponse response)
                throws Exception {
		 Contato contato = ((RemoveContatoForm) form).getContato();
		 new ContatoDAO().remove(contato);
		 return mapping.findForward("ok");
	}

}
