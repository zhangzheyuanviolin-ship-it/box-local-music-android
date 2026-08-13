            package com.google.mlkit.vision.barcode.internal;

            import android.content.Context;
            import android.os.SystemClock;
            import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
            import com.google.mlkit.vision.common.internal.ImageUtils;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.IOiOol0;
            import p000.Io1OIO1l0o;
            import p000.O1Il0Il;
            import p000.O1lli10oolO;
            import p000.O1o0111OI00;
            import p000.O1o01iO0liI0;
            import p000.OloOI1o;
            import p000.OloOII1ioI1l;
            import p000.iiooi0i00l;
            import p000.ilIIoll0ll;
            import p000.io1OllI;
            import p000.ioi1lOIlO1;
            import p000.ioiiOII0li;
            import p000.lII0I0I000I;
            import p000.lOio11O;
            import p000.ll1Iloi;
            import p000.ll1lI01ilI1;
            import p000.ll1ol0ii0;
            import p000.llI10o;
            import p000.llO00iOl;
            import p000.lliI0lOI;
            import p000.lliO0i0Iii0;
            import p000.lliOo1oo;
            import p000.llo1OlOi;
            import p000.o0Ii11Oi1li;
            import p000.o0IiOl;
            import p000.o0IooioOOIl;
            import p000.o0OiI0Oo;
            import p000.o0OiOio;
            import p000.o0OlOl111;
            import p000.o0Oll1li;
            
            public final class zzl extends O1Il0Il {
                private final BarcodeScannerOptions zzc;
                private final zzm zzd;
                private final o0OiOio zze;
                private final o0OlOl111 zzf;
                private final BitmapInStreamingChecker zzg = new BitmapInStreamingChecker();
                private boolean zzh;
                private static final ImageUtils zzb = ImageUtils.getInstance();
                static boolean zza = true;

                public zzl(O1o0111OI00 o1o0111OI00, BarcodeScannerOptions barcodeScannerOptions, zzm zzmVar, o0OiOio o0oioio) {
/* 13 */            lII0I0I000I.I000O01llI0("MlKitContext can not be null", o1o0111OI00);
/* 18 */            lII0I0I000I.I000O01llI0("BarcodeScannerOptions can not be null", barcodeScannerOptions);
/* 21 */            this.zzc = barcodeScannerOptions;
/* 23 */            this.zzd = zzmVar;
/* 25 */            this.zze = o0oioio;
/* 27 */            Context contextI00000oOI = o1o0111OI00.I00000oOI();
/* 33 */            o0OlOl111 o0olol111 = new o0OlOl111();
/* 43 */            o0olol111.I00000oOI = new AtomicLong(-1L);
/* 47 */            OloOII1ioI1l oloOII1ioI1l = new OloOII1ioI1l();
/* 52 */            oloOII1ioI1l.I00000oOI = "mlkit:vision";
/* 54 */            VarHandle.storeStoreFence();
/* 61 */            o0olol111.I00000oIO = lOio11O.I00000oIO(contextI00000oOI, oloOII1ioI1l);
/* 63 */            VarHandle.storeStoreFence();
/* 66 */            this.zzf = o0olol111;
                }

                private final void zzf(final lliO0i0Iii0 llio0i0iii0, long j, final InputImage inputImage, List list) {
/* 3 */             final iiooi0i00l iiooi0i00lVar = new iiooi0i00l();
/* 8 */             final iiooi0i00l iiooi0i00lVar2 = new iiooi0i00l();
/* 11 */            if (list != null) {
/* 13 */                Iterator it = list.iterator();
/* 21 */                while (it.hasNext()) {
/* 27 */                    Barcode barcode = (Barcode) it.next();
/* 37 */                    iiooi0i00lVar.I00000oIO(zzb.zza(barcode.getFormat()));
/* 48 */                    iiooi0i00lVar2.I00000oIO(zzb.zzb(barcode.getValueType()));
                        }
                    }
/* 56 */            final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 73 */            this.zze.I0000Il00O(new o0OiI0Oo() {
                        @Override
                        public final o0IooioOOIl zza() {
/* 13 */                    return this.zza.zzc(jElapsedRealtime, llio0i0iii0, iiooi0i00lVar, iiooi0i00lVar2, inputImage);
                        }
                    }, lliOo1oo.ON_DEVICE_BARCODE_DETECT);
/* 78 */            Boolean boolValueOf = Boolean.valueOf(zza);
/* 84 */            o0Ii11Oi1li o0ii11oi1liZzc = zzb.zzc(this.zzc);
/* 88 */            ilIIoll0ll iliioll0llI0000Il00O = iiooi0i00lVar.I0000Il00O();
/* 92 */            ilIIoll0ll iliioll0llI0000Il00O2 = iiooi0i00lVar2.I0000Il00O();
/* 98 */            ioi1lOIlO1 ioi1loilo1 = new ioi1lOIlO1();
/* 101 */           ioi1loilo1.I00000oIO = llio0i0iii0;
/* 103 */           ioi1loilo1.I00000oOI = boolValueOf;
/* 105 */           ioi1loilo1.I0000Il00O = o0ii11oi1liZzc;
/* 107 */           ioi1loilo1.I0000O = iliioll0llI0000Il00O;
/* 109 */           ioi1loilo1.I0000oI00 = iliioll0llI0000Il00O2;
/* 111 */           VarHandle.storeStoreFence();
/* 116 */           zzk zzkVar = new zzk(this);
/* 119 */           o0OiOio o0oioio = this.zze;
/* 121 */           lliOo1oo llioo1oo = lliOo1oo.UNKNOWN_EVENT;
/* 126 */           ll1lI01ilI1 ll1li01ili1 = new ll1lI01ilI1(2);
/* 129 */           ll1li01ili1.I00iiO = o0oioio;
/* 131 */           ll1li01ili1.I00iio = ioi1loilo1;
/* 133 */           ll1li01ili1.I00iiI = jElapsedRealtime;
/* 135 */           ll1li01ili1.I00ilI0I1 = zzkVar;
/* 137 */           VarHandle.storeStoreFence();
/* 141 */           io1OllI.I00000oIO(1, ll1li01ili1);
/* 144 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 148 */           boolean z = this.zzh;
/* 150 */           long j2 = jCurrentTimeMillis - jElapsedRealtime;
/* 152 */           o0OlOl111 o0olol111 = this.zzf;
/* 160 */           int i = true != z ? 24301 : 24302;
/* 163 */           int i2 = llio0i0iii0.I00iOIl;
                    synchronized (o0olol111) {
/* 166 */               AtomicLong atomicLong = o0olol111.I00000oOI;
/* 168 */               long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 180 */               if (atomicLong.get() != -1 && jElapsedRealtime2 - o0olol111.I00000oOI.get() <= 1800000) {
/* 199 */                   return;
                        }
/* 229 */               o0IiOl o0iiolI0000Il00O = o0olol111.I00000oIO.I0000Il00O(new OloOI1o(0, Arrays.asList(new O1lli10oolO(i, i2, 0, j2, jCurrentTimeMillis, null, null, 0, -1))));
/* 237 */               Io1OIO1l0o io1OIO1l0o = new Io1OIO1l0o(11);
/* 240 */               io1OIO1l0o.I00iiO = o0olol111;
/* 242 */               io1OIO1l0o.I00iiI = jElapsedRealtime2;
/* 244 */               VarHandle.storeStoreFence();
/* 247 */               o0iiolI0000Il00O.I0000Il00O(io1OIO1l0o);
                    }
                }

                @Override
                public final synchronized void load() {
/* 8 */             this.zzh = this.zzd.zzc();
                }

                @Override
                public final synchronized void release() {
                    try {
/* 4 */                 this.zzd.zzb();
/* 8 */                 zza = true;
/* 14 */                IOiOol0 iOiOol0 = new IOiOol0(15);
/* 26 */                lliI0lOI llii0loi = this.zzh ? lliI0lOI.TYPE_THICK : lliI0lOI.TYPE_THIN;
/* 28 */                o0OiOio o0oioio = this.zze;
/* 30 */                iOiOol0.I00iio = llii0loi;
/* 34 */                o0Ii11Oi1li o0ii11oi1liZzc = zzb.zzc(this.zzc);
/* 40 */                llo1OlOi llo1oloi = new llo1OlOi();
/* 44 */                llo1oloi.I00000oIO = null;
/* 46 */                llo1oloi.I00000oOI = o0ii11oi1liZzc;
/* 48 */                llo1oloi.I0000Il00O = null;
/* 50 */                llo1oloi.I0000O = null;
/* 52 */                llo1oloi.I0000oI00 = null;
/* 54 */                VarHandle.storeStoreFence();
/* 57 */                iOiOol0.I00ilI0I1 = llo1oloi;
/* 71 */                o0oioio.I00000oOI(new o0Oll1li(iOiOol0, 0), lliOo1oo.ON_DEVICE_BARCODE_CLOSE, o0oioio.I0000O());
                    } catch (Throwable th) {
/* 113 */               throw th;
                    }
                }

                public final o0IooioOOIl zzc(long j, lliO0i0Iii0 llio0i0iii0, iiooi0i00l iiooi0i00lVar, iiooi0i00l iiooi0i00lVar2, InputImage inputImage) {
/* 7 */             Long lValueOf = Long.valueOf(j & Long.MAX_VALUE);
/* 13 */            Boolean boolValueOf = Boolean.valueOf(zza);
/* 19 */            llO00iOl llo00iol = new llO00iOl();
/* 22 */            llo00iol.I00000oIO = lValueOf;
/* 24 */            llo00iol.I00000oOI = llio0i0iii0;
/* 26 */            llo00iol.I0000Il00O = boolValueOf;
/* 28 */            VarHandle.storeStoreFence();
/* 33 */            o0Ii11Oi1li o0ii11oi1liZzc = zzb.zzc(this.zzc);
/* 37 */            ilIIoll0ll iliioll0llI0000Il00O = iiooi0i00lVar.I0000Il00O();
/* 41 */            ilIIoll0ll iliioll0llI0000Il00O2 = iiooi0i00lVar2.I0000Il00O();
/* 45 */            int format = inputImage.getFormat();
/* 51 */            int mobileVisionImageSize = zzb.getMobileVisionImageSize(inputImage);
/* 90 */            ll1ol0ii0 ll1ol0ii0Var = format != -1 ? format != 35 ? format != 842094169 ? format != 16 ? format != 17 ? ll1ol0ii0.UNKNOWN_FORMAT : ll1ol0ii0.NV21 : ll1ol0ii0.NV16 : ll1ol0ii0.YV12 : ll1ol0ii0.YUV_420_888 : ll1ol0ii0.BITMAP;
/* 96 */            Integer numValueOf = Integer.valueOf(mobileVisionImageSize & Integer.MAX_VALUE);
/* 102 */           llI10o lli10o = new llI10o();
/* 105 */           lli10o.I00000oIO = ll1ol0ii0Var;
/* 107 */           lli10o.I00000oOI = numValueOf;
/* 109 */           VarHandle.storeStoreFence();
/* 116 */           IOiOol0 iOiOol0 = new IOiOol0(15);
/* 128 */           iOiOol0.I00iio = this.zzh ? lliI0lOI.TYPE_THICK : lliI0lOI.TYPE_THIN;
/* 132 */           llo1OlOi llo1oloi = new llo1OlOi();
/* 135 */           llo1oloi.I00000oIO = llo00iol;
/* 137 */           llo1oloi.I00000oOI = o0ii11oi1liZzc;
/* 139 */           llo1oloi.I0000Il00O = iliioll0llI0000Il00O;
/* 141 */           llo1oloi.I0000O = iliioll0llI0000Il00O2;
/* 143 */           llo1oloi.I0000oI00 = lli10o;
/* 145 */           VarHandle.storeStoreFence();
/* 148 */           iOiOol0.I00ilI0I1 = llo1oloi;
/* 153 */           return new o0Oll1li(iOiOol0, 0);
                }

                public final o0IooioOOIl zzd(ioi1lOIlO1 ioi1loilo1, int i, ll1Iloi ll1iloi) {
/* 5 */             IOiOol0 iOiOol0 = new IOiOol0(15);
/* 17 */            iOiOol0.I00iio = this.zzh ? lliI0lOI.TYPE_THICK : lliI0lOI.TYPE_THIN;
/* 23 */            Integer numValueOf = Integer.valueOf(Integer.MAX_VALUE & i);
/* 29 */            ioiiOII0li ioiioii0li = new ioiiOII0li();
/* 32 */            ioiioii0li.I00000oIO = ioi1loilo1;
/* 34 */            ioiioii0li.I00000oOI = numValueOf;
/* 36 */            ioiioii0li.I0000Il00O = ll1iloi;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            iOiOol0.I00io1l = ioiioii0li;
/* 46 */            return new o0Oll1li(iOiOol0, 0);
                }

                @Override
                public final synchronized List run(InputImage inputImage) throws Throwable {
                    zzl zzlVar;
                    InputImage inputImage2;
                    try {
                        try {
/* 2 */                     BitmapInStreamingChecker bitmapInStreamingChecker = this.zzg;
/* 4 */                     long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 8 */                     bitmapInStreamingChecker.check(inputImage);
                            try {
/* 13 */                        List listZza = this.zzd.zza(inputImage);
/* 19 */                        zzlVar = this;
/* 20 */                        inputImage2 = inputImage;
                                try {
/* 21 */                            zzlVar.zzf(lliO0i0Iii0.NO_ERROR, jElapsedRealtime, inputImage2, listZza);
/* 25 */                            zza = false;
/* 28 */                            return listZza;
                                } catch (O1o01iO0liI0 e) {
/* 32 */                            e = e;
/* 33 */                            O1o01iO0liI0 o1o01iO0liI0 = e;
/* 56 */                            zzlVar.zzf(o1o01iO0liI0.I00iOIl == 14 ? lliO0i0Iii0.MODEL_NOT_DOWNLOADED : lliO0i0Iii0.UNKNOWN_ERROR, jElapsedRealtime, inputImage2, null);
/* 59 */                            throw o1o01iO0liI0;
                                }
                            } catch (O1o01iO0liI0 e2) {
/* 38 */                        e = e2;
/* 39 */                        zzlVar = this;
/* 40 */                        inputImage2 = inputImage;
                            }
                        } catch (Throwable th) {
/* 35 */                    th = th;
/* 186 */                   throw th;
                        }
                    } catch (Throwable th2) {
/* 29 */                th = th2;
                    }
/* 186 */           throw th;
                }
            }
