
Solution for a code challenge implemented in two different ways:
- Standard Android architecture 
- MVP(model view presenter) architecture, including JUnit tests for the presenter using robolectric.

# Code challenge
Create an Android application that displays information received over the network.

The server at the following url responds with JSON formatted data:

(GET) http://-------.com/service/v2/upcomingGuides/

The response represents a list of “Guide” objects:

{ "data": [ { "startDate": "", "endDate": "", "name": "", "url": "", "venue": {"city": "", "state": ""}, "icon": "" }, … ] }


# Milestones
Spend no more than an hour completing as many of these steps as possible.

Retrieve and print out the data received from the url above.

Parse the data retrieved from the server into a list of Java objects

Display your objects in an organized fashion (ListView, GridView, etc.)

Should display the name, city, state, and end date In addition the object’s name, have your view display the image located at each object’s icon url.
