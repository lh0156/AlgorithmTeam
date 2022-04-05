function solution(id) {
    var answer = step1(id);


    return answer;
}

function step1(id) {
    
    let small_Latter = true;
    let sentence = '';

    for (let i=0; i<id.length; ++i) {
        let ASCII_Code = id.charCodeAt(i);
        if (ASCII_Code < 64 || ASCII_Code > 90) {
            sentence += id.substring(i, i+1);
        }

        
    }

    console.log(sentence);
    

}


solution('asdjkfhsdfTajsd@');