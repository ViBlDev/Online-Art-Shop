/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myexpoonline.store.core.entity;

/**
 *
 * @author Administrateur
 */
public class Work {
    
    public static int lastId; 
// lastId appartient à la classe
// il n'appartient pas aux objets créés à partir de la classe

// a chaque création objet lastId +1

// -> permet d'avoir un suivi des id créé
// a chaque création d'une oeuvre lastId va être incrémenter de 1
// récupérable pour connaitre l'id à setter pour mon nouvel objet
    
    private int id;
    private String title;
    private Author author;
    private int year;
    private String style;
    private String description;
    
    public Work(){
    
    }
    
        public Work(String title){
        this.title=title;
        lastId++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
