package com.myProject.databaseManager.DataLayer;

import com.myProject.databaseManager.DomainLayer.PositionsDaoInterface;
import com.myProject.databaseManager.DomainLayer.Positions;

import java.util.List;

public class Position implements PositionsDaoInterface {
    @Override
    public void addPosition(Positions position) {

    }

    @Override
    public Positions getPositionById(int id) {
        return null;
    }

    @Override
    public List<Positions> getAllPositions() {
        return null;
    }

    @Override
    public void updatePosition(Positions position) {

    }

    @Override
    public void deletePosition(String name) {

    }

    @Override
    public void deletePosition(int id) {

    }
}
