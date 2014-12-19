package edu.luc.etl.cs313.android.scala.primechecker

import junit.framework.Assert._
import org.junit.Test

/**
 * An abstract GUI-based functional test for the clickcounter app.
 * This follows the XUnit Testcase Superclass pattern.
 */
trait AbstractFunctionalTest {

  /** The activity to be provided by concrete subclasses of this test. */
  protected def activity: MainActivity

  @Test def testActivityExists() {
    assertNotNull(activity)
  }
}
