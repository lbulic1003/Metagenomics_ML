// Generated with Weka 3.8.6
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Tue Nov 14 06:33:06 CET 2023

package weka.classifiers;

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.classifiers.Classifier;
import weka.classifiers.AbstractClassifier;

public class WekaWrapper
  extends AbstractClassifier {

  /**
   * Returns only the toString() method.
   *
   * @return a string describing the classifier
   */
  public String globalInfo() {
    return toString();
  }

  /**
   * Returns the capabilities of this classifier.
   *
   * @return the capabilities
   */
  public Capabilities getCapabilities() {
    weka.core.Capabilities result = new weka.core.Capabilities(this);

    result.enable(weka.core.Capabilities.Capability.NOMINAL_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.NUMERIC_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.DATE_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.MISSING_VALUES);
    result.enable(weka.core.Capabilities.Capability.NOMINAL_CLASS);
    result.enable(weka.core.Capabilities.Capability.MISSING_CLASS_VALUES);


    result.setMinimumNumberInstances(0);

    return result;
  }

  /**
   * only checks the data against its capabilities.
   *
   * @param i the training data
   */
  public void buildClassifier(Instances i) throws Exception {
    // can classifier handle the data?
    getCapabilities().testWithFail(i);
  }

  /**
   * Classifies the given instance.
   *
   * @param i the instance to classify
   * @return the classification result
   */
  public double classifyInstance(Instance i) throws Exception {
    Object[] s = new Object[i.numAttributes()];
    
    for (int j = 0; j < s.length; j++) {
      if (!i.isMissing(j)) {
        if (i.attribute(j).isNominal())
          s[j] = new String(i.stringValue(j));
        else if (i.attribute(j).isNumeric())
          s[j] = new Double(i.value(j));
      }
    }
    
    // set class value to missing
    s[i.classIndex()] = null;
    
    return WekaClassifier.classify(s);
  }

  /**
   * Returns the revision string.
   * 
   * @return        the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("1.0");
  }

  /**
   * Returns only the classnames and what classifier it is based on.
   *
   * @return a short description
   */
  public String toString() {
    return "Auto-generated classifier wrapper, based on weka.classifiers.trees.J48 (generated with Weka 3.8.6).\n" + this.getClass().getName() + "/WekaClassifier";
  }

  /**
   * Runs the classfier from commandline.
   *
   * @param args the commandline arguments
   */
  public static void main(String args[]) {
    runClassifier(new WekaWrapper(), args);
  }
}

