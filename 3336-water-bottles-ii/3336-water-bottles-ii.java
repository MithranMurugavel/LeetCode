class Solution {
    public int maxBottlesDrunk(int numbottles, int numExchange) {
        
        if(numbottles<numExchange){
            return numbottles;
        }
        else if(numbottles == numExchange) return numbottles+1;
        int totalbottle=0;
        int fullbottle = numbottles;
        int empty = 0;
        while(empty+fullbottle >= numExchange){

            totalbottle+=fullbottle;
            empty+=fullbottle;
            if(numExchange<= empty){
                fullbottle=1;
                empty-=numExchange;
                numExchange++;
            }
        }


        return totalbottle+1;
    }
}