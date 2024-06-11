package com.swvl.service.busService;

import com.swvl.exception.AdminException;
import com.swvl.exception.BusException;
import com.swvl.model.Bus;

import java.util.List;

public interface BusService {
    //admin methods
    public Bus addBus(Bus bus, String key) throws BusException , AdminException;
    public Bus updateBus(Bus bus, String key) throws BusException, AdminException;
    public Bus deleteBus(Integer busId, String key) throws BusException, AdminException;

    //admin + user methods
    public Bus viewBus(Integer busId) throws BusException;
    public List<Bus> viewBusByBusType(String busType) throws BusException;
    public List<Bus> viewAllBuses() throws BusException;
}
