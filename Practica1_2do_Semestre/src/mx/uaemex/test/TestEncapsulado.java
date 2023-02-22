package mx.uaemex.test;
import mx.uaemex.dto.*;

public class TestEncapsulado {
public static void main(String[] args) {
testLogin();
testHackeo();
}
public static void testLogin() {
SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
sesionDeUsuario.setUsuario("sofia");
sesionDeUsuario.setPassword("a");
sesionDeUsuario.doLogin();
if(sesionDeUsuario.isLoggedIn()) {
System.out.println("Bienvenid@ "+sesionDeUsuario.getUsuario());
}else {
System.out.println("Su usuario o contraseña están equivocados");
}
}
public static void testHackeo() {
SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
sesionDeUsuario.getPassword();
sesionDeUsuario.setLoggedIn(true);
}
}