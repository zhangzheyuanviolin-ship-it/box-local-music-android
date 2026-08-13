            package com.google.mlkit.genai.common.audio;

            import android.media.AudioFormat;
            import android.os.ParcelFileDescriptor;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            
/* 31 */    public class AudioSource {
                private final ParcelFileDescriptor zza;
                private final int zzb;
                private final AudioFormat zzc;

                @Retention(RetentionPolicy.SOURCE)
                public @interface Mode {
                    public static final int ONE_SHOT = 1;
                    public static final int STREAMING = 0;
                }

                private AudioSource(ParcelFileDescriptor parcelFileDescriptor, int i, AudioFormat audioFormat) {
/* 4 */             this.zza = parcelFileDescriptor;
/* 6 */             this.zzb = i;
/* 8 */             this.zzc = audioFormat;
                }

                public static AudioSource fromMic() {
/* 31 */            return new AudioSource(null, 0, new AudioFormat.Builder().setEncoding(2).setSampleRate(WhisperEngine.SAMPLE_RATE).setChannelMask(16).build());
                }

                public static AudioSource fromPfd(ParcelFileDescriptor parcelFileDescriptor, int i) {
/* 29 */            return new AudioSource(parcelFileDescriptor, i, new AudioFormat.Builder().setEncoding(2).setSampleRate(WhisperEngine.SAMPLE_RATE).setChannelMask(16).build());
                }

                public AudioFormat getAudioFormat() {
/* 1 */             return this.zzc;
                }

                public int getMode() {
/* 1 */             return this.zzb;
                }

                public ParcelFileDescriptor getPfd() {
/* 1 */             return this.zza;
                }

/* 32 */        public static AudioSource fromPfd(ParcelFileDescriptor parcelFileDescriptor) {
/* 33 */            return fromPfd(parcelFileDescriptor, 0);
                }

/* 33 */        public static AudioSource fromPfd(ParcelFileDescriptor parcelFileDescriptor, int i, AudioFormat audioFormat) {
/* 34 */            return new AudioSource(parcelFileDescriptor, i, audioFormat);
                }
            }
