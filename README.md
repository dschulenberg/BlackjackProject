# Black Jack Game


#Description
The BlackJack Games allows the user to play black jack with a program and determines which one wins. The deck, card, and hand allows for other apps to use these classes. The main components used is the app, which handles comparing scores and the logic of the game, the dealer, which handles dealing out cards but also has its own hand, and the player, which can hit or stay depending on their current score count. Note, a player can willing BUST on their own. The players hand and dealers hand extend blackjackhand which holds the specific rules for blackjack, blackjack and bust. Upon start of the game, if the player is dealt a blackjack, 21, then the game is over and is announced. If the dealer is dealt a blackjack, we will not know until it is his turn to go and the card that was dealt face down is revealed. The player is asked to hit, get another card, or stay to continue the game. Each time someone adds a card to their hand, their hand is updated and revealed. The dealer operates off of the the logic, card score <17, they add a card, if the card score >= 17, then the dealer will Stay. Default Scenarios are: A player gets 21 on the first dealt cards, a player automatically loses if they hit above 21.


#Technologies Used
Java, Enumerators


#Lessons Learned# BlackjackProject
The best thing I learned is what are the actual actions a class would take in the real world in the form of their methods. I also learned the difficulties of getting protected items, primarily when they don't belong in the same package. Additionally, this further strengthened my understanding of global variables in a class and how to interact with them. I really enjoyed figuring out the the logic of the game how and to incorporate each steps together. 