package afterglowJar;
//AUTHOR: Jakob Endrestad Kielland (now with 100% more regret, after 500 lines of hard coded bullet patterns...)

public class BulletPattern {
	private int currentIndex;
	private int[][] bulletPattern =
			{		
					{0, 20}, 
					{0, 16}, 
					{0, 16}, 
					{1, 16}, 
					{3, 16}, 
					{2, 16}, 
					
					{0, 8}, 
					{2, 8}, 
					{0, 8}, 
					{2, 8}, 
					{0, 8}, 
					{2, 8}, 
					{1, 8}, 
					{3, 8}, 
					{1, 8}, 
					{3, 8}, 
					{1, 8}, 
					{3, 8}, 
					{1, 8}, 
					{3, 8}, 
					{1, 8}, 
					{3, 8}, 
					{1, 8}, 
					{3, 8}, 
					{2, 8}, 
					{2, 8}, 
					
					{0, 8}, 
					{0, 8},
					{0, 8},
					{3, 8},
					{1, 8},
					{3, 8},
					{0, 8},
					{1, 8},
					{2, 8},
					{3, 8},
					{0, 8},
					{1, 8},
					{2, 8},
					{1, 8},
					{3, 8},
					{1, 4}, {3, 4},
					{1, 8},
					{3, 8},
					{0, 8},
					{0, 8},
					{0, 8},
					{0, 8},
					{0, 8},
					{2, 8},
					{3, 4}, {1, 4},
					{3, 4}, {1, 4},
					{3, 4}, {1, 4},
					{3, 4}, {1, 4},
					{3, 4}, {1, 4},
					{3, 4}, {1, 4},
					{0, 4}, {3, 4},
					{2, 2}, {1, 2}, {0, 12},
					
					//ADRELANIE IS PUMPINNN 0:47
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					{0, 4}, {2, 4},
					{0, 4}, {2, 4},
					{0, 4}, {2, 4},
					{0, 4}, {2, 4},
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					{0, 4}, {2, 4},
					{0, 4}, {2, 4},
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 7}, 
					
					{3, 12}, 
					{1, 14},
					
					{3, 4}, {1, 4},
					{3, 18}, 
					
					
					{0, 4}, {2, 4}, //blockbuster
					{0, 30},
					
					
					{3, 4}, {2, 4}, //brain power
					{1, 32},
					
					{3, 4}, {1, 4},
					{3, 4}, {1, 10},
					{2, 4}, //coooo-
					{0, 34},//caineeee
					
					
					
					{3, 4}, {0, 4},//dont you
					{1, 2}, {2, 12},//try iiiit
					{3, 4}, {0, 4},//dont you 
					{1, 6}, {2, 24},//tryyy it
					
					{0, 2}, {0, 2}, {1, 4}, //ge-ne-ra-
					{2, 18},//tor
					
					{0, 4}, {0, 4},//killer
					{2, 2}, {2, 4},//machine
					
					{0, 4}, {3, 4},
					{0, 4}, {1, 4},
					{0, 4}, {3, 4},
					{0, 4}, {1, 4},//...theres
					{0, 4}, {3, 4},//no fate
					{0, 4}, {1, 4},
					{0, 4}, 
					
					{3, 4}, {0, 4}, //take con
					{1, 4}, {2, 20}, //tro-oll
				
					{3, 4}, {2, 4},//brain pow
					{1, 4}, {0, 26},//eee-eerrr
					
					//##############################################################################################################################################################//
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{3, 2}, {1, 2}, {3, 2}, {1, 4}, //A-I-A-A
					{3, 2}, {0, 2}, {1, 2}, //I-A-O
					
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{1, 2}, {0, 2}, {1, 2}, {0, 4}, //A-�-A-U-A-O
					
