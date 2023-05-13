/* Time Complexity - O(n), Space Complexity O(1) */
class Solution
{
  public int romanToInt (String s)
  {
    int answer = 0;		// Variable to store the final integer value
    int number = 0;		// Variable to store the value of the current Roman numeral
    int prev = 0;		// Variable to store the value of the previous Roman numeral

    for (int j = s.length () - 1; j >= 0; j--)
      {
	switch (s.charAt (j))
	  {
	    case 'M'->number = 1000;
	    case 'D'->number = 500;
	    case 'C'->number = 100;
	    case 'L'->number = 50;
	    case 'X'->number = 10;
	    case 'V'->number = 5;
	    case 'I'->number = 1;
	  }
	if (number < prev)
	  {
	    answer -= number;	// Subtract the current value if it is smaller than the previous value
	  }
	else
	  {
	    answer += number;	// Add the current value if it is greater than or equal to the previous value
	  }
	prev = number;		// Update the previous value for the next iteration
      }
    return answer;		// Return the final integer value
  }
}
