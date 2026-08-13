            package p000;

            import android.graphics.Bitmap;
            import android.util.Log;
            import com.google.ai.edge.gallery.stablediffusion.StableDiffusion;
            import java.util.concurrent.CancellationException;
            
            public final class OlIilOoOIIiO extends Oll0io implements IlliIl1l11O {
                public O010OIi I00iOIl;
                public long I00iiI;
                public long I00iiO;
                public int I00iio;
                public Object I00ilI0I1;
                public final StableDiffusion I00ilO0;
                public final OlIiOOo1O1ll I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OlIilOoOIIiO(StableDiffusion stableDiffusion, OlIiOOo1O1ll olIiOOo1O1ll, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00ilO0 = stableDiffusion;
/* 3 */             this.I00io1l = olIiOOo1O1ll;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             OlIilOoOIIiO olIilOoOIIiO = new OlIilOoOIIiO(this.I00ilO0, this.I00io1l, iOoil1iiIilo);
/* 10 */            olIilOoOIIiO.I00ilI0I1 = obj;
/* 37 */            return olIilOoOIIiO;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OlIilOoOIIiO) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:15:0x0033, B:38:0x00a4, B:40:0x00a9, B:44:0x00cf, B:30:0x0082), top: B:58:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00cf A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #2 {all -> 0x003a, blocks: (B:15:0x0033, B:38:0x00a4, B:40:0x00a9, B:44:0x00cf, B:30:0x0082), top: B:58:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
                /* JADX WARN: Type inference failed for: r3v0, types: [int] */
                /* JADX WARN: Type inference failed for: r3v1 */
                /* JADX WARN: Type inference failed for: r3v10, types: [O010OIi] */
                /* JADX WARN: Type inference failed for: r3v12 */
                /* JADX WARN: Type inference failed for: r3v13 */
                /* JADX WARN: Type inference failed for: r3v8, types: [O010OIi, OlIl0i] */
                /* JADX WARN: Type inference failed for: r3v9 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    O010OIi o010OIi;
                    Object objI0000oI00;
                    long j;
                    long j2;
                    byte[] bArr;
/* 5 */             OOIoOo0O oOIoOo0O = (OOIoOo0O) this.I00ilI0I1;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             ?? I0000O = this.I00iio;
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 15 */            OlIiOOo1O1ll olIiOOo1O1ll = this.I00io1l;
/* 20 */            StableDiffusion stableDiffusion = this.I00ilO0;
/* 22 */            CancellationException cancellationException = null;
                    try {
/* 23 */                if (I0000O == 0) {
/* 67 */                    lIoii1l01l0i.I00000oOI(obj);
/* 78 */                    if (stableDiffusion.loadedModelPath.length() > 0) {
/* 80 */                        IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 86 */                        I1iOI0oo i1iOI0oo = new I1iOI0oo(stableDiffusion, (IOoil1iiIilo) null, 21);
/* 89 */                        this.I00ilI0I1 = oOIoOo0O;
/* 91 */                        this.I00iio = 1;
/* 97 */                        if (iOi1II01i0.I0000oI00(iiI0oillOO10, i1iOI0oo, this) != ii0111o) {
                                }
                            }
                        }
/* 25 */                if (I0000O != 1) {
/* 27 */                    if (I0000O != 2) {
/* 29 */                        if (I0000O != 3) {
/* 42 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 22 */                            return null;
                                }
/* 31 */                        o010OIi = this.I00iOIl;
                                try {
/* 33 */                            lIoii1l01l0i.I00000oOI(obj);
/* 36 */                            return ooiIlOl1iI;
                                } catch (Throwable th) {
/* 37 */                            th = th;
/* 222 */                           o010OIi.I000II(cancellationException);
/* 227 */                           if (th instanceof OutOfMemoryError) {
/* 235 */                               iOi100.I00000oIO(Log.e("StableDiffusion", "Generation failed", th));
/* 238 */                               return ooiIlOl1iI;
                                    }
/* 241 */                           OIiilo1Ool0o.I000iOII("Out of memory — try a smaller image size", th);
/* 437 */                           return cancellationException;
                                }
                            }
/* 46 */                    j = this.I00iiO;
/* 48 */                    j2 = this.I00iiI;
/* 50 */                    O010OIi o010OIi2 = this.I00iOIl;
/* 52 */                    lIoii1l01l0i.I00000oOI(obj);
/* 55 */                    objI0000oI00 = obj;
                            I0000O = o010OIi2;
/* 162 */                   bArr = (byte[]) objI0000oI00;
/* 165 */                   I0000O.I000II(null);
/* 168 */                   if (bArr != null) {
/* 214 */                       iOi100.I00000oIO(Log.e("StableDiffusion", "Generation returned null — model may have failed to load properly"));
/* 217 */                       return ooiIlOl1iI;
                            }
/* 1 */                     Bitmap bitmapRgbBytesToBitmap = stableDiffusion.rgbBytesToBitmap(bArr, olIiOOo1O1ll.I0000Il00O, olIiOOo1O1ll.I0000O);
/* 180 */                   int i = olIiOOo1O1ll.I0000oI00;
/* 182 */                   OlIiOi0Oo olIiOi0Oo = new OlIiOi0Oo(i, i, bitmapRgbBytesToBitmap);
/* 185 */                   this.I00ilI0I1 = null;
/* 187 */                   this.I00iOIl = I0000O;
/* 189 */                   this.I00iiI = j2;
/* 191 */                   this.I00iiO = j;
/* 194 */                   this.I00iio = 3;
                            return ((OOIoO0IIOO0) oOIoOo0O).I00ilI0I1.I00000oOI(this, olIiOi0Oo) == ii0111o ? ii0111o : ooiIlOl1iI;
                        }
/* 63 */                lIoii1l01l0i.I00000oOI(obj);
/* 1 */                 long j3 = stableDiffusion.contextHandle;
/* 108 */               if (j3 == 0) {
/* 112 */                   Log.e("StableDiffusion", "generateImage called without loaded model");
/* 115 */                   return ooiIlOl1iI;
                        }
/* 118 */               long jCurrentTimeMillis = System.currentTimeMillis();
/* 127 */               I0000O = iOi1II01i0.I0000O(oOIoOo0O, null, null, new I00111O(stableDiffusion, oOIoOo0O, null), 3);
/* 131 */               IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
                        try {
/* 140 */                   OlIii1 olIii1 = new OlIii1(stableDiffusion, j3, olIiOOo1O1ll, jCurrentTimeMillis, null);
/* 143 */                   this.I00ilI0I1 = oOIoOo0O;
/* 145 */                   this.I00iOIl = I0000O;
/* 147 */                   this.I00iiI = j3;
/* 149 */                   this.I00iiO = jCurrentTimeMillis;
/* 151 */                   this.I00iio = 2;
/* 153 */                   objI0000oI00 = iOi1II01i0.I0000oI00(iiI0oillOO102, olIii1, this);
/* 157 */                   if (objI0000oI00 != ii0111o) {
/* 160 */                       j = jCurrentTimeMillis;
/* 161 */                       j2 = j3;
                                I0000O = I0000O;
/* 162 */                       bArr = (byte[]) objI0000oI00;
/* 165 */                       I0000O.I000II(null);
/* 168 */                       if (bArr != null) {
                                }
                            }
                        } catch (Throwable th2) {
/* 218 */                   th = th2;
/* 219 */                   cancellationException = null;
/* 60 */                    o010OIi = I0000O;
/* 222 */                   o010OIi.I000II(cancellationException);
/* 227 */                   if (th instanceof OutOfMemoryError) {
                            }
                        }
                    } catch (Throwable th3) {
/* 59 */                th = th3;
                    }
                }
            }
