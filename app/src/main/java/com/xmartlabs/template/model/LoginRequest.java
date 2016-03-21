package com.xmartlabs.template.model;

import lombok.Builder;
import lombok.Data;

/**
 * Created by remer on 08/12/2015.
 */
@Builder
@Data
public class LoginRequest {
  String user;
  String password;
}
