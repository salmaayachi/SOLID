package com.directi.training.ocp.exercice_refactored;

public interface Slot {
    public void markSlotFree();
    public void markSlotBusy();
    public int findFreeSlot();
}
