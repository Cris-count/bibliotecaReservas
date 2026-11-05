package bibliotecReservas.src.biblioteca;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sala> salas = List.of(
            new Sala("A", "SALA A", 2),
            new Sala("B", "SALA B", 4),
            new Sala("C", "SALA C", 6),
            new Sala("D", "SALA D", 8)
        );

        System.out.println("Salas de la biblioteca:");
        salas.forEach(System.out::println);
    }
}