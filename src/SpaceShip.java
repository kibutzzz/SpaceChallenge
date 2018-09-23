public interface SpaceShip {

    //retorna true caso o lançamento tenha sido efetuado com sucesso
    boolean lauch();

    //retorna true caso o pouso tenha sido efetuado com sucesso
    boolean land();

    //retorna true caso possa carregar o item
    boolean canCarry(Item item);

    //atualiza o peso
    void carry(Item item);

}
