function processData(input) {
    var newString = input.toLowerCase();
    var arr = [];
    for(var i = 0; i < newString.length; i++) {
        if(newString[i] != ' ' && arr.indexOf(newString[i]) === -1) {
            arr.push(newString[i]);
        }
    }

    if(arr.length === 26) {
        console.log('pangram');
    } else {
        console.log('not pangram');
    }
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
