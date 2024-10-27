//stewart martin
// smartin91@cnm.edu
//location class
package com.cis2235.program6;


// class location
// take directicly from the program specs
public class Location {
    private String name;
    private String description;

    public Location(String name){
        this.name = name;
    }

    public Location[] exits;    //exits is an array of Locations that this location connects to

    public String getName(){
        return name;
    }

    public String getDescription(){
        description = "You are standing in the " + name
                + ".  \r\nYou see exits to the following places: ";

        for(int i = 0; i < exits.length; i++)
        {
            description += "\r\n " + exits[i].getName();
            if( i!= exits.length - 1)
                description += ",";
        }
        description += ".\r\n";
        return description;
    }

}

