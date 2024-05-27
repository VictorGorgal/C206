package Excecoes;

public class WrongPassword extends RuntimeException{
    public WrongPassword(String erro) {
        super(erro);
    }
}
