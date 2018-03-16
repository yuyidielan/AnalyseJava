class Point{
    double x;
    double y;
}
class testArray{
    public static void main(String[] args){
        Point[] pts;
        pts=new Point[5];
        for(int i=0;i<pts.length;i++){
            pts[i]=new Point();
            pts[i].x=i;
            pts[i].y=i;
            System.out.println("第"+(i+1)+"个点的x坐标:"+pts[i].x);
        }
    }
}