pub struct Player {
    pub health: u32,
    pub mana: Option<u32>,
    pub level: u32,
}

impl Player {
    pub fn revive(&self) -> Option<Player> {
        if self.health <= 0 {
            let mut p = Player {
                health: 100,
                mana: None,
                level: self.level,
            };

            if self.level >= 10 {
                p.mana = Some(100);
            }

            Some(p)
        } else {
            None
        }
    }

    pub fn cast_spell(&mut self, mana_cost: u32) -> u32 {
        let mut damage = 0u32;

        match self.mana {
            Some(mana) => {
                if mana >= mana_cost {
                    self.mana = Some(mana - mana_cost);
                    damage = mana_cost * 2;
                }
            }
            None => {
                if mana_cost > self.health {
                    self.health = 0;
                } else {
                    self.health -= mana_cost;
                }
            }
        }

        damage
    }
}
