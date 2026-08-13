            package p000;

            import android.media.AudioAttributes;
            import android.media.AudioFormat;
            import android.media.AudioTrack;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOliii00iliIi;", "LOooioIIoi0O;", "<init>", "()V", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class Oliii00iliIi extends OooioIIoi0O {
                public final OlO0OIIl1 I00000oOI;
                public final OOli1O I0000Il00O;
                public OlIl0i I0000O;
                public AudioTrack I0000oI00;

                public Oliii00iliIi() {
/* 17 */            OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(new OliiOl0("", false, 0, 1.0f, 1, null));
/* 21 */            this.I00000oOI = olO0OIIl1I00000oIO;
/* 27 */            this.I0000Il00O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
                }

                @Override
                public final void I0000O() {
/* 1 */             I0001Ioi1lo();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000oI00(float[] fArr, int i, IOoilo iOoilo) throws Throwable {
                    OliiOlll oliiOlll;
                    int minBufferSize;
                    int length;
                    AudioTrack audioTrack;
/* 3 */             if (iOoilo instanceof OliiOlll) {
/* 6 */                 oliiOlll = (OliiOlll) iOoilo;
/* 8 */                 int i2 = oliiOlll.I00io1l;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    oliiOlll.I00io1l = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oliiOlll = new OliiOlll(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = oliiOlll.I00ilI0I1;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = oliiOlll.I00io1l;
/* 33 */            if (i3 == 0) {
/* 58 */                lIoii1l01l0i.I00000oOI(obj);
                        try {
/* 61 */                    AudioTrack audioTrack2 = this.I0000oI00;
/* 63 */                    if (audioTrack2 != null) {
/* 65 */                        audioTrack2.release();
                            }
                        } catch (Throwable unused) {
                        }
/* 68 */                this.I0000oI00 = null;
/* 71 */                minBufferSize = AudioTrack.getMinBufferSize(i, 4, 4);
/* 76 */                int length2 = fArr.length * 4;
/* 77 */                if (minBufferSize < length2) {
/* 79 */                    minBufferSize = length2;
                        }
/* 139 */               AudioTrack audioTrackBuild = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(1).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(4).setSampleRate(i).setChannelMask(4).build()).setBufferSizeInBytes(minBufferSize).setTransferMode(1).build();
/* 143 */               this.I0000oI00 = audioTrackBuild;
/* 145 */               audioTrackBuild.play();
/* 150 */               audioTrackBuild.write(fArr, 0, fArr.length, 0);
/* 153 */               length = fArr.length;
/* 154 */               audioTrack = audioTrackBuild;
                    } else {
/* 35 */                if (i3 != 1) {
/* 54 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                length = oliiOlll.I00iio;
/* 39 */                int i4 = oliiOlll.I00iiO;
/* 41 */                int i5 = oliiOlll.I00iiI;
/* 43 */                audioTrack = oliiOlll.I00iOIl;
/* 45 */                lIoii1l01l0i.I00000oOI(obj);
/* 49 */                minBufferSize = i4;
/* 50 */                i = i5;
                    }
/* 163 */           while (l01oO1iOo.I000II(oliiOlll.getContext()) && audioTrack.getPlaybackHeadPosition() < length) {
/* 171 */               oliiOlll.I00iOIl = audioTrack;
/* 173 */               oliiOlll.I00iiI = i;
/* 175 */               oliiOlll.I00iiO = minBufferSize;
/* 177 */               oliiOlll.I00iio = length;
/* 179 */               oliiOlll.I00io1l = 1;
/* 187 */               if (il0l1o1l.I00000oOI(30L, oliiOlll) == ii0111o) {
/* 189 */                   return ii0111o;
                        }
                    }
/* 190 */           audioTrack.stop();
                    try {
/* 193 */               AudioTrack audioTrack3 = this.I0000oI00;
/* 195 */               if (audioTrack3 != null) {
/* 197 */                   audioTrack3.release();
                        }
                    } catch (Throwable unused2) {
                    }
/* 200 */           this.I0000oI00 = null;
/* 202 */           return OoiIlOl1iI.I00000oIO;
                }

                public final void I0001Ioi1lo() {
/* 1 */             OlIl0i olIl0i = this.I0000O;
/* 4 */             if (olIl0i != null) {
/* 6 */                 olIl0i.I000II(null);
                    }
/* 9 */             this.I0000O = null;
                    try {
/* 11 */                AudioTrack audioTrack = this.I0000oI00;
/* 13 */                if (audioTrack != null) {
/* 15 */                    audioTrack.release();
                        }
                    } catch (Throwable unused) {
                    }
/* 18 */            this.I0000oI00 = null;
/* 20 */            OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 41 */            olO0OIIl1.I000lI(null, OliiOl0.I00000oIO((OliiOl0) olO0OIIl1.getValue(), null, false, 0, 0.0f, 0, null, 61));
                }
            }
