function calcula() {
    var peso = document.querySelector('#peso').value;
    if (peso != "") {
        //document.write('El peso de la sandía es: ' + peso);
        var parte1 = peso % 2;
        if (parte1 == 0) {
            document.querySelector('#respuesta').innerHTML = 'SI';
            document.write("Si se puede dividir en dos partes iguales");
            let par = peso / 2;
            document.write("<br/>Lo ideal Seria de " + par + " Kg; Cada una");



        } else {

            document.write("No se puede :(");
        }

    } else {
        alert("Debe escribir algún valor!")
    }
}