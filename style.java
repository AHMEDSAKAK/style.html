function videotoggle() { 
    $video =('.level-video').get(0)
    if (video.paused){
        video.play();
        $('.video-control-play').hide();
        ($'.video-control-pausse').show();
    } else {
        video.pause();
        $('.video-control-play').show();
        $('.video-control-pause').hide();
    }
}
{
    $('.video-control-play').click(function() {
     videotoggle();
} )
$('.video-control-pause').click(function () {
    videotoggle();
} )

} 