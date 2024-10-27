package com.cis2235.program6;


//
public class Room extends Location
{
    private String decortion;

    public Room (String name, String decortion)
    {
        this.decortion = decortion;
        this.name = name;
    }

    @Override
    public String getDescription()
    {

        description = "You are standing in the " + name +
                " you see " + decortion
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
