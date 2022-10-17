package com.example.testing.model

import com.example.core.domain.model.Character

class CharacterFactory {

    fun create(hero: Hero) = when (hero) {
        Hero.ThreeDMan -> Character(
            "3-D Man",
            "imageUrl.jpg"
        )
        Hero.ABomb -> Character(
            "A-Bomb (HAS)",
            "imageUrl.jpg"
        )
    }

    sealed class Hero {
        object ThreeDMan : Hero()
        object ABomb : Hero()
    }
}