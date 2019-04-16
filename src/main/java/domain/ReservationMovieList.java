package domain;

import java.util.ArrayList;
import java.util.List;

import static domain.Movie.NEW_LINE;

public class ReservationMovieList {
    private static final String RESERVATION_HISTORY = "예약 내역";
    private List<ReservationMovie> reservationMovieList;

    private ReservationMovieList() {
        this.reservationMovieList = new ArrayList<>();
    }

    private static class ReservationMovieListHolder {
        public static final ReservationMovieList RESERVATION_MOVIE_LIST = new ReservationMovieList();
    }

    public static ReservationMovieList getInstance() {
        return ReservationMovieListHolder.RESERVATION_MOVIE_LIST;
    }

    public void addReservationMovie(ReservationMovie reservationMovie) {
        reservationMovieList.add(reservationMovie);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ReservationMovie reservationMovie : reservationMovieList) {
            sb.append(reservationMovie);
        }
        return RESERVATION_HISTORY + NEW_LINE + sb.toString();
    }
}
