package entids;

public class SugestaoGame {
    private Esportes gameEsporte;
    private Rpg gameRpg;

    public Esportes getGameEsporte() {
        return gameEsporte;
    }

    public Rpg getGameRpg() {
        return gameRpg;
    }
    
    public void gerar(byte opc)
    {
        if(opc == 1)
        {
            gameEsporte = new Fifa();
            gameRpg = new EldenRing();
        }
        else
        {
            gameEsporte = new WiningEleven();
            gameRpg = new Zelda();
        }
    }
  }       
