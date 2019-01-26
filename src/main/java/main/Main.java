package main;

import location.model.Location;
import task.model.Priority;
import task.model.Status;
import task.model.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Location location = new Location(1,"Lodz", "90-444", "Pomorska", "11");

        Task task = new Task(1, "Instalacja", "instalacja sprzetu u klienta", null, Status.OPEN,
                false, LocalDate.now(), null, null, Priority.LOW, location, null, null);

        Task task2 = new Task.TaskBuilder()
                .withId(2)
                .withTitle("Naprawa usterki")
                .withDueDate(LocalDate.now().plusDays(5))
                .withPriority(Priority.MEDIUM)
                .withSummry("Naprawa usterki")
                .withLocation(new Location(2,"Lodz", "90-440", "Pomorska", "9"))
                .withStatus(Status.OPEN)
                .withDone(false)
                .withCreateDate(LocalDate.now())
                .build();


    }
}
