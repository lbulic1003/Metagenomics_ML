// Generated with Weka 3.8.6
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Thu Feb 22 16:35:21 CET 2024

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
    p = WekaClassifier.N4d67063d48(i);
    return p;
  }
  static double N4d67063d48(Object []i) {
    double p = Double.NaN;
    if (i[1160] == null) {
      p = 0;
    } else if (((Double) i[1160]).doubleValue() <= 0.0) {
    p = WekaClassifier.N619cdc7d49(i);
    } else if (((Double) i[1160]).doubleValue() > 0.0) {
    p = WekaClassifier.N406c124663(i);
    } 
    return p;
  }
  static double N619cdc7d49(Object []i) {
    double p = Double.NaN;
    if (i[994] == null) {
      p = 0;
    } else if (((Double) i[994]).doubleValue() <= 1.33239) {
    p = WekaClassifier.N46f351b50(i);
    } else if (((Double) i[994]).doubleValue() > 1.33239) {
    p = WekaClassifier.N2a350a2658(i);
    } 
    return p;
  }
  static double N46f351b50(Object []i) {
    double p = Double.NaN;
    if (i[71] == null) {
      p = 0;
    } else if (((Double) i[71]).doubleValue() <= 0.06934) {
    p = WekaClassifier.N616a4c3951(i);
    } else if (((Double) i[71]).doubleValue() > 0.06934) {
    p = WekaClassifier.N18c0ef0857(i);
    } 
    return p;
  }
  static double N616a4c3951(Object []i) {
    double p = Double.NaN;
    if (i[267] == null) {
      p = 0;
    } else if (((Double) i[267]).doubleValue() <= 0.0477) {
      p = 0;
    } else if (((Double) i[267]).doubleValue() > 0.0477) {
    p = WekaClassifier.N1449f8c752(i);
    } 
    return p;
  }
  static double N1449f8c752(Object []i) {
    double p = Double.NaN;
    if (i[941] == null) {
      p = 0;
    } else if (((Double) i[941]).doubleValue() <= 0.01893) {
    p = WekaClassifier.N13b1b10753(i);
    } else if (((Double) i[941]).doubleValue() > 0.01893) {
      p = 16;
    } 
    return p;
  }
  static double N13b1b10753(Object []i) {
    double p = Double.NaN;
    if (i[977] == null) {
      p = 0;
    } else if (((Double) i[977]).doubleValue() <= 0.7693) {
    p = WekaClassifier.N6e0b898754(i);
    } else if (((Double) i[977]).doubleValue() > 0.7693) {
      p = 16;
    } 
    return p;
  }
  static double N6e0b898754(Object []i) {
    double p = Double.NaN;
    if (i[104] == null) {
      p = 0;
    } else if (((Double) i[104]).doubleValue() <= 13.23274) {
    p = WekaClassifier.N5d331bfb55(i);
    } else if (((Double) i[104]).doubleValue() > 13.23274) {
      p = 16;
    } 
    return p;
  }
  static double N5d331bfb55(Object []i) {
    double p = Double.NaN;
    if (i[514] == null) {
      p = 0;
    } else if (((Double) i[514]).doubleValue() <= 5.21404) {
    p = WekaClassifier.N6e74f5a56(i);
    } else if (((Double) i[514]).doubleValue() > 5.21404) {
      p = 16;
    } 
    return p;
  }
  static double N6e74f5a56(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 16;
    } else if (((Double) i[19]).doubleValue() <= 0.00865) {
      p = 16;
    } else if (((Double) i[19]).doubleValue() > 0.00865) {
      p = 0;
    } 
    return p;
  }
  static double N18c0ef0857(Object []i) {
    double p = Double.NaN;
    if (i[391] == null) {
      p = 0;
    } else if (((Double) i[391]).doubleValue() <= 2.38462) {
      p = 0;
    } else if (((Double) i[391]).doubleValue() > 2.38462) {
      p = 16;
    } 
    return p;
  }
  static double N2a350a2658(Object []i) {
    double p = Double.NaN;
    if (i[1395] == null) {
      p = 0;
    } else if (((Double) i[1395]).doubleValue() <= 0.0017) {
    p = WekaClassifier.N6f9c205859(i);
    } else if (((Double) i[1395]).doubleValue() > 0.0017) {
      p = 16;
    } 
    return p;
  }
  static double N6f9c205859(Object []i) {
    double p = Double.NaN;
    if (i[281] == null) {
      p = 0;
    } else if (((Double) i[281]).doubleValue() <= 0.00232) {
    p = WekaClassifier.N53bd2f6e60(i);
    } else if (((Double) i[281]).doubleValue() > 0.00232) {
      p = 16;
    } 
    return p;
  }
  static double N53bd2f6e60(Object []i) {
    double p = Double.NaN;
    if (i[494] == null) {
      p = 0;
    } else if (((Double) i[494]).doubleValue() <= 0.66779) {
    p = WekaClassifier.N4c9a22be61(i);
    } else if (((Double) i[494]).doubleValue() > 0.66779) {
      p = 16;
    } 
    return p;
  }
  static double N4c9a22be61(Object []i) {
    double p = Double.NaN;
    if (i[461] == null) {
      p = 0;
    } else if (((Double) i[461]).doubleValue() <= 0.64562) {
    p = WekaClassifier.N4e7c753162(i);
    } else if (((Double) i[461]).doubleValue() > 0.64562) {
      p = 16;
    } 
    return p;
  }
  static double N4e7c753162(Object []i) {
    double p = Double.NaN;
    if (i[267] == null) {
      p = 0;
    } else if (((Double) i[267]).doubleValue() <= 1.9368) {
      p = 0;
    } else if (((Double) i[267]).doubleValue() > 1.9368) {
      p = 16;
    } 
    return p;
  }
  static double N406c124663(Object []i) {
    double p = Double.NaN;
    if (i[114] == null) {
      p = 16;
    } else if (((Double) i[114]).doubleValue() <= 0.00405) {
      p = 16;
    } else if (((Double) i[114]).doubleValue() > 0.00405) {
      p = 0;
    } 
    return p;
  }
}