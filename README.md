CaptchaView
==========  
CaptchaView是一个验证码、邀请码的自定义布局，是在 `InputCodeLayout` 的基础上修改了原生系统键盘删除键不起作用的问题、添加了自定义脱敏样式和自定义`digits`过滤及回调。


效果预览
==========  
![img](http://)  

如何使用
==========  
只需要在 `build.gradle`  的 `dependencies` 添加:

```
compile 'com.opensource:captchaview:1.0.3'
```

### 布局中配置
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:label="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true"
    android:orientation="vertical">

    <com.captcha.CaptchaView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        label:captchaHeight="56dp"
        label:captchaWidth="56dp"
        label:inputMode="number"
        label:number="4"/>
</LinearLayout>
```


属性  | 描述
:------------- | :------------- 
label:number | 验证码可输入的个数
android:textColor | 字体颜色
android:textSize | 字体大小
android:gravity   | CaptchaView 位置
label:captchaWidth | 输入框的宽度
label:captchaHeight| 输入框的高度
label:dividerWidth| 输入框的间距
label:hasFocusBackground| 是否显示获取焦点时背景，默认显示 unFocusBackground 背景
label:focusBackground| 获取焦点时背景
label:unFocusBackground| 失去焦点时背景
label:passwordTransformation| 不可见时样式，如 `● ` 、`*`，不指定为可见显示
label:inputMode| 输入模式，`number` 只可输入数字，`text` 任何，`numberText` 只可输入数字和字母


### 代码中设置

```java
CaptchaView captchaView = (CaptchaView) findViewById(R.id.captchaView);
//设置间距
captchaView.setDivideWidth(20);
//设置输入框个数
captchaView.setNumber(5);
//设置显示位置
captchaView.setGravity(Gravity.CENTER);
//输入类型过滤，如果需指定 digits，这里的InputType必须为CaptchaView.INPUT_TYPE_NUMBER_TEXT才起作用
captchaView.setInputType(CaptchaView.INPUT_TYPE_NUMBER_TEXT, "1234efcsf*");
```

#### 添加回调
```java
captchaView.setOnInputCompleteListener(new CaptchaView.OnInputCompleteCallback() {
    @Override
    public void onInputCompleteListener(String captcha) {
        // 输入完成回调
    }

    @Override
    public void onError(String error) {
    	  // InputType必须为CaptchaView.INPUT_TYPE_NUMBER_TEXT，才回调
    	  // error 为不在 digits 中的字符
    }
});
```
感谢
==========  
[InputCodeLayout](https://github.com/Airsaid/InputCodeLayout) 

[https://stackoverflow.com/questions/4886858/android-edittext-deletebackspace-key-event](https://stackoverflow.com/questions/4886858/android-edittext-deletebackspace-key-event)

License
==========
```
Copyright 2017 utouch

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
