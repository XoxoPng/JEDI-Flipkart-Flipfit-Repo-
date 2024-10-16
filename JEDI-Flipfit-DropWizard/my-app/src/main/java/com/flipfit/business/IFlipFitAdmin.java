package com.flipfit.business;

import com.flipfit.model.*;

import java.util.List;

public interface IFlipFitAdmin {
    public boolean adminLogin(FlipFitAdmin flipFitAdmin);
    public List<FlipFitGymOwner> getPendingOwnerList();
    public List<FlipFitGymOwner> getApprovedOwnerList();
    public List<FlipFitGymCustomer> getUserList();
    public List<FlipFitGymCentre> getGymCentreUsingOwnerId(int ownerId);
    public boolean validateOwner(int ownerId);
    public boolean deleteOwner(int ownerId);
}