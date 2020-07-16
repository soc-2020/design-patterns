# Observer Pattern

Assume we are building an application for a news agency.
Each time the user types a news title, a number of different actions 
must take place, like update the database,
write the action to a log file, and send a message to the mailing list.
More actions may be taken in the future. 
Also the system must be configurable in order to 
suspend or activate any of the actions.

**Note**: Actions are not actually doing what they are 
supposed to do. They only display a message that they are 
completing the respective action just to indicate the functionality.

