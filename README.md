Running Automation Shrine

- Make sure that you already installed java and android sdk
- setup path for android sdk, platfom tools and build tools
- installed node and appium server, you may user desktop app (appium server GUI) or installed in and run on your terminal
- Make sure the flutter-gallery.apk is already installed on your device.
- turn on the server using appium (I user appiun server GUI)
- kindly adjust the device capablitiy based on your own devices, you only need to change the deviceName, udid, and android version.
to check the udid you can get the value by type : adb devices
- since this project is maven project we need to build it first, to make sure the dependency will be downloaded, to run it use this command : mvn clean install
- after build success, we can execute the test using command : mvn clean test