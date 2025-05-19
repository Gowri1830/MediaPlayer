package com.example.mediaplayer

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var playButton: Button
    private lateinit var statusText: TextView
    private var isPlaying = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playButton = findViewById(R.id.btnPlay)
        statusText = findViewById(R.id.txtStatus)

        playButton.setOnClickListener {
            isPlaying = !isPlaying
            if (isPlaying) {
                playButton.text = "Pause"
                statusText.text = "Status: Playing (simulated)"
            } else {
                playButton.text = "Play"
                statusText.text = "Status: Paused"
            }
        }
    }
}
