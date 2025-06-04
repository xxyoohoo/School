#include <bits/stdc++.h>
using namespace std;
int main()
{
    cout << "1: La Ville & Les Directions\n" << "2: Les Adjectifs\n" << 
    map<int,map<string,string>> vocab =
    {
        {1,{
            {"l'avenue","avenue"}, {"faire le lit","make the bed"}, {"faire la vaisselle","wash the dishes"}, {"faire du shopping","go shopping"},
            {"faire la lessive","do the laundry"}, {"sortir la poubelle","take out the trash"}, {"laver la voiture","wash the car"}, {"promener le chien","walk the dog"},
            {"tout droit","straight ahead"}, {"à gauche","to the left"}, {"à droite","to the right"}}},
        {2,{
            {"impatient","impatient"}, {"sympathique","nice"}, {"petit","small"}, {"confortable","comfortable"}, {"beau","handsome"},
            {"belle","beautiful"}, {"blond","blond"}, {"brun","brown-haired"}, {"stupide","stupid"}, {"délicieux","delicious"},
            {"amusant","funny"}, {"facile","easy"}, {"intelligent","smart"}, {"sportif","athletic"}, {"nouveau","new"},
            {"drôle","funny"}, {"joli","pretty"}, {"gros","fat/big"}, {"mince","thin"}, {"honnête","honest"},
            {"malhonnête","dishonest"}, {"patient","patient"}, {"ouvert","open"}, {"fermé","closed"}, {"difficile","difficult"}, {"grand","tall/big"}}},
        };
    return 0;
}
