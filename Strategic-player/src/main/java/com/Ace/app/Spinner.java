package com.Ace.app;/*Copyright 2018 ACE
        Permission is hereby granted, free of charge, to any person obtaining a copy of this software
        and associated documentation files (the "Software"), to deal in the Software without restriction,
        including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
         and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
         subject to the following conditions:
        The above copyright notice and this permission notice shall be included in all copies or substantial
         portions of the Software.
        THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
        LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
        IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
        WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
         OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.*/




import java.util.Collections;
import java.util.Random;

/** First version of a game. Game accepts user input for number of coins,
 *  number of spins, and number of coins to be revealed. Also this version
 *  of the game checks for invalid inputs, and initializes so the game is
 *  ready to play.
 @version
 Fall 2018 v0.7
 @author
 Egor Muscat, Travis Rebhan, Justin Wu, Emenu Dobamo.
 */
public class Spinner {

    public CircularList<Coin> coins;

    public Spinner (int [] coins){}

    /**
     * Constructs a spinner object which initializes CircularList with the
     * number of coins provided by the user input
     */
    public Spinner (int numOfCoins){
        coins = new CircularList<>(numOfCoins);
        for (int i = 0; i < numOfCoins; i++){
            coins.add(i,new Coin());
        }
    }

    /**
     * Spins the numbers in a CircularList by a specific number so it can be tested.
     */
    public void spin(int n){
        if(coins.size() > 0)
            Collections.rotate(coins, n);
    }

    /**
     * Spins the numbers in a CircularList by a by a random number.
     */
    public void randomSpin(){
        if(coins.size() > 0)
            Collections.rotate(coins,new Random().nextInt(coins.size()));
    }

    /**
     * Takes a number, n, and reveals the current state of the coin at that position
     */
    public int reveal(int n){
        return coins.get(n).get_coin();
    }

    /**
     * Flips a coin with a specified index.
     */
    public void flip(int n){
        coins.get(n).flip();
    }
}
