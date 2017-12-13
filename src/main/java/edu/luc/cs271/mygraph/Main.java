package edu.luc.cs271.mygraph;

import java.util.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.RandomWalkIterator;

public class Main {

  public static void main(final String[] args) {

    final String argentina = countryCodes.RA;
    final String bolivia = countryCodes.BO;
    final String brazil = countryCodes.BR;
    final String colombia = countryCodes.CO;
    final String frenchGuiana = countryCodes.GF;
    final String guyana = countryCodes.GY;
    final String paraguay = countryCodes.PY;
    final String peru = countryCodes.PE;
    final String suriname = countryCodes.SR;
    final String uruguay = countryCodes.UY;
    final String venezuela = countryCodes.VE;

    final Graph<String, DefaultEdge> brMap = new SimpleGraph<>(DefaultEdge.class);
    // Vertex adding
    brMap.addVertex(argentina);
    brMap.addVertex(bolivia);
    brMap.addVertex(brazil);
    brMap.addVertex(colombia);
    brMap.addVertex(frenchGuiana);
    brMap.addVertex(guyana);
    brMap.addVertex(paraguay);
    brMap.addVertex(peru);
    brMap.addVertex(suriname);
    brMap.addVertex(uruguay);
    brMap.addVertex(venezuela);

    // Brazil borders
    brMap.addEdge(countryCodes.BR, countryCodes.RA);
    brMap.addEdge(brazil, argentina);
    brMap.addEdge(brazil, bolivia);
    brMap.addEdge(brazil, colombia);
    brMap.addEdge(brazil, frenchGuiana);
    brMap.addEdge(brazil, guyana);
    brMap.addEdge(brazil, paraguay);
    brMap.addEdge(brazil, peru);
    brMap.addEdge(brazil, suriname);
    brMap.addEdge(brazil, uruguay);
    brMap.addEdge(brazil, venezuela);

    // other borders
    brMap.addEdge(argentina, bolivia);
    brMap.addEdge(argentina, paraguay);
    brMap.addEdge(argentina, uruguay);
    brMap.addEdge(bolivia, paraguay);
    brMap.addEdge(bolivia, peru);
    brMap.addEdge(colombia, peru);
    brMap.addEdge(colombia, venezuela);
    brMap.addEdge(frenchGuiana, suriname);
    brMap.addEdge(guyana, suriname);
    brMap.addEdge(guyana, venezuela);

    System.out.println(brMap);

    final Iterator<String> breadthFirst = new BreadthFirstIterator<>(brMap, brazil);
    while (breadthFirst.hasNext()) {
      final String country = breadthFirst.next();
      System.out.println(country);
    }

    final Iterator<String> closestFirst = new ClosestFirstIterator<>(brMap, brazil);
    while (closestFirst.hasNext()) {
      final String country = closestFirst.next();
      System.out.println(country);
    }

    final Iterator<String> depthFirst = new DepthFirstIterator<>(brMap, brazil);
    while (depthFirst.hasNext()) {
      final String country = depthFirst.next();
      System.out.println(country);
    }

    //final Iterator<String> rw = new RandomWalkIterator<>(brMap, brazil);
    //while (rw.hasNext()) {
    //    final String country = rw.next();
    //    System.out.println(country);
    //  }

    GreedyColoring map = new GreedyColoring(brMap);

    System.out.println(map.getColoring());
  }
}
