/**
 * Created by johan on 2017-02-10.
 */

function PrintStuff(myDocuments) {
   this.documents = myDocuments
}
PrintStuff.prototype.print = function(){
   console.log(this.documents);
}

var newObj = new PrintStuff("I am a new Object and i can print.")
newObj.print();
