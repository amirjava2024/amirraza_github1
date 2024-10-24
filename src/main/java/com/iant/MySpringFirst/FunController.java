package com.iant.MySpringFirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {
private CricketCoach cricketCoach;
    FunController(CricketCoach cir)
{
      cricketCoach=cir;
}
@GetMapping("/mess")
public String callMethod()
{
  return   cricketCoach.getDailywork();
}
@GetMapping("/work")
    public String mywork()
{
    return  "Work hard For Cricket";
}
}
