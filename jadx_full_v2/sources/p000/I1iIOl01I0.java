            package p000;

            import android.media.AudioRecord;
            import android.media.AudioTrack;
            import android.media.MediaPlayer;
            
            public final class I1iIOl01I0 implements IiiO1li1 {
                public final int I00000oIO;
                public OI10i0Il I00000oOI;

                @Override
                public final void I00000oOI() throws IllegalStateException {
                    switch (this.I00000oIO) {
                        case 0:
/* 75 */                    AudioTrack audioTrack = (AudioTrack) this.I00000oOI.getValue();
/* 77 */                    if (audioTrack != null) {
/* 79 */                        audioTrack.stop();
                            }
/* 82 */                    if (audioTrack != null) {
/* 84 */                        audioTrack.release();
                                break;
                            }
                            break;
                        case 1:
/* 61 */                    AudioRecord audioRecord = (AudioRecord) this.I00000oOI.getValue();
/* 63 */                    if (audioRecord != null) {
/* 65 */                        audioRecord.release();
                                break;
                            }
                            break;
                        case 2:
/* 47 */                    OOIl1Io0 oOIl1Io0 = (OOIl1Io0) this.I00000oOI.getValue();
/* 49 */                    if (oOIl1Io0 != null) {
/* 51 */                        oOIl1Io0.I00000oOI();
                                break;
                            }
                            break;
                        case 3:
/* 24 */                    OI10i0Il oI10i0Il = this.I00000oOI;
/* 30 */                    MediaPlayer mediaPlayer = (MediaPlayer) oI10i0Il.getValue();
/* 32 */                    if (mediaPlayer != null) {
/* 34 */                        mediaPlayer.release();
                            }
/* 37 */                    oI10i0Il.setValue(null);
                            break;
                        default:
/* 7 */                     OI10i0Il oI10i0Il2 = this.I00000oOI;
/* 13 */                    MediaPlayer mediaPlayer2 = (MediaPlayer) oI10i0Il2.getValue();
/* 15 */                    if (mediaPlayer2 != null) {
/* 17 */                        mediaPlayer2.release();
                            }
/* 20 */                    oI10i0Il2.setValue(null);
                            break;
                    }
                }
            }
