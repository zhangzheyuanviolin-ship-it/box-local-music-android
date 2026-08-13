            package com.google.mlkit.genai.imagedescription;

            import android.graphics.Bitmap;
            import android.os.SystemClock;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.common.StreamingCallback;
            import com.google.mlkit.genai.common.internal.GenAiUtils;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.function.Consumer;
            import p000.I000II;
            import p000.I1ii1o0;
            import p000.IOOlIIilOl0;
            import p000.Iioi0lilII;
            import p000.Oi010OO0;
            import p000.OoIol00Ool;
            import p000.i1OlIi1OoI0;
            import p000.iIloli;
            import p000.iOIIOoOoii;
            import p000.iOIoil;
            import p000.iOli1OIiO1I0;
            import p000.iOolO1ll1I;
            import p000.ii00IIO11;
            import p000.ii1O10ooOi;
            import p000.iiI11l01l;
            import p000.iiOIO1I1lio0;
            import p000.iiOOoloool;
            import p000.iio10oooI0O;
            import p000.iio1ioOI;
            import p000.iioil0OolIIi;
            import p000.il1OOI0;
            import p000.ilO0ioll;
            import p000.ioI11OIOiiI;
            import p000.ioIl00;
            import p000.iooO1OIlo;
            import p000.l01I110i;
            import p000.l0IlooI;
            import p000.l0Iool1O1iil;
            import p000.l0O11I1ll;
            import p000.l0OI000IIIi;
            import p000.l0OO1i;
            import p000.l0Ol1ili;
            import p000.l0lI0IOIl000;
            import p000.l0oOo0Ili1i;
            import p000.l10i0Oio;
            import p000.l1OIlloI1l0;
            import p000.ll00lliII;
            import p000.ll01i01oo11;
            import p000.o0111I;
            import p000.o011iIl;
            import p000.o10IIi1O010o;
            import p000.o10OlO;
            import p000.o10iO00iOl;
            import p000.o10l1l;
            
