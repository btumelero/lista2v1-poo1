/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introoop;

/**
 *
 * @author bruno.191196
 */
class Triangulo {
  double altura, largura, x, y;
  int z=0;
  
  double hipotenusa() {
    double hipotenusa;
    hipotenusa = altura*altura+largura*largura;
    hipotenusa = Math.sqrt(hipotenusa);
    return hipotenusa;
  }
  
  double perimetro() {
    double hipotenusa;
    hipotenusa = altura*altura+largura*largura;
    hipotenusa = Math.sqrt(hipotenusa);
    return hipotenusa+altura+largura;
  }
  
  double area() {
    return altura*largura/2.0;
  }
  
  Triangulo(double altura, double largura, double x, double y) {
    this.altura = altura;
    this.largura = largura;
    this.x = x;
    this.y = y;
  }
}
