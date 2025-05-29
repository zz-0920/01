// 鼠标在白色 speed 区域内移动时，动态控制彩色 speed-bar 的高度和视频播放速度

// 1. 获取页面元素
var speed = document.querySelector('.speed');      // 白色速度控制容器
var speedBar = document.querySelector('.speed-bar'); // 彩色进度条
var video = document.querySelector('.flex');         // 视频播放器

// 2. 监听 speed 区域的鼠标移动事件
speed.addEventListener('mousemove', function (e) {
    // 2.1 获取鼠标在 speed 区域内的 Y 坐标
    var y = e.pageY - speed.offsetTop;
    // 2.2 计算鼠标位置占 speed 高度的百分比
    var percent = y / speed.offsetHeight;
    // 2.3 计算彩色条的高度百分比
    var height = Math.round(percent * 100) + '%';
    speedBar.style.height = height; // 设置彩色条高度
    
    // 2.4 计算播放速度，范围 0.5x ~ 5x
    var min = 0.5;
    var max = 5;
    var scale = (percent * (max - min)) + min;
    speedBar.textContent = scale.toFixed(2) + 'x'; // 显示当前速度

    // 2.5 设置视频播放速度
    video.playbackRate = scale;
})