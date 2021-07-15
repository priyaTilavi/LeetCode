package graph;

import java.util.LinkedList;

public class Vertex {
    private String name;
    private LinkedList<Vertex> neighbors;
    private boolean visited;
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    Vertex(String name){
        this.name =name;
        this.neighbors = new LinkedList<>();
    }
    Vertex(String name, int value){
        this.name =name;
        this.neighbors = new LinkedList<>();
        this.value = value;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Vertex> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Vertex v) {
        this.neighbors.add(v);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
