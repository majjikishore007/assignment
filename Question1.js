function getBinaryToInt(num){
    let index = 0;

    let ans = 0;

    while (num != 0) {
        ans += (num % 10) * parseInt((Math.pow(2, index)));
        num = num / 10;
        index = index + 1;
    }
    return ans;
}

function isPrime(num) {
    if (num % 2 == 0) {
        return false;
    }
    for (let i = 3;i <= Math.sqrt(num);i++) {
        if (num%i== 0) {
            return false;
        }
    }
    return true;
}

function getPrimeFromAtoB(a, b) {
    let ans=[]
    let x = parseInt(getBinaryToInt(a));
    let y = parseInt(getBinaryToInt(b));
    console.log("a and b",x ,"----",y );
    for (let i = x; i <= y; i++) {
        if (isPrime(i)) {
            ans.push(i);
        }
    }
    console.log(ans);   
}

getPrimeFromAtoB(101, 11111);