/* 5 */     public class ImageDescriber {
                boolean zza = true;
                private final iIloli zzb;
                private final l1OIlloI1l0 zzc;
                private iiI11l01l zzd;
                private int zze;

                public ImageDescriber(iIloli iiloli, l1OIlloI1l0 l1oilloi1l0) throws Throwable {
/* 7 */             this.zzb = iiloli;
/* 9 */             this.zzc = l1oilloi1l0;
/* 11 */            l1oilloi1l0.getClass();
/* 19 */            I1ii1o0 i1ii1o0 = new I1ii1o0(27, false);
/* 27 */            i1ii1o0.I00ilI0I1 = new o10OlO();
/* 37 */            l1oilloi1l0.I00000oIO.I00000oIO(OoIol00Ool.I001i1O0Ol(i1ii1o0), o011iIl.SAPI_IMAGE_DESCRIPTION_CREATE);
                }

                public static iiI11l01l zza(ImageDescriber imageDescriber, iOIoil ioioil) {
/* 6 */             imageDescriber.zze = ((iOli1OIiO1I0) ioioil).I0001Ioi1lo;
/* 8 */             iIloli iiloli = imageDescriber.zzb;
/* 14 */            Iioi0lilII iioi0lilII = new Iioi0lilII(20);
/* 17 */            if (iiloli == null) {
/* 55 */                StringBuilder sb = new StringBuilder();
/* 58 */                if (iiloli == null) {
/* 62 */                    sb.append(" aiCoreClient");
                        }
/* 75 */                I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 78 */                return null;
                    }
/* 21 */            iiI11l01l iii11l01l = new iiI11l01l();
/* 29 */            iii11l01l.I0001Ioi1lo = new Object();
/* 31 */            iii11l01l.I00000oIO = iiloli;
/* 33 */            iii11l01l.I00000oOI = ioioil;
/* 35 */            iii11l01l.I0000Il00O = iioi0lilII;
/* 37 */            il1OOI0 il1ooi0 = (il1OOI0) iiloli;
/* 41 */            iii11l01l.I0000O = il1ooi0.I00iOIl;
/* 45 */            iii11l01l.I0000oI00 = il1ooi0.I00iiO;
/* 47 */            VarHandle.storeStoreFence();
/* 50 */            imageDescriber.zzd = iii11l01l;
/* 52 */            return iii11l01l;
                }

                public static ListenableFuture zzb(ImageDescriber imageDescriber, DownloadCallback downloadCallback, iOIoil ioioil) {
/* 3 */             zzq zzqVar = new zzq(imageDescriber, downloadCallback);
/* 8 */             il1OOI0 il1ooi0 = (il1OOI0) imageDescriber.zzb;
/* 14 */            l10i0Oio l10i0oioI0000O = il1ooi0.I00000oIO().I0000O();
/* 20 */            iioil0OolIIi iioil0ooliii = new iioil0OolIIi();
/* 23 */            iioil0ooliii.I00000oIO = il1ooi0;
/* 25 */            iioil0ooliii.I00000oOI = ioioil;
/* 27 */            iioil0ooliii.I0000Il00O = zzqVar;
/* 29 */            VarHandle.storeStoreFence();
/* 34 */            return ll00lliII.I00000oOI(l10i0oioI0000O, iioil0ooliii, il1ooi0.I00iOIl);
                }

                public static ListenableFuture zzc(ImageDescriber imageDescriber, iOIoil ioioil) {
/* 1 */             if (ioioil == null) {
/* 68 */                return new l0lI0IOIl000(0);
                    }
/* 5 */             il1OOI0 il1ooi0 = (il1OOI0) imageDescriber.zzb;
/* 7 */             il1ooi0.I000II();
/* 18 */            l0Ol1ili l0ol1iliI000o00OoI0I = l0Ol1ili.I000o00OoI0I(il1ooi0.I00000oIO().I0000O());
/* 24 */            iio1ioOI iio1iooi = new iio1ioOI();
/* 27 */            int i = l0O11I1ll.I00l0OO0IO;
/* 31 */            l0Iool1O1iil l0iool1o1iil = new l0Iool1O1iil(l0ol1iliI000o00OoI0I, iio1iooi);
/* 40 */            l0ol1iliI000o00OoI0I.addListener(l0iool1o1iil, ll01i01oo11.I00000oIO(l0OO1i.I00iOIl, l0iool1o1iil));
/* 46 */            iiOOoloool iioooloool = new iiOOoloool(3);
/* 49 */            iioooloool.I00000oOI = ioioil;
/* 51 */            VarHandle.storeStoreFence();
/* 56 */            return ll00lliII.I00000oOI(l0iool1o1iil, iioooloool, il1ooi0.I00iOIl);
                }

                public static ListenableFuture zzd(ImageDescriber imageDescriber, o011iIl o011iil, Throwable th) throws Throwable {
                    GenAiException genAiException;
                    GenAiException genAiException2;
/* 3 */             boolean z = false;
/* 4 */             if (th instanceof GenAiException) {
/* 6 */                 genAiException2 = (GenAiException) th;
                    } else {
/* 11 */                if (th instanceof iOIIOoOoii) {
/* 13 */                    iOIIOoOoii ioiiooooii = (iOIIOoOoii) th;
/* 19 */                    genAiException = new GenAiException(ioiiooooii, ioiiooooii.I00iOIl);
                        } else {
/* 26 */                    String message = th.getMessage();
/* 30 */                    if (message == null) {
/* 32 */                        message = "";
                            }
/* 34 */                    genAiException = new GenAiException(message, th, 0);
                        }
/* 22 */                genAiException2 = genAiException;
                    }
/* 38 */            o011iIl o011iil2 = o011iIl.SAPI_IMAGE_DESCRIPTION_INFERENCE;
/* 40 */            if (o011iil == o011iil2) {
/* 42 */                l1OIlloI1l0 l1oilloi1l0 = imageDescriber.zzc;
/* 44 */                int i = imageDescriber.zze;
/* 46 */                int errorCode = genAiException2.getErrorCode();
/* 50 */                l1oilloi1l0.getClass();
/* 57 */                I1ii1o0 i1ii1o0 = new I1ii1o0(27, z);
/* 60 */                Integer numValueOf = Integer.valueOf(i);
/* 132 */               o0111I o0111i = errorCode != -100 ? errorCode != 4 ? errorCode != 15 ? errorCode != 501 ? errorCode != 604 ? errorCode != 7 ? errorCode != 8 ? errorCode != 9 ? errorCode != 11 ? errorCode != 12 ? o0111I.UNKNOWN_ERROR : o0111I.SAPI_REQUEST_TOO_LARGE : o0111I.SAPI_RESPONSE_PROCESSING_ERROR : o0111I.SAPI_BUSY : o0111I.SAPI_NOT_AVAILABLE : o0111I.SAPI_CANCELLED : o0111I.SAPI_NEEDS_SYSTEM_UPDATE : o0111I.SAPI_NOT_ENOUGH_DISK_SPACE : o0111I.SAPI_RESPONSE_GENERATION_ERROR : o0111I.SAPI_REQUEST_PROCESSING_ERROR : o0111I.SAPI_REQUEST_TOO_SMALL;
/* 134 */               i1OlIi1OoI0 i1olii1ooi0 = l1oilloi1l0.I00000oIO;
/* 138 */               o10l1l o10l1lVar = new o10l1l();
/* 141 */               o10l1lVar.I00000oIO = numValueOf;
/* 143 */               o10l1lVar.I00000oOI = o0111i;
/* 146 */               o10l1lVar.I0000Il00O = null;
/* 148 */               o10l1lVar.I0000O = null;
/* 150 */               o10l1lVar.I0000oI00 = null;
/* 152 */               o10l1lVar.I0001Ioi1lo = null;
/* 154 */               o10l1lVar.I000II = null;
/* 156 */               VarHandle.storeStoreFence();
/* 161 */               o10iO00iOl o10io00iol = new o10iO00iOl();
/* 164 */               o10io00iol.I00000oIO = o10l1lVar;
/* 166 */               VarHandle.storeStoreFence();
/* 169 */               i1ii1o0.I00iio = o10io00iol;
/* 175 */               i1olii1ooi0.I00000oIO(OoIol00Ool.I001i1O0Ol(i1ii1o0), o011iil2);
                    }
/* 178 */           return ll00lliII.I00000oIO(genAiException2);
                }

                public static ImageDescriptionResult zze(ImageDescriber imageDescriber, ImageDescriptionRequest imageDescriptionRequest, AtomicLong atomicLong, long j, ii1O10ooOi ii1o10oooi) throws Throwable {
/* 6 */             boolean z = false;
/* 11 */            String str = (String) ((ii00IIO11) ii1o10oooi).I00000oIO.get(0);
/* 15 */            ioIl00 ioil00 = ((ii00IIO11) ii1o10oooi).I0000Il00O;
/* 37 */            zzg zzgVar = new zzg(str, !ioil00.isEmpty() ? ((Float) ioil00.get(0)).floatValue() : 0.0f);
/* 40 */            l1OIlloI1l0 l1oilloi1l0 = imageDescriber.zzc;
/* 42 */            int i = imageDescriber.zze;
/* 44 */            long j2 = atomicLong.get();
/* 52 */            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 53 */            boolean z2 = imageDescriber.zza;
/* 55 */            l1oilloi1l0.getClass();
/* 62 */            I1ii1o0 i1ii1o0 = new I1ii1o0(27, z);
/* 65 */            Integer numValueOf = Integer.valueOf(i);
/* 69 */            Boolean boolValueOf = Boolean.valueOf(z2);
/* 90 */            Integer numValueOf2 = Integer.valueOf(imageDescriptionRequest.zza().getHeight() * imageDescriptionRequest.zza().getWidth());
/* 102 */           Integer numValueOf3 = Integer.valueOf(zzgVar.getDescription().length());
/* 112 */           Long lValueOf = Long.valueOf(j2 & Long.MAX_VALUE);
/* 118 */           Long lValueOf2 = Long.valueOf(jElapsedRealtime & Long.MAX_VALUE);
/* 124 */           o10l1l o10l1lVar = new o10l1l();
/* 127 */           o10l1lVar.I00000oIO = numValueOf;
/* 131 */           o10l1lVar.I00000oOI = o0111I.NO_ERROR;
/* 133 */           o10l1lVar.I0000Il00O = boolValueOf;
/* 135 */           o10l1lVar.I0000O = numValueOf2;
/* 137 */           o10l1lVar.I0000oI00 = numValueOf3;
/* 139 */           o10l1lVar.I0001Ioi1lo = lValueOf2;
/* 141 */           o10l1lVar.I000II = lValueOf;
/* 143 */           VarHandle.storeStoreFence();
/* 148 */           o10iO00iOl o10io00iol = new o10iO00iOl();
/* 151 */           o10io00iol.I00000oIO = o10l1lVar;
/* 153 */           VarHandle.storeStoreFence();
/* 156 */           i1ii1o0.I00iio = o10io00iol;
/* 166 */           l1oilloi1l0.I00000oIO.I00000oIO(OoIol00Ool.I001i1O0Ol(i1ii1o0), o011iIl.SAPI_IMAGE_DESCRIPTION_INFERENCE);
/* 169 */           imageDescriber.zza = false;
/* 399 */           return zzgVar;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [com.google.mlkit.genai.imagedescription.zzp] */
                private final ListenableFuture zzf(ListenableFuture listenableFuture, final o011iIl o011iil) {
/* 3 */             ?? r0 = new l0OI000IIIi() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 7 */                     return ImageDescriber.zzd(this.zza, o011iil, (Throwable) obj);
                        }
                    };
/* 10 */            l0oOo0Ili1i l0ooo0ili1i = ((il1OOI0) this.zzb).I00iOIl;
/* 14 */            l01I110i l01i110i = new l01I110i();
/* 17 */            l01i110i.I00ioIO = listenableFuture;
/* 21 */            l01i110i.I00l0I0l0lO1 = Throwable.class;
/* 23 */            l01i110i.I00l0OO0IO = r0;
/* 29 */            listenableFuture.addListener(l01i110i, ll01i01oo11.I00000oIO(l0ooo0ili1i, l01i110i));
/* 37 */            return l01i110i;
                }

                private final ListenableFuture zzg() {
/* 1 */             iiI11l01l iii11l01l = this.zzd;
/* 3 */             if (iii11l01l != null) {
/* 7 */                 return new l0lI0IOIl000(iii11l01l);
                    }
/* 11 */            ListenableFuture listenableFutureZzh = zzh();
/* 17 */            ilO0ioll ilo0ioll = new ilO0ioll() {
                        @Override
                        public final Object zza(Object obj) {
/* 5 */                     return ImageDescriber.zza(this.zza, (iOIoil) obj);
                        }
                    };
/* 24 */            l0oOo0Ili1i l0ooo0ili1i = ((il1OOI0) this.zzb).I00iOIl;
/* 26 */            int i = l0O11I1ll.I00l0OO0IO;
/* 30 */            l0Iool1O1iil l0iool1o1iil = new l0Iool1O1iil(listenableFutureZzh, ilo0ioll);
/* 37 */            listenableFutureZzh.addListener(l0iool1o1iil, ll01i01oo11.I00000oIO(l0ooo0ili1i, l0iool1o1iil));
/* 55 */            return l0iool1o1iil;
                }

                private final ListenableFuture zzh() {
/* 1 */             iIloli iiloli = this.zzb;
/* 12 */            if (!GenAiUtils.isAiCoreCompatible(((il1OOI0) iiloli).I00iiI)) {
/* 22 */                return ll00lliII.I00000oIO(new GenAiException(null, GenAiException.ErrorCode.AICORE_INCOMPATIBLE));
                    }
/* 27 */            il1OOI0 il1ooi0 = (il1OOI0) iiloli;
/* 29 */            il1ooi0.I000II();
/* 40 */            l0Ol1ili l0ol1iliI000o00OoI0I = l0Ol1ili.I000o00OoI0I(il1ooi0.I00000oIO().I0000O());
/* 46 */            iio1ioOI iio1iooi = new iio1ioOI();
/* 49 */            int i = l0O11I1ll.I00l0OO0IO;
/* 53 */            l0Iool1O1iil l0iool1o1iil = new l0Iool1O1iil(l0ol1iliI000o00OoI0I, iio1iooi);
/* 62 */            l0ol1iliI000o00OoI0I.addListener(l0iool1o1iil, ll01i01oo11.I00000oIO(l0OO1i.I00iOIl, l0iool1o1iil));
/* 72 */            return ll00lliII.I00000oOI(l0iool1o1iil, new iio10oooI0O(), il1ooi0.I00iOIl);
                }

                private final ListenableFuture zzi(final ImageDescriptionRequest imageDescriptionRequest, final StreamingCallback streamingCallback) {
/* 1 */             final long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 7 */             final AtomicLong atomicLong = new AtomicLong();
/* 10 */            ListenableFuture listenableFutureZzg = zzg();
/* 21 */            l0OI000IIIi l0oi000iiii = new l0OI000IIIi(this) {
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r5v2, types: [com.google.mlkit.genai.imagedescription.zzn] */
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 3 */                     iiI11l01l iii11l01l = (iiI11l01l) obj;
/* 5 */                     Bitmap bitmapZza = imageDescriptionRequest.zza();
/* 9 */                     int width = bitmapZza.getWidth();
/* 13 */                    int height = bitmapZza.getHeight();
/* 17 */                    int iMin = Math.min(width, height);
/* 23 */                    int i = 0;
/* 24 */                    if (iMin > 768) {
/* 31 */                        float f = 768.0f / iMin;
/* 36 */                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapZza, (int) (width * f), (int) (height * f), false);
/* 40 */                        if (bitmapCreateScaledBitmap != bitmapZza) {
/* 42 */                            bitmapZza.recycle();
                                }
/* 45 */                        bitmapZza = bitmapCreateScaledBitmap;
                            }
/* 46 */                    final StreamingCallback streamingCallback2 = streamingCallback;
/* 48 */                    Object[] objArr = {bitmapZza};
                            while (true) {
/* 52 */                        int i2 = 1;
/* 53 */                        zzn zznVar = null;
/* 54 */                        if (i >= 1) {
/* 75 */                            iooO1OIlo iooo1oiloI001lIiIIo1O = ioIl00.I001lIiIIo1O(1, objArr);
/* 79 */                            if (iooo1oiloI001lIiIIo1O == null) {
/* 130 */                               IOOlIIilOl0.I000II("Null images");
/* 53 */                                return null;
                                    }
/* 81 */                            if (streamingCallback2 != null) {
/* 83 */                                final long j = jElapsedRealtime;
/* 85 */                                final AtomicLong atomicLong2 = atomicLong;
/* 89 */                                zznVar = new Consumer() {
                                            @Override
                                            public final void accept(Object obj2) {
/* 14 */                                        atomicLong2.compareAndSet(0L, SystemClock.elapsedRealtime() - j);
/* 19 */                                        streamingCallback2.onNewText((String) obj2);
                                            }
                                        };
                                    }
/* 95 */                            iOolO1ll1I ioolo1ll1i = new iOolO1ll1I();
/* 98 */                            ioolo1ll1i.I00000oIO = iooo1oiloI001lIiIIo1O;
/* 100 */                           ioolo1ll1i.I00000oOI = zznVar;
/* 102 */                           VarHandle.storeStoreFence();
/* 105 */                           ListenableFuture listenableFutureI00000oIO = iii11l01l.I00000oIO();
/* 111 */                           iiOIO1I1lio0 iioio1i1lio0 = new iiOIO1I1lio0(i2);
/* 114 */                           iioio1i1lio0.I00000oOI = iii11l01l;
/* 116 */                           iioio1i1lio0.I0000Il00O = ioolo1ll1i;
/* 118 */                           VarHandle.storeStoreFence();
/* 123 */                           return ll00lliII.I00000oOI(listenableFutureI00000oIO, iioio1i1lio0, iii11l01l.I0000O);
                                }
/* 56 */                        ioI11OIOiiI ioi11oioiii = ioIl00.I00lll10;
/* 60 */                        if (objArr[i] == null) {
/* 71 */                            IOOlIIilOl0.I000II(Oi010OO0.I000oI1ioi(i, "at index "));
/* 53 */                            return null;
                                }
/* 62 */                        i++;
                            }
                        }
                    };
