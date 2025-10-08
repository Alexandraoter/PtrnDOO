//Patrón Composite (Ataques) 
package JuegoconArmas;
interface I_Ataque {
    int getDano();
    String getNombre();
    void ejecutar(Personaje atacante, Personaje defensor);
}