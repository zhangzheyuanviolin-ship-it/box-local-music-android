            package com.google.mlkit.vision.text.internal;

            import android.content.Context;
            import android.os.SystemClock;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.ImageUtils;
            import com.google.mlkit.vision.text.Text;
            import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.I00Ol00;
            import p000.I0Oi111ii;
            import p000.Io1OIO1l0o;
            import p000.O1Il0Il;
            import p000.O1lli10oolO;
            import p000.O1o0111OI00;
            import p000.O1o01iO0liI0;
            import p000.OloO01111;
            import p000.OloOI1o;
            import p000.OloOII1ioI1l;
            import p000.ilooIOio;
            import p000.io0011OOloo;
            import p000.io1OllI;
            import p000.lOio11O;
            import p000.li001Ol;
            import p000.li0loOoii;
            import p000.li11ilO;
            import p000.liI01il11;
            import p000.liOi0IoI0i;
            import p000.liOiOolii;
            import p000.liOll1O;
            import p000.ll1lI01ilI1;
            import p000.lloolo1;
            import p000.lo0I10I;
            import p000.lo0O11O;
            import p000.loioOil;
            import p000.lolloooO;
            import p000.loloOlli1l0;
            import p000.loo0I11ii;
            import p000.o0IiOl;
            
            public class TextRecognizerTaskWithResource extends O1Il0Il {
                static boolean zza = true;
                private final zzm zzc;
                private final loloOlli1l0 zzd;
                private final loo0I11ii zze;
                private final TextRecognizerOptionsInterface zzf;
                private static final ImageUtils zzb = ImageUtils.getInstance();
                private static final OloO01111 taskQueue = new OloO01111();

                public TextRecognizerTaskWithResource(loloOlli1l0 loloolli1l0, zzm zzmVar, TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
/* 25 */            super((textRecognizerOptionsInterface.getLoggingLanguageOption() == 8 || textRecognizerOptionsInterface.getLoggingLanguageOption() == 7) ? new OloO01111() : taskQueue);
/* 28 */            this.zzd = loloolli1l0;
/* 30 */            this.zzc = zzmVar;
/* 36 */            Context contextI00000oOI = O1o0111OI00.I0000Il00O().I00000oOI();
/* 42 */            loo0I11ii loo0i11ii = new loo0I11ii();
/* 52 */            loo0i11ii.I00000oOI = new AtomicLong(-1L);
/* 56 */            OloOII1ioI1l oloOII1ioI1l = new OloOII1ioI1l();
/* 61 */            oloOII1ioI1l.I00000oOI = "mlkit:vision";
/* 63 */            VarHandle.storeStoreFence();
/* 70 */            loo0i11ii.I00000oIO = lOio11O.I00000oIO(contextI00000oOI, oloOII1ioI1l);
/* 72 */            VarHandle.storeStoreFence();
/* 75 */            this.zze = loo0i11ii;
/* 77 */            this.zzf = textRecognizerOptionsInterface;
                }

                private final void zzf(final liOiOolii lioioolii, long j, final InputImage inputImage) {
/* 5 */             final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 22 */            this.zzd.I0000Il00O(new lolloooO() {
                        @Override
                        public final loioOil zza() {
/* 9 */                     return this.zza.zzc(jElapsedRealtime, lioioolii, inputImage);
                        }
                    }, liOll1O.ON_DEVICE_TEXT_DETECT);
/* 27 */            Boolean boolValueOf = Boolean.valueOf(zza);
/* 37 */            lo0I10I lo0i10iZza = LoggingUtils.zza(this.zzf.getLoggingLanguageOption());
/* 43 */            lo0O11O lo0o11o = new lo0O11O();
/* 46 */            lo0o11o.I00000oIO = lo0i10iZza;
/* 48 */            VarHandle.storeStoreFence();
/* 53 */            ilooIOio ilooioio = new ilooIOio();
/* 56 */            ilooioio.I00000oIO = lioioolii;
/* 58 */            ilooioio.I00000oOI = boolValueOf;
/* 60 */            ilooioio.I0000Il00O = lo0o11o;
/* 62 */            VarHandle.storeStoreFence();
/* 67 */            zzr zzrVar = new zzr(this);
/* 70 */            liOll1O lioll1o = liOll1O.UNKNOWN_EVENT;
/* 74 */            loloOlli1l0 loloolli1l0 = this.zzd;
/* 77 */            ll1lI01ilI1 ll1li01ili1 = new ll1lI01ilI1(1);
/* 80 */            ll1li01ili1.I00iiO = loloolli1l0;
/* 82 */            ll1li01ili1.I00iio = ilooioio;
/* 84 */            ll1li01ili1.I00iiI = jElapsedRealtime;
/* 86 */            ll1li01ili1.I00ilI0I1 = zzrVar;
/* 88 */            VarHandle.storeStoreFence();
/* 91 */            io1OllI.I00000oIO(1, ll1li01ili1);
/* 94 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 98 */            long j2 = jCurrentTimeMillis - jElapsedRealtime;
/* 100 */           loo0I11ii loo0i11ii = this.zze;
/* 104 */           int loggingEventId = this.zzf.getLoggingEventId();
/* 108 */           int i = lioioolii.I00iOIl;
                    synchronized (loo0i11ii) {
/* 111 */               AtomicLong atomicLong = loo0i11ii.I00000oOI;
/* 113 */               long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 125 */               if (atomicLong.get() != -1 && jElapsedRealtime2 - loo0i11ii.I00000oOI.get() <= 1800000) {
/* 144 */                   return;
                        }
/* 175 */               o0IiOl o0iiolI0000Il00O = loo0i11ii.I00000oIO.I0000Il00O(new OloOI1o(0, Arrays.asList(new O1lli10oolO(loggingEventId, i, 0, j2, jCurrentTimeMillis, null, null, 0, -1))));
/* 183 */               Io1OIO1l0o io1OIO1l0o = new Io1OIO1l0o(9);
/* 186 */               io1OIO1l0o.I00iiO = loo0i11ii;
/* 188 */               io1OIO1l0o.I00iiI = jElapsedRealtime2;
/* 190 */               VarHandle.storeStoreFence();
/* 193 */               o0iiolI0000Il00O.I0000Il00O(io1OIO1l0o);
                    }
                }

                @Override
                public final synchronized void load() {
/* 4 */             this.zzc.zzb();
                }

                @Override
                public final synchronized void release() {
/* 3 */             zza = true;
/* 7 */             this.zzc.zzc();
                }

                public final loioOil zzc(long j, liOiOolii lioioolii, InputImage inputImage) {
/* 7 */             Long lValueOf = Long.valueOf(j & Long.MAX_VALUE);
/* 13 */            Boolean boolValueOf = Boolean.valueOf(zza);
/* 19 */            liI01il11 lii01il11 = new liI01il11();
/* 22 */            lii01il11.I00000oIO = lValueOf;
/* 24 */            lii01il11.I00000oOI = lioioolii;
/* 26 */            lii01il11.I0000Il00O = boolValueOf;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            ImageUtils imageUtils = zzb;
/* 33 */            int mobileVisionImageFormat = imageUtils.getMobileVisionImageFormat(inputImage);
/* 37 */            int mobileVisionImageSize = imageUtils.getMobileVisionImageSize(inputImage);
/* 42 */            int i = 17;
/* 76 */            li0loOoii li0loooii = mobileVisionImageFormat != -1 ? mobileVisionImageFormat != 35 ? mobileVisionImageFormat != 842094169 ? mobileVisionImageFormat != 16 ? mobileVisionImageFormat != 17 ? li0loOoii.UNKNOWN_FORMAT : li0loOoii.NV21 : li0loOoii.NV16 : li0loOoii.YV12 : li0loOoii.YUV_420_888 : li0loOoii.BITMAP;
/* 82 */            Integer numValueOf = Integer.valueOf(mobileVisionImageSize & Integer.MAX_VALUE);
/* 88 */            li11ilO li11ilo = new li11ilO();
/* 91 */            li11ilo.I00000oIO = li0loooii;
/* 93 */            li11ilo.I00000oOI = numValueOf;
/* 95 */            VarHandle.storeStoreFence();
/* 104 */           lo0I10I lo0i10iZza = LoggingUtils.zza(this.zzf.getLoggingLanguageOption());
/* 110 */           lo0O11O lo0o11o = new lo0O11O();
/* 113 */           lo0o11o.I00000oIO = lo0i10iZza;
/* 115 */           VarHandle.storeStoreFence();
/* 120 */           lloolo1 lloolo1Var = new lloolo1();
/* 123 */           lloolo1Var.I00000oIO = lii01il11;
/* 125 */           lloolo1Var.I00000oOI = li11ilo;
/* 127 */           lloolo1Var.I0000Il00O = lo0o11o;
/* 129 */           VarHandle.storeStoreFence();
/* 134 */           I0Oi111ii i0Oi111ii = new I0Oi111ii(i);
/* 150 */           i0Oi111ii.I00iio = this.zzf.getIsThickClient() ? liOi0IoI0i.TYPE_THICK : liOi0IoI0i.TYPE_THIN;
/* 152 */           i0Oi111ii.I00ilI0I1 = lloolo1Var;
/* 157 */           return new I00Ol00(i0Oi111ii, 0, (char) 0);
                }

                public final loioOil zzd(ilooIOio ilooioio, int i, li001Ol li001ol) {
/* 5 */             I0Oi111ii i0Oi111ii = new I0Oi111ii(17);
/* 21 */            i0Oi111ii.I00iio = this.zzf.getIsThickClient() ? liOi0IoI0i.TYPE_THICK : liOi0IoI0i.TYPE_THIN;
/* 27 */            Integer numValueOf = Integer.valueOf(Integer.MAX_VALUE & i);
/* 33 */            io0011OOloo io0011ooloo = new io0011OOloo();
/* 36 */            io0011ooloo.I00000oIO = ilooioio;
/* 38 */            io0011ooloo.I00000oOI = numValueOf;
/* 40 */            io0011ooloo.I0000Il00O = li001ol;
/* 42 */            VarHandle.storeStoreFence();
/* 45 */            i0Oi111ii.I00io1l = io0011ooloo;
/* 50 */            return new I00Ol00(i0Oi111ii, 0, (char) 0);
                }

                @Override
                public final synchronized Text run(InputImage inputImage) {
                    Text textZza;
/* 2 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
                    try {
/* 8 */                 textZza = this.zzc.zza(inputImage);
/* 14 */                zzf(liOiOolii.NO_ERROR, jElapsedRealtime, inputImage);
/* 18 */                zza = false;
                    } catch (O1o01iO0liI0 e) {
/* 36 */                zzf(e.I00iOIl == 14 ? liOiOolii.MODEL_NOT_DOWNLOADED : liOiOolii.UNKNOWN_ERROR, jElapsedRealtime, inputImage);
/* 39 */                throw e;
                    }
/* 21 */            return textZza;
                }
            }
