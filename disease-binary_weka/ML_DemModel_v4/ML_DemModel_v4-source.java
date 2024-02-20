// Generated with Weka 3.8.6
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Mon Nov 13 20:23:30 CET 2023

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
    p = WekaClassifier.N2527bc17193(i);
    return p;
  }
  static double N2527bc17193(Object []i) {
    double p = Double.NaN;
    if (i[998] == null) {
      p = 0;
    } else if (((Double) i[998]).doubleValue() <= 0.10292) {
    p = WekaClassifier.N476547d1194(i);
    } else if (((Double) i[998]).doubleValue() > 0.10292) {
    p = WekaClassifier.N62e17b5203(i);
    } 
    return p;
  }
  static double N476547d1194(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (i[2].equals(" tanzania")) {
      p = 0;
    } else if (i[2].equals(" italy")) {
      p = 0;
    } else if (i[2].equals(" denmark")) {
      p = 0;
    } else if (i[2].equals(" usa")) {
      p = 0;
    } else if (i[2].equals(" nd")) {
      p = 0;
    } else if (i[2].equals(" germany")) {
      p = 0;
    } else if (i[2].equals(" spain")) {
    p = WekaClassifier.N1822f49d195(i);
    } else if (i[2].equals(" china")) {
      p = 0;
    } else if (i[2].equals(" peru")) {
      p = 0;
    } else if (i[2].equals(" -")) {
      p = 0;
    } else if (i[2].equals(" sweden")) {
      p = 0;
    } else if (i[2].equals(" france")) {
      p = 0;
    } else if (i[2].equals(" norway")) {
      p = 0;
    } else if (i[2].equals(" slovakia")) {
      p = 0;
    } else if (i[2].equals(" yugoslavia")) {
      p = 0;
    } else if (i[2].equals(" hungary")) {
      p = 0;
    } else if (i[2].equals(" estonia")) {
      p = 0;
    } else if (i[2].equals(" finland")) {
      p = 0;
    } else if (i[2].equals(" iceland")) {
      p = 0;
    } 
    return p;
  }
  static double N1822f49d195(Object []i) {
    double p = Double.NaN;
    if (i[166] == null) {
      p = 6;
    } else if (((Double) i[166]).doubleValue() <= 0.00148) {
    p = WekaClassifier.N59049b51196(i);
    } else if (((Double) i[166]).doubleValue() > 0.00148) {
      p = 0;
    } 
    return p;
  }
  static double N59049b51196(Object []i) {
    double p = Double.NaN;
    if (i[1220] == null) {
      p = 6;
    } else if (((Double) i[1220]).doubleValue() <= 0.00848) {
    p = WekaClassifier.N415b4362197(i);
    } else if (((Double) i[1220]).doubleValue() > 0.00848) {
      p = 0;
    } 
    return p;
  }
  static double N415b4362197(Object []i) {
    double p = Double.NaN;
    if (i[1978] == null) {
      p = 6;
    } else if (((Double) i[1978]).doubleValue() <= 3.8E-4) {
    p = WekaClassifier.N2ceddf57198(i);
    } else if (((Double) i[1978]).doubleValue() > 3.8E-4) {
      p = 0;
    } 
    return p;
  }
  static double N2ceddf57198(Object []i) {
    double p = Double.NaN;
    if (i[93] == null) {
      p = 6;
    } else if (((Double) i[93]).doubleValue() <= 0.00115) {
    p = WekaClassifier.N2364504b199(i);
    } else if (((Double) i[93]).doubleValue() > 0.00115) {
      p = 0;
    } 
    return p;
  }
  static double N2364504b199(Object []i) {
    double p = Double.NaN;
    if (i[527] == null) {
      p = 6;
    } else if (((Double) i[527]).doubleValue() <= 0.48898) {
    p = WekaClassifier.N5e478965200(i);
    } else if (((Double) i[527]).doubleValue() > 0.48898) {
      p = 0;
    } 
    return p;
  }
  static double N5e478965200(Object []i) {
    double p = Double.NaN;
    if (i[123] == null) {
      p = 6;
    } else if (((Double) i[123]).doubleValue() <= 11.47991) {
    p = WekaClassifier.N459c919c201(i);
    } else if (((Double) i[123]).doubleValue() > 11.47991) {
      p = 0;
    } 
    return p;
  }
  static double N459c919c201(Object []i) {
    double p = Double.NaN;
    if (i[464] == null) {
      p = 6;
    } else if (((Double) i[464]).doubleValue() <= 0.01897) {
      p = 6;
    } else if (((Double) i[464]).doubleValue() > 0.01897) {
    p = WekaClassifier.N749f91f202(i);
    } 
    return p;
  }
  static double N749f91f202(Object []i) {
    double p = Double.NaN;
    if (i[181] == null) {
      p = 0;
    } else if (((Double) i[181]).doubleValue() <= 1.4E-4) {
      p = 0;
    } else if (((Double) i[181]).doubleValue() > 1.4E-4) {
      p = 6;
    } 
    return p;
  }
  static double N62e17b5203(Object []i) {
    double p = Double.NaN;
    if (i[937] == null) {
      p = 0;
    } else if (((Double) i[937]).doubleValue() <= 8.3E-4) {
      p = 0;
    } else if (((Double) i[937]).doubleValue() > 8.3E-4) {
      p = 6;
    } 
    return p;
  }
}