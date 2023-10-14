package ferramentaAN;

 

public class Empresa {

 

    private String nome;

    private String setor;

    private String localizacao;

    private int numFuncionarios;

    

    public Empresa(String nome, String setor, String localizacao, int numFuncionarios) {

        super();

        this.nome = nome;

        this.setor = setor;

        this.localizacao = localizacao;

        this.numFuncionarios = numFuncionarios;

    }

    

    
    //lógica de validacao de empresas
    public boolean validarEmpresa() {

        

        //verificar se o nome da empresa não está vazio

        if (nome == null || nome.isEmpty()) {

            System.out.println("É necessário inserir o nome da empresa.");

            return false;

            }

        

        //verificar se o setor não está vazio

        if (setor == null || setor.isEmpty()) {

            System.out.println("É necessário inserir o nome do setor.");

            return false;

        }

        

        //verificar se o campo de localização não está vazio

        if (localizacao == null || localizacao.isEmpty()) {

            System.out.println("É necessário inserir a localização da empresa.");

            return false;

        }

        

        //verificar o número de funcionários

        if (numFuncionarios <= 0) {

            System.out.println("É necessário ter ao menos um funcionário na empresa.");

            return false;

        }

        

        //Se todas as verificações passaram a empresa é considerada válida    

            return true;

    }

    

    

    

}

 