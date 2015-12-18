package com.sco.oval;

import static org.junit.Assert.fail;

import org.junit.Test;

import net.sf.oval.exception.ConstraintsViolatedException;
/**
 * 
 * @author Lang
 *
 */
public class StaticForOvalTestCase {
    // ~ Static Fields =======================================
    // ~ Instance Fields =====================================
    // ~ Static Block ========================================
    // ~ Static Methods ======================================
    // ~ Constructors ========================================
    // ~ Abstract Methods ====================================
    // ~ Override Methods ====================================
    // ~ Methods =============================================
    @Test(expected = ConstraintsViolatedException.class)
    public void testNotNull(){
        StaticForOval.test("   ");
        fail("Failure - testNotNull");
    }
    // ~ Private Methods =====================================
    // ~ Get/Set =============================================
    // ~ hashCode,equals,toString ============================

}
