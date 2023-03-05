package com.myProject.databaseManager.DomainLayer;

import java.util.List;

public interface PositionsDaoInterface {
    void addPosition(Positions position);
    Positions getPositionById(int id);
    List<Positions> getAllPositions();
    void updatePosition(Positions position);
    void deletePosition(String name);
    void deletePosition(int id);
}
