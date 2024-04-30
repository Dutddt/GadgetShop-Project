**GadgetShop Project README**

**PROJECT TITLE:** GadgetShop

**PURPOSE OF PROJECT:**  
The GadgetShop project is a Java application designed for managing gadgets within a shop environment. It facilitates the addition of gadgets like mobile phones and MP3 players to an inventory, provides functionality to interact with these gadgets via a graphical user interface (GUI), and enables actions such as making calls and downloading music.

**VERSION or DATE:**  
As of April 23, 2024

**HOW TO START THIS PROJECT:**  
To begin utilizing the GadgetShop project, follow these steps:
1. Clone or download the project repository from GitHub.
2. Open the project in your preferred Java development environment.
3. Compile and run the `GadgetShop.java` file, which contains the main method.
4. Utilize the graphical interface to manage the gadget inventory, including adding mobile phones and MP3 players, viewing all gadgets, making calls, and downloading music.

**AUTHORS:**  
- Dumitru Tanasie

**USER INSTRUCTIONS:**  
1. **Adding Gadgets:**
   - Click on the "Add Mobile" button to add a mobile phone to the inventory. Fill in the required details such as model, price, weight, size, and credit.
   - Click on the "Add MP3" button to add an MP3 player to the inventory. Enter the model, price, weight, size, and memory details.
   
2. **Clearing Fields:**
   - Click on the "Clear" button to clear all text fields in the GUI.

3. **Displaying Gadgets:**
   - Press the "Display All" button to view details of all gadgets in the inventory.

4. **Making a Call:**
   - To make a call using a mobile phone, enter the display number, phone number, and call duration, then click on the "Make a Call" button.

5. **Downloading Music:**
   - To download music to an MP3 player, enter the display number and download size, then click on the "Download Music" button.

**PROJECT STRUCTURE ANALYSIS:**
- **Gadget Class:** Represents a generic gadget with properties like model, price, weight, and size. Provides methods for displaying gadget details.
- **Mobile Class:** Extends Gadget class, adding specific properties like credit and methods for making calls.
- **MP3 Class:** Extends Gadget class, adding specific properties like memory and methods for downloading music.
- **GadgetShop Class:** Main class implementing the GUI for managing gadgets. Provides functionalities for adding gadgets, displaying all gadgets, making calls, and downloading music. Uses Swing for the graphical interface.

This project demonstrates object-oriented programming concepts in Java, including inheritance and polymorphism, and showcases the use of GUI components for user interaction.