package ru.kharina.study.task14;

/*
Интерфейс: сущность, которую можно отправить по почте.
У такой сущности можно получить от кого и кому направляется письмо.
*/

public static interface Sendable {
    String getFrom();
    String getTo();
}

