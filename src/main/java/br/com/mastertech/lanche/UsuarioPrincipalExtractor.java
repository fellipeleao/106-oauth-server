package br.com.mastertech.lanche;

import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

public class UsuarioPrincipalExtractor implements PrincipalExtractor 
{
    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        Usuario usuario = new Usuario();
        usuario.setId(Integer.parseInt((String) map.get("id")));
        usuario.setName((String) map.get("name"));
        return usuario;	
    }
}
