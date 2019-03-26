# img2color
## What is img2color
As we all know, product managers are the biggest enemies every existed in this world. Their order sometimes may seem proactive and unreliable.  
Such as this one:  
> “根据用户手机壳颜色来改变app主题颜色”  

This is of course unimplementable using no extra hardware (at least I think so). However, this thought can be possibly converted to the problem "Make a pure color image based on the given image".  
img2color is one of the ways to do that, inspired by [chensiun](https://github.com/chensiun/wechat-color-thief).  
## How to use
- Step 1  
Put your image file into folder `imgInput`.
- Step 2  
Create an `Image` Object with the file name of your image as the parameter. (i.e `new Image("1.jpg")`).
- Step 3  
Run the program with `create()` method. (i.e `image.create();` image is the name of the Image object here).
- Step 4  
Get your converted pure color image in the folder `imgOutput`.
## TODO
The algorithm needs to be improved.  

![img](https://ss.csdn.net/p?https://mmbiz.qpic.cn/mmbiz_jpg/bcPwoCALib9L6gBWozgiazHc0ldCxGxPSVbe89RoK1Hh4CbsSibCARFI2wKZVugcDsRiawt0Rdm8ZkC4hF0TUvxL5A/640?wx_fmt=jpeg)
