pub struct Allergies {
    allergens: Vec<Allergen>,
}

#[derive(Clone, Debug, Hash, Eq, PartialEq)]
pub enum Allergen {
    Eggs,
    Peanuts,
    Shellfish,
    Strawberries,
    Tomatoes,
    Chocolate,
    Pollen,
    Cats,
}

impl Allergen {
    fn from(value: u32) -> Option<Self> {
        match value {
            1 => Some(Self::Eggs),
            2 => Some(Self::Peanuts),
            4 => Some(Self::Shellfish),
            8 => Some(Self::Strawberries),
            16 => Some(Self::Tomatoes),
            32 => Some(Self::Chocolate),
            64 => Some(Self::Pollen),
            128 => Some(Self::Cats),
            _ => None,
        }
    }
}

impl Allergies {
    pub fn new(score: u32) -> Self {
        let mut allergies = Allergies {
            allergens: Vec::new(),
        };

        for n in [1, 2, 4, 8, 16, 32, 64, 128] {
            if score & n == n {
                if let Some(value) = Allergen::from(n) {
                    allergies.allergens.push(value);
                }
            }
        }

        allergies
    }

    pub fn is_allergic_to(&self, allergen: &Allergen) -> bool {
        self.allergens.contains(allergen)
    }

    pub fn allergies(&self) -> Vec<Allergen> {
        self.allergens.clone()
    }
}
