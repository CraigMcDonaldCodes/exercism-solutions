using System;
using System.Collections.Generic;

public enum Allergen
{
    Eggs = 1,
    Peanuts = 2,
    Shellfish = 4,
    Strawberries = 8,
    Tomatoes = 16,
    Chocolate = 32,
    Pollen = 64,
    Cats = 128
}

public class Allergies
{
    private int mask;

    public Allergies(int mask)
    {
        this.mask = mask;
    }

    public bool IsAllergicTo(Allergen allergen)
    {
        int enumInt = (int) allergen;
        return (mask & enumInt) == enumInt;
    }

    public Allergen[] List()
    {
        var allergicTo = new List<Allergen>();

        foreach (var allergy in Enum.GetValues(typeof(Allergen)))
        {
            int value = (int) allergy;

            if ((mask & value) == value) { allergicTo.Add((Allergen)allergy); }
        }

        return allergicTo.ToArray();
    }
}