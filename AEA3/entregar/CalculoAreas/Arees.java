package AEA3.entregar.CalculoAreas;
public class Arees {

  static double areaTriangle(double b, double h) {
    return (b * h) / 2;
  }

  static double areaQuadrat(double c) {
    return c * c;
  }

  static double areaRectangle(double b, double h) {
    return b * h;
  }

  static double areaCercle(double r) {
    return 3.14 * r * r;
  }
  static double areaTrapezi(double B, double b, double h) {
    return ((B + b) * h) / 2;
  }

  static double areaRombe(double D, double d) {
    return (D * d) / 2;
  }

  static double areaParalelogram(double b, double h) {
    return b * h;
  }
}

