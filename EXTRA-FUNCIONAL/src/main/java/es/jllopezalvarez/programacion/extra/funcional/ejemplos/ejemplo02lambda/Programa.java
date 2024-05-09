package es.jllopezalvarez.programacion.extra.funcional.ejemplos.ejemplo02lambda;

import net.datafaker.Faker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Programa {

    private static Faker faker = new Faker();

    public static void main(String[] args) throws IOException {

        ClaseQueImplementaA objetoQueImplementaA = new ClaseQueImplementaA();

        hazAlgoConInterfazA(objetoQueImplementaA);

        hazAlgoConInterfazA(new InterfazA() {
            @Override
            public void metodoInterfazA(String valor) {
                System.out.println(valor + " En el método en clase anónima");
            }
        });

        hazAlgoConInterfazA(valor -> System.out.println(valor + " En el método en lambda"));
        hazAlgoConInterfazB((a, b) -> System.out.printf("%d - %s - En lambda de B\n", b, a));

        System.out.println("-".repeat(100));

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(integers);

        List<Integer> pares = integers.stream().filter(num -> num % 2 == 0).toList();

        System.out.println(pares);

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        IntStream stream2 = IntStream.range(2, 100);

        System.out.println("-".repeat(100));

        Files.readAllLines(Path.of("/home/jllopezalvarez/starshiptroopers.txt"))
                .stream().filter(s -> s.length() < 50)
                .filter(s -> !s.isBlank())
                .map(s -> {
                    char[] caracteres = s.toCharArray();
                    invertirArray(caracteres);
                    return new String(caracteres);
                })
                .forEach(System.out::println);


        System.out.println("_".repeat(100));
        // Lista de números aleatorios
        Stream<Integer> numerosAleatorios = Stream.generate(() -> (int) (Math.random() * 100)).limit(10);
        //List<Integer> numerosEnLista = numerosAleatorios.toList();
        //numerosAleatorios.collect(Collectors.toList());
        numerosAleatorios.forEach(System.out::println);
        //List<Integer> numerosEnLista = numerosAleatorios.toList();

        System.out.println("_".repeat(100));
        // Números de 5 en 5 comenzando en -17
        Stream.iterate(-17, n -> n + 5)
                .limit(10)
                .forEach(n -> {
                    System.out.println(n);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                });

//        List<Scanner> scanners = new ArrayList<>();
//        long l = 0;
//        while(true){
//            l++;
//            Scanner s = new Scanner(System.in);
//            System.out.println(l);
//        }


        // Stream de aleatorios con Random
        Random r = new Random();
        List<Integer> l =  r.ints(100, 1, 100+1).boxed().toList();
        System.out.println(l);


//
//
//
//
//
//        integers.forEach(num->System.out.println(num));
//
//        integers.stream().filter()
//
//        integers.forEach(System.out::println);
//
//        integers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.
//                        println(integer);
//            }
//        });

        System.out.println("_".repeat(100));
        long milisegundos = System.currentTimeMillis();
        r.longs(100, 1, 20).map(Programa::factorial).forEach(System.out::println);
        long tiempoInvertido = System.currentTimeMillis() - milisegundos;
        System.out.println("Se han invertido en secuencial " + milisegundos / 1000D);

        milisegundos = System.currentTimeMillis();
        r.longs(100, 1, 20).parallel().map(Programa::factorial).forEach(System.out::println);
        tiempoInvertido = System.currentTimeMillis() - milisegundos;
        System.out.println("Se han invertido en paralelo " + milisegundos / 1000D);


        System.out.println("_".repeat(100));
        // Máximo de una colección
        List<Integer> numerosParaMaximo = r.ints(100, 1, 100).boxed().toList();
        // Máximo
        Optional<Integer> maximo = numerosParaMaximo.stream().max(Integer::compare);

        System.out.println(maximo.orElseThrow());


    }

    private static long factorial(long n) {
        long factorial = 1;
        while(n > 1){
            factorial *= n;
            n--;
        }
        return factorial;
    }

    private static void invertirArray(char[] caracteres) {
        int inicio = 0;
        int fin = caracteres.length - 1;
        while (inicio < fin) {
            char aux = caracteres[inicio];
            caracteres[inicio] = caracteres[fin];
            caracteres[fin] = aux;
            inicio++;
            fin--;
        }
    }

    private static void hazAlgoConInterfazA(InterfazA objeto) {
        objeto.metodoInterfazA(faker.movie().quote());
    }

    private static void hazAlgoConInterfazB(InterfazB objeto) {
        objeto.metodoInterfazB(faker.movie().quote(), faker.number().negative());
    }


    private static class ClaseQueImplementaA implements InterfazA {

        @Override
        public void metodoInterfazA(String valor) {
            System.out.println(valor + " En el método en clase 'completa'");
        }
    }

}
