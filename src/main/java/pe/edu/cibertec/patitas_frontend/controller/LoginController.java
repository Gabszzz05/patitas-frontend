package pe.edu.cibertec.patitas_frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.cibertec.patitas_frontend.viewModel.LoginModel;

@Controller
@RequestMapping("/login")
public class LoginController {

    //Metodo para mostrar la pantalla de inicio
    @GetMapping("/inicio")
    public String incioPage(Model model){
        //Instanciamos el viewModel
        LoginModel loginModel = new LoginModel("00", "", "");
        //                     VARIABLE               VALOR
        model.addAttribute("loginModel", loginModel);
        //Retornamos la vista
        return "inicioPage";
    }

    //Metodo para autenticar
    @PostMapping("/autenticar")
    public String autenticar(@RequestParam("tipoDocumento") String tipoDocumento,
                             @RequestParam("numeroDocumento") String numeroDocumento,
                             @RequestParam("password") String password,
                             Model model){
        //Validar campos de entrada
        if(tipoDocumento == null || tipoDocumento.isEmpty() || numeroDocumento == null || numeroDocumento.isEmpty() || password == null || password.isEmpty()){
            //Enviamos un mensaje de Error
            LoginModel loginModel = new LoginModel("01", "Error: Debe completar correctamente sus credenciales", "");
            model.addAttribute("loginModel", loginModel);
            //Retornamos a inicio
            return "inicioPage";
        }

        //Instanciamos el viewModel
        LoginModel loginModel = new LoginModel("00", "", "Gabriel Hinostroza");
        //                     VARIABLE               VALOR
        model.addAttribute("loginModel", loginModel);
        //
        return "principal";
    }
}