					{3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{1, 2}, {3, 2}, {1, 2}, {3, 4}, //A-O-A-E
					{1, 2}, {0, 2}, {3, 2}, //I-A-O
					
					{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{3, 2}, {2, 2}, {3, 2}, {2, 4}, //A-�-A-U-A-O
					//##############################################################################################################################################################//
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{3, 2}, {1, 2}, {3, 2}, {1, 4}, //A-I-A-A
					{3, 2}, {0, 2}, {1, 2}, //I-A-O
					
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{1, 2}, {0, 2}, {1, 2}, {0, 4}, //A-�-A-U-A-O
					
					{3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{1, 2}, {3, 2}, {1, 2}, {3, 4}, //A-O-A-E
					{1, 2}, {0, 2}, {3, 2}, //I-A-O
					
					{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{3, 2}, {2, 2}, {3, 2}, {2, 4}, //A-�-A-U-A-O
					//##############################################################################################################################################################//
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{3, 2}, {1, 2}, {3, 2}, {1, 4}, //A-I-A-A
					{3, 2}, {0, 2}, {1, 2}, //I-A-O
					
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{1, 2}, {0, 2}, {1, 2}, {0, 4}, //A-�-A-U-A-O
					
					{3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{1, 2}, {3, 2}, {1, 2}, {3, 4}, //A-O-A-E
					{1, 2}, {0, 2}, {3, 2}, //I-A-O
					
					{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{0, 2}, {0, 2}, {3, 2}, {3, 2}, 
					{2, 2}, {2, 2}, {1, 2}, {1, 2}, 
					//##############################################################################################################################################################//
					{0, 8},
					{0, 8},
					{0, 8},
					{0, 8},
					{0, 8},
					{0, 8},
					{0, 8},
					{0, 8},
					
					{0, 8},
					{0, 8},
					{0, 8},
					{0, 8},
					{0, 4}, {0, 4}, 
					{0, 4}, {0, 2}, {0, 2}, 
					{0, 4}, {0, 6}, 
					{0, 10}, 
					
					{1, 4}, {3, 4}, //ADRENALINE IS PUMPINNGGGG
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					{0, 4}, {2, 4},
					{0, 4}, {2, 4},
					{0, 4}, {2, 4},
					{0, 4}, {2, 4},
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					{0, 4}, {2, 4},
					{0, 4}, {2, 4},
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 7}, 
					
					{3, 4}, {0, 4}, {2, 4}, //atomic  
					{1, 4}, {0, 4}, {2, 6},
					
					{3, 4}, {1, 4}, //overdrive
					{3, 4}, 
					
					{1, 2}, {2, 2}, 
					{1, 2}, {2, 2}, 
					{1, 2}, {2, 4}, 
					
					
					{0, 4}, {2, 4}, //blockbuster
					{0, 8},
					
					{2, 2}, {3, 2}, 
					{2, 2}, {3, 2}, 
					{2, 2}, {3, 2}, 
					{2, 2}, {3, 2}, 
					{2, 2}, {3, 4}, 
					
					{3, 4}, {2, 4}, //brain power
					{1, 4},
					
					{3, 4}, {1, 4},
					{3, 4}, {1, 4},
					{2, 4}, {0, 4}, {2, 4},
					
					{3, 4}, {1, 4}, //call me
					{3, 4}, {1, 10}, //lea-der
					{2, 4}, //coooo-
					{0, 10},//caineeee
					
					{2, 8},
					{0, 8},
					{2, 8},
					
					{3, 4}, {0, 4},//dont you
					{1, 2}, {2, 12},//try iiiit
					{3, 4}, {0, 4},//dont you 
					{1, 6}, {2, 24},//tryyy it
					
					{0, 2}, {0, 2}, {1, 4}, //ge-ne-ra-
					{2, 6},//tor
					
					{3, 2}, {0, 2}, {3, 2}, {0, 2}, 
					{3, 2}, {0, 2}, 
					
					{0, 4}, {0, 4},//killer
					{2, 2}, {2, 4},//machine
					
					{0, 4}, {3, 4},
					{0, 4}, {1, 4},
					{0, 4}, {3, 4},
					{0, 4}, {1, 4},//...theres
					{0, 4}, {3, 4},//no fate
					{0, 4}, {1, 4},
					{0, 4}, 
					
					{3, 4}, {0, 4}, //take con
					{1, 4}, {2, 20}, //tro-oll
				
					{3, 4}, {2, 4},//brain pow
					{1, 4}, {0, 26},//eee-eerrr
					
					//##############################################################################################################################################################//
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{3, 2}, {1, 2}, {3, 2}, {1, 4}, //A-I-A-A
					{3, 2}, {0, 2}, {1, 2}, //I-A-O
					
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{1, 2}, {0, 2}, {1, 2}, {0, 4}, //A-�-A-U-A-O
					
					{3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{1, 2}, {3, 2}, {1, 2}, {3, 4}, //A-O-A-E
					{1, 2}, {0, 2}, {3, 2}, //I-A-O
					
					{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{3, 2}, {2, 2}, {3, 2}, {2, 4}, //A-�-A-U-A-O
					//##############################################################################################################################################################//
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{3, 2}, {1, 2}, {3, 2}, {1, 4}, //A-I-A-A
					{3, 2}, {0, 2}, {1, 2}, //I-A-O
					
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{1, 2}, {0, 2}, {1, 2}, {0, 4}, //A-�-A-U-A-O
					
					{3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{1, 2}, {3, 2}, {1, 2}, {3, 4}, //A-O-A-E
					{1, 2}, {0, 2}, {3, 2}, //I-A-O
					
					{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{3, 2}, {2, 2}, {3, 2}, {2, 4}, //A-�-A-U-A-O
					//##############################################################################################################################################################//
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{3, 2}, {1, 2}, {3, 2}, {1, 4}, //A-I-A-A
					{3, 2}, {0, 2}, {1, 2}, //I-A-O
					
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{1, 2}, {0, 2}, {1, 2}, {0, 4}, //A-�-A-U-A-O
					
					{3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{1, 2}, {3, 2}, {1, 2}, {3, 4}, //A-O-A-E
					{1, 2}, {0, 2}, {3, 2}, //I-A-O
					
					{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{0, 2}, {0, 2}, {3, 2}, {3, 2}, 
					{2, 2}, {2, 2}, {1, 2}, {1, 2}, 
					//##############################################################################################################################################################//
					{0, 2}, {0, 2}, {0, 2}, {0, 2},
					{0, 2}, {0, 2}, {0, 2}, {0, 2},
					
					{0, 2}, {0, 2}, {0, 2}, {0, 2},
					{0, 2}, {0, 2}, {0, 2}, {0, 2},
					
					{1, 4}, {3, 4}, 
					{1, 4}, {3, 4},
					
					{1, 4}, {3, 4},
					{1, 4}, {0, 4},
					
					{1, 4}, {2, 4},
					{1, 4}, {3, 4},
					
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					
					{2, 2}, {2, 2}, {2, 2}, {2, 2},
					{2, 2}, {2, 2}, {2, 2}, {2, 2},
					
					{2, 4}, {1, 2}, {0, 2}, {3, 2}, {2, 2}, 
					{1, 4}, {0, 2}, {3, 2}, {2, 2}, {1, 2}, 
					{0, 4}, {3, 2}, {2, 2}, {1, 2}, {0, 2}, 
					{3, 4}, {2, 2}, {1, 2}, {0, 2}, {3, 2}, 
					{2, 4}, {2, 4},
					{3, 4}, {0, 2}, {1, 2},
					{2, 2}, {3, 2}, {0, 2}, {1, 4},
					
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					
					{2, 8}, 
					{0, 8},
					{2, 8}, 
					{0, 8},
					{2, 8}, 
					{0, 8},
					{2, 8}, 
					{0, 16},
					
					{1, 4}, {2, 4},
					{3, 4}, {0, 4},
					{0, 4}, {3, 4},
					{2, 4}, {1, 4},
					
					{1, 4}, {2, 4},
					{3, 4}, {0, 4},
					{0, 4}, {3, 4},
					{2, 4}, {1, 4},
					
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 2},
					{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 2},
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 2}, 
					{3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 10}, 
					
					{1, 4}, {3, 4}, 
					{1, 2}, {3, 2}, {1, 2}, {3, 2}, 
					
					{1, 4}, {3, 4}, 
					{1, 2}, {3, 2}, {1, 2}, {3, 2}, 
					
					{1, 4}, {3, 4}, 
					{1, 4}, {3, 4},
					
					{1, 4}, {3, 4},
					{1, 4}, {0, 4},
					
					{1, 4}, {2, 4},
					{1, 4}, {3, 4},
					
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					
					{0, 1}, {0, 1}, {0, 1}, {0, 1},
					{1, 4},
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, 
					{3, 4},
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, 
					{1, 4},
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, 
					{3, 4},
					{2, 1}, {2, 1}, {2, 1}, {2, 1},
					{1, 4},
					{0, 1}, {0, 1}, {0, 1}, {0, 1},
					{3, 4},
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, 
					{1, 4},
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, 
					{3, 4},
					
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					
					{1, 4}, {3, 4},
					{1, 4}, {3, 4},
					
					{3, 4}, {0, 4},
					{1, 4}, {2, 4},
					{3, 4}, {0, 4},
					{1, 4}, {2, 4},

					
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					
					{0, 4}, {2, 2}, {2, 2}, 
					{0, 4}, {2, 2}, {2, 2},
					{0, 4}, {2, 2}, {2, 2},
					{0, 4}, {2, 2}, {2, 2},
					
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 2},
					{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 2},
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 2}, 
					{3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 10}, 
					
					{2, 4}, {2, 4}, 
					{0, 8},
					{2, 4}, {2, 4}, 
					{0, 8},
					{1, 4}, {1, 4}, 
					{0, 8},
					{1, 4}, {1, 4}, 
					{0, 8},
					{3, 4}, {3, 4}, 
					{0, 8},
					{3, 4}, {3, 4}, 
					
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					{0, 4}, {3, 4}, 
					{0, 4}, {1, 4}, 
					
					{0, 1},
					{0, 2},
					{0, 3},
					{0, 4},
					{0, 5},
					{0, 6},
					{0, 7},
					
					//##############################################################################################################################################################//
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{3, 2}, {1, 2}, {3, 2}, {1, 4}, //A-I-A-A
					{3, 2}, {0, 2}, {1, 2}, //I-A-O
					
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{1, 2}, {0, 2}, {1, 2}, {0, 4}, //A-�-A-U-A-O
					
					{3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{1, 2}, {3, 2}, {1, 2}, {3, 4}, //A-O-A-E
					{1, 2}, {0, 2}, {3, 2}, //I-A-O
					
					{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{3, 2}, {2, 2}, {3, 2}, {2, 4}, //A-�-A-U-A-O
					//##############################################################################################################################################################//
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{3, 2}, {1, 2}, {3, 2}, {1, 4}, //A-I-A-A
					{3, 2}, {0, 2}, {1, 2}, //I-A-O
					
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{1, 2}, {0, 2}, {1, 2}, {0, 4}, //A-�-A-U-A-O
					
					{3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{1, 2}, {3, 2}, {1, 2}, {3, 4}, //A-O-A-E
					{1, 2}, {0, 2}, {3, 2}, //I-A-O
					
					{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{3, 2}, {2, 2}, {3, 2}, {2, 4}, //A-�-A-U-A-O
					//##############################################################################################################################################################//
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{3, 2}, {1, 2}, {3, 2}, {1, 4}, //A-I-A-A
					{3, 2}, {0, 2}, {1, 2}, //I-A-O
					
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{1, 2}, {0, 2}, {1, 2}, {0, 4}, //A-�-A-U-A-O
					
					{3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{1, 2}, {3, 2}, {1, 2}, {3, 4}, //A-O-A-E
					{1, 2}, {0, 2}, {3, 2}, //I-A-O
					
					{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{0, 2}, {0, 2}, {3, 2}, {3, 2}, 
					{2, 2}, {2, 2}, {1, 2}, {1, 2}, 
					//##############################################################################################################################################################//
					{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{3, 2}, {1, 2}, {3, 2}, {1, 4}, //A-I-A-A
					{3, 2}, {0, 2}, {1, 2}, //I-A-O
					
					{2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 1}, {2, 5}, //O-o-O-o-O-o-O-o-O-o-O-o-O-o-O-o-
					{1, 2}, {0, 2}, {1, 2}, {0, 4}, //A-�-A-U-A-O
					
					{3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 1}, {3, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{1, 2}, {3, 2}, {1, 2}, {3, 4}, //A-O-A-E
					{1, 2}, {0, 2}, {3, 2}, //I-A-O
					
					{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 5}, //�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-�-
					{0, 2}, {0, 2}, {3, 2}, {3, 2}, {2, 2}, {2, 2}, {1, 2}, {1, 2},
					{0, 2}, {0, 2}, {0, 2}, {0, 2}, 
					{0, 2}, {0, 2}, {0, 2}, {0, 2}, {0, 2}, {0, 2}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}, {0, 8}, {0, 9}, {0, 10}, {0, 11}, {5, 1}
					//##############################################################################################################################################################//
					
			};
	
	public BulletPattern() {
		currentIndex = 0;
	}
	
	public int[] getNextBullet() {
		if (currentIndex >= 1494) {
			throw new IllegalArgumentException("Bullet pattern har blitt forbig�tt!");
		}
		int[] result = bulletPattern[currentIndex];
		currentIndex++;
		return result;
	}
}
