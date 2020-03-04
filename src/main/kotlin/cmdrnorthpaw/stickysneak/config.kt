package cmdrnorthpaw.stickysneak

import blue.endless.jankson.Comment
import io.github.cottonmc.cotton.config.annotations.ConfigFile

@ConfigFile(name=StickySneak)
class StickySneakConfig {
    @Comment(value= "Sets max tick time for sneak to lock down")
     var maxTicksToLockSneak = 5

}