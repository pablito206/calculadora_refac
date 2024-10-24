function suma(num1,num2){
    suma = num1 + num2
    return suma
}
function resta(num1,num2){
    resta = num1 - num2
    return resta
}
function multiplicacion(num1,num2){
    multiplicacion = num1 * num2
    return multiplicacion
}
function division(num1,num2){
    if(num2 == 0){
        throw new Error("No se puede divir entre 0")
    }
    else{
        division= num1 / num2
    }
}
function potencias(num1,num2){
    potencias= Math.pow(num1,num2)
    return 
}
function factorial(num0){
    
        if (num0 < 0) {
            throw new Error("El factorial no está definido para números negativos.");
        }
        let resultado = 1;
        for (let i = 1; i <= num0; i++) {
            resultado *= i;
        }
        return resultado;
}
function menu(num1,num2){
    "Seleccione una opción: "
    "1. Suma"
    "2. Resta"
    "3. Multiplicación"
    "4. División entera"
    "5. Potencias"
    "6. Factorial"
    "0. Salir"
}

function calculadora(){
    let opcion
    do{
        opcion = parseInt(prompt("Seleccione una opción:\n1. Suma\n2. Resta\n3. Multiplicación\n4. División entera\n5. Potencias\n6. Factorial\n0. Salir"))

        try{
        if(opcion == 0){
            console.log("Estas saliendo del menu. Good Bye")
            break 

        }
        else if(opcion >= 1 && opcion <=6){
            num1= parseFloat(prompt("Dime un numero"))
            num2 = parseFloat(prompt("Dime otro numero")) 
        }
        switch(opcion){
            case 1:
                resultado = suma(num1,num2)
                console.log("La suma de"+num1+ "y" +num2+ "es: " +resultado)
        }
        }catch(error) {
            alert("Error: " + error.message);

        }
    }while (opcion !== 0);

}

calculadora()
