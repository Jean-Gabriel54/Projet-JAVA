package controller;

public class CollisionManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
  
		bool Collision(AABB box1,AABB box2)
		{
		   if((box2.x >= box1.x + box1.w)      // trop à droite
			|| (box2.x + box2.w <= box1.x) // trop à gauche
			|| (box2.y >= box1.y + box1.h) // trop en bas
			|| (box2.y + box2.h <= box1.y))  // trop en haut
		          return false; 
		   else
		          return true; 
		}
	}



