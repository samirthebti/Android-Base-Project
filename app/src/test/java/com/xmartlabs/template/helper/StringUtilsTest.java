package com.xmartlabs.template.helper;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by santiago on 02/02/16.
 */
public class StringUtilsTest {
  @Test
  public void nullString() {
    Assert.assertThat(StringUtils.stringIsNullOrEmpty(null), is(true));
  }

  @Test
  public void emptyString() {
    Assert.assertThat(StringUtils.stringIsNullOrEmpty(""), is(true));
  }

  @Test
  public void length3String() {
    Assert.assertThat(StringUtils.stringIsNullOrEmpty("abc"), is(false));
  }
}
