package Poki;
public class Pokedex
{
    // Variables
    private Pokemon[] pokemons;
    private int pokemonLimit;
    private int pokemonCount;

    // Constructor
    public Pokedex(int limit)
    {
        pokemonCount = 0;
        pokemonLimit = limit;
        pokemons = new Pokemon[limit];
    }

    /*
     * Return all the names of the Pokemon species in the Pokedex
     */
    public String[] listPokemon()
    {
        String[] pokemonList = new String[pokemonCount];

        for (int i = 0; i < pokemonCount; i++)
            pokemonList[i] = pokemons[i].getSpecies();

        return pokemonList;
    }

    /*
     * Add a Pokemon to the Pokedex and return true if it can actually be added
     * to the Pokedex. If not, return false.
     */
    public boolean addPokemon(Pokemon pokemon)
    {
        if (pokemonCount >= pokemonLimit)
            return false;


        boolean isAlreadyAdded = false;
        for(int i = 0; i < pokemonCount; i++)
        {
            if(pokemons[i].getSpecies().toLowerCase().equals( pokemon.getSpecies().toLowerCase()) )
                isAlreadyAdded = true;
        }

        if(isAlreadyAdded)
            return false;


        pokemons[pokemonCount] = pokemon;
        pokemonCount++;
        return true;
    }

    /*
     * Return the stats of a certain Pokemon that you are searching for.
     */
    public int[] checkStats(String species)
    {
        int[] stats = { -1, -1, -1 };

        for (int i = 0; i < pokemonCount; i++)
        {
            if (pokemons[i].getSpecies().equals(species))
            {
                stats[0] = pokemons[i].getAttack();
                stats[1] = pokemons[i].getDefense();
                stats[2] = pokemons[i].getSpeed();
            }
        }
        return stats;
    }

	/*
	 * Sort Pokedex in alphabetical order
	 */

    public void sortPokedex()
    {
        selectionSort(0);
    }

    private void selectionSort(int start)
    {
        if(start < pokemonCount)
        {
            int min = findMinPos(start);
            swap(start,min);
            selectionSort(start + 1);
        }
    }

    private int findMinPos(int start)
    {
        int min = start;
        for(int i = start + 1; i < pokemonCount ;i++)
        {
            if(pokemons[i].getSpecies().compareTo(pokemons[min].getSpecies()) < 0)
            {
                min = i;
            }
        }
        return min;
    }


    private void swap(int i , int j)
    {
        Pokemon temp = pokemons[i];
        pokemons[i] = pokemons[j];
        pokemons[j] = temp;
    }

	/*
	* Evolve a certain Pokemon that you are searching for in the
	* Pokedex and return true if the Pokemon is actually in the
	* the Pokedex. If not, return false.
	 */


    public boolean evolvePokemon(String species)
    {
        for(int i = 0; i < pokemonCount; i++)
        {
            if(pokemons[i].getSpecies().equals(species))
            {
                pokemons[i].evolve();
                return true;
            }
        }
        return false;
    }

    public int getPokemonCount()
    {
        return pokemonCount;
    }
}