package br.com.caelum.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.caelum.struts.form.ContatoForm;

    // série de imports aqui

    public class AdicionaContatoAction extends Action {
        @Override
        public ActionForward execute(ActionMapping mapping, ActionForm form,
                        HttpServletRequest request, HttpServletResponse response)
                    throws Exception {
            // log
            System.out.println("Tentando criar um novo contato...");

            // formulário de cliente
            ContatoForm formulario = (ContatoForm) form;
            // acessa o bean
            Contato contato = formulario.getContato();

            // adiciona ao banco de dados
            ContatoDAO dao = new ContatoDAO();
            dao.adiciona(contato);

            // ok.... visualização
            return mapping.findForward("ok");
        }
    }