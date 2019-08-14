### easylayout
[自定义Layout，让子View支持圆角属性](https://www.jianshu.com/p/afc930586210)

### EasyTabLayout
在[FlycoTabLayout](https://github.com/H07000223/FlycoTabLayout)基础上修改，增加了选中字体大小（tl_textSelectSize）
```
compile 'com.easywidgets.tablayout:EasyTabLayout:1.0.2'
```
for AndroidX
在gradle.properties中添加
```
android.useAndroidX=true
android.enableJetifier=true
```

```
  <com.easywidgets.tablayout.EasyTabLayout
         android:id="@+id/tabLayout"
         android:layout_width="match_parent"
         android:layout_height="69dp"
         android:clipToPadding="false"
         android:paddingLeft="16dp"
         android:paddingRight="16dp"
         app:tl_indicator_color="#f00"
         app:tl_indicator_height="2dp"
         app:tl_textBold="SELECT"
         app:tl_textSelectColor="#333"
         app:tl_textSelectSize="20sp"
         app:tl_textUnselectColor="#999"
         app:tl_textsize="14sp" />
```
效果

<img src="./screen/easytablayout.gif" width="50%">