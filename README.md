# Ecological Marine Unit Explorer Android

This repo is home to an Esri example application that uses the [ArcGIS Runtime SDK for Android](https://developers.arcgis.com/android/) to showcase ocean ecosystems.  Explore 50 years worth of NOAA data using Esri maps and services!

## Features

## Development Instructions
This Ecological Marine Unit Explorer repo is an Android Studio Project and App Module that can be directly cloned and imported into Android Studio. 

### Fork the repo
**Fork** the [Ecological Marine Unit Explorer Android](https://github.com/Esri/ecological-marine-unit-android/fork) repo.

### Clone the repo
Once you have forked the repo, you can make a clone

#### Command line Git
1. [Clone the Ecological Marine Unit Explorer repo](https://help.github.com/articles/fork-a-repo#step-2-clone-your-fork)
2. ```cd``` into the ```ecological-marine-unit-android``` folder
3. Make your changes and create a [pull request](https://help.github.com/articles/creating-a-pull-request)

### Configuring a Remote for a Fork
If you make changes in the fork and would like to [sync](https://help.github.com/articles/syncing-a-fork/) those changes with the upstream repository, you must first [configure the remote](https://help.github.com/articles/configuring-a-remote-for-a-fork/). This will be required when you have created local branches and would like to make a [pull request](https://help.github.com/articles/creating-a-pull-request) to your upstream branch.

1. In the Terminal (for Mac users) or command prompt (fow Windows and Linux users) type ```git remote -v``` to list the current configured remote repo for your fork.
2. ```git remote add upstream https://github.com/Esri/ecological-marine-unit-android`git``` to specify new remote upstream repository that will be synced with the fork. You can type ```git remote -v``` to verify the new upstream.

If there are changes made in the Original repository, you can sync the fork to keep it updated with upstream repository.

1. In the terminal, change the current working directory to your local project
2. Type ```git fetch upstream``` to fetch the commits from the upstream repository
3. ```git checkout master``` to checkout your fork's local master branch.
4. ```git merge upstream/master``` to sync your local `master' branch with `upstream/master`. **Note**: Your local changes will be retained and your fork's master branch will be in sync with the upstream repository.

### Configure Basic License (optional)
While the Ecological Marine Unit Explorer application references a Basic license file, it is not required to run the app.  To learn more about licensing your Runtime app, see the documentation [here](https://developers.arcgis.com/arcgis-runtime/licensing/).  The Ecological Marine Unit Explorer is completely functional without the Basic license. We have used a Basic license to remove the "Licensed for Developer Use Only" watermark from the map since this app has often been used in demos. If you have a Basic license, use the following steps to use it in your app.

1.  In the module build.file uncomment line 17 `buildConfigField "String" , "LICENSE_KEY" , LICENSE_KEY`
2.  Add a file entitled gradle.properties to the root of the project.  Copy your license key to this file.
3.  Uncomment line 100 in the MainActivity.java file that sets the license:  `ArcGISRuntimeEnvironment.setLicense(BuildConfig.LICENSE_KEY);`
4.  Sync your gradle file and re-run the app.


## Requirements
* [JDK 6 or higher](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Android Studio](http://developer.android.com/sdk/index.html)

## Resources
* [Ecological Marine Unit Explorer](https://github.com/Esri/ecological-marine-unit-android/blob/emu-app/README.md)
* [ArcGIS Runtime SDK for Android Developers Site](https://developers.arcgis.com/android/)
* [ArcGIS Mobile Blog](http://blogs.esri.com/esri/arcgis/category/mobile/)
* [ArcGIS Developer Blog](http://blogs.esri.com/esri/arcgis/category/developer/)
* [Google+](https://plus.google.com/+esri/posts)
* [twitter@ArcGISRuntime](https://twitter.com/ArcGISRuntime)
* [twitter@esri](http://twitter.com/esri)

## Issues
Find a bug or want to request a new feature enhancement?  Let us know by submitting an issue.

## Contributing
Anyone and everyone is welcome to [contribute](https://github.com/Esri/ecological-marine-unit-android/blob/master/CONTRIBUTING.md). We do accept pull requests.

1. Get involved
2. Report issues
3. Contribute code
4. Improve documentation

## Licensing
Copyright 2016 Esri

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

A copy of the license is available in the repository's [license.txt](https://github.com/Esri/maps-app-android/blob/master/license.txt) file.

For information about licensing your deployed app, see [License your app](https://developers.arcgis.com/android/guide/license-your-app.htm).

