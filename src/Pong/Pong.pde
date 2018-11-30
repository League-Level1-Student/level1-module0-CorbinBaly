void setup(){
  size(500,500);
 
}
int x=1;
int y=450;

void draw(){
background(0,0,0);
fill(255,255,255);
boolean right = true;
boolean left = false;
if(x==1){
  boolean right = true;
}
if(x==499){
 boolean left= true;
 boolean right=false;
} 
if(left==true){
 x=x-3; 
  
}
if(right==true){
 x=x+3; 
}
stroke(0,0,0);
ellipse(x,y,50,50);

}