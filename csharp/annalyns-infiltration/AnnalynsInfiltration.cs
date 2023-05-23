using System;

static class QuestLogic
{
    /// <summary>
    /// Can fast attack can be made based on the state of the knight.
    /// </summary>
    public static bool CanFastAttack(bool knightIsAwake)
    {
        return !knightIsAwake;
    }

    /// <summary>
    /// Able to spy if the knight, archer and the prisoner, respectively, are awake.
    /// </summary>
    public static bool CanSpy(bool knightIsAwake, bool archerIsAwake, bool prisonerIsAwake)
    {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    /// <summary>
    /// Prisoner can be signalled, based on the state of the two characters.
    /// </summary>
    public static bool CanSignalPrisoner(bool archerIsAwake, bool prisonerIsAwake)
    {
        return !archerIsAwake && prisonerIsAwake;
    }

    /// <summary>
    /// If the first three parameters indicate if the knight, archer and the prisoner, respectively, are awake.
    /// The last parameter indicates if Annalyn's pet dog is present. The method returns true if the prisoner can be
    /// freed based on the state of the three characters and Annalyn's pet dog presence. Otherwise, it returns false:
    /// </summary>
    public static bool CanFreePrisoner(bool knightIsAwake, bool archerIsAwake, bool prisonerIsAwake, bool petDogIsPresent)
    {
        if (prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
		    return true;
	    }

	    if (!archerIsAwake && petDogIsPresent) {
		    return true;
	    }

	    return false;
    }
}
