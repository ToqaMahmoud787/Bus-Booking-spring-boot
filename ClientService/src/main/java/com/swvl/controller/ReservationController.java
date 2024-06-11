package com.swvl.controller;


import com.swvl.exception.ReservationException;
import com.swvl.model.Reservation;
import com.swvl.model.dto.ReservationDTO;
import com.swvl.service.reservationService.ReservationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/swvl")
public class ReservationController {
    @Autowired
    private ReservationService service;

    @PostMapping("/user/reservation/add")
    public ResponseEntity<Reservation> addReservation(@Valid @RequestBody ReservationDTO dto, @RequestParam(required = false) String key) throws ReservationException {
        Reservation reservation = service.addReservation(dto, key);

        return  new ResponseEntity<>(reservation, HttpStatus.CREATED);
    }

    @PutMapping("/user/reservation/update/{rid}")
    public ResponseEntity<Reservation> updateReservation(@Valid @RequestBody ReservationDTO dto, @RequestParam(required = false) String key, @PathVariable Integer rid) throws ReservationException{
        Reservation reservation = service.updateReservation(rid, dto, key);

        return  new ResponseEntity<>(reservation, HttpStatus.OK);
    }

    @DeleteMapping("/user/reservation/delete/{rid}")
    public ResponseEntity<Reservation> deleteReservation( @RequestParam(required = false) String key, @PathVariable Integer rid) throws ReservationException{
        Reservation reservation = service.deleteReservation(rid, key);

        return new ResponseEntity<>(reservation, HttpStatus.ACCEPTED);
    }

    @GetMapping("/reservation/{rid}")
    public ResponseEntity<Reservation> viewReservationById(@PathVariable Integer rid, @RequestParam(required = false) String key) throws ReservationException {
        Reservation reservation = service.viewReservation(rid, key);
        
        return new ResponseEntity<>(reservation, HttpStatus.FOUND);
    }

    @GetMapping("/reservation/all")
    public ResponseEntity<List<Reservation>> viewAllReservation(@RequestParam(required = false) String key) throws ReservationException {
        List<Reservation> reservations = service.getAllReservation(key);

        return new ResponseEntity<>(reservations, HttpStatus.FOUND);
    }

    @GetMapping("/user/reservation/{uid}")
    public ResponseEntity<List<Reservation>> viewReservationsByUserId(@PathVariable Integer uid, @RequestParam(required = false) String key) throws ReservationException{
        List<Reservation> reservations = service.viewReservationByUerId(uid, key);

        return  new ResponseEntity<>(reservations, HttpStatus.FOUND);
    }
}
