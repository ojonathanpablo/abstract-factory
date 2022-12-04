package entids;

class FabricaNovos implements Modelo {
    public Esportes getEsportes() {
        return new Fifa();
    }
    public Rpg getRpg() {
        return new EldenRing();
    }
  }   
