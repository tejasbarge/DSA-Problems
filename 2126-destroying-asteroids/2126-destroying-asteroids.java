class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long massl=mass;
        for(int i=0;i<asteroids.length;i++){
            if(massl<asteroids[i]){
                return false;
            }else{
                massl+=asteroids[i];
            }
        }
        return true;
    }
}