/* 26 */            iIloli iiloli = this.zzb;
/* 33 */            l0IlooI l0ilooiI00000oOI = ll00lliII.I00000oOI(listenableFutureZzg, l0oi000iiii, ((il1OOI0) iiloli).I00iOIl);
/* 39 */            ilO0ioll ilo0ioll = new ilO0ioll() {
                        @Override
                        public final Object zza(Object obj) {
/* 12 */                    return ImageDescriber.zze(this.zza, imageDescriptionRequest, atomicLong, jElapsedRealtime, (ii1O10ooOi) obj);
                        }
                    };
/* 44 */            l0oOo0Ili1i l0ooo0ili1i = ((il1OOI0) iiloli).I00iOIl;
/* 46 */            int i = l0O11I1ll.I00l0OO0IO;
/* 50 */            l0Iool1O1iil l0iool1o1iil = new l0Iool1O1iil(l0ilooiI00000oOI, ilo0ioll);
/* 57 */            l0ilooiI00000oOI.addListener(l0iool1o1iil, ll01i01oo11.I00000oIO(l0ooo0ili1i, l0iool1o1iil));
/* 62 */            return zzf(l0iool1o1iil, o011iIl.SAPI_IMAGE_DESCRIPTION_INFERENCE);
                }

                public ListenableFuture checkFeatureStatus() {
/* 1 */             iIloli iiloli = this.zzb;
                    return !GenAiUtils.isAiCoreCompatible(((il1OOI0) iiloli).I00iiI) ? new l0lI0IOIl000(0) : zzf(ll00lliII.I00000oOI(zzh(), new l0OI000IIIi() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 5 */                     return ImageDescriber.zzc(this.zza, (iOIoil) obj);
                        }
                    }, ((il1OOI0) iiloli).I00iOIl), null);
                }

                public void close() throws Throwable {
/* 5 */             ((il1OOI0) this.zzb).I0000Il00O();
/* 9 */             this.zza = true;
/* 11 */            l1OIlloI1l0 l1oilloi1l0 = this.zzc;
/* 13 */            l1oilloi1l0.getClass();
/* 21 */            I1ii1o0 i1ii1o0 = new I1ii1o0(27, false);
/* 29 */            i1ii1o0.I00ilO0 = new o10IIi1O010o();
/* 39 */            l1oilloi1l0.I00000oIO.I00000oIO(OoIol00Ool.I001i1O0Ol(i1ii1o0), o011iIl.SAPI_IMAGE_DESCRIPTION_CLOSE);
                }

                public ListenableFuture downloadFeature(final DownloadCallback downloadCallback) {
/* 21 */            return zzf(ll00lliII.I00000oOI(zzh(), new l0OI000IIIi() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 7 */                     return ImageDescriber.zzb(this.zza, downloadCallback, (iOIoil) obj);
                        }
                    }, ((il1OOI0) this.zzb).I00iOIl), null);
                }

                public ListenableFuture getBaseModelName() {
/* 21 */            return zzf(ll00lliII.I00000oOI(zzh(), new l0OI000IIIi() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 1 */                     iOIoil ioioil = (iOIoil) obj;
                            return ioioil != null ? new l0lI0IOIl000(((iOli1OIiO1I0) ioioil).I00000oOI) : ll00lliII.I00000oIO(new IllegalStateException("Failed to get base model name. aiFeature is null."));
                        }
                    }, ((il1OOI0) this.zzb).I00iOIl), null);
                }

                public ListenableFuture prepareInferenceEngine() {
/* 21 */            return zzf(ll00lliII.I00000oOI(zzg(), new l0OI000IIIi() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 1 */                     iiI11l01l iii11l01l = (iiI11l01l) obj;
/* 3 */                     ListenableFuture listenableFutureI00000oIO = iii11l01l.I00000oIO();
/* 10 */                    iiOOoloool iioooloool = new iiOOoloool(2);
/* 13 */                    iioooloool.I00000oOI = iii11l01l;
/* 15 */                    VarHandle.storeStoreFence();
/* 20 */                    return ll00lliII.I00000oOI(listenableFutureI00000oIO, iioooloool, iii11l01l.I0000O);
                        }
                    }, ((il1OOI0) this.zzb).I00iOIl), null);
                }

                public ListenableFuture runInference(ImageDescriptionRequest imageDescriptionRequest) {
/* 2 */             return zzi(imageDescriptionRequest, null);
                }

/* 6 */         public ListenableFuture runInference(ImageDescriptionRequest imageDescriptionRequest, StreamingCallback streamingCallback) {
/* 7 */             return zzi(imageDescriptionRequest, streamingCallback);
                }
            }
