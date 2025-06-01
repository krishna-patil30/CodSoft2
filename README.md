 Objective:
The program is a simple number guessing game where the user has to guess a randomly generated number between 1 and 100. The player has a limited number of attempts in each round, and scores are awarded based on performance.

📦 Key Components Used:
Scanner: To take input from the user.

Random: To generate a random number between 1 and 100.

Loops: To allow repeated attempts and multiple rounds.

Conditions (if-else): To give hints and check correctness of the guess.

🔁 Game Flow:
Start of the Game:

The game welcomes the user.

It sets up variables to keep track of the number of rounds and the total score.

Game Loop:

The game runs in a loop (while (playitAgain)) allowing the user to play multiple rounds until they choose to stop.

Random Number Generation:

A random number between 1 and 100 is generated for the user to guess.

Guessing Attempts:

The user is given 5 attempts to guess the number.

After each guess:

If correct, a congratulatory message is displayed and the score is updated.

If incorrect:

A hint is provided ("Too low!" or "Too high!").

End of Round:

If the user fails to guess correctly in 5 attempts, the correct number is revealed.

Score is calculated if the number was guessed correctly:

Score
=
(
Remaining Attempts
+
1
)
×
10
Score=(Remaining Attempts+1)×10
Replay Option:

The user is asked if they want to play another round.

The game continues if the user inputs "yes" (case-insensitive).

End of Game:

When the user chooses not to continue, the game displays:

Total rounds played.

Final score.

Scanner is closed.

