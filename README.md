# Disclaimer
It is important to verify that the necessary game files are located in the root directory of the project. To facilitate this process, you can use the SetupDependencies.bat script, which will automatically transfer the required files from the default Steam installation location to the root directory of the project. If you encounter any issues, you may need to perform this task manually or refer to the instructions in the batch file.

Please also note that if there is an update to the Porcupine Framework, it is necessary to ensure that the latest version of porcupine-1.0-SNAPSHOT.jar is present in the root directory of the project. Typically, updates to the framework will only be included in this repository when breaking changes are introduced.

# Description
This example project demonstrates how to use the Porcupine Framework to create a FPS counter for the game Songs of Syx. It implements the IScriptEntity, ITickCapable, and IRenderCapable interfaces, allowing it to be executed on each tick of the game loop and rendered on the screen. The FPS counter tracks the time between each tick and calculates the current tick FPS, which is then displayed on the screen using a Text sprite. The FPS counter is able to maintain a record of up to 100 tick times using an ArrayDeque.

