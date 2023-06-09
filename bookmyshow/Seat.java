package com.software_design.bookmyshow;

import com.bookmyshow.SeatCategory;

public class Seat {

    int seatId;
    int row;
    SeatCategory seatCategory;

    public int getSeatId() {
        return seatId;
    }

    public int getRow() {
        return row;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }
}
