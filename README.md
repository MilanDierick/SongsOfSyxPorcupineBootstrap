# Disclaimer
It is important to verify that the necessary game files are located in the root directory of the project. To facilitate this process, you can use the SetupDependencies.bat script, which will automatically transfer the required files from the default Steam installation location to the root directory of the project. If you encounter any issues, you may need to perform this task manually or refer to the instructions in the batch file.

# Description
This example project demonstrates how to use the Porcupine Framework to create a FPS counter for the game Songs of Syx. It implements the IScriptEntity, ITickCapable, and IRenderCapable interfaces, allowing it to be executed on each tick of the game loop and rendered on the screen. The FPS counter tracks the time between each tick and calculates the current tick FPS, which is then displayed on the screen using a Text sprite. The FPS counter is able to maintain a record of up to 100 tick times using an ArrayDeque.

# Usage
This project assumes both the game and Porcupine can be found as dependencies in your .m2 repository. There's no need to this manually; clone Porcupine Framework and execute the `install` command. If successful (which it should be if you executed the .batch file in that repository), both the game and the framework will be installed to your local Maven repository. This will need to be redone every time there's an update to the game or the framework, shouldn't take more than a minute. 
