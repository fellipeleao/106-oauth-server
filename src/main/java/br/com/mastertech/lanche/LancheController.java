package br.com.mastertech.lanche;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LancheController 
{
	@GetMapping("/lanche")
	public String consultaLanchao(@AuthenticationPrincipal Usuario usuario)
	{
		return "Lanchão do " + usuario.getName();
	}
}

