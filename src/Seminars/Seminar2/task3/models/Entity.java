package Seminars.Seminar2.task3.models;


import Seminars.Seminar2.task3.Column;

import java.util.UUID;

@Seminars.Seminar2.task3.Entity
public class Entity {

    @Column(name = "id", primaryKey = true)
    private UUID id;

}
