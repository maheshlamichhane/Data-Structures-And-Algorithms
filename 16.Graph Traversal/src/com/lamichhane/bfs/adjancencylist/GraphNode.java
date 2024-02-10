package com.lamichhane.bfs.adjancencylist;

import java.util.ArrayList;

public class GraphNode {

	public String name;
	public int index;
	
	public ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
	public boolean isVisited=false;
	
	
	public GraphNode(String name,int index) {
		this.name = name;
		this.index = index;
	}
}
