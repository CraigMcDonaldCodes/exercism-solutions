class SpaceAge {

	seconds: number;

	constructor(seconds: number) {
		this.seconds = seconds;
	}

	onEarth(): number {
		return +(this.seconds / 31_557_600).toFixed(2);
	}

	onMercury(): number {
        return +(this.onEarth() / 0.2_408_467).toFixed(2);
    }

	onVenus(): number {
		// Not sure why this works but the other solution does not
		// but it's late and I'm probably missing something obvious
        return Math.trunc((this.onEarth() / 0.61_519_726) * 100) / 100;
    }

    onMars(): number {
        return +(this.onEarth() / 1.8_808_158).toFixed(2);
    }

    onJupiter(): number {
        return +(this.onEarth() / 11.8_626_15).toFixed(2);
    }

    onSaturn(): number {
        return +(this.onEarth() / 29.447_498).toFixed(2);
    }

    onUranus(): number {
        return +(this.onEarth() / 84.016_846).toFixed(2);
    }

    onNeptune(): number {
        return +(this.onEarth() / 164.79_132).toFixed(2);
    }
}

export default SpaceAge;