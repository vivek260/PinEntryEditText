
# PinEntryEditText for Android

This repository contains Pin Entry which contains one edit text that will take all four digit of pin and displaying as TextView ( written in Kotlin).

![PinEntryEditText](https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExNDlmNjEwNmQwZjI1ODI0MDgwZjUzMzIwNTFmMjlhNDY5MTY4NzcxYSZlcD12MV9pbnRlcm5hbF9naWZzX2dpZklkJmN0PWc/gWRkw2dn7toMmOQF4W/giphy.gif)

## Features

- Custom 4 digit pin Entry which will consume 20Mb of memory.
- Specify drawable as the foreground/background.

NOTE: Make sure `jcenter()` is one of the repositories mentioned in your build.gradle.
This used to be the default repository for Android but since then has changed the `google()`
This needs to be set in your top level build.gradle: `<project root>/build.gradle`

```
buildscript {
    repositories {
        jcenter()
        ...
    }
    ...
}
```

## Effects :

1. PopIn (default)
2. Bottom Up

License
=======

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.