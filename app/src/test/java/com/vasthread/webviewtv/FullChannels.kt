package com.vasthread.webviewtv

import com.vasthread.webviewtv.playlist.Channel

val fullChannels = mutableListOf<Channel>()
    .addChannels(
        "央视",
        Channel("CCTV-1 综合", "", listOf("https://tv.cctv.com/live/cctv1/",
            "https://www.yangshipin.cn/tv/home?pid=600001859")),
        Channel("CCTV-2 财经", "", listOf("https://tv.cctv.com/live/cctv2/",
            "https://www.yangshipin.cn/tv/home?pid=600001800")),
        Channel("CCTV-3 综艺", "", listOf("https://tv.cctv.com/live/cctv3/")),
        Channel("CCTV-4 中文国际", "", listOf("https://tv.cctv.com/live/cctv4/",
            "https://www.yangshipin.cn/tv/home?pid=600001814")),
        Channel("CCTV-5 体育", "", listOf("https://tv.cctv.com/live/cctv5/")),
        Channel("CCTV-5+ 体育赛事", "", listOf("https://tv.cctv.com/live/cctv5plus/")),
        Channel("CCTV-6 电影", "", listOf("https://tv.cctv.com/live/cctv6/",
            "http://mobilelive-timeshift.ysp.cctv.cn/timeshift/ysp/2013693901/timeshift.m3u8?delay=0")),
        Channel("CCTV-7 国防军事", "", listOf("https://tv.cctv.com/live/cctv7/",
            "https://www.yangshipin.cn/tv/home?pid=600004092")),
        Channel("CCTV-8 电视剧", "", listOf("https://tv.cctv.com/live/cctv8/")),
        Channel("CCTV-9 记录", "", listOf("https://tv.cctv.com/live/cctvjilu/",
            "https://www.yangshipin.cn/tv/home?pid=600004078")),
        Channel("CCTV-10 科教", "", listOf("https://tv.cctv.com/live/cctv10/",
            "https://www.yangshipin.cn/tv/home?pid=600001805")),
        Channel("CCTV-11 戏曲", "", listOf("https://tv.cctv.com/live/cctv11/",
            "https://www.yangshipin.cn/tv/home?pid=600001806")),
        Channel("CCTV-12 社会与法", "", listOf("https://tv.cctv.com/live/cctv12/",
            "https://www.yangshipin.cn/tv/home?pid=600001807")),
        Channel("CCTV-13 新闻", "", listOf("https://tv.cctv.com/live/cctv13/",
            "https://www.yangshipin.cn/tv/home?pid=600001811")),
        Channel("CCTV-14 少儿", "", listOf("https://tv.cctv.com/live/cctvchild/",
            "https://www.yangshipin.cn/tv/home?pid=600001809")),
        Channel("CCTV-15 音乐", "", listOf("https://tv.cctv.com/live/cctv15/",
            "https://www.yangshipin.cn/tv/home?pid=600001815")),
        Channel("CCTV-16 奥林匹克", "", listOf("https://tv.cctv.com/live/cctv16/",
            "https://www.yangshipin.cn/tv/home?pid=600098637")),
        Channel("CCTV-17 农业农村", "", listOf("https://tv.cctv.com/live/cctv17/",
            "https://www.yangshipin.cn/tv/home?pid=600001810")),
        Channel("CCTV-4 中文国际（欧洲）", "", listOf("https://tv.cctv.com/live/cctveurope/")),
        Channel("CCTV-4 中文国际（美洲）", "", listOf("https://tv.cctv.com/live/cctvamerica/")),
        Channel("CCTV-4K 超高清", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002264")),
    )
    .addChannels(
        "国家",
        Channel("CETV-1 综合教育", "", listOf("https://tv.gxtv.cn/channel/channelivePlay_ffa6b6e1b32b4a16a73eb3ef66f8bfc7.html")),
        Channel("CETV-2 空中课堂", "", listOf("https://tv.gxtv.cn/channel/channelivePlay_80d0ffb42c114eaf9663708629ff0a3e.html")),
        Channel("CETV-4 职业教育", "", listOf("https://tv.gxtv.cn/channel/channelivePlay_67eace939278435bb4bca90800fb4225.html",
            "https://edu.cctv.com/cetv/")),

        Channel("CECTV-1 汉语文化", "", listOf("http://m3u8.cec-tv.com.cn/?url=http://play.cec-tv.com.cn/channel/cec-tv1.m3u8",
            "http://play.cec-tv.com.cn/channel/cec-tv1.m3u8")),
        Channel("CECTV-2 国际旅游", "", listOf("http://m3u8.cec-tv.com.cn/?url=http://play.cec-tv.com.cn/channel/cec-tv2.m3u8",
            "http://play.cec-tv.com.cn/channel/cec-tv2.m3u8")),
        Channel("CECTV-3 国际教育", "", listOf("http://m3u8.cec-tv.com.cn/?url=http://play.cec-tv.com.cn/channel/cec-tv3.m3u8",
            "http://play.cec-tv.com.cn/channel/cec-tv3.m3u8")),
        Channel("CECTV-4 国际健康", "", listOf("http://m3u8.cec-tv.com.cn/?url=http://play.cec-tv.com.cn/channel/cec-tv4.m3u8",
            "http://play.cec-tv.com.cn/channel/cec-tv4.m3u8")),

        Channel("CGTN", "", listOf("https://www.cgtn.com/tv",
            "https://www.yangshipin.cn/tv/home?pid=600014550",)),
        Channel("CGTN Español", "", listOf("https://espanol.cgtn.com/en-directo",
            "https://www.yangshipin.cn/tv/home?pid=600084744")),
        Channel("CGTN Français", "", listOf("https://francais.cgtn.com/channel",
            "https://www.yangshipin.cn/tv/home?pid=600084704")),
        Channel("CGTN العربية", "", listOf("https://arabic.cgtn.com/channel",
            "https://www.yangshipin.cn/tv/home?pid=600084782")),
        Channel("CGTN Русский", "", listOf("https://russian.cgtn.com/channel",
            "https://www.yangshipin.cn/tv/home?pid=600084758")),
        Channel("CGTN Documentary", "", listOf("https://www.cgtn.com/channel/documentary",
            "https://www.yangshipin.cn/tv/home?pid=600084781")),

        Channel("中国气象频道", "", listOf("http://www.weathertv.cn",
            "http://hls.weathertv.cn/tslslive/qCFIfHB/hls/live_sd.m3u8")),
    )
    .addChannels(
        "卫视",
        Channel("北京卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002309",
            "https://www.brtn.cn/btv/btvsy_index")),
        Channel("江苏卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002521")),
        Channel("东方卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002483")),
        Channel("浙江卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002520")),
        Channel("湖南卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002475")),
        Channel("湖北卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002508")),
        Channel("广东卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002485")),
        Channel("广西卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002509",
            "https://tv.gxtv.cn/channel/channelivePlay_e7a7ab7df9fe11e88bcfe41f13b60c62.html")),
        Channel("黑龙江卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002498")),
        Channel("海南卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002506")),
        Channel("重庆卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002531")),
        Channel("深圳卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002481")),
        Channel("四川卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002516")),
        Channel("康巴卫视", "", listOf("https://www.kangbatv.com/zb_22587/")),
        Channel("河南卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002525")),
        Channel("东南卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002484")),
        Channel("海峡卫视", "", listOf("https://www.fjtv.net/folder526/folder536/")),
        Channel("贵州卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002490")),
        Channel("江西卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002503")),
        Channel("辽宁卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002505")),
        Channel("安徽卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002532")),
        Channel("河北卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002493")),
        Channel("山东卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002513")),
        Channel("山西卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600190407",
            "https://www.sxrtv.com/tv/index.shtml")),
        Channel("吉林卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600190405")),
        Channel("延边卫视", "", listOf("https://www.yb983.com/cys/index.html")),
        Channel("大湾区卫视", "", listOf("https://m.gdtv.cn/tvChannelDetail/51")),
        Channel("大湾区卫视（海外版）", "", listOf("https://m.gdtv.cn/tvChannelDetail/46")),
        Channel("内蒙古卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600190401",
            "https://www.nmtv.cn/liveTv")),
        Channel("陕西卫视", "", listOf("http://www.sxtvs.com/sxtvs_sxws/index.html")),
        Channel("云南卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600190402")),
        Channel("青海卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600190406",
            "http://www.qhbtv.com/new_index/live/folder2646/")),
        Channel("天津卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600152137")),
        Channel("陕西卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600190400")),
        Channel("甘肃卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600190408")),
        Channel("宁夏卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600190737")),
        Channel("新疆卫视", "", listOf("https://www.xjtvs.com.cn/column/tv/434?channelId=1")),
        Channel("西藏卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600190403")),
    )
    .addChannels(
        "北京",
        Channel("北京卫视", "", listOf("https://www.brtn.cn/btv/btvsy_index")),
        Channel("北京文艺", "", listOf("https://www.brtn.cn/btv/btvsy_index")),
        Channel("北京纪实科教", "", listOf("https://www.brtn.cn/btv/btvsy_index")),
        Channel("北京影视", "", listOf("https://www.brtn.cn/btv/btvsy_index")),
        Channel("北京财经", "", listOf("https://www.brtn.cn/btv/btvsy_index")),
        Channel("北京体育休闲", "", listOf("https://www.brtn.cn/btv/btvsy_index")),
        Channel("北京生活", "", listOf("https://www.brtn.cn/btv/btvsy_index")),
        Channel("北京新闻", "", listOf("https://www.brtn.cn/btv/btvsy_index")),
        Channel("卡酷少儿", "", listOf("https://www.brtn.cn/btv/btvsy_index")),
    )
    .addChannels(
        "湖南",
        Channel("湖南卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002475")),
        Channel("湖南经视", "", listOf("https://live.mgtv.com/?channelId=280")),
        Channel("湖南电影", "", listOf("https://live.mgtv.com/?channelId=221")),
        Channel("湖南娱乐", "", listOf("https://live.mgtv.com/?channelId=344")),
        Channel("湖南都市", "", listOf("https://live.mgtv.com/?channelId=346")),
        Channel("湖南电视剧", "", listOf("https://live.mgtv.com/?channelId=484")),
        Channel("湖南国际", "", listOf("https://live.mgtv.com/?channelId=229")),
        Channel("金鹰卡通", "", listOf("https://live.mgtv.com/?channelId=287")),
        Channel("金鹰纪实", "", listOf("https://live.mgtv.com/?channelId=316")),
        Channel("湖南爱晚", "", listOf("https://live.mgtv.com/?channelId=261")),
        Channel("先锋乒羽", "", listOf("https://live.mgtv.com/?channelId=329")),
        Channel("快乐垂钓", "", listOf("https://live.mgtv.com/?channelId=218")),
        Channel("茶频道", "", listOf("https://live.mgtv.com/?channelId=578")),
        Channel("长沙新闻综合", "", listOf("https://live.mgtv.com/?channelId=269")),
        Channel("长沙政法", "", listOf("https://live.mgtv.com/?channelId=254")),
    )
    .addChannels(
        "湖北",
        Channel("湖北卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002508",
            "https://news.hbtv.com.cn/app/tv/431")),
        Channel("湖北经视", "", listOf("https://news.hbtv.com.cn/app/tv/432")),
        Channel("湖北综合", "", listOf("https://news.hbtv.com.cn/app/tv/433")),
        Channel("湖北影视", "", listOf("https://news.hbtv.com.cn/app/tv/434")),
        Channel("湖北生活", "", listOf("https://news.hbtv.com.cn/app/tv/436")),
        Channel("湖北教育", "", listOf("https://news.hbtv.com.cn/app/tv/437")),
        Channel("湖北垄上", "", listOf("https://news.hbtv.com.cn/app/tv/438")),
    )
    .addChannels(
        "广东",
        Channel("广东卫视", "", listOf(
            "https://www.yangshipin.cn/tv/home?pid=600002485",
            "https://m.gdtv.cn/tvChannelDetail/43")),
        Channel("广东珠江", "", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=gdzj",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=gdzj",
            "https://m.gdtv.cn/tvChannelDetail/44")),
        Channel("广东新闻", "", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=gdxw",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=gdxw",
            "https://m.gdtv.cn/tvChannelDetail/45")),
        Channel("广东民生", "", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=gdms",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=gdms",
            "https://m.gdtv.cn/tvChannelDetail/48")),
        Channel("广东体育", "", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=gdty",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=gdty",
            "https://m.gdtv.cn/tvChannelDetail/47")),
        Channel("大湾区卫视", "", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=dwqws",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=dwqws",
            "https://m.gdtv.cn/tvChannelDetail/51")),
        Channel("大湾区卫视（海外版）", "", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=gdgj",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=gdgj",
            "https://m.gdtv.cn/tvChannelDetail/46")),
        Channel("经济科教", "", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=jjkj",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=jjkj",
            "https://m.gdtv.cn/tvChannelDetail/49")),
        Channel("广东影视", "", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=gdys",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=gdys",
            "https://m.gdtv.cn/tvChannelDetail/53")),
        Channel("4K超高清","", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=gdzy",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=gdzy",
            "https://m.gdtv.cn/tvChannelDetail/16")),
        Channel("广东少儿", "", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=gdse",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=gdse",
            "https://m.gdtv.cn/tvChannelDetail/54")),
        Channel("嘉佳卡通", "", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=jjkt",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=jjkt",
            "https://m.gdtv.cn/tvChannelDetail/66")),
        Channel("岭南戏曲", "", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=lnxq",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=lnxq",
            "https://m.gdtv.cn/tvChannelDetail/15")),
        Channel("现代教育", "", listOf(
            "http://2017.ydns.eu/site/video.html?id=http://2017.ydns.eu/wap/v2.php?id=xdjy",
            "https://2018.v2free.cf/site/video.html?id=https://2018.v2free.cf/wap/v2.php?id=xdjy",
            "https://m.gdtv.cn/tvChannelDetail/13")),
        Channel("荔枝台", "", listOf("https://m.gdtv.cn/tvChannelDetail/94")),
        Channel("纪录片", "", listOf("https://m.gdtv.cn/tvChannelDetail/100")),
        Channel("GRTN健康频道", "", listOf("https://m.gdtv.cn/tvChannelDetail/99")),
        Channel("GRTN文化频道", "", listOf("https://m.gdtv.cn/tvChannelDetail/75")),
        Channel("GRTN生活频道", "", listOf("https://m.gdtv.cn/tvChannelDetail/102")),
        Channel("GRTN教育频道", "", listOf("https://m.gdtv.cn/tvChannelDetail/104")),

        Channel("广州综合", "", listOf("https://www.gztv.com/#/channel")),

        Channel("深圳卫视", "", listOf("https://www.sztv.com.cn/pindao/index.html?id=7867")),
        Channel("深圳都市", "", listOf("https://www.sztv.com.cn/pindao/index.html?id=7868")),
        Channel("深圳电视剧", "", listOf("https://www.sztv.com.cn/pindao/index.html?id=7880")),
        Channel("深圳财经", "", listOf("https://www.sztv.com.cn/pindao/index.html?id=7871")),
        Channel("深圳国际", "", listOf("https://www.sztv.com.cn/pindao/index.html?id=7944")),
        Channel("深圳少儿", "", listOf("https://www.sztv.com.cn/pindao/index.html?id=7881")),

        Channel("佛山顺德", "", listOf("http://xiubo.net/tv/gd/fssd.html")),
        Channel("佛山公共", "", listOf("http://xiubo.net/tv/gd/fsgg.html")),
        Channel("佛山影视", "", listOf("http://xiubo.net/tv/gd/fsys.html")),
        Channel("佛山高明", "", listOf("http://xiubo.net/tv/gd/fsgm.html")),
        Channel("佛山三水", "", listOf("http://xiubo.net/tv/gd/fsss.html")),
        Channel("佛山综合", "", listOf("http://xiubo.net/tv/gd/fszh.html")),
        Channel("佛山南海", "", listOf("http://xiubo.net/tv/gd/fsnh.html")),
    )
    .addChannels(
        "广西",
        Channel("广西卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002509",
            "https://tv.gxtv.cn/channel/channelivePlay_e7a7ab7df9fe11e88bcfe41f13b60c62.html")),
        Channel("广西综艺旅游", "", listOf("https://tv.gxtv.cn/channel/channelivePlay_f3335975f9fe11e88bcfe41f13b60c62.html")),
        Channel("广西都市", "", listOf("https://tv.gxtv.cn/channel/channelivePlay_fdbaf085f9fe11e88bcfe41f13b60c62.html")),
        Channel("广西影视", "", listOf("https://tv.gxtv.cn/channel/channelivePlay_5e923d82058e11e9ba67e41f13b60c62.html")),
        Channel("广西新闻", "", listOf("https://tv.gxtv.cn/channel/channelivePlay_9dfd8600075811e9ba67e41f13b60c62.html")),
        Channel("广西国际", "", listOf("https://tv.gxtv.cn/channel/channelivePlay_bfa17b64157f11e999f0e41f13b60c62.html")),
        Channel("广西移动", "", listOf("https://tv.gxtv.cn/channel/channelivePlay_78dbfd44e6b74ab687204d2d8113cbf5.html")),
        Channel("玉林新闻综合", "", listOf("https://web.guangdianyun.tv/tv/3289?uin=4042")),
        Channel("玉林公共", "", listOf("https://web.guangdianyun.tv/tv/3290?uin=4042")),
        )
    .addChannels(
        "江西",
        Channel("江西卫视", "", listOf("https://www.jxntv.cn/live/#/")),
        Channel("江西都市", "", listOf("https://www.jxntv.cn/live/#/jxtv2")),
        Channel("江西经济生活", "", listOf("https://www.jxntv.cn/live/#/jxtv3")),
        Channel("江西影视旅游", "", listOf("https://www.jxntv.cn/live/#/jxtv4")),
        Channel("江西公共农业", "", listOf("https://www.jxntv.cn/live/#/jxtv5")),
        Channel("江西少儿", "", listOf("https://www.jxntv.cn/live/#/jxtv6")),
        Channel("江西新闻", "", listOf("https://www.jxntv.cn/live/#/jxtv7")),
        Channel("江西移动", "", listOf("https://www.jxntv.cn/live/#/jxtv8")),
    )
    .addChannels(
        "江苏",
        Channel("江苏卫视", "", listOf("https://live.jstv.com/?channelId=534")),
        Channel("江苏城市", "", listOf("https://live.jstv.com/?channelId=535")),
        Channel("江苏综艺", "", listOf("https://live.jstv.com/?channelId=556")),
        Channel("江苏影视", "", listOf("https://live.jstv.com/?channelId=542")),
        Channel("江苏新闻", "", listOf("https://live.jstv.com/?channelId=536")),
        Channel("江苏教育", "", listOf("https://live.jstv.com/?channelId=545")),
        Channel("江苏体育", "", listOf("https://live.jstv.com/?channelId=537")),
        Channel("江苏国际", "", listOf("https://live.jstv.com/?channelId=544")),
        Channel("优漫卡通", "", listOf("https://live.jstv.com/?channelId=543")),
        Channel("江宁综合", "", listOf("http://tv.haoqu99.com/3/jiangsu/jiangning.html")),
    )
    .addChannels(
        "河北",
        Channel("河北卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002493",
            "https://www.hebtv.com/19/19js/st/xdszb/index.shtml?index=0")),
        Channel("经济生活", "", listOf("https://www.hebtv.com/19/19js/st/xdszb/index.shtml?index=1")),
        Channel("农民频道", "", listOf("https://www.hebtv.com/19/19js/st/xdszb/index.shtml?index=2")),
        Channel("河北都市", "", listOf("https://www.hebtv.com/19/19js/st/xdszb/index.shtml?index=3")),
        Channel("河北影视剧", "", listOf("https://www.hebtv.com/19/19js/st/xdszb/index.shtml?index=4")),
        Channel("少儿科教", "", listOf("https://www.hebtv.com/19/19js/st/xdszb/index.shtml?index=5")),
    )
    .addChannels(
        "河南",
        Channel("河南卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002525")),
        Channel("河南都市", "", listOf("https://www.hntv2.net/index.html#/pages/tv/index")),
    )
    .addChannels(
        "上海",
        Channel("东方卫视", "", listOf("https://live.kankanews.com/huikan")),
        Channel("新闻综合", "", listOf("https://live.kankanews.com/huikan?id=2")),
        Channel("外语频道", "", listOf("https://live.kankanews.com/huikan?id=3")),
        Channel("都市频道", "", listOf("https://live.kankanews.com/huikan?id=4")),
        Channel("第一财经", "", listOf("https://live.kankanews.com/huikan?id=5")),
        Channel("纪实人文", "", listOf("https://live.kankanews.com/huikan?id=6")),
        Channel("哈哈炫动", "", listOf("https://live.kankanews.com/huikan?id=9")),
    )
    .addChannels(
        "浙江",
        Channel("浙江卫视", "", listOf("https://www.cztv.com/liveTV/101",
            "https://www.yangshipin.cn/tv/home?pid=600002520")),
        Channel("浙江钱江", "", listOf("https://www.cztv.com/liveTV/102")),
        Channel("浙江经济生活", "", listOf("https://www.cztv.com/liveTV/103")),
        Channel("浙江教科影视", "", listOf("https://www.cztv.com/liveTV/104")),
        Channel("浙江民生休闲", "", listOf("https://www.cztv.com/liveTV/106")),
        Channel("浙江新闻", "", listOf("https://www.cztv.com/liveTV/107")),
        Channel("浙江少儿", "", listOf("https://www.cztv.com/liveTV/108")),
        Channel("浙江国际", "", listOf("https://www.cztv.com/liveTV/110")),
        Channel("浙江之江纪录", "", listOf("https://www.cztv.com/liveTV/112")),

        Channel("杭州综合", "", listOf("https://tv.hoolo.tv/hzzh/")),
        Channel("西湖明珠", "", listOf("https://tv.hoolo.tv/xhmz/")),
        Channel("杭州生活", "", listOf("https://tv.hoolo.tv/hzsh/")),
        Channel("杭州影视", "", listOf("https://tv.hoolo.tv/utv/")),
        Channel("杭州青少体育", "", listOf("https://tv.hoolo.tv/hzse/")),
        Channel("杭州文化", "", listOf("https://tv.hoolo.tv/whpd/")),

        Channel("宁波新闻综合", "", listOf("https://www.ncmc.nbtv.cn/gbds/folder8458/NBTV1/index.shtml")),
        Channel("宁波经济生活", "", listOf("https://www.ncmc.nbtv.cn/gbds/folder8458/NBTV2/index.shtml")),
        Channel("宁波都市文体", "", listOf("https://www.ncmc.nbtv.cn/gbds/folder8458/NBTV3/index.shtml")),
        Channel("宁波影视剧", "", listOf("https://www.ncmc.nbtv.cn/gbds/folder8458/NBTV4/index.shtml")),

        Channel("绍兴新闻综合", "", listOf("https://www.shaoxing.com.cn/app/tv/74",
            "http://live.shaoxing.com.cn/video/s10001-sxhb/index.m3u8")),
        Channel("绍兴公共", "", listOf("https://www.shaoxing.com.cn/app/tv/78",
            "http://live.shaoxing.com.cn/video/s10001-sxtv2/index.m3u8")),
        Channel("绍兴文化影视", "", listOf("https://www.shaoxing.com.cn/app/tv/75",
            "http://live.shaoxing.com.cn/video/s10001-sxtv3/index.m3u8")),
    )
    .addChannels(
        "安徽",
        Channel("安徽卫视", "", listOf("https://www.ahtv.cn/folder9000/folder20193?channelIndex=0")),
        Channel("安徽经济生活", "", listOf("https://www.ahtv.cn/folder9000/folder20193?channelIndex=1")),
        Channel("安徽综艺体育", "", listOf("https://www.ahtv.cn/folder9000/folder20193?channelIndex=2")),
        Channel("安徽影视", "", listOf("https://www.ahtv.cn/folder9000/folder20193?channelIndex=3")),
        Channel("安徽公共", "", listOf("https://www.ahtv.cn/folder9000/folder20193?channelIndex=4")),
        Channel("安徽农业科教", "", listOf("https://www.ahtv.cn/folder9000/folder20193?channelIndex=5")),
        Channel("安徽国际", "", listOf("https://www.ahtv.cn/folder9000/folder20193?channelIndex=6")),
        Channel("安徽移动", "", listOf("https://www.ahtv.cn/folder9000/folder20193?channelIndex=7")),

        Channel("淮北新闻综合", "", listOf("https://www.hbnews.net/tv/")),
        Channel("亳州综合", "", listOf("https://www.ahbztv.com/televisi0n.html")),
        Channel("滁州新闻综合", "", listOf("http://www.cztv.cc/Live/index?liveid=1")),
        Channel("滁州公共", "", listOf("http://www.cztv.cc/Live/index?liveid=2")),
        Channel("滁州科教", "", listOf("http://www.cztv.cc/Live/index?liveid=3")),
        Channel("芜湖新闻综合", "", listOf("http://www.wuhubtv.com/folder1194/#")),
    )
    .addChannels(
        "贵州",
        Channel("贵州卫视", "", listOf("https://www.gzstv.com/tv/ch01")),
        Channel("贵州公共", "", listOf("https://www.gzstv.com/tv/ch02")),
        Channel("贵州影视文艺", "", listOf("https://www.gzstv.com/tv/ch03")),
        Channel("贵州大众生活", "", listOf("https://www.gzstv.com/tv/ch04")),
        Channel("贵州生态乡村", "", listOf("https://www.gzstv.com/tv/ch05")),
        Channel("贵州科教健康", "", listOf("https://www.gzstv.com/tv/ch06")),
        Channel("贵州移动", "", listOf("https://www.gzstv.com/tv/ch13")),
    )
    .addChannels(
        "山东",
        Channel("山东卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002513")),
        Channel("青岛一套", "", listOf("http://www.qtv.com.cn/live/tv/index.shtml")),
        Channel("青岛二套", "", listOf("http://www.qtv.com.cn/live/tv/tv_qtv2.shtml")),
        Channel("青岛三套", "", listOf("http://www.qtv.com.cn/live/tv/tv_qtv3.shtml")),
        Channel("青岛四套", "", listOf("http://www.qtv.com.cn/live/tv/tv_qtv4.shtml")),
        Channel("青岛五套", "", listOf("http://www.qtv.com.cn/live/tv/tv_qtv5.shtml")),
        Channel("青岛六套", "", listOf("http://www.qtv.com.cn/live/tv/tv_qtv6.shtml")),
    )
    .addChannels(
        "山西",
        Channel("山西卫视", "", listOf("https://www.sxrtv.com/tv/index.shtml")),
        Channel("太原新闻综合", "", listOf("https://www.sxtygdy.com/23/23mbdszb/index.shtml")),
        Channel("大同新闻综合", "", listOf("https://www.dtradio.com.cn/local/folder25")),
        Channel("阳泉新闻综合", "", listOf("https://www.yqrtv.com/folder74/folder139?id=10")),
        Channel("阳泉科教", "", listOf("https://www.yqrtv.com/folder74/folder139?id=11")),
    )
    .addChannels(
        "吉林",
        Channel("吉林卫视", "", listOf("https://www.jlntv.cn/tv?id=104")),
        Channel("延边卫视", "", listOf("https://www.yb983.com/cys/index.html")),
        Channel("延边朝鲜语综合", "", listOf("https://www.yb983.com/ybtv1/index.html")),
        Channel("延边汉语综合", "", listOf("https://www.yb983.com/ybtv2/index.html")),
    )
    .addChannels(
        "黑龙江",
        Channel("黑龙江卫视", "", listOf("https://www.hljtv.com/live/folder418/")),
        Channel("黑龙江文体", "", listOf("https://www.hljtv.com/live/folder423/")),
        Channel("黑龙江影视", "", listOf("https://www.hljtv.com/live/folder425/")),
        Channel("黑龙江新闻法治", "", listOf("https://www.hljtv.com/live/folder424/")),
        Channel("黑龙江农业科教", "", listOf("https://www.hljtv.com/live/folder419/")),
        Channel("黑龙江少儿", "", listOf("https://www.hljtv.com/live/folder422/")),
        Channel("哈尔滨新闻综合", "", listOf("https://www.hrbtv.net/folder79/folder81/")),
        Channel("哈尔滨生活", "", listOf("https://www.hrbtv.net/folder79/folder85/")),
        Channel("哈尔滨影视", "", listOf("https://www.hrbtv.net/folder79/folder87/")),
    )
    .addChannels(
        "海南",
        Channel("海南卫视", "", listOf("http://tc.hnntv.cn/")),
        Channel("三沙卫视", "", listOf("https://www.hnntv.cn/live.html?playType=livePlay&channelId=5")),
        Channel("海南新闻", "", listOf("https://www.hnntv.cn/live.html?playType=livePlay&channelId=3")),
        Channel("海南公共", "", listOf("https://www.hnntv.cn/live.html?playType=livePlay&channelId=4")),
        Channel("海南文旅", "", listOf("https://www.hnntv.cn/live.html?playType=livePlay&channelId=6")),
        Channel("海南少儿", "", listOf("https://www.hnntv.cn/live.html?playType=livePlay&channelId=7")),
        Channel("海南自贸", "", listOf("https://www.hnntv.cn/live.html?playType=livePlay&channelId=1")),
    )
    .addChannels(
        "福建",
        Channel("东南卫视", "", listOf("https://www.yangshipin.cn/tv/home?pid=600002484",
            "https://live.fjtv.net/setv/")),
        Channel("海峡卫视", "", listOf("https://www.fjtv.net/folder526/folder536/")),
        Channel("福建新闻", "", listOf("https://live.fjtv.net/xwpd/")),
        Channel("福建旅游", "", listOf("https://live.fjtv.net/dspd/")),
        Channel("福建公共", "", listOf("https://live.fjtv.net/ggpd/")),
        Channel("福建经视", "", listOf("https://live.fjtv.net/jspd/")),
        Channel("厦门新闻综合", "", listOf("https://live1b.kxm.xmtv.cn/xm1bf/tvzb/live.m3u8")),
        Channel("厦门海峡", "", listOf("https://live1b.kxm.xmtv.cn/xm2bf/playlist.m3u8",
            "https://live1b.kxm.xmtv.cn/xm2bf/tvzb/live.m3u8")),
    )
    .addChannels(
        "甘肃",
        Channel("甘肃卫视", "", listOf("http://www.gstv.com.cn/zxc.jhtml", "http://hls.gstv.com.cn/9hvng2/hcoqhp.m3u8")),
        Channel("甘肃经济", "", listOf("http://hls.gstv.com.cn/49048r/10iv1j.m3u8")),
        Channel("甘肃文化影视", "", listOf("http://hls.gstv.com.cn/49048r/w1l6d5.m3u8")),
        Channel("甘肃公共应急", "", listOf("http://hls.gstv.com.cn/49048r/3t5xyc.m3u8")),
        Channel("甘肃少儿", "", listOf("http://hls.gstv.com.cn/49048r/922k96.m3u8")),
        Channel("甘肃都市", "", listOf("http://hls.gstv.com.cn/49048r/l54391.m3u8")),
        Channel("甘肃移动电视", "", listOf("http://hls.gstv.com.cn/94ycke/v9qci2.m3u8")),
    )
    .addChannels(
        "香港",
        Channel("翡翠台", "", listOf(
            "https://www.tiantianzhibo.net/player/index?id=714fQdFOPs7fA2to6CG0UroN9l0YvCP5kVSLYnbvT654w1jlNQ",
            "https://enz.gdplayertv.to/live-tv/tvb-jade/?embed=1"
        )),
        Channel("無線新聞", "", listOf(
            "https://www.tiantianzhibo.net/player/index?id=5e2avMI8JXyPe9rVuDSxwiCvsqAqCrPBqPsUSWrXDKN2L9rIzA",
            "https://idx.gdplayertv.to/live-tv/tvb-news/?embed=1",
            "https://www.chaojidianshi.net/e/DownSys/play/?classid=3&id=73&pathid=0",
            "https://news.tvb.com/tc/live/83",
        )),
        Channel("明珠台", "", listOf(
            "https://www.tiantianzhibo.net/player/index?id=910drXCXuvox1KxMaCzEhMltq5JK1qSQy9zm-nkstsFwqLSw7i4",
            "https://idx.gdplayertv.to/live-tv/tvb-pearl/?embed=1"
        )),
        Channel("鳳凰衛視資訊台", "", listOf(
            "https://www.chaojidianshi.net/e/DownSys/play/?classid=3&id=99&pathid=0",
            "https://www.fengshows.com/live"
        )),
        Channel("香港衛視", "", listOf("http://zhibo.hkstv.tv/livestream/mutfysrq/playlist.m3u8",
            "http://www.hkstv.tv/index/live.html")),
        Channel("創世電視", "", listOf("https://cdn.deepcore.online/ctv_hk/")),
    )
    .addChannels(
        "澳門",
        Channel("澳視澳門", "", listOf("https://www.tdm.com.mo/zh-hant/live?Channel=1&type=tv",
            "http://61.244.22.5/ch1/ch1.live/index.m3u8")),
        Channel("澳視葡文", "", listOf("https://www.tdm.com.mo/zh-hant/live?Channel=2&type=tv")),
        Channel("澳門資訊", "", listOf("https://www.tdm.com.mo/zh-hant/live?Channel=5&type=tv",
            "http://61.244.22.5/ch5/info_ch5.live/master.m3u8")),
        Channel("澳門體育", "", listOf("https://www.tdm.com.mo/zh-hant/live?Channel=6&type=tv")),
        Channel("澳門綜藝", "", listOf("https://www.tdm.com.mo/zh-hant/live?Channel=7&type=tv")),
        Channel("澳門MACAU", "", listOf("https://www.tdm.com.mo/zh-hant/live?Channel=8&type=tv",
            "http://61.244.22.5/ch3/ch3.live/index.m3u8")),
    )
    .addChannels(
        "台灣",
        Channel("東森新聞", "", listOf(
            "https://idx.gdplayertv.to/live-tv/ebc-news-tv/?embed=1",
            "https://www.tiantianzhibo.net/player/index?id=d7c9cqojVv8HhOKJ21KwZvsYwApfnEiecpCVhysKZsYsWnGGTw",
            "https://www.chaojidianshi.net/e/DownSys/play/?classid=3&id=260165103&pathid=0",
            "https://news.ebc.net.tw/video",
            "https://www.4gtv.tv/channel/4gtv-4gtv152?set=4&ch=292"
        )),
        Channel("東森財經", "", listOf(
            "https://www.tiantianzhibo.net/player/index?id=5440lDG41CDeziB7SsRoChqYyIiSs14oznWXOe6Pw3W09l32yA",
            "https://www.chaojidianshi.net/e/DownSys/play/?classid=3&id=260165109&pathid=0",
            "https://fnc.ebc.net.tw/",
        )),
        Channel("東森綜合", "", listOf(
            "https://idx.gdplayertv.to/live-tv/ebc-variety-tv/?embed=1",
            "https://www.tiantianzhibo.net/player/index?id=f352Z9Iib4gt-4o-2JdjxD-Lcal2DNVSdFv8_KgVIpNEjBnMBA",
            "https://www.chaojidianshi.net/e/DownSys/play/?classid=3&id=260165106&pathid=0"
        )),
        Channel("東森電影", "", listOf(
            "https://idx.gdplayertv.to/live-tv/ebc-movies-tv/?embed=1",
            "https://www.tiantianzhibo.net/player/index?id=faffRjOxK2m5W8AzdGxiWAst6NK0Bly9HTgNJP0Ni7KyWlF7tg",
            "https://www.chaojidianshi.net/e/DownSys/play/?classid=3&id=260165104&pathid=0"
        )),
        Channel("東森戲劇", "", listOf(
            "https://idx.gdplayertv.to/live-tv/ebc-drama-tv/?embed=1",
            "https://www.tiantianzhibo.net/player/index?id=0ba9U596e_liclHp-sRJyA497-B-o2Ff0ws_6SUz1Yv4ZDBsiQ",
            "https://www.chaojidianshi.net/e/DownSys/play/?classid=3&id=260165107&pathid=0"
        )),
        Channel("東森洋片", "", listOf(
            "https://www.tiantianzhibo.net/player/index?id=b731J0NuKSooz1MrvfF8lT9CFViu_ykbNOdGI7OkFYK7BbBy3A"
        )),
        Channel("東森幼幼", "", listOf(
            "https://www.tiantianzhibo.net/player/index?id=8d89ITGSf0YWWa2GH1gY2jel3z4ciyTwW2dZKbQq43ZUD73YCg"
        )),
        Channel("年代新聞", "", listOf(
            "https://www.tiantianzhibo.net/player/index?id=0c771kC3czYydY-9dMP-8087HfO99F_8NiDCWRdINHu9FLGGSQ"
        )),
        Channel("民視第一台", "", listOf("https://www.4gtv.tv/channel/4gtv-4gtv003?set=4&ch=1")),
        Channel("民視台灣台", "", listOf("https://www.4gtv.tv/channel/4gtv-4gtv001?set=4&ch=2")),
        Channel("民視新聞台", "", listOf("https://www.4gtv.tv/channel/litv-ftv13?set=4&ch=31")),
        Channel("民視綜藝台", "", listOf("https://www.4gtv.tv/channel/4gtv-4gtv004?set=4&ch=16")),
        Channel("民視旅遊台", "", listOf("https://www.4gtv.tv/channel/litv-ftv07?set=4&ch=61")),
        Channel("民視影劇台", "", listOf("https://www.4gtv.tv/channel/litv-ftv09?set=4&ch=24")),
        Channel("民視", "", listOf("https://www.4gtv.tv/channel/4gtv-4gtv002?set=4&ch=3")),
        Channel("中視", "", listOf("https://www.4gtv.tv/channel/4gtv-4gtv040?set=4&ch=4")),
        Channel("中視經典台", "", listOf("https://www.4gtv.tv/channel/4gtv-4gtv080?set=4&ch=124")),
        Channel("華視", "", listOf("https://www.4gtv.tv/channel/4gtv-4gtv041?set=4&ch=6")),
        Channel("華視新聞", "", listOf("https://www.4gtv.tv/channel/4gtv-live014?set=4&ch=273")),
        Channel("大愛電視", "", listOf("https://www.4gtv.tv/channel/4gtv-live007?set=4&ch=209")),
        Channel("番薯電視台", "", listOf("http://www.fanstv.tw/fans.html")),
        Channel("ARIRANG阿里郎頻道", "", listOf("https://www.4gtv.tv/channel/4gtv-4gtv079?set=4&ch=189")),
        Channel("原住民族電視台", "", listOf(
            "https://www.ipcf.org.tw/zh-TW/Vod/Home",
            "https://www.4gtv.tv/channel/4gtv-live014?set=4&ch=273"
        )),
    )
    .addChannels(
        "海外",
        Channel("NHK World", "", listOf("https://www3.nhk.or.jp/nhkworld/common/player/tv/cclive/embed/embed.html?movie=truel&lang=zh")),

        Channel("VOA English TV", "", listOf("https://www.voanews.com/live/video/116")),
        Channel("VOA LIVE", "", listOf("https://www.voanews.com/live/video/126")),

        Channel("新唐人美東台", "", listOf("https://www.ntdtv.com/", "https://www.ntdtv.com/b5/live-tv?code=ntd_usa_east")),
//        Channel("新唐人美西台", "", listOf("https://www.ntdtv.com/b5/live-tv?code=ntd_usa_west")),
        Channel("新唐人歐洲台", "", listOf("https://www.ntdtv.com/b5/live-tv?code=ntd_europe")),
        Channel("新唐人加東台", "", listOf("https://www.ntdtv.com/b5/live-tv?code=ntd_ca_east")),
//        Channel("新唐人加西台", "", listOf("https://www.ntdtv.com/b5/live-tv?code=ntd_ca_west")),
//        Channel("新唐人舊金山台", "", listOf("https://www.ntdtv.com/b5/live-tv?code=ntd_usa_sf")),
//        Channel("新唐人休斯頓台", "", listOf("https://www.ntdtv.com/b5/live-tv?code=ntd_usa_tx")),
        Channel("新唐人亞太台", "", listOf("https://www.ntdtv.com.tw/", "https://www.ntdtv.com/b5/live-tv?code=ntd_asia_tw")),
        Channel("新唐人中國台", "", listOf("https://www.ntdtv.com/b5/live-tv?code=ntd_china")),
    )