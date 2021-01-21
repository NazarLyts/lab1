package com.company;

import com.company.Commands.*;

public class Develop {
    Command _CreateNewNecklace;
    Command _CreateNewStone;
    Command _ListOfStones;
    Command _OverallWeightInCarats;
    Command _OverallValueInPrice;
    Command _SortStonesByValue;
    Command _SortStonesByWeight;
    Command _TransparencyRange;

    public Develop(Command CreateNewNecklace, Command CreateNewStone,
                   Command ListOfStones,
                   Command OverallWeightInCarats, Command OverallValueInPrice,
                   Command SortStonesByValue,
                   Command SortStonesByWeight,
                   Command TransparencyRange
    ) {
        this._CreateNewNecklace = CreateNewNecklace;
        this._CreateNewStone = CreateNewStone;
        this._ListOfStones = ListOfStones;
        this._OverallWeightInCarats = OverallWeightInCarats;
        this._OverallValueInPrice = OverallValueInPrice;
        this._SortStonesByValue = SortStonesByValue;
        this._SortStonesByWeight = SortStonesByWeight;
        this._TransparencyRange = TransparencyRange;

    }

    public void CreateNewNecklace() {
        this._CreateNewNecklace.execute();
    }

    public void CreateNewStone() {
        this._CreateNewStone.execute();
    }

    public void ListOfStones() {
        this._ListOfStones.execute();
    }

    public void OverallWeightInCarats() {
        this._OverallWeightInCarats.execute();
    }

    public void OverallValueInPrice() {
        this._OverallValueInPrice.execute();
    }

    public void SortStonesByValue() {
        this._SortStonesByValue.execute();
    }

    public void SortStonesByWeight() {
        this._SortStonesByWeight.execute();
    }

    public void TransparencyRange() {
        this._TransparencyRange.execute();
    }
}

