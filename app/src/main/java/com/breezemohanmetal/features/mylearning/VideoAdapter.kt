package com.breezemohanmetal.features.mylearning
import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.breezemohanmetal.R
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.PlaybackException
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.analytics.AnalyticsListener
import com.google.android.exoplayer2.analytics.PlaybackStatsListener
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.google.android.exoplayer2.upstream.DefaultDataSource
import com.pnikosis.materialishprogress.ProgressWheel


class VideoAdapter(
    var context: Context,
    var videos: ArrayList<VideoLMS>,
    var videoPreparedListener: OnVideoPreparedListener
) : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {


    inner class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val playerView: StyledPlayerView = itemView.findViewById(R.id.stylplayerView)
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val pbLoading: ProgressWheel = itemView.findViewById(R.id.progress_wheel)
        lateinit var exoPlayer: ExoPlayer
        lateinit var mediaSource: MediaSource

        fun bind(position: Int) {

            val model = videos[position]
            tvTitle.text = model.title
        }

        fun setVideoPath(url: String) {
            exoPlayer = ExoPlayer.Builder(context).build()
            exoPlayer.addListener(object : Player.Listener {
                override fun onPlayerError(error: PlaybackException) {
                    super.onPlayerError(error)
                    Toast.makeText(context, "Can't play this video", Toast.LENGTH_SHORT).show()
                }

                override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {

                    var b = exoPlayer.currentPosition //Returns the playback position in the current content
                    var d = exoPlayer.duration //Returns the duration of the current content
                    if(b>0){
                        println("tag_vodeo_position  $b $d")
                    }
                    when (playbackState) {
                        Player.STATE_ENDED -> {
                            println("tag_vodeo_position_state  state ended")
                        }
                        Player.STATE_READY -> {
                            println("tag_vodeo_position_state  state ready")
                        }//hideProgressBar() //*Hide progressbar!
                        Player.STATE_BUFFERING ->{
                            println("tag_vodeo_position_state  state buffering")
                        } //showProgressBar() //*Show progressbar!
                        Player.STATE_IDLE -> {
                            println("tag_vodeo_position_state  state idle")
                        }
                    }


                    if (playbackState == Player.STATE_BUFFERING) {
                        pbLoading.spin()
                    } else if (playbackState == Player.STATE_READY) {
                        pbLoading.stopSpinning()
                    }
                }
            })

            //playerView.player = exoPlayer

            exoPlayer.seekTo(0)
            exoPlayer.repeatMode = Player.REPEAT_MODE_OFF

            val dataSourceFactory = DefaultDataSource.Factory(context)

            mediaSource = ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(MediaItem.fromUri(Uri.parse(url)))

            exoPlayer.setMediaSource(mediaSource)
            exoPlayer.prepare()
            pbLoading.visibility = View.GONE
            if (absoluteAdapterPosition == 0) {
                exoPlayer.playWhenReady = true
                exoPlayer.play()
                pbLoading.stopSpinning()
            }

            videoPreparedListener.onVideoPrepared(ExoPlayerItem(exoPlayer, absoluteAdapterPosition))
            playerView.player = exoPlayer


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_video, parent, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val model = videos[position]
        holder.bind(position)
        holder.setVideoPath(model.url)
    }

    override fun getItemCount(): Int {
        return videos.size
    }

    interface OnVideoPreparedListener {
        fun onVideoPrepared(exoPlayerItem: ExoPlayerItem)
    }
}