package  br.com.caelum.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;

import br.com.caelum.struts.action.Contato;

public class ContatoForm extends ActionForm {
    private Contato contato = new Contato();
    public Contato getContato() {
        return this.contato;
    }
    
    @Override
    public ActionErrors validate(ActionMapping mapping,
            HttpServletRequest request) {

        ActionErrors erros = new ActionErrors();

        // verifica o nome
        if (contato.getNome() == null || contato.getNome().equals("")) {
            erros.add("nome", new ActionMessage("erro.campoNome"));
        }

        // verifica o email
        if (contato.getEmail() == null || contato.getEmail().equals("")) {
            erros.add("email", new ActionMessage("erro.campoEmail"));
        }

        // verifica o endereco
        if (contato.getEndereco() == null ||
                contato.getEndereco().equals("")) {
            erros.add("endereco", 
                    new ActionMessage("erro.campoEndereco"));
        }

        return erros;
    }
}