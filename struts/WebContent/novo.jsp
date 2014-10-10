   <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
   <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

            <html:html>
                <head>
                    <title><bean:message key="site.titulo" /></title>
                </head>

                <html:errors />
                 <html:errors property="nome"/>

                <html:form action="/novoContato" focus="contato.nome">
                    Nome:
                        <html:text  property="contato.nome"/>
                        <br/>

                    Email: 
                        <html:text  property="contato.email"/>
                        <br/>

                    Endereço: 
                        <html:text  property="contato.endereco"/>
                        <br/>

                        <html:submit>Enviar dados</html:submit>
                    <br/>
                </html:form>
            </html:html>