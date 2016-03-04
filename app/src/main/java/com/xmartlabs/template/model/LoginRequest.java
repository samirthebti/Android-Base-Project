package com.xmartlabs.template.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * Created by remer on 08/12/2015.
 */
@Builder
@Data
public class LoginRequest {
  String user;
  String password;
}
