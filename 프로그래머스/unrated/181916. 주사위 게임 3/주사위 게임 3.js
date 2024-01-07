function solution(a, b, c, d) {
    if(a==b && a==c && a==d && b==c && b==d && c==d ){   //  네 주사위가 같을 경우
        return 1111*a;
    }else if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){ //  네 주사위가 다를 경우
        return (Math.min(a,Math.min(b,Math.min(c,d))));
    }else if((a==b && b==c && a==c) || (a==b && b==d && a==d) || // 세 주사위가 같을 경우
             (a==c && c==d && a==d) || (b==c && b==d && c==d)){
        if(a==b && b==c && a==c){
            return Math.pow((10*a+d),2);
        }else if(a==b && b==d && a==d){
            return Math.pow((10*a+c),2);
        }else if(a==c && c==d && a==d){
            return Math.pow((10*a+b),2);
        }else if(b==c && b==d && c==d){
            return Math.pow((10*b+a),2);
        }
    }else if((a==b && c==d)||(a==c && b==d)||(a==d && b==c)){  //  두개씩 같은 값일 경우
        if(a==b && c==d){
            return ((a+c)*Math.abs(a-c));
        }else if(a==c && b==d){
            return ((a+b)*Math.abs(a-b));
        }else if(a==d && b==c){
            return ((a+b)*Math.abs(a-b));
        }
    }else{
        if(a==b){
            return c*d;
        }else if(a==c){
            return b*d;
        }else if(a==d){
            return b*c;
        }else if(b==c){
            return a*d;
        }else if(b==d){
            return a*c;
        }else if(c==d){
            return a*b;
        }
    }  
}
    