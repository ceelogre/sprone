package com.jonevscode.resulting_build;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResultingBuildController {
  @RequestMapping(value = "/phone", method = RequestMethod.GET)
  @ResponseBody
  public String resultingBuild() {
    return "$600";
  }
}
