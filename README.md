# Jets Project

## Overview
This project is an assignment for the Skill Distillery FullStack Java Bootcamp focussing on Object Oriented Java programming.

The overall goal of this project was to review the 4 main pillars of Object Oriented programming by creating multiple classes that extend to a single class (Jet) while implementing different interfaces.


## Implementation
To meet the requirements of this specific project I started with my main class, Jet, and branched out into various smaller classes that would extend up to Jet, while implementing a "Combat" interface for planes used in combat missions, or a "NonCombat" interface for all others. Afterward I added a "JetImpl" class that would allow users to add their own jet to the program without being restrained by having to only add Combat jets or only adding NonCombat jets, with this class (and the pertinent methods) the user may  add either type to the fleet.

## Run Through
When the program is ran the user is welcomed and prompted to choose one of nine options.

* ListFleet-which will list the 5 starter jets in the fleet. This option will also update when the user adds or removes jets as they see fit
* Fly all jets-this presents all jets and calls their fly(); method, which will read off their top speed as they soar through the sky
* View Fastest-this uses basic arithmetic and variables to determine the fastest jet in the fleet, as with all other choices this will update based on user inputted data
* View Jet with longest range-as above, except instead of showing the fastest jet it will show the jet that can fly the longest without needing to refuel
* Load cargo jet-this will call the load(); function that the Cargo Jet has
* Dogfight!-this will call a special method that only the jets that have implemented the "Combat" interface have, including user inputed jets
* Add a jet to the fleet-allows the user to add objects to the fleet
* Remove a jet from the fleet-allows the user to remove jets from the fleet, including default Jets
* Leave the airstrip-this serves as an "exit" option and merely closes the loop displaying the menu, halting anymore user input

## Lessons Learned
This project helped solidify my understanding of the 4 pillars of Object Oriented Programming.
* Abstraction - Visualizing the airstrip and its occupants and translating those concepts into the Java language and individual classes
* Polymorphism - This was particularly clear when adding methods to child classes that would result in different output than when the same methods were called by the parent classes (typically the abstract Jet class)
* Inheritance - Using parent and child class relationships to reuse code instead of repeating methods and variable names over and over again, reducing redundancy
* Encapsulation - Usage of protected fields and methods and public methods (where applicable) to keep data and methods tied only to relevant places


## Technologies Used
* Java
* Eclipse

## Author
* Branden Bent
