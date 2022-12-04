package entids;

class FabricaAntigos implements Modelo {
    public Esportes getEsportes() {
        return new WiningEleven();
    }
    public Rpg getRpg() {
        return new Zelda();
    }
  }  
