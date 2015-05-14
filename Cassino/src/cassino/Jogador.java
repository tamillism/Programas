package cassino;

public class Jogador {

    private String nome;
    private String senha;
    private String login;
    private String sapato;
    private String roupa;
    private String acessorio;
    private Boolean jogando;
    private float gold;
    private float cash;

    Jogador() {
        this.nome = null;
        this.senha = null;
        this.login = null;
        this.roupa = null;
        this.acessorio = null;
        this.sapato = null;
        this.jogando = false;
        this.cash = 0;
        this.gold = 0;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSapato(String sapato) {
        this.sapato = sapato;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public void setJogando(Boolean jogando) {
        this.jogando = jogando;
    }

    public void setGold(float gold) {
        this.gold = gold;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }

    public String getNome()
    {
        return this.nome;
    }
    
    public String getSenha()
    {
        return this.senha;
    }
    
    public String getLogin()
    {
        return this.login;
    }
     public String getRoupa()
     {
         return this.roupa;
     }
      public String getAcessorio()
      {
          return this.acessorio;
      }
      public Boolean getJogando()
      {
          return this.jogando;
      }
      public float getGold()
      {
          return this.gold;
      }
      public float getCash()
      {
          return this.cash;
      }
      
  
    Boolean cadastro(String vnome, String vsenha, String vlogin, String confirmasenha, String chinelorider, String calcaecamisa, String relogiodocamelo) {

        if (senha == null ? confirmasenha == null : senha.equals(confirmasenha)) {
            gold = 50;
            cash = 0;
            acessorio = relogiodocamelo;
            roupa = calcaecamisa;
            sapato = chinelorider;
            nome = vnome;
            login = vlogin;
            senha = confirmasenha;
            return true;
        } else {
            return false;
        }

    }

    Boolean entrar(String wlogin, String wsenha) {

        if (login == wlogin && senha == wsenha) {
            jogando = true;
            return true;
        } else {
            return false;
        }

    }

    Boolean inserirCash(String numcartao, float valor) {

        if (numcartao.length() == 16 && jogando == true) {
            return true;
        } else if (numcartao.length() < 16 && jogando == false) {
            return false;
        } else if (valor <= 10) {
            cash = cash + valor;
            return true;
        } else if (valor > 10 && valor <= 50) {
            cash = cash + valor;
        } else if (valor > 50) {
            cash = cash + valor;
        } else {
            return false;
        }
       return null;
    }

}
