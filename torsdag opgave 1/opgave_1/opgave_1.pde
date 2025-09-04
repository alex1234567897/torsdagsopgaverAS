String month = "febuar";
int days = 0;

switch(month){
  case "januar":
  days += 31;
  break;
  case "febuar":
  days += 28;
  break;
  case "marts":
  days += 31;
  break;
  case "april":
  days += 30;
  break;
  case "maj":
  days += 31;
  break;
  case "juni":
  days += 30;
  break;
  case "juli":
  days += 31;
  break;
  case "august":
  days += 31;
  break;
  case "september":
  days += 30;
  break;
  case "oktober":
  days += 31;
  break;
  case "november":
  days += 30;
  break;
  case "december":
  days += 31;
  break;
  default:
  days += 0;

}
print(month + " har " + days + " dage");
  
