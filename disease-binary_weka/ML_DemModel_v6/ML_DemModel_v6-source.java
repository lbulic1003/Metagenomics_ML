// Generated with Weka 3.8.6
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Tue Nov 14 15:41:39 CET 2023

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
    p = WekaClassifier.N25e86a5c0(i);
    return p;
  }
  static double N25e86a5c0(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (i[2].equals(" female")) {
      p = 0;
    } else if (i[2].equals(" male")) {
      p = 0;
    } else if (i[2].equals(" -")) {
    p = WekaClassifier.N63c0fedb1(i);
    } else if (i[2].equals(" nd")) {
      p = 0;
    } else if (i[2].equals(" na")) {
      p = 0;
    } 
    return p;
  }
  static double N63c0fedb1(Object []i) {
    double p = Double.NaN;
    if (i[544] == null) {
      p = 1;
    } else if (((Double) i[544]).doubleValue() <= 1.05846) {
    p = WekaClassifier.N1531d7762(i);
    } else if (((Double) i[544]).doubleValue() > 1.05846) {
      p = 0;
    } 
    return p;
  }
  static double N1531d7762(Object []i) {
    double p = Double.NaN;
    if (i[872] == null) {
      p = 1;
    } else if (((Double) i[872]).doubleValue() <= 0.0) {
    p = WekaClassifier.N5ae731643(i);
    } else if (((Double) i[872]).doubleValue() > 0.0) {
      p = 0;
    } 
    return p;
  }
  static double N5ae731643(Object []i) {
    double p = Double.NaN;
    if (i[991] == null) {
      p = 1;
    } else if (((Double) i[991]).doubleValue() <= 4.8E-4) {
    p = WekaClassifier.N3c3b1aee4(i);
    } else if (((Double) i[991]).doubleValue() > 4.8E-4) {
      p = 0;
    } 
    return p;
  }
  static double N3c3b1aee4(Object []i) {
    double p = Double.NaN;
    if (i[236] == null) {
      p = 1;
    } else if (((Double) i[236]).doubleValue() <= 1.52021) {
    p = WekaClassifier.N58e91d945(i);
    } else if (((Double) i[236]).doubleValue() > 1.52021) {
      p = 0;
    } 
    return p;
  }
  static double N58e91d945(Object []i) {
    double p = Double.NaN;
    if (i[798] == null) {
      p = 1;
    } else if (((Double) i[798]).doubleValue() <= 0.00273) {
    p = WekaClassifier.N43f8fb986(i);
    } else if (((Double) i[798]).doubleValue() > 0.00273) {
      p = 0;
    } 
    return p;
  }
  static double N43f8fb986(Object []i) {
    double p = Double.NaN;
    if (i[41] == null) {
      p = 1;
    } else if (((Double) i[41]).doubleValue() <= 0.0042) {
      p = 1;
    } else if (((Double) i[41]).doubleValue() > 0.0042) {
    p = WekaClassifier.N20779e927(i);
    } 
    return p;
  }
  static double N20779e927(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 0.06246) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > 0.06246) {
      p = 0;
    } 
    return p;
  }
}