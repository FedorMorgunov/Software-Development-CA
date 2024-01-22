-Junit test--
Junit version: 5.8.1
Our tests consist of 3 executable test classes: PlayerTest, DeckTest and CardTest.
These test classes contain tests for methods withing the classes Player, Deck and Card respectively.

-CardGame test--
In order to test the functionality of the CardGame class we provide you with .txt files to test different scenarios.
The name of the text file references the number of players it's intended to handle (e.g. 11 players expect eleven_players.txt as the deck file name)

Special cases:
four_players_instantwin.txt expects four players and handles a situation where every player wins immediately.
four_players_winner_player1.txt expects four players and player1 should be the only player that can win.
fourPlayerInvalid.txt has an incorrect number of cards which should be handled by the CardGame class.

--Invalid number of players test--
Enter the number of players less than 1 or incorrect data type (not int)
Expected output: The program will warn you and ask you to enter the number of players again.

--Invalid deck test--
Enter the number of players and enter the wrong deck. For example enter 11 players and try loading the deck from eight.txt or a file that doesn't exist.
Expected output: The program will warn you and ask you to enter the deck file name again.