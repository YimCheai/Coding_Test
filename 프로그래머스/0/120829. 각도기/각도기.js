function solution(angle) {
    let answer = 0;
    if (angle > 0 && 90>angle){
        return 1;
    }
    else if (angle == 90){
        return 2;
    }
    else if(angle > 90 && 180>angle){
        return 3;
    }
    else if (angle == 180){
        return 4;
    }
    
    return answer;
}