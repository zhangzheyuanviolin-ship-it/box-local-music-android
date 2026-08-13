            package p000;

            import android.media.AudioAttributes;
            import android.media.AudioFormat;
            import android.media.AudioTrack;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOoIoI0iii0;", "LOooioIIoi0O;", "<init>", "()V", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class OoIoI0iii0 extends OooioIIoi0O {
                public final OlO0OIIl1 I00000oOI;
                public final OOli1O I0000Il00O;
                public OlIl0i I0000O;
                public AudioTrack I0000oI00;

                public OoIoI0iii0() {
/* 20 */            OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(new OoIo10100O1("", false, 0, 1.0f, 1, null, false, 0.0f, null));
/* 24 */            this.I00000oOI = olO0OIIl1I00000oIO;
/* 30 */            this.I0000Il00O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
                }

                @Override
                public final void I0000O() {
/* 1 */             I000O01llI0();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000oI00(float[] fArr, int i, IOoilo iOoilo) throws Throwable {
                    OoIo1Oi ooIo1Oi;
                    int minBufferSize;
                    int length;
                    AudioTrack audioTrack;
/* 3 */             if (iOoilo instanceof OoIo1Oi) {
/* 6 */                 ooIo1Oi = (OoIo1Oi) iOoilo;
/* 8 */                 int i2 = ooIo1Oi.I00io1l;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    ooIo1Oi.I00io1l = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ooIo1Oi = new OoIo1Oi(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = ooIo1Oi.I00ilI0I1;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = ooIo1Oi.I00io1l;
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
/* 37 */                length = ooIo1Oi.I00iio;
/* 39 */                int i4 = ooIo1Oi.I00iiO;
/* 41 */                int i5 = ooIo1Oi.I00iiI;
/* 43 */                audioTrack = ooIo1Oi.I00iOIl;
/* 45 */                lIoii1l01l0i.I00000oOI(obj);
/* 49 */                minBufferSize = i4;
/* 50 */                i = i5;
                    }
/* 163 */           while (l01oO1iOo.I000II(ooIo1Oi.getContext()) && audioTrack.getPlaybackHeadPosition() < length) {
/* 171 */               ooIo1Oi.I00iOIl = audioTrack;
/* 173 */               ooIo1Oi.I00iiI = i;
/* 175 */               ooIo1Oi.I00iiO = minBufferSize;
/* 177 */               ooIo1Oi.I00iio = length;
/* 179 */               ooIo1Oi.I00io1l = 1;
/* 187 */               if (il0l1o1l.I00000oOI(30L, ooIo1Oi) == ii0111o) {
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

                public final void I0001Ioi1lo(String str) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 26 */            olO0OIIl1.I000lI(null, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl1.getValue(), str, false, 0, 0.0f, 0, null, false, 0.0f, null, 478));
                }

                public final void I000II(O1oIOiI11o0 o1oIOiI11o0) {
/* 5 */             Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 16 */            II1olI iI1olI = obj instanceof II1olI ? (II1olI) obj : null;
/* 17 */            OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 19 */            if (iI1olI == null) {
/* 46 */                olO0OIIl1.I000lI(null, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl1.getValue(), null, false, 0, 0.0f, 0, "Model not loaded. Try re-initializing.", false, 0.0f, null, 479));
/* 49 */                return;
                    }
/* 58 */            if (((OoIo10100O1) olO0OIIl1.getValue()).I00000oOI) {
/* 60 */                return;
                    }
/* 66 */            OoIo10100O1 ooIo10100O1 = (OoIo10100O1) olO0OIIl1.getValue();
/* 74 */            String string = OlOoOIi0o.I00OIo(ooIo10100O1.I00000oIO).toString();
/* 82 */            if (string.length() == 0) {
/* 102 */               olO0OIIl1.I000lI(null, OoIo10100O1.I00000oIO(ooIo10100O1, null, false, 0, 0.0f, 0, "Enter some text first", false, 0.0f, null, 479));
                    } else {
/* 123 */               olO0OIIl1.I000lI(null, OoIo10100O1.I00000oIO(ooIo10100O1, null, true, 0, 0.0f, 0, null, false, 0.0f, null, 477));
/* 146 */               this.I0000O = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(this), IiiIil1lOIO.I00000oIO, null, new O1o1iI(iI1olI, string, ooIo10100O1, this, (IOoil1iiIilo) null, 20), 2);
                    }
                }

                public final void I000O01llI0() {
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
/* 44 */            olO0OIIl1.I000lI(null, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl1.getValue(), null, false, 0, 0.0f, 0, null, false, 0.0f, null, 509));
                }
            }
