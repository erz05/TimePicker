# TimePicker
Android Library for TimePicker View

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-TimePicker-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/1610)

[ ![Download](https://api.bintray.com/packages/erz05/maven/TimePicker/images/download.svg) ](https://bintray.com/erz05/maven/TimePicker/_latestVersion)

<H2>Images</H2>
<img width="300px" src="https://github.com/erz05/TimePicker/blob/master/images/Screenshot_2015-03-01-00-53-47.png" />
<br>
<img width="300px" src="https://github.com/erz05/TimePicker/blob/master/images/Screenshot_2015-03-01-00-54-20.png" />
<br>
<img width="300px" src="https://github.com/erz05/TimePicker/blob/master/images/Screenshot_2015-03-01-00-55-26.png" />
<br>

<H2>Usage</H2>
Gradle Import: jcenter <br>
```groovy
dependencies {
    compile 'com.github.erz05:TimePicker:0.1.1@aar'
}
```

```xml
<com.erz.timepicker_library.TimePicker
    android:id="@+id/timePicker"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>

<com.erz.timepicker_library.TimePicker
    xmlns:timepicker="http://schemas.android.com/apk/res-auto"
    android:id="@+id/timePicker"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    timepicker:clock_color="#FF0000"
    timepicker:text_color="#FF0000"
    timepicker:dial_color="#FF0000"/>
```

```java
TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);

//or 

TimePicker timePicker = new TimePicker(context);

//Set TimePicker Color
timePicker.setColor(Color.BLUE);

//Set Dial Color
timePicker.setDialColor(Color.RED);

//Set Clock Color
timePicker.setClockColor(Color.GREEN);

//Set Text Color
timePicker.setTextColor(Color.YELLOW);

//Disable Touch
timePicker.disableTouch(true);

//Enable Twenty Four Hour Clock
timePicker.enableTwentyFourHour(true);

//Set Time
timePicker.setTime(new Date());

//Get Time
timePicker.getTime();

//Set OnTimeChangedListener
timePicker.setTimeChangedListener(this);

//OnTimeChangeListener Interface
public static interface OnTimeChangedListener {
    public void timeChanged(Date date);
}
```
<H2>License</H2>
    Copyright 2015 erz05

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

