#include <bits/stdc++.h>
using namespace std;
int main()
{
    cout << "Pick a category, and type the corresponding number:\n";
    cout <<"1: La Ville & Les Directions\n" << "2: Les Adjectifs\n" << "3: La Maison & Les Meubles\n" << 
    int choice;
    map<int,map<string,string>> vocab =
    {
        {1,{
            {"l\'avenue","avenue"}, {"faire le lit","make the bed"}, {"faire la vaisselle","wash the dishes"}, {"faire du shopping","go shopping"},
            {"faire la lessive","do the laundry"}, {"sortir la poubelle","take out the trash"}, {"laver la voiture","wash the car"}, {"promener le chien","walk the dog"},
            {"tout droit","straight ahead"}, {"à gauche","to the left"}, {"à droite","to the right"}}},
        {2,{
            {"impatient","impatient"}, {"sympathique","nice"}, {"petit","small"}, {"confortable","comfortable"}, {"beau","handsome"},
            {"belle","beautiful"}, {"blond","blond"}, {"brun","brown-haired"}, {"stupide","stupid"}, {"délicieux","delicious"},
            {"amusant","funny"}, {"facile","easy"}, {"intelligent","smart"}, {"sportif","athletic"}, {"nouveau","new"},
            {"drôle","funny"}, {"joli","pretty"}, {"gros","fat/big"}, {"mince","thin"}, {"honnête","honest"},
            {"malhonnête","dishonest"}, {"patient","patient"}, {"ouvert","open"}, {"fermé","closed"}, {"difficile","difficult"}, {"grand","tall/big"}}},
        {3,{
            {"un appartement","apartment"}, {"la chambre","bedroom"}, {"le jardin","yard"}, {"le salon","living room"}, {"la cuisine","kitchen"},
            {"la salle à manger","dining room"}, {"la salle de bains","bathroom"}, {"les toilettes","toilet"}, {"le garage","garage"}, {"le lit","bed"},
            {"l\'armoire","wardrobe"}, {"la table","table"}, {"le bureau","desk"}, {"la chaise","chair"}, {"le sofa","couch"}, {"le fauteuil","armchair"}}},
        {4,{
            {"un examen","an exam"}, {"un quiz","a quiz"}, {"un livre","a book"}, {"un stylo","a pen"}, {"un crayon","a pencil"},
            {"un sac à dos","a backpack"}, {"les devoirs","homework"}, {"l’horaire","schedule"}, {"le français","French"}, {"l’espagnol","Spanish"},
            {"l’italien","Italian"}, {"l’anglais","English"}, {"les mathématiques","Mathematics"}, {"l’informatique","Computer science"}, {"l’histoire","History"},
            {"l’EPS","Physical education"}, {"les sciences","Science"}}},
        {5,{
            {"Acheter", "to buy"}, {"Adorer", "to adore"}, {"Aider", "to help"}, {"Aimer", "to like/love"}, {"Arrêter", "to stop"},
            {"Danser", "to dance"}, {"Détester", "to hate"}, {"Donner", "to give"}, {"Écouter", "to listen"}, {"Étudier", "to study"},
            {"Gagner", "to win/earn"}, {"Habiter", "to live"}, {"Jouer", "to play"}, {"Manger", "to eat"}, {"Nager", "to swim"},
            {"Parler", "to speak"}, {"Porter", "to wear/carry"}, {"Préférer", "to prefer"}, {"Préparer", "to prepare"}, {"Regarder", "to watch/look at"},
            {"Tourner", "to turn"}, {"Travailler", "to work"}, {"Visiter", "to visit"}, {"Voyager", "to travel"}}},
        {6,{
            {"Finir", "to finish"}, {"Maigrir", "to lose weight"}, {"Punir", "to punish"}, {"Obéir", "to obey"}, {"Désobéir", "to disobey"}, {"Grandir", "to grow"}}},
        {7,{
            {"Attendre", "to wait"}, {"Entendre", "to hear"}, {"Perdre", "to lose"}, {"Vendre", "to sell"}, {"Répondre", "to answer"}}},
        {8,{
            {"Mes parents", "My parents"}, {"Mon ami", "My (male) friend"}, {"Mon amie", "My (female) friend"}, {"Mon frère", "My brother"}, {"Ma sœur", "My sister"},
            {"Mon chien", "My dog"}, {"Mon chat", "My cat"}, {"Mon animal domestique", "My pet"}, {"Mon animal de compagnie", "My companion animal"}}}
    };
    cout << "You picked: #" << choice << endl;
    if(guess=)
    return 0;
}
