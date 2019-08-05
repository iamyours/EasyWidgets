### easylayout
[自定义Layout，让子View支持圆角属性](https://www.jianshu.com/p/afc930586210)

### EasyTabLayout
在[FlycoTabLayout](https://github.com/H07000223/FlycoTabLayout)基础上修改，增加了选中字体大小（tl_textSelectSize）
```
compile 'com.easywidgets.tablayout:EasyTabLayout:1.0.1'
```
for AndroidX
```
compile 'com.easywidgets.tablayout:EasyTabLayoutX:1.0.1'
```
 <com.easywidgets.tablayout.EasyTabLayout
        android:id="@+id/tabLayout"
        android:layout_width="match_parent"
        android:layout_height="44dp"
        android:background="@color/title_black"
        app:tl_indicator_color="#FFD96F"
        app:tl_indicator_corner_radius="2dp"
        app:tl_indicator_gravity="BOTTOM"
        app:tl_indicator_height="4dp"
        app:tl_indicator_margin_bottom="4dp"
        app:tl_textBold="SELECT"
        app:tl_textSelectColor="#fff"
        app:tl_textSelectSize="16sp"
        app:tl_textUnselectColor="#fefefe"
        app:tl_textsize="15sp"
        app:tl_underline_height="4dp" />
```