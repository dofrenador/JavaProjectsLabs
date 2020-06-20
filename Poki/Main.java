package Poki;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //variables
        Scanner scanner = new Scanner(System.in);
        int pokemonLimit = -1;
        int userChoice = 0;
        Pokedex pokedex;

        System.out.println("Welcome to your new PokeDex!");
        do
        {
            // Initialize pokedex
            try
            {
                System.out.print("How many Pokemon are in your region: ");
                pokemonLimit = scanner.nextInt();
                System.out.println();
            }
            catch (InputMismatchException e)
            {
                scanner.nextLine();
            }
        } while (!(pokemonLimit > 0));

        pokedex = new Pokedex(pokemonLimit);
        System.out.println("Your new Pokedex can hold " + pokemonLimit + " Pokemon. Let’s start using it!");
        System.out.println();

// Main menu
        do
        {
            try{
                System.out.println("1. List Pokemon");
                System.out.println("2. Add Pokemon");
                System.out.println("3. Check a Pokemon’s Stats");
                System.out.println("4. Evolve Pokemon");
                System.out.println("5. Sort Pokemon");
                System.out.println("6. Exit\n");
                System.out.print("What would you like to do? ");
                userChoice = scanner.nextInt(); // Get user choice

                if (userChoice == 1) //when user inputs 1
                {
                    String[] output = pokedex.listPokemon();

                    for (int i = 0; i < output.length; i++) // create a loop to display the list of pokemons that user entered
                        System.out.println((i+1) + ". " + output[i]);

                }

                else if (userChoice == 2) // when user inputs 2
                {
                    System.out.println();
                    System.out.print("Please enter the Pokemon's species: ");
                    String species = scanner.next();

                    Pokemon newPokemon = new Pokemon(species);
                    boolean result = pokedex.addPokemon(newPokemon);

                    if (!result)
                    {
                        if (pokemonLimit <= pokedex.getPokemonCount()) //if the limit of pokedex exceed
                            System.out.println("Max");
                        else
                            System.out.println("Duplicate");
                    }
                }

                else if (userChoice == 3) // when user inputs 3
                {
                    System.out.println();
                    System.out.print("Please enter the Pokemon of interest: ");
                    String species = scanner.next();
                    int[] stats = pokedex.checkStats(species);
                    if (stats[0] < 0 || stats[1] < 0 || stats[2] < 0)
                        System.out.println("Missing");
                    else
                    {
                        System.out.println();
                        System.out.println("The stats for " + species + " are:");
                        System.out.println("Attack: " + stats[0]);
                        System.out.println("Defense: " + stats[1]);
                        System.out.println("Speed: " + stats[2]);
                    }

                }

                else if (userChoice == 4) // when user inputs 4
                {
                    System.out.println();
                    System.out.print("Please enter the Pokemon of interest: ");
                    String species = scanner.next();
                    if (pokedex.evolvePokemon(species)) // call the method
                    {
                        System.out.println(species + " has evolved!");
                    } else
                    {
                        System.out.println("Missing");
                    }
                }

                else if (userChoice == 5) // when the user inputs 5
                    pokedex.sortPokedex();

                else if (userChoice != 6)
                    System.out.println("\nThat is not a valid choice. Try again.");
                    System.out.println();
            }
            catch(InputMismatchException e) // handle all the invalid input
            {
                System.out.println("\nThat is not a valid choice. Try again.");
                System.out.println();
                scanner.nextLine();
            }
        } while (userChoice != 6);
        scanner.close();
    }
}