class WekaClassifier {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = WekaClassifier.N164a71700(i);
    return p;
  }
  static double N164a71700(Object []i) {
    double p = Double.NaN;
    if (i[892] == null) {
      p = 0;
    } else if (((Double) i[892]).doubleValue() <= 0.00182) {
    p = WekaClassifier.N25cfaaf51(i);
    } else if (((Double) i[892]).doubleValue() > 0.00182) {
    p = WekaClassifier.N4cc0cd4910(i);
    } 
    return p;
  }
  static double N25cfaaf51(Object []i) {
    double p = Double.NaN;
    if (i[1480] == null) {
      p = 0;
    } else if (((Double) i[1480]).doubleValue() <= 0.00717) {
    p = WekaClassifier.N5fd593652(i);
    } else if (((Double) i[1480]).doubleValue() > 0.00717) {
    p = WekaClassifier.N50889f568(i);
    } 
    return p;
  }
  static double N5fd593652(Object []i) {
    double p = Double.NaN;
    if (i[1092] == null) {
      p = 0;
    } else if (((Double) i[1092]).doubleValue() <= 0.00136) {
    p = WekaClassifier.N5a4f75343(i);
    } else if (((Double) i[1092]).doubleValue() > 0.00136) {
    p = WekaClassifier.N470bc7e25(i);
    } 
    return p;
  }
  static double N5a4f75343(Object []i) {
    double p = Double.NaN;
    if (i[295] == null) {
      p = 0;
    } else if (((Double) i[295]).doubleValue() <= 1.6E-4) {
      p = 0;
    } else if (((Double) i[295]).doubleValue() > 1.6E-4) {
    p = WekaClassifier.N1f4b4efc4(i);
    } 
    return p;
  }
  static double N1f4b4efc4(Object []i) {
    double p = Double.NaN;
    if (i[78] == null) {
      p = 0;
    } else if (((Double) i[78]).doubleValue() <= 0.00326) {
      p = 0;
    } else if (((Double) i[78]).doubleValue() > 0.00326) {
      p = 10;
    } 
    return p;
  }
  static double N470bc7e25(Object []i) {
    double p = Double.NaN;
    if (i[513] == null) {
      p = 0;
    } else if (((Double) i[513]).doubleValue() <= 0.92835) {
    p = WekaClassifier.N34b63add6(i);
    } else if (((Double) i[513]).doubleValue() > 0.92835) {
      p = 10;
    } 
    return p;
  }
  static double N34b63add6(Object []i) {
    double p = Double.NaN;
    if (i[356] == null) {
      p = 0;
    } else if (((Double) i[356]).doubleValue() <= 0.01006) {
    p = WekaClassifier.N15711faa7(i);
    } else if (((Double) i[356]).doubleValue() > 0.01006) {
      p = 10;
    } 
    return p;
  }
  static double N15711faa7(Object []i) {
    double p = Double.NaN;
    if (i[1092] == null) {
      p = 10;
    } else if (((Double) i[1092]).doubleValue() <= 0.00376) {
      p = 10;
    } else if (((Double) i[1092]).doubleValue() > 0.00376) {
      p = 0;
    } 
    return p;
  }
  static double N50889f568(Object []i) {
    double p = Double.NaN;
    if (i[605] == null) {
      p = 0;
    } else if (((Double) i[605]).doubleValue() <= 0.0111) {
    p = WekaClassifier.N49a576729(i);
    } else if (((Double) i[605]).doubleValue() > 0.0111) {
      p = 10;
    } 
    return p;
  }
  static double N49a576729(Object []i) {
    double p = Double.NaN;
    if (i[1031] == null) {
      p = 0;
    } else if (((Double) i[1031]).doubleValue() <= 1.26845) {
      p = 0;
    } else if (((Double) i[1031]).doubleValue() > 1.26845) {
      p = 10;
    } 
    return p;
  }
  static double N4cc0cd4910(Object []i) {
    double p = Double.NaN;
    if (i[513] == null) {
      p = 0;
    } else if (((Double) i[513]).doubleValue() <= 0.09674) {
    p = WekaClassifier.N5151073411(i);
    } else if (((Double) i[513]).doubleValue() > 0.09674) {
    p = WekaClassifier.N6da3837114(i);
    } 
    return p;
  }
  static double N5151073411(Object []i) {
    double p = Double.NaN;
    if (i[1206] == null) {
      p = 0;
    } else if (((Double) i[1206]).doubleValue() <= 8.9E-4) {
    p = WekaClassifier.N4537506712(i);
    } else if (((Double) i[1206]).doubleValue() > 8.9E-4) {
      p = 10;
    } 
    return p;
  }
  static double N4537506712(Object []i) {
    double p = Double.NaN;
    if (i[729] == null) {
      p = 0;
    } else if (((Double) i[729]).doubleValue() <= 0.0151) {
    p = WekaClassifier.N2743a85513(i);
    } else if (((Double) i[729]).doubleValue() > 0.0151) {
      p = 10;
    } 
    return p;
  }
  static double N2743a85513(Object []i) {
    double p = Double.NaN;
    if (i[126] == null) {
      p = 0;
    } else if (((Double) i[126]).doubleValue() <= 1.15123) {
      p = 0;
    } else if (((Double) i[126]).doubleValue() > 1.15123) {
      p = 10;
    } 
    return p;
  }
  static double N6da3837114(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 10;
    } else if (i[3].equals(" tanzania")) {
      p = 10;
    } else if (i[3].equals(" italy")) {
      p = 10;
    } else if (i[3].equals(" denmark")) {
      p = 0;
    } else if (i[3].equals(" usa")) {
      p = 10;
    } else if (i[3].equals(" nd")) {
      p = 10;
    } else if (i[3].equals(" germany")) {
      p = 10;
    } else if (i[3].equals(" spain")) {
      p = 10;
    } else if (i[3].equals(" china")) {
    p = WekaClassifier.N3412415615(i);
    } else if (i[3].equals(" peru")) {
      p = 10;
    } else if (i[3].equals(" -")) {
      p = 10;
    } else if (i[3].equals(" sweden")) {
      p = 10;
    } else if (i[3].equals(" france")) {
      p = 0;
    } else if (i[3].equals(" norway")) {
      p = 10;
    } else if (i[3].equals(" slovakia")) {
      p = 10;
    } else if (i[3].equals(" yugoslavia")) {
      p = 10;
    } else if (i[3].equals(" hungary")) {
      p = 10;
    } else if (i[3].equals(" estonia")) {
      p = 10;
    } else if (i[3].equals(" finland")) {
      p = 10;
    } else if (i[3].equals(" iceland")) {
      p = 10;
    } 
    return p;
  }
  static double N3412415615(Object []i) {
    double p = Double.NaN;
    if (i[328] == null) {
      p = 10;
    } else if (((Double) i[328]).doubleValue() <= 2.3E-4) {
    p = WekaClassifier.N4b598bdb16(i);
    } else if (((Double) i[328]).doubleValue() > 2.3E-4) {
      p = 0;
    } 
    return p;
  }
  static double N4b598bdb16(Object []i) {
    double p = Double.NaN;
    if (i[443] == null) {
      p = 10;
    } else if (((Double) i[443]).doubleValue() <= 0.00267) {
    p = WekaClassifier.N716283e517(i);
    } else if (((Double) i[443]).doubleValue() > 0.00267) {
      p = 0;
    } 
    return p;
  }
  static double N716283e517(Object []i) {
    double p = Double.NaN;
    if (i[104] == null) {
      p = 10;
    } else if (((Double) i[104]).doubleValue() <= 10.32291) {
    p = WekaClassifier.Nab3eb318(i);
    } else if (((Double) i[104]).doubleValue() > 10.32291) {
      p = 0;
    } 
    return p;
  }
  static double Nab3eb318(Object []i) {
    double p = Double.NaN;
    if (i[704] == null) {
      p = 10;
    } else if (((Double) i[704]).doubleValue() <= 0.00941) {
      p = 10;
    } else if (((Double) i[704]).doubleValue() > 0.00941) {
      p = 0;
    } 
    return p;
  }
}
