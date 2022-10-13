package com.directi.training.ocp.exercice_refactored;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Slot resourceType)
    {
        int resourceId;
        resourceId = resourceType.markSlotFree(resourceId);
        resourceType.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(Slot resourceType, int resourceId)
    {
        resourceType.markSlotFree();
    }

}
