/**
 * Represents one person
 * 
 * <TODO add @author info here for all group-mates!>
 **/

//TODO PART 2: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
					DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ DACArecipient()
+ DACArecipient(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char)
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountyOfOrigin() : String
+ getBirthDay() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void
+ setAll(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char) : void
+ toString() : String
+ equals(other : DACArecipient) : boolean
+ printCard() : void
+ jdnToDate(J : int) : String
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//DONE: Declare the instance variables. 
  private String surname;
  private String givenName;
  private String uscisNumber;
  private String countryOfOrigin;
  private int birthday, validFromDate, expirationDate;
  private char sex;
	
  /**** CONSTRUCTORS ****/
  //DONE: Write the default constructor and constructor with parameters. Remember to include documentation for each method.
  public DACArecipient()
  {
    surname = "Unknown";
    givenName = "Unknown";
    uscisNumber = "Unknown";
    countryOfOrigin = "Unknown";
    birthday = 2415021;
    validFromDate = 2415021;
    expirationDate = 2415021;
    sex = 'X';
  }

  public DACArecipient(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
  {
    this.surname = surname;
    this.givenName = givenName;
    this.uscisNumber = uscisNumber;
    this.countryOfOrigin = countryOfOrigin;
    this.birthday = birthday;
    this.validFromDate = validFromDate;
    this.expirationDate = expirationDate;
    this.sex = sex;
  }
  
  public String toString()
  {
    return "Surname: " + surname + ", Given Name: " + givenName + ", USCIS Number: " + uscisNumber + ", Country of Origin: " + countryOfOrigin + ", Birthday: " + birthday + ", Valid From Date: " + validFromDate + ", Expiration Date: " + expirationDate + ", Sex: " + sex;
  }
}