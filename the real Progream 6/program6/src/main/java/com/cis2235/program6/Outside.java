package com.cis2235.program6;

public class Outside extends Location
{
    private boolean hot;

    public Outside (String name, boolean hot)
    {
        this.name = name;
        this.hot = hot;
    }

    @Override
    public String getDescription() {

        //varables
        String hotVar = "";
        if (hot)
        {
            hotVar = "its very hot outside";
        }

        description = "You are standing in the " + name +
               hotVar
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
