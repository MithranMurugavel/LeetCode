/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let arr = [1,5,10,50,100,500,1000];
    let rom = ['I','V','X','L','C','D','M'];
    let val = 0;
    for(let i=0;i<s.length;i++){
        let curr = arr[rom.indexOf(s.charAt(i))];

        if(i < s.length-1 && curr < arr[rom.indexOf(s.charAt(i+1))]){
            val -= curr;
        }
        else{
            val += curr;
        }
    }

    return val;

};