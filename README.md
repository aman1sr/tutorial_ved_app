DevByte - What's New Added
======================

-

Introduction
------------

DevByteViewer app displays a list of DevByte videos. DevByte videos are short
videos made by the Google Android developer relations team to introduce new
developer features on Android. They're also a great way to stay up to date with
new features as they come out as well as tips and best practices. This app
fetches the DevByte video list from the network using the Retrofit library and
displays it on the screen. It uses a ViewModel and LiveData to hold the data and
update the UI. Since the video list is big, results are displayed in a
RecyclerView.


NOTE:
--------------

1) Databases on Android are stored on the file system, or disk, and in order to save they must perform a disk I/O. The disk I/O, or reading and writing to disk,
 is slow and always blocks the current thread until the operation is complete. Because of this, you have to run the disk I/O in the I/O dispatcher.
  This dispatcher is designed to offload blocking I/O tasks to a shared pool of threads using withContext(Dispatchers.IO) { ... }.

2) The Transformations.map method uses a conversion function to convert one LiveData object into another LiveData object. The transformations are only calculated when an active activity 
   or a fragment is observing the returned LiveData property


Getting Started
---------------

1. Download and run the app.
2. You need Android Studio 3.2 or higher to build this project.

License
-------

Copyright 2019 Google, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
