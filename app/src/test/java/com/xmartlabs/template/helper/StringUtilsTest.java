package com.xmartlabs.template.helper;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by santiago on 02/02/16.
 *
 * If doing plain Java testing, just do it under the "test" folder.
 */
public class StringUtilsTest {
  @Test
  public void checkNullStringIsNullOrEmpty() {
    Assert.assertThat(StringUtils.stringIsNullOrEmpty(null), is(true));
  }

  @Test
  public void checkEmptyStringIsNullOrEmpty() {
    Assert.assertThat(StringUtils.stringIsNullOrEmpty(""), is(true));
  }

  @Test
  public void checkIfLength3StringIsNullOrEmpty() {
    Assert.assertThat(StringUtils.stringIsNullOrEmpty("abc"), is(false));
  }
}
