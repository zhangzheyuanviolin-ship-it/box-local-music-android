            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.os.ParcelFileDescriptor;
            import android.util.Log;
            import android.view.textclassifier.TextClassifier;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.jegly.offlineLLM.smollm.GGUFReader;
            import com.jegly.offlineLLM.smollm.SmolLM;
            import com.k2fsa.sherpa.onnx.OfflineTts;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.jvm.functions.Function1;
            
/* 14 */    public final class O1o1iI extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public final Object I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1o1iI(Context context, O1oIOiI11o0 o1oIOiI11o0, I0IO1io0I i0IO1io0I, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(2, iOoil1iiIilo);
/* 3 */             this.I00iOIl = 13;
/* 5 */             this.I00ilI0I1 = context;
/* 7 */             this.I00iio = o1oIOiI11o0;
/* 9 */             this.I00ilO0 = i0IO1io0I;
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006a -> B:17:0x0039). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I00000oIO(Object obj) throws Throwable {
                    Ii0110 ii0110;
                    Ii0110 ii01102;
                    OoI0Iio ooI0Iio;
                    Oii00o1ll oii00o1ll;
/* 3 */             OoI0Iio ooI0Iio2 = (OoI0Iio) this.I00ilO0;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
                    try {
/* 12 */                if (i == 0) {
/* 51 */                    lIoii1l01l0i.I00000oOI(obj);
/* 56 */                    ii0110 = (Ii0110) this.I00iiO;
                        } else {
/* 14 */                    if (i == 1) {
/* 37 */                        oii00o1ll = (Oii00o1ll) this.I00ilI0I1;
/* 41 */                        ooI0Iio = (OoI0Iio) this.I00iio;
/* 45 */                        ii01102 = (Ii0110) this.I00iiO;
/* 47 */                        lIoii1l01l0i.I00000oOI(obj);
/* 92 */                        this.I00iiO = ii01102;
/* 94 */                        this.I00iio = null;
/* 96 */                        this.I00ilI0I1 = null;
/* 98 */                        this.I00iiI = 2;
/* 104 */                       if (ooI0Iio.I0000Il00O(oii00o1ll, (OoI0I0o10ll) obj, this) != ii0111o) {
/* 107 */                           ii0110 = ii01102;
                                }
/* 106 */                       return ii0111o;
                            }
/* 16 */                    if (i != 2) {
/* 31 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 20 */                    Ii0110 ii01103 = (Ii0110) this.I00iiO;
/* 22 */                    lIoii1l01l0i.I00000oOI(obj);
/* 25 */                    ii0110 = ii01103;
                        }
/* 66 */                if (!l01oO1iOo.I000II(ii0110.I00000oIO())) {
/* 109 */                   ooI0Iio2.I000II = null;
/* 111 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 68 */                oii00o1ll = ooI0Iio2.I00000oIO;
/* 70 */                IIIII1OI1 iiiii1oi1 = ooI0Iio2.I0001Ioi1lo;
/* 72 */                this.I00iiO = ii0110;
/* 74 */                this.I00iio = ooI0Iio2;
/* 76 */                this.I00ilI0I1 = oii00o1ll;
/* 78 */                this.I00iiI = 1;
/* 80 */                Object objI000iOII = iiiii1oi1.I000iOII(this);
/* 84 */                if (objI000iOII == ii0111o) {
/* 106 */                   return ii0111o;
                        }
/* 87 */                ii01102 = ii0110;
/* 88 */                obj = objI000iOII;
/* 89 */                ooI0Iio = ooI0Iio2;
/* 92 */                this.I00iiO = ii01102;
/* 94 */                this.I00iio = null;
/* 96 */                this.I00ilI0I1 = null;
/* 98 */                this.I00iiI = 2;
/* 104 */               if (ooI0Iio.I0000Il00O(oii00o1ll, (OoI0I0o10ll) obj, this) != ii0111o) {
                        }
/* 106 */               return ii0111o;
                    } catch (Throwable th) {
/* 114 */               ooI0Iio2.I000II = null;
/* 168 */               throw th;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
                
                    if (p000.iOi1II01i0.I0000oI00((p000.Ii00l101O) r12, r8, r11) == r2) goto L23;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I000II(Object obj) throws Throwable {
                    IlOil1iooOO0 ilOil1iooOO0;
                    IlOil1iooOO0 ilOil1iooOO02;
/* 3 */             int[] iArr = (int[]) this.I00ilI0I1;
/* 7 */             OoIlIoo1oiOo ooIlIoo1oiOo = (OoIlIoo1oiOo) this.I00iio;
/* 9 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 11 */            int i = this.I00iiI;
/* 13 */            IOoil1iiIilo iOoil1iiIilo = null;
                    try {
/* 17 */                if (i == 0) {
/* 60 */                    lIoii1l01l0i.I00000oOI(obj);
/* 65 */                    ilOil1iooOO0 = (IlOil1iooOO0) this.I00iiO;
/* 75 */                    if (((OIOiiiloOio) ooIlIoo1oiOo.I00ioIO).I00000oIO(iArr)) {
/* 79 */                        Oi1oIiOiIi0 oi1oIiOiIi0 = (Oi1oIiOiIi0) ooIlIoo1oiOo.I00iiO;
/* 81 */                        this.I00iiO = ilOil1iooOO0;
/* 83 */                        this.I00iiI = 1;
/* 86 */                        Ii00l101O ii00l101OI00000oIO = il01ioIoI.I00000oIO(oi1oIiOiIi0, false, this);
/* 90 */                        if (ii00l101OI00000oIO != ii0111o) {
/* 94 */                            ilOil1iooOO02 = ilOil1iooOO0;
/* 95 */                            obj = ii00l101OI00000oIO;
                                }
/* 115 */                       return ii0111o;
                            }
/* 119 */                   OOo0ooi oOo0ooi = new OOo0ooi();
/* 124 */                   Ii1OIo10 ii1OIo10 = (Ii1OIo10) ooIlIoo1oiOo.I00l0I0l0lO1;
/* 130 */                   String[] strArr = (String[]) this.I00ilO0;
/* 132 */                   OoIl01i0Oo ooIl01i0Oo = new OoIl01i0Oo();
/* 135 */                   ooIl01i0Oo.I00iOIl = oOo0ooi;
/* 137 */                   ooIl01i0Oo.I00iiI = true;
/* 139 */                   ooIl01i0Oo.I00iiO = ilOil1iooOO0;
/* 141 */                   ooIl01i0Oo.I00iio = strArr;
/* 143 */                   ooIl01i0Oo.I00ilI0I1 = iArr;
/* 145 */                   VarHandle.storeStoreFence();
/* 148 */                   this.I00iiO = null;
/* 150 */                   this.I00iiI = 3;
/* 152 */                   ii1OIo10.I00000oIO(ooIl01i0Oo, this);
/* 155 */                   return ii0111o;
                        }
/* 19 */                if (i != 1) {
/* 21 */                    if (i != 2) {
/* 23 */                        if (i != 3) {
/* 27 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
/* 40 */                        throw new IOiIIo1l(5);
                            }
/* 46 */                    ilOil1iooOO02 = (IlOil1iooOO0) this.I00iiO;
/* 48 */                    lIoii1l01l0i.I00000oOI(obj);
/* 116 */                   ilOil1iooOO0 = ilOil1iooOO02;
/* 119 */                   OOo0ooi oOo0ooi2 = new OOo0ooi();
/* 124 */                   Ii1OIo10 ii1OIo102 = (Ii1OIo10) ooIlIoo1oiOo.I00l0I0l0lO1;
/* 130 */                   String[] strArr2 = (String[]) this.I00ilO0;
/* 132 */                   OoIl01i0Oo ooIl01i0Oo2 = new OoIl01i0Oo();
/* 135 */                   ooIl01i0Oo2.I00iOIl = oOo0ooi2;
/* 137 */                   ooIl01i0Oo2.I00iiI = true;
/* 139 */                   ooIl01i0Oo2.I00iiO = ilOil1iooOO0;
/* 141 */                   ooIl01i0Oo2.I00iio = strArr2;
/* 143 */                   ooIl01i0Oo2.I00ilI0I1 = iArr;
/* 145 */                   VarHandle.storeStoreFence();
/* 148 */                   this.I00iiO = null;
/* 150 */                   this.I00iiI = 3;
/* 152 */                   ii1OIo102.I00000oIO(ooIl01i0Oo2, this);
/* 155 */                   return ii0111o;
                        }
/* 54 */                ilOil1iooOO02 = (IlOil1iooOO0) this.I00iiO;
/* 56 */                lIoii1l01l0i.I00000oOI(obj);
/* 102 */               O1iOlO o1iOlO = new O1iOlO(ooIlIoo1oiOo, iOoil1iiIilo, 14);
/* 105 */               this.I00iiO = ilOil1iooOO02;
/* 107 */               this.I00iiI = 2;
                    } catch (Throwable th) {
/* 160 */               ((OIOiiiloOio) ooIlIoo1oiOo.I00ioIO).I00000oOI(iArr);
/* 168 */               throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I000O01llI0(Object obj) throws Throwable {
                    float[] samples;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
/* 11 */            if (i == 0) {
/* 26 */                lIoii1l01l0i.I00000oOI(obj);
/* 31 */                II1olI iI1olI = (II1olI) this.I00iiO;
/* 35 */                String str = (String) this.I00iio;
/* 39 */                OoIo10100O1 ooIo10100O1 = (OoIo10100O1) this.I00ilI0I1;
/* 41 */                int i2 = ooIo10100O1.I0000Il00O;
/* 43 */                float f = ooIo10100O1.I0000O;
/* 45 */                OfflineTts offlineTts = iI1olI.I00000oIO;
/* 48 */                if (offlineTts == null) {
/* 50 */                    samples = null;
/* 87 */                    if (samples != null) {
/* 93 */                        OlO0OIIl1 olO0OIIl1 = ((OoIoI0iii0) this.I00ilO0).I00000oOI;
/* 118 */                       olO0OIIl1.I000lI(null, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl1.getValue(), null, false, 0, 0.0f, 0, "Synthesis failed — check logcat for details", false, 0.0f, null, 477));
/* 121 */                       return ooiIlOl1iI;
                            }
/* 123 */                   boolean z = samples.length == 0;
/* 128 */                   OoIoI0iii0 ooIoI0iii0 = (OoIoI0iii0) this.I00ilO0;
/* 130 */                   if (z) {
/* 147 */                       OlO0OIIl1 olO0OIIl12 = ooIoI0iii0.I00000oOI;
/* 172 */                       olO0OIIl12.I000lI(null, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl12.getValue(), null, false, 0, 0.0f, 0, "Synthesis returned empty audio", false, 0.0f, null, 479));
                            } else {
/* 136 */                       int i3 = ((II1olI) this.I00iiO).I00000oOI;
/* 138 */                       this.I00iiI = 1;
/* 144 */                       if (ooIoI0iii0.I0000oI00(samples, i3, this) == ii0111o) {
/* 146 */                           return ii0111o;
                                }
                            }
                        } else {
/* 56 */                    String string = OlOoOIi0o.I00OIo(str).toString();
/* 64 */                    if (string.length() == 0) {
/* 66 */                        samples = new float[0];
                            } else {
                                try {
/* 73 */                            samples = offlineTts.generate(string, i2, f).getSamples();
                                } catch (Throwable th) {
/* 83 */                            Log.e("BoxTtsEngine", "Synthesize failed", th);
                                }
                            }
/* 87 */                    if (samples != null) {
                            }
                        }
                    } else {
/* 13 */                if (i != 1) {
/* 22 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                    return null;
                        }
/* 15 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 179 */           OlO0OIIl1 olO0OIIl13 = ((OoIoI0iii0) this.I00ilO0).I00000oOI;
/* 203 */           olO0OIIl13.I000lI(null, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl13.getValue(), null, false, 0, 0.0f, 0, null, false, 0.0f, null, 509));
/* 437 */           return ooiIlOl1iI;
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
                
                    if (((p000.IiIOI1ol0o) r7).I00o0iI0io1(r6) == r0) goto L15;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I000iOII(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 7 */             if (i == 0) {
/* 28 */                lIoii1l01l0i.I00000oOI(obj);
/* 33 */                OolI1lo oolI1lo = (OolI1lo) this.I00iiO;
/* 37 */                Ool1iI0OiI ool1iI0OiI = (Ool1iI0OiI) this.I00iio;
/* 41 */                Map map = (Map) this.I00ilI0I1;
/* 45 */                IOlOo0 iOlOo0 = (IOlOo0) this.I00ilO0;
/* 47 */                this.I00iiI = 1;
/* 49 */                IOi10loi iOi10loi = OolI1lo.I000l1;
/* 51 */                obj = oolI1lo.I00100o1O0lo(ool1iI0OiI, map, iOlOo0, this);
/* 55 */                if (obj != ii0111o) {
                        }
/* 68 */                return ii0111o;
                    }
/* 9 */             if (i != 1) {
/* 11 */                if (i == 2) {
/* 13 */                    lIoii1l01l0i.I00000oOI(obj);
/* 69 */                    return OoiIlOl1iI.I00000oIO;
                        }
/* 19 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 22 */                return null;
                    }
/* 24 */            lIoii1l01l0i.I00000oOI(obj);
/* 60 */            this.I00iiI = 2;
                }

                private final Object I000lI(Object obj) throws Throwable {
/* 4 */             i00oo10 i00oo10Var = (i00oo10) this.I00ilO0;
/* 9 */             O0oiOi o0oiOi = (O0oiOi) this.I00ilI0I1;
/* 14 */            OOloolilI11i oOloolilI11i = (OOloolilI11i) this.I00iio;
/* 16 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 18 */            int i = this.I00iiI;
/* 20 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    try {
/* 23 */                if (i == 0) {
/* 41 */                    lIoii1l01l0i.I00000oOI(obj);
/* 50 */                    OI01Ilio oI01Ilio = (OI01Ilio) ((OOo0ooi) this.I00iiO).I00iOIl;
/* 52 */                    if (oI01Ilio != null) {
/* 60 */                        oI01Ilio.I00iiI = il001oo1.I00000oIO(oOloolilI11i.I001i1lo1io);
                            }
/* 62 */                    this.I00iiI = 1;
/* 87 */                    Object objI0000oI00 = iOi1II01i0.I0000oI00(oOloolilI11i.I00000oIO, new I000oI1ioi(oOloolilI11i, new OOlooO1oiOlo(oOloolilI11i, null), l1i0lii.I00000oIO(getContext()), null, 18), this);
/* 91 */                    if (objI0000oI00 != ii0111o) {
/* 94 */                        objI0000oI00 = ooiIlOl1iI;
                            }
/* 95 */                    if (objI0000oI00 != ii0111o) {
/* 98 */                        objI0000oI00 = ooiIlOl1iI;
                            }
/* 99 */                    if (objI0000oI00 == ii0111o) {
/* 101 */                       return ii0111o;
                            }
                        } else {
/* 25 */                    if (i != 1) {
/* 36 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                        return null;
                            }
/* 27 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 106 */               o0oiOi.I000iOII().I00ooIo0(i00oo10Var);
/* 109 */               return ooiIlOl1iI;
                    } catch (Throwable th) {
/* 114 */               o0oiOi.I000iOII().I00ooIo0(i00oo10Var);
/* 168 */               throw th;
                    }
                }

                public static final String I000o00OoI0I(O1oIOiI11o0 o1oIOiI11o0, Context context, String str, String str2) {
/* 1 */             O1oIOoi0oo o1oIOoi0ooI00000oIO = o1oIOiI11o0.I00000oIO(str);
/* 5 */             if (o1oIOoi0ooI00000oIO != null) {
/* 7 */                 str2 = o1oIOoi0ooI00000oIO.I0000Il00O;
                    }
/* 9 */             return o1oIOiI11o0.I00000oOI(context, str2);
                }

                private final Object I00100l0(Object obj) throws Throwable {
                    String strZza;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
                    try {
/* 12 */                if (this.I00iiI == 0) {
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    o0l0iIlo0O o0l0iilo0o = (o0l0iIlo0O) this.I00iio;
/* 23 */                    IOiOol0 iOiOol0 = (IOiOol0) this.I00ilO0;
/* 27 */                    Context context = (Context) this.I00ilI0I1;
/* 29 */                    strZza = o0l0iilo0o.zza();
/* 43 */                    File file = new File(iOiOol0.I00Ol10(context), o0l0iilo0o.zzb());
/* 50 */                    if (file.exists()) {
/* 110 */                       return ParcelFileDescriptor.open(file, 268435456);
                            }
/* 64 */                    StringBuilder sb = new StringBuilder(String.valueOf(strZza).length() + 51);
/* 67 */                    sb.append("Cache file not found for name: ");
/* 70 */                    sb.append(strZza);
/* 73 */                    sb.append(". Cleaning up index.");
/* 80 */                    Log.w("CacheFileManager", sb.toString());
/* 83 */                    this.I00iiO = strZza;
/* 86 */                    this.I00iiI = 1;
/* 99 */                    obj = iOi1II01i0.I0000oI00(((IIOlO1ii) iOiOol0.I00ioIO).I00iiI, new i00Iooii0i(iOiOol0, (IOoil1iiIilo) null, context, strZza), this);
/* 103 */                   if (obj == ii0111o) {
/* 105 */                       return ii0111o;
                            }
                        } else {
/* 118 */                   strZza = (String) this.I00iiO;
/* 120 */                   lIoii1l01l0i.I00000oOI(obj);
                        }
/* 125 */               ((Boolean) obj).getClass();
/* 142 */               StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + 31);
/* 145 */               sb2.append("Cache file not found for name: ");
/* 148 */               sb2.append(strZza);
/* 158 */               throw new FileNotFoundException(sb2.toString());
                    } catch (IOException e) {
/* 161 */               Log.e("CacheFileManager", "Failed to open cache for reading", e);
/* 7 */                 return null;
                    }
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 628 */                   return new O1o1iI((O1oIOiI11o0) this.I00iio, (Context) this.I00ilI0I1, (I0IO1io0I) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 607 */                   return new O1o1iI(this.I00iiO, (O1o1io0oi0ol) this.I00ilI0I1, (Bitmap) obj2, iOoil1iiIilo);
                        case 2:
/* 590 */                   O1o1iI o1o1iI = new O1o1iI((IIOOoll) this.I00ilI0I1, (IlliIl1l11O) obj2, iOoil1iiIilo, 2);
/* 593 */                   o1o1iI.I00iiO = obj;
/* 595 */                   return o1o1iI;
                        case 3:
/* 574 */                   O1o1iI o1o1iI2 = new O1o1iI((Oii110oOoO) this.I00iio, (OiO1O1lil10) this.I00ilI0I1, (OoI1Oi0l1I0o) obj2, iOoil1iiIilo, 3);
/* 577 */                   o1o1iI2.I00iiO = obj;
/* 579 */                   return o1o1iI2;
                        case 4:
/* 551 */                   O1o1iI o1o1iI3 = new O1o1iI((Oii110oOoO) this.I00iio, (OI1OloOIO1O) this.I00ilI0I1, (OoI1Oi0l1I0o) obj2, iOoil1iiIilo, 4);
/* 554 */                   o1o1iI3.I00iiO = obj;
/* 556 */                   return o1o1iI3;
                        case 5:
/* 530 */                   return new O1o1iI((OO1O0I) this.I00ilI0I1, (IlliIl1l11O) obj2, iOoil1iiIilo, 5);
                        case 6:
/* 516 */                   return new O1o1iI((IOO000ilo) this.I00iiO, (String) this.I00iio, (OOio1IioOO1l) this.I00ilI0I1, (OOl1OlI0) obj2, iOoil1iiIilo, 6);
                        case 7:
/* 487 */                   O1o1iI o1o1iI4 = new O1o1iI((Oi1oIiOiIi0) this.I00iio, (IIoOo1iIio1l) this.I00ilI0I1, (IlliIl1l11O) obj2, iOoil1iiIilo, 7);
/* 490 */                   o1o1iI4.I00iiO = obj;
/* 492 */                   return o1o1iI4;
                        case 8:
/* 466 */                   return new O1o1iI((Oiill0lI1il1) this.I00iiO, (OOo0ooi) this.I00iio, (OOo0ooi) this.I00ilI0I1, (OOo0o0oO) obj2, iOoil1iiIilo, 8);
                        case 9:
/* 436 */                   O1o1iI o1o1iI5 = new O1o1iI((Function1) this.I00iio, (AtomicReference) this.I00ilI0I1, (IlliIl1l11O) obj2, iOoil1iiIilo, 9);
/* 439 */                   o1o1iI5.I00iiO = obj;
/* 441 */                   return o1o1iI5;
                        case 10:
/* 414 */                   return new O1o1iI((Ol010000lo00) this.I00iiO, (Function1) this.I00iio, (OOo0ooi) this.I00ilI0I1, (Ol0o1OiOIIIl) obj2, iOoil1iiIilo, 10);
                        case 11:
/* 386 */                   return new O1o1iI((String) this.I00iio, (SmolLM) this.I00ilI0I1, (Ol1OIlllo) obj2, iOoil1iiIilo, 11);
                        case 12:
/* 364 */                   return new O1o1iI(this.I00iiO, (String) this.I00iio, (OooioIIoi0O) obj2, (Context) this.I00ilI0I1, iOoil1iiIilo, 12);
                        case 13:
/* 336 */                   return new O1o1iI((Context) this.I00ilI0I1, (O1oIOiI11o0) this.I00iio, (I0IO1io0I) obj2, iOoil1iiIilo);
                        case 14:
/* 319 */                   return new O1o1iI(this.I00iiO, (String) this.I00iio, (OooioIIoi0O) obj2, (Context) this.I00ilI0I1, iOoil1iiIilo, 14);
                        case 15:
/* 291 */                   return new O1o1iI((O1oIOiI11o0) this.I00iio, (Context) this.I00ilI0I1, (I0IO1io0I) obj2, iOoil1iiIilo, 15);
                        case 16:
/* 269 */                   return new O1o1iI((OliiOI) this.I00iiO, (String) this.I00iio, (OliiOl0) this.I00ilI0I1, (Oliii00iliIi) obj2, iOoil1iiIilo, 16);
                        case 17:
/* 241 */                   return new O1o1iI((Ol010000lo00) this.I00iiO, (Function1) this.I00iio, (String) this.I00ilI0I1, (IllOOo00lI) obj2, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 211 */                   O1o1iI o1o1iI6 = new O1o1iI((OoI0Iio) obj2, iOoil1iiIilo);
/* 214 */                   o1o1iI6.I00iiO = obj;
/* 216 */                   return o1o1iI6;
                        case PoseLandmark.LEFT_INDEX:
/* 200 */                   O1o1iI o1o1iI7 = new O1o1iI((OoIlIoo1oiOo) this.I00iio, (int[]) this.I00ilI0I1, (String[]) obj2, iOoil1iiIilo, 19);
/* 203 */                   o1o1iI7.I00iiO = obj;
/* 205 */                   return o1o1iI7;
                        case PoseLandmark.RIGHT_INDEX:
/* 178 */                   return new O1o1iI((II1olI) this.I00iiO, (String) this.I00iio, (OoIo10100O1) this.I00ilI0I1, (OoIoI0iii0) obj2, iOoil1iiIilo, 20);
                        case PoseLandmark.LEFT_THUMB:
/* 150 */                   return new O1o1iI((O1oIOiI11o0) this.I00iio, (Context) this.I00ilI0I1, (I0IO1io0I) obj2, iOoil1iiIilo, 21);
                        case PoseLandmark.RIGHT_THUMB:
/* 128 */                   return new O1o1iI((OolI1lo) this.I00iiO, (Ool1iI0OiI) this.I00iio, (Map) this.I00ilI0I1, (IOlOo0) obj2, iOoil1iiIilo, 22);
                        case PoseLandmark.LEFT_HIP:
/* 100 */                   return new O1o1iI((OOo0ooi) this.I00iiO, (OOloolilI11i) this.I00iio, (O0oiOi) this.I00ilI0I1, (i00oo10) obj2, iOoil1iiIilo, 23);
                        case PoseLandmark.RIGHT_HIP:
/* 72 */                    return new O1o1iI((o00i1olooO) this.I00iio, (ii1iOiO) this.I00ilI0I1, (OI10i0Il) obj2, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 50 */                    return new O1o1iI(this.I00iio, (IOiOol0) obj2, (Context) this.I00ilI0I1, iOoil1iiIilo, 25);
                        default:
/* 26 */                    O1o1iI o1o1iI8 = new O1o1iI(this.I00iio, (IOiOol0) obj2, (Context) this.I00ilI0I1, iOoil1iiIilo, 26);
/* 29 */                    o1o1iI8.I00iiO = obj;
/* 31 */                    return o1o1iI8;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 409 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 394 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 379 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 364 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 349 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 5:
/* 334 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 6:
/* 319 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 7:
/* 304 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 8:
/* 289 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 9:
/* 274 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 10:
/* 259 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 11:
/* 244 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 12:
/* 229 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 13:
/* 214 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 14:
/* 199 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 15:
/* 184 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 16:
/* 169 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 17:
/* 154 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_PINKY:
/* 139 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_INDEX:
/* 123 */                   ((O1o1iI) create((IlOil1iooOO0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 126 */                   return Ii0111o.I00iOIl;
                        case PoseLandmark.RIGHT_INDEX:
/* 108 */                   return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_THUMB:
/* 93 */                    return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_THUMB:
/* 78 */                    return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_HIP:
/* 63 */                    return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_HIP:
/* 48 */                    return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_KNEE:
/* 33 */                    return ((O1o1iI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((O1o1iI) create((Map) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:201:0x0559, code lost:
                
                    if (p000.l01oO1iOo.I0000Il00O(r2, r30) == r0) goto L206;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:205:0x0569, code lost:
                
                    if (r3 == r0) goto L206;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:367:0x0991, code lost:
                
                    if (r2 == r1) goto L380;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:373:0x09b2, code lost:
                
                    if (r2 == r1) goto L380;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:379:0x09d2, code lost:
                
                    if (r2 == r1) goto L380;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:400:0x0a85, code lost:
                
                    if (r0 == r2) goto L417;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:409:0x0ab9, code lost:
                
                    if (r0 == r2) goto L417;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:416:0x0ae7, code lost:
                
                    if (r0 == r2) goto L417;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:471:?, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x014d, code lost:
                
                    if (p000.il0l1o1l.I00000oOI(100, r30) == r0) goto L69;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:89:0x01f1, code lost:
                
                    if (r12.I0000oI00(r3, r2, r30) == r1) goto L90;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:230:0x05df  */
                /* JADX WARN: Removed duplicated region for block: B:291:0x07a0  */
                /* JADX WARN: Removed duplicated region for block: B:474:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r2v133 */
                /* JADX WARN: Type inference failed for: r2v67 */
                /* JADX WARN: Type inference failed for: r2v70, types: [Oilo1OII0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v75, types: [Oilo1OII0] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    O1o1IiIllOI o1o1IiIllOI;
                    Object objI0000oI00;
                    IiilI0lIiol iiilI0lIiol;
                    Object objI0000oI002;
                    OO1I0o oO1I0o;
                    Object objI0000oI003;
                    boolean zBooleanValue;
                    Object objI0000oI004;
                    Object objI0000oI005;
                    Object objI0000oI006;
                    OI11ol oI11ol;
                    OO1O0I oo1o0i;
                    OI11ol oI11ol2;
                    TextClassifier textClassifier;
                    Object objI0000Il00O;
                    OI11ol oI11ol3;
                    Throwable th;
                    Object objI0000Il00O2;
                    Object objI0000oI007;
                    IOoil1iiIilo iOoil1iiIilo;
                    Oo0lI00l oo0lI00l;
                    Object objI0000oI008;
                    OI0i1o0iOo0 oI0i1o0iOo0;
                    Oo0iil0o0oI oo0iil0o0oI;
                    ?? r2;
                    Object objInvoke;
                    GGUFReader gGUFReader;
                    Object objI0000Il00O3;
                    Object objI0000oI009;
                    OlI0iOo olI0iOo;
                    Object objI0000Il00O4;
                    OliiOI oliiOI;
                    Object objI0000oI0010;
                    OliiOI oliiOI2;
                    Object objI0000oI0011;
                    Object objI0000oI0012;
                    Ool0OI ool0OI;
                    Object objI0000oI0013;
                    OI10i0Il oI10i0Il;
                    Map map;
                    Object objInvoke2;
/* 3 */             int i = this.I00iOIl;
/* 9 */             int i2 = 15;
/* 19 */            Object obj2 = OoiIlOl1iI.I00000oIO;
/* 21 */            Object obj3 = this.I00ilO0;
/* 23 */            int i3 = 1;
/* 24 */            Object obj4 = null;
/* 24 */            boolean z = false;
/* 24 */            boolean z2 = false;
/* 24 */            boolean z3 = false;
/* 24 */            boolean z4 = false;
/* 24 */            boolean z5 = false;
/* 24 */            boolean z6 = false;
                    switch (i) {
                        case 0:
/* 2595 */                  Context context = (Context) this.I00ilI0I1;
/* 2599 */                  O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iio;
/* 2601 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 2603 */                  int i4 = this.I00iiI;
/* 2605 */                  if (i4 == 0) {
/* 2653 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2658 */                      boolean zContains = OO1I1IIio10o.I00000oIO.contains(o1oIOiI11o0);
/* 2662 */                      Il01100l il01100l = Il01100l.I00iOIl;
/* 2664 */                      if (!zContains) {
/* 2718 */                          if (!IiilII1liol.I00000oIO.contains(o1oIOiI11o0)) {
/* 2766 */                              o1o1IiIllOI = new O1o1IiIllOI();
/* 2769 */                              o1o1IiIllOI.I0000Il00O = il01100l;
/* 2773 */                              String strI00000oOI = o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO);
/* 2777 */                              this.I00iiO = o1o1IiIllOI;
/* 2779 */                              this.I00iiI = 3;
/* 2788 */                              objI0000oI00 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new O1o11iOi1(o1o1IiIllOI, strI00000oOI, context, null), this);
                                        break;
                                    } else {
/* 2722 */                              iiilI0lIiol = new IiilI0lIiol();
/* 2727 */                              String strI00000oOI2 = o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO);
/* 2731 */                              this.I00iiO = iiilI0lIiol;
/* 2733 */                              this.I00iiI = 2;
/* 2742 */                              objI0000oI002 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new Iiil110oiIi(iiilI0lIiol, strI00000oOI2, null), this);
                                        break;
                                    }
                                } else {
/* 2668 */                          oO1I0o = new OO1I0o();
/* 2671 */                          oO1I0o.I00000oOI = il01100l;
/* 2675 */                          String strI00000oOI3 = o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO);
/* 2679 */                          this.I00iiO = oO1I0o;
/* 2681 */                          this.I00iiI = 1;
/* 2690 */                          objI0000oI003 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new OO1I0iO01I(oO1I0o, strI00000oOI3, context, null), this);
                                    break;
                                }
/* 2794 */                      return ii0111o;
                            }
/* 2607 */                  if (i4 == 1) {
/* 2644 */                      OO1I0o oO1I0o2 = (OO1I0o) this.I00iiO;
/* 2646 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2649 */                      oO1I0o = oO1I0o2;
/* 2650 */                      objI0000oI003 = obj;
/* 2697 */                      Boolean bool = (Boolean) objI0000oI003;
/* 2703 */                      if (bool.booleanValue()) {
/* 2705 */                          o1oIOiI11o0.I00IlilI0i0i = oO1I0o;
                                }
/* 2707 */                      zBooleanValue = bool.booleanValue();
                            } else if (i4 == 2) {
/* 2633 */                      IiilI0lIiol iiilI0lIiol2 = (IiilI0lIiol) this.I00iiO;
/* 2635 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2638 */                      iiilI0lIiol = iiilI0lIiol2;
/* 2639 */                      objI0000oI002 = obj;
/* 2749 */                      Boolean bool2 = (Boolean) objI0000oI002;
/* 2755 */                      if (bool2.booleanValue()) {
/* 2757 */                          o1oIOiI11o0.I00IlilI0i0i = iiilI0lIiol;
                                }
/* 2759 */                      zBooleanValue = bool2.booleanValue();
                            } else {
/* 2611 */                      if (i4 != 3) {
/* 2625 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                            return null;
                                }
/* 2615 */                      O1o1IiIllOI o1o1IiIllOI2 = (O1o1IiIllOI) this.I00iiO;
/* 2617 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2620 */                      o1o1IiIllOI = o1o1IiIllOI2;
/* 2621 */                      objI0000oI00 = obj;
/* 2796 */                      Boolean bool3 = (Boolean) objI0000oI00;
/* 2802 */                      if (bool3.booleanValue()) {
/* 2804 */                          o1oIOiI11o0.I00IlilI0i0i = o1o1IiIllOI;
                                }
/* 2806 */                      zBooleanValue = bool3.booleanValue();
                            }
/* 2810 */                  I0IO1io0I i0IO1io0I = (I0IO1io0I) obj3;
/* 2812 */                  if (zBooleanValue) {
/* 2814 */                      i0IO1io0I.invoke("");
/* 2823 */                      return obj2;
                            }
/* 2820 */                  i0IO1io0I.invoke("Failed to load model");
/* 2823 */                  return obj2;
                        case 1:
/* 2369 */                  Bitmap bitmap = (Bitmap) obj3;
/* 2373 */                  O1o1io0oi0ol o1o1io0oi0ol = (O1o1io0oi0ol) this.I00ilI0I1;
/* 2375 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 2377 */                  int i5 = this.I00iiI;
/* 2379 */                  if (i5 == 0) {
/* 2424 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2427 */                      Object obj5 = this.I00iiO;
/* 2431 */                      if (obj5 instanceof O1o1IiIllOI) {
/* 2435 */                          this.I00iio = o1o1io0oi0ol;
/* 2437 */                          this.I00iiI = 1;
/* 2446 */                          objI0000oI006 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new O00lOIIO((O1o1IiIllOI) obj5, bitmap, z3 ? 1 : 0, i2), this);
                                    break;
                                } else if (obj5 instanceof OO1I0o) {
/* 2466 */                          this.I00iio = o1o1io0oi0ol;
/* 2468 */                          this.I00iiI = 2;
/* 2479 */                          objI0000oI005 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new O00lOIIO((OO1I0o) obj5, bitmap, z2 ? 1 : 0, 21), this);
                                    break;
                                } else {
/* 2494 */                          if (!(obj5 instanceof IiilI0lIiol)) {
/* 2569 */                              OlO0OIIl1 olO0OIIl1 = o1o1io0oi0ol.I00000oOI;
/* 2589 */                              olO0OIIl1.I000lI(null, O1o1iOlI1.I00000oIO((O1o1iOlI1) olO0OIIl1.getValue(), null, null, null, false, "Unknown model type.", 7));
/* 2592 */                              return obj2;
                                    }
/* 2498 */                          this.I00iio = o1o1io0oi0ol;
/* 2500 */                          this.I00iiI = 3;
/* 2511 */                          objI0000oI004 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new I1iIil1I((IiilI0lIiol) obj5, bitmap, z ? 1 : 0, 17), this);
                                    break;
                                }
/* 2517 */                      return ii0111o2;
                            }
/* 2381 */                  if (i5 == 1) {
/* 2416 */                      o1o1io0oi0ol = (O1o1io0oi0ol) this.I00iio;
/* 2418 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2421 */                      objI0000oI006 = obj;
/* 2455 */                      o1o1io0oi0ol.I0000oI00((List) objI0000oI006);
/* 2592 */                      return obj2;
                            }
/* 2383 */                  if (i5 == 2) {
/* 2406 */                      o1o1io0oi0ol = (O1o1io0oi0ol) this.I00iio;
/* 2408 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2411 */                      objI0000oI005 = obj;
/* 2488 */                      o1o1io0oi0ol.I0000oI00((List) objI0000oI005);
/* 2592 */                      return obj2;
                            }
/* 2385 */                  if (i5 != 3) {
/* 2398 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                        return null;
                            }
/* 2389 */                  o1o1io0oi0ol = (O1o1io0oi0ol) this.I00iio;
/* 2391 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2394 */                  objI0000oI004 = obj;
/* 2520 */                  Float f = (Float) objI0000oI004;
/* 2522 */                  OlO0OIIl1 olO0OIIl12 = o1o1io0oi0ol.I00000oOI;
/* 2558 */                  O1o1iOlI1 o1o1iOlI1I00000oIO = f != null ? O1o1iOlI1.I00000oIO((O1o1iOlI1) olO0OIIl12.getValue(), null, null, f, false, null, 19) : O1o1iOlI1.I00000oIO((O1o1iOlI1) olO0OIIl12.getValue(), null, null, null, false, "Couldn't count this image — check logcat.", 7);
/* 2562 */                  olO0OIIl12.getClass();
/* 2565 */                  olO0OIIl12.I000lI(null, o1o1iOlI1I00000oIO);
/* 2592 */                  return obj2;
                        case 2:
/* 2254 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 2256 */                  int i6 = this.I00iiI;
/* 2258 */                  if (i6 == 0) {
/* 2318 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2329 */                      l01oO1iOo.I0000O(((Ii0110) this.I00iiO).I00000oIO());
/* 2338 */                      OI1I0OoOl oI1I0OoOl = (OI1I0OoOl) ((IIOOoll) this.I00ilI0I1).I00iiI;
/* 2342 */                      this.I00iiO = oI1I0OoOl;
/* 2346 */                      this.I00iio = (Oll0io) ((IlliIl1l11O) obj3);
/* 2348 */                      this.I00iiI = 1;
/* 2358 */                      if (l00iIoI.I0000O(OI1I1OiIO.I00ioIO, oI1I0OoOl, this) != Ii0111o.I00iOIl) {
/* 2364 */                          l00iIoI.I0000Il00O(this).resumeWith(obj2);
                                }
                            } else {
/* 2260 */                      if (i6 != 1) {
/* 2262 */                          if (i6 != 2) {
/* 2275 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                                return null;
                                    }
/* 2267 */                          oI11ol = (OI11ol) this.I00iiO;
                                    try {
/* 2269 */                              lIoii1l01l0i.I00000oOI(obj);
/* 2308 */                              oI11ol.I00000oOI(null);
/* 2368 */                              return obj2;
                                    } catch (Throwable th2) {
/* 2273 */                              th = th2;
/* 2314 */                              oI11ol.I00000oOI(null);
/* 2317 */                              throw th;
                                    }
                                }
/* 2284 */                      IlliIl1l11O illiIl1l11O = (IlliIl1l11O) ((Oll0io) this.I00iio);
/* 2288 */                      OI11ol oI11ol4 = (OI11ol) this.I00iiO;
/* 2290 */                      lIoii1l01l0i.I00000oOI(obj);
                                try {
/* 2293 */                          this.I00iiO = oI11ol4;
/* 2295 */                          this.I00iio = null;
/* 2297 */                          this.I00iiI = 2;
/* 2303 */                          if (il001oo1.I0000Il00O(illiIl1l11O, this) != ii0111o3) {
/* 2307 */                              oI11ol = oI11ol4;
/* 2308 */                              oI11ol.I00000oOI(null);
/* 2368 */                              return obj2;
                                    }
                                } catch (Throwable th3) {
/* 2312 */                          th = th3;
/* 2313 */                          oI11ol = oI11ol4;
/* 2314 */                          oI11ol.I00000oOI(null);
/* 2317 */                          throw th;
                                }
                            }
/* 2305 */                  return ii0111o3;
                        case 3:
/* 2069 */                  OoI1Oi0l1I0o ooI1Oi0l1I0o = (OoI1Oi0l1I0o) obj3;
/* 2073 */                  OiO1O1lil10 oiO1O1lil10 = (OiO1O1lil10) this.I00ilI0I1;
/* 2077 */                  Oii110oOoO oii110oOoO = (Oii110oOoO) this.I00iio;
/* 2079 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 2081 */                  int i7 = this.I00iiI;
/* 2083 */                  if (i7 != 0) {
/* 2085 */                      if (i7 == 1 || i7 == 2) {
/* 2096 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2253 */                          return obj2;
                                }
/* 2090 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                        return null;
                            }
/* 2101 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2106 */                  Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 2108 */                  OIooliIO0 oIooliIO0 = oii110oOoO.I00iiO;
/* 2110 */                  OIooO1iiliI oIooO1iiliI = oii110oOoO.I00l0I0l0lO1;
/* 2120 */                  if (O0000Ioio00.I0000O(oIooliIO0.getValue(), oiO1O1lil10)) {
/* 2136 */                      long jI000II = ooI1Oi0l1I0o.I000II() / 1000000;
/* 2196 */                      OIoi0IIoi oIoi0IIoi = O0000Ioio00.I0000O(ooI1Oi0l1I0o.I0000O.getValue(), oiO1O1lil10) ? new OIoi0IIoi(new Float(1.0f), new Integer((int) ((1.0f - oIooO1iiliI.I000II()) * jI000II))) : new OIoi0IIoi(new Float(0.0f), new Integer((int) (oIooO1iiliI.I000II() * jI000II)));
/* 2203 */                      float fFloatValue = ((Number) oIoi0IIoi.I00iOIl).floatValue();
/* 2211 */                      int iIntValue = ((Number) oIoi0IIoi.I00iiI).intValue();
/* 2215 */                      float fI000II = oIooO1iiliI.I000II();
/* 2219 */                      OoIoO0I0oOI ooIoO0I0oOII0000O = iOO01lio0.I0000O(iIntValue, 6, null);
/* 2225 */                      OI1lIilIi0I oI1lIilIi0I = new OI1lIilIi0I();
/* 2228 */                      oI1lIilIi0I.I00iOIl = ii0110;
/* 2230 */                      oI1lIilIi0I.I00iiI = fFloatValue;
/* 2232 */                      oI1lIilIi0I.I00iiO = oii110oOoO;
/* 2234 */                      oI1lIilIi0I.I00iio = oiO1O1lil10;
/* 2236 */                      VarHandle.storeStoreFence();
/* 2239 */                      this.I00iiI = 2;
/* 2250 */                      if (lOiIo0.I0000Il00O(fI000II, fFloatValue, ooIoO0I0oOII0000O, oI1lIilIi0I, this, 4) != ii0111o4) {
/* 2253 */                          return obj2;
                                }
                            } else {
/* 2122 */                      this.I00iiI = 1;
/* 2128 */                      if (Oii110oOoO.I010i10l(oii110oOoO, oiO1O1lil10, this) != ii0111o4) {
/* 2253 */                          return obj2;
                                }
                            }
/* 2252 */                  return ii0111o4;
                        case 4:
/* 1961 */                  OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) this.I00ilI0I1;
/* 1965 */                  Oii110oOoO oii110oOoO2 = (Oii110oOoO) this.I00iio;
/* 1967 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 1969 */                  int i8 = this.I00iiI;
/* 1971 */                  if (i8 != 0) {
/* 1973 */                      if (i8 == 1 || i8 == 2) {
/* 1983 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2068 */                          return obj2;
                                }
/* 1978 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                        return null;
                            }
/* 1987 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1992 */                  Ii0110 ii01102 = (Ii0110) this.I00iiO;
/* 1994 */                  OIooliIO0 oIooliIO02 = oii110oOoO2.I00iiO;
/* 1996 */                  OIooO1iiliI oIooO1iiliI2 = oii110oOoO2.I00l0I0l0lO1;
/* 2006 */                  if (O0000Ioio00.I0000O(oIooliIO02.getValue(), oI1OloOIO1O)) {
/* 2023 */                      long jI000II2 = ((OoI1Oi0l1I0o) obj3).I000II() / 1000000;
/* 2024 */                      float fI000II2 = oIooO1iiliI2.I000II();
/* 2035 */                      OoIoO0I0oOI ooIoO0I0oOII0000O2 = iOO01lio0.I0000O((int) (oIooO1iiliI2.I000II() * jI000II2), 6, null);
/* 2043 */                      I01oi1lIIO i01oi1lIIO = new I01oi1lIIO(24);
/* 2046 */                      i01oi1lIIO.I00iiI = ii01102;
/* 2048 */                      i01oi1lIIO.I00iiO = oii110oOoO2;
/* 2050 */                      i01oi1lIIO.I00iio = oI1OloOIO1O;
/* 2052 */                      VarHandle.storeStoreFence();
/* 2055 */                      this.I00iiI = 2;
/* 2065 */                      if (lOiIo0.I0000Il00O(fI000II2, 0.0f, ooIoO0I0oOII0000O2, i01oi1lIIO, this, 4) != ii0111o5) {
/* 2068 */                          return obj2;
                                }
                            } else {
/* 2008 */                      this.I00iiI = 1;
/* 2014 */                      if (Oii110oOoO.I010i10l(oii110oOoO2, oI1OloOIO1O, this) != ii0111o5) {
/* 2068 */                          return obj2;
                                }
                            }
/* 2067 */                  return ii0111o5;
                        case 5:
/* 1792 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 1794 */                  int i9 = this.I00iiI;
                            try {
/* 1796 */                      if (i9 == 0) {
/* 1842 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1847 */                          oo1o0i = (OO1O0I) this.I00ilI0I1;
/* 1849 */                          oI11ol2 = oo1o0i.I0000oI00;
/* 1851 */                          this.I00iiO = oI11ol2;
/* 1853 */                          this.I00iio = oo1o0i;
/* 1855 */                          this.I00iiI = 1;
/* 1861 */                          if (oI11ol2.I00000oIO(this) != ii0111o6) {
                                    }
/* 1951 */                          return ii0111o6;
                                }
/* 1798 */                      if (i9 != 1) {
/* 1800 */                          if (i9 != 2) {
/* 1802 */                              if (i9 == 3) {
/* 1804 */                                  lIoii1l01l0i.I00000oOI(obj);
/* 1807 */                                  return obj;
                                        }
/* 1811 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                                return null;
                                    }
/* 1818 */                          oI11ol3 = (OI11ol) this.I00iiO;
                                    try {
/* 1820 */                              lIoii1l01l0i.I00000oOI(obj);
/* 1823 */                              oI11ol2 = oI11ol3;
/* 1824 */                              objI0000Il00O = obj;
/* 1911 */                              textClassifier = (TextClassifier) objI0000Il00O;
/* 1913 */                              oI11ol2.I00000oOI(null);
/* 1916 */                              IOO0o0I1l iOO0o0I1l = Iio1OlIo0.I00iiI;
/* 1922 */                              long jI0000O = ilI0IilIOi.I0000O(200L, Iio1llolooo.I00iiO);
/* 1932 */                              O1iIlllIoo o1iIlllIoo = new O1iIlllIoo(textClassifier, (IlliIl1l11O) obj3, z5 ? 1 : 0, 10);
/* 1935 */                              this.I00iiO = null;
/* 1937 */                              this.I00iio = null;
/* 1939 */                              this.I00iiI = 3;
/* 1945 */                              objI0000Il00O2 = lOlo0o.I0000Il00O(il0l1o1l.I0000O(jI0000O), o1iIlllIoo, this);
/* 1949 */                              if (objI0000Il00O2 != ii0111o6) {
/* 1953 */                                  return objI0000Il00O2;
                                        }
/* 1951 */                              return ii0111o6;
                                    } catch (Throwable th4) {
/* 1827 */                              th = th4;
/* 1955 */                              oI11ol3.I00000oOI(null);
/* 1958 */                              throw th;
                                    }
                                }
/* 1832 */                      oo1o0i = (OO1O0I) this.I00iio;
/* 1836 */                      oI11ol2 = (OI11ol) this.I00iiO;
/* 1838 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1864 */                      textClassifier = oo1o0i.I0001Ioi1lo;
/* 1866 */                      if (textClassifier == null || textClassifier.isDestroyed()) {
/* 1878 */                          IOO0o0I1l iOO0o0I1l2 = Iio1OlIo0.I00iiI;
/* 1884 */                          long jI0000O2 = ilI0IilIOi.I0000O(300L, Iio1llolooo.I00iiO);
/* 1890 */                          I1iOI0oo i1iOI0oo = new I1iOI0oo((Object) oo1o0i, (IOoil1iiIilo) (z4 ? 1 : 0), i2);
/* 1893 */                          this.I00iiO = oI11ol2;
/* 1895 */                          this.I00iio = null;
/* 1897 */                          this.I00iiI = 2;
/* 1903 */                          objI0000Il00O = lOlo0o.I0000Il00O(il0l1o1l.I0000O(jI0000O2), i1iOI0oo, this);
/* 1907 */                          if (objI0000Il00O == ii0111o6) {
                                    }
/* 1911 */                          textClassifier = (TextClassifier) objI0000Il00O;
/* 1913 */                          oI11ol2.I00000oOI(null);
/* 1916 */                          IOO0o0I1l iOO0o0I1l3 = Iio1OlIo0.I00iiI;
/* 1922 */                          long jI0000O3 = ilI0IilIOi.I0000O(200L, Iio1llolooo.I00iiO);
/* 1932 */                          O1iIlllIoo o1iIlllIoo2 = new O1iIlllIoo(textClassifier, (IlliIl1l11O) obj3, z5 ? 1 : 0, 10);
/* 1935 */                          this.I00iiO = null;
/* 1937 */                          this.I00iio = null;
/* 1939 */                          this.I00iiI = 3;
/* 1945 */                          objI0000Il00O2 = lOlo0o.I0000Il00O(il0l1o1l.I0000O(jI0000O3), o1iIlllIoo2, this);
/* 1949 */                          if (objI0000Il00O2 != ii0111o6) {
                                    }
                                } else {
/* 1913 */                          oI11ol2.I00000oOI(null);
/* 1916 */                          IOO0o0I1l iOO0o0I1l32 = Iio1OlIo0.I00iiI;
/* 1922 */                          long jI0000O32 = ilI0IilIOi.I0000O(200L, Iio1llolooo.I00iiO);
/* 1932 */                          O1iIlllIoo o1iIlllIoo22 = new O1iIlllIoo(textClassifier, (IlliIl1l11O) obj3, z5 ? 1 : 0, 10);
/* 1935 */                          this.I00iiO = null;
/* 1937 */                          this.I00iio = null;
/* 1939 */                          this.I00iiI = 3;
/* 1945 */                          objI0000Il00O2 = lOlo0o.I0000Il00O(il0l1o1l.I0000O(jI0000O32), o1iIlllIoo22, this);
/* 1949 */                          if (objI0000Il00O2 != ii0111o6) {
                                    }
                                }
/* 1951 */                      return ii0111o6;
                            } catch (Throwable th5) {
/* 1875 */                      th = th5;
/* 1876 */                      oI11ol3 = oI11ol2;
/* 1955 */                      oI11ol3.I00000oOI(null);
/* 1958 */                      throw th;
                            }
                        case 6:
/* 1723 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 1725 */                  int i10 = this.I00iiI;
/* 1727 */                  if (i10 != 0) {
/* 1729 */                      if (i10 == 1) {
/* 1731 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1791 */                          return obj2;
                                }
/* 1735 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                        return null;
                            }
/* 1740 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1766 */                  Ii1Io1loiI ii1Io1loiII00000oOI = ilOl0O00Il0i.I00000oOI(new I000oI1ioi((IOO000ilo) this.I00iiO, (String) this.I00iio, (OOio1IioOO1l) this.I00ilI0I1, null, 16));
/* 1774 */                  OOl1Io0Ol oOl1Io0Ol = new OOl1Io0Ol(i3);
/* 1777 */                  oOl1Io0Ol.I00iiI = (OOl1OlI0) obj3;
/* 1779 */                  VarHandle.storeStoreFence();
/* 1782 */                  this.I00iiI = 1;
                            return ii1Io1loiII00000oOI.I00000oIO(oOl1Io0Ol, this) == ii0111o7 ? ii0111o7 : obj2;
                        case 7:
/* 1608 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 1610 */                  int i11 = this.I00iiI;
/* 1612 */                  if (i11 == 0) {
/* 1631 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1648 */                      Ii00lIOoi ii00lIOoi = (Ii00lIOoi) ((Ii0110) this.I00iiO).I00000oIO().I00lli11(o0iOli.I00iiO);
/* 1652 */                      Oi1oIiOiIi0 oi1oIiOiIi0 = (Oi1oIiOiIi0) this.I00iio;
/* 1656 */                      OoI0O1 ooI0O1 = new OoI0O1();
/* 1659 */                      ooI0O1.I00iOIl = ii00lIOoi;
/* 1661 */                      VarHandle.storeStoreFence();
/* 1666 */                      Ii00l101O ii00l101OI00000oIO = iiollilo0IO1.I00000oIO(ii00lIOoi, ooI0O1);
/* 1670 */                      ThreadLocal threadLocal = oi1oIiOiIi0.I000OOo1O;
/* 1674 */                      Oo100Olo0IlO oo100Olo0IlO = new Oo100Olo0IlO();
/* 1677 */                      oo100Olo0IlO.I00iOIl = ii00l101OI00000oIO;
/* 1679 */                      oo100Olo0IlO.I00iiI = threadLocal;
/* 1683 */                      Oo1011O00 oo1011O00 = new Oo1011O00();
/* 1686 */                      oo1011O00.I00iOIl = threadLocal;
/* 1688 */                      VarHandle.storeStoreFence();
/* 1691 */                      oo100Olo0IlO.I00iiO = oo1011O00;
/* 1693 */                      VarHandle.storeStoreFence();
/* 1696 */                      Ii00l101O ii00l101OI00ioIO = ii00l101OI00000oIO.I00ioIO(oo100Olo0IlO);
/* 1702 */                      IIoOo1iIio1l iIoOo1iIio1l = (IIoOo1iIio1l) this.I00ilI0I1;
/* 1706 */                      this.I00iiO = iIoOo1iIio1l;
/* 1708 */                      this.I00iiI = 1;
/* 1710 */                      objI0000oI007 = iOi1II01i0.I0000oI00(ii00l101OI00ioIO, (IlliIl1l11O) obj3, this);
/* 1714 */                      if (objI0000oI007 == ii0111o8) {
/* 1716 */                          return ii0111o8;
                                }
/* 1718 */                      iOoil1iiIilo = iIoOo1iIio1l;
                            } else {
/* 1614 */                      if (i11 != 1) {
/* 1626 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                            return null;
                                }
/* 1618 */                      iOoil1iiIilo = (IOoil1iiIilo) this.I00iiO;
/* 1620 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1623 */                      objI0000oI007 = obj;
                            }
/* 1719 */                  iOoil1iiIilo.resumeWith(objI0000oI007);
/* 1722 */                  return obj2;
                        case 8:
/* 1401 */                  OOo0ooi oOo0ooi = (OOo0ooi) this.I00ilI0I1;
/* 1405 */                  OOo0ooi oOo0ooi2 = (OOo0ooi) this.I00iio;
/* 1407 */                  OOo0o0oO oOo0o0oO = (OOo0o0oO) obj3;
/* 1411 */                  Oiill0lI1il1 oiill0lI1il1 = (Oiill0lI1il1) this.I00iiO;
/* 1413 */                  Oiio1oll000 oiio1oll000 = oiill0lI1il1.I00iOIl;
/* 1415 */                  Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 1417 */                  int i12 = this.I00iiI;
/* 1419 */                  if (i12 == 0) {
/* 1435 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1438 */                      OO1O0I oo1o0i2 = oiill0lI1il1.I00oO101o;
/* 1440 */                      if (oo1o0i2 == null) {
/* 1501 */                          oo0lI00l = null;
/* 1502 */                          if (oo0lI00l != null) {
/* 1607 */                              return obj2;
                                    }
/* 1504 */                          long j = oo0lI00l.I00000oIO;
/* 1512 */                          if (Oo0lI00l.I00000oOI(j, oOo0ooi.I00iOIl) || (oI0i1o0iOo0 = (OI0i1o0iOo0) oiio1oll000.I0000Il00O.I0000oI00(oOo0o0oO.I00iOIl)) == null || oI0i1o0iOo0.I0000oI00() != oOo0ooi2.I00iOIl || (oo0iil0o0oI = (Oo0iil0o0oI) oI0i1o0iOo0.I0000Il00O.invoke()) == null) {
/* 1607 */                              return obj2;
                                    }
/* 1553 */                          int i13 = (int) (j >> 32);
/* 1560 */                          OiiOOli oiiOOli = new OiiOOli(lO1O0oll.I00000oIO(oo0iil0o0oI, i13), i13, oOo0o0oO.I00iOIl);
/* 1571 */                          int i14 = (int) (j & 4294967295L);
/* 1572 */                          Oi0il01O01IO oi0il01O01IOI00000oIO = lO1O0oll.I00000oIO(oo0iil0o0oI, i14);
/* 1576 */                          long j2 = oOo0o0oO.I00iOIl;
/* 1582 */                          OiiOlI0I oiiOlI0I = new OiiOlI0I(oiiOOli, new OiiOOli(oi0il01O01IOI00000oIO, i14, j2), false);
/* 1585 */                          OI0lli1 oI0lli1 = O1IO1IIIO0OO.I00000oIO;
/* 1589 */                          OI0lli1 oI0lli12 = new OI0lli1();
/* 1592 */                          oI0lli12.I000OOo1O(j2, oiiOlI0I);
/* 1597 */                          oiio1oll000.I000iOII.setValue(oI0lli12);
/* 1602 */                          oiill0lI1il1.I00iio.invoke(oiiOlI0I);
/* 1605 */                          oiill0lI1il1.I00oI0i = null;
/* 1607 */                          return obj2;
                                }
/* 1446 */                      CharSequence charSequence = (CharSequence) oOo0ooi2.I00iOIl;
/* 1452 */                      long j3 = ((Oo0lI00l) oOo0ooi.I00iOIl).I00000oIO;
/* 1454 */                      this.I00iiI = 1;
/* 1490 */                      objI0000oI008 = (charSequence.length() == 0 || Oo0lI00l.I0000O(j3)) ? null : iOi1II01i0.I0000oI00(oo1o0i2.I00000oIO, new O1o1iI((Object) oo1o0i2, (IlliIl1l11O) new OO1Iool1ol(charSequence, j3, oo1o0i2, (IOoil1iiIilo) null), (IOoil1iiIilo) (z6 ? 1 : 0), 5), this);
/* 1494 */                      if (objI0000oI008 == ii0111o9) {
/* 1496 */                          return ii0111o9;
                                }
                            } else {
/* 1421 */                      if (i12 != 1) {
/* 1429 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                            return null;
                                }
/* 1423 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1426 */                      objI0000oI008 = obj;
                            }
/* 1498 */                  oo0lI00l = (Oo0lI00l) objI0000oI008;
/* 1502 */                  if (oo0lI00l != null) {
                            }
                            break;
                        case 9:
/* 1280 */                  AtomicReference atomicReference = (AtomicReference) this.I00ilI0I1;
/* 1282 */                  Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 1284 */                  int i15 = this.I00iiI;
                            try {
/* 1286 */                      if (i15 == 0) {
/* 1317 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1322 */                          Ii0110 ii01103 = (Ii0110) this.I00iiO;
/* 1330 */                          O010OIi o010OIiI0000oI00 = l01oO1iOo.I0000oI00(ii01103.I00000oIO());
/* 1338 */                          Object objInvoke3 = ((Function1) this.I00iio).invoke(ii01103);
/* 1342 */                          Oilo1OII0 oilo1OII0 = new Oilo1OII0();
/* 1345 */                          oilo1OII0.I00000oIO = o010OIiI0000oI00;
/* 1347 */                          oilo1OII0.I00000oOI = objInvoke3;
/* 1349 */                          VarHandle.storeStoreFence();
/* 1356 */                          Oilo1OII0 oilo1OII02 = (Oilo1OII0) atomicReference.getAndSet(oilo1OII0);
/* 1358 */                          if (oilo1OII02 != null) {
/* 1360 */                              O010OIi o010OIi = oilo1OII02.I00000oIO;
/* 1362 */                              this.I00iiO = oilo1OII0;
/* 1364 */                              this.I00iiI = 1;
                                        break;
                                    }
/* 1373 */                          r2 = oilo1OII0;
                                } else {
/* 1288 */                          if (i15 != 1) {
/* 1290 */                              if (i15 != 2) {
/* 1305 */                                  I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                                    return null;
                                        }
/* 1295 */                              ?? r22 = (Oilo1OII0) this.I00iiO;
/* 1297 */                              lIoii1l01l0i.I00000oOI(obj);
/* 1300 */                              objInvoke = obj;
                                        i15 = r22;
/* 1390 */                              atomicReference.compareAndSet(i15, null);
/* 1393 */                              obj4 = objInvoke;
/* 1394 */                              return obj4;
                                    }
/* 1311 */                          Oilo1OII0 oilo1OII03 = (Oilo1OII0) this.I00iiO;
/* 1313 */                          lIoii1l01l0i.I00000oOI(obj);
                                    r2 = oilo1OII03;
                                }
/* 1376 */                      Object obj6 = r2.I00000oOI;
/* 1378 */                      this.I00iiO = r2;
/* 1380 */                      this.I00iiI = 2;
/* 1382 */                      objInvoke = ((IlliIl1l11O) obj3).invoke(obj6, this);
                                i15 = r2;
                                break;
                            } catch (Throwable th6) {
/* 1395 */                      atomicReference.compareAndSet(i15, obj4);
/* 1398 */                      throw th6;
                            }
                        case 10:
/* 1214 */                  Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 1216 */                  int i16 = this.I00iiI;
/* 1218 */                  if (i16 == 0) {
/* 1231 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1236 */                      Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00iiO;
/* 1238 */                      this.I00iiI = 1;
/* 1244 */                      if (ol010000lo00.I0000O(this) == ii0111o11) {
/* 1246 */                          return ii0111o11;
                                }
                            } else {
/* 1220 */                      if (i16 != 1) {
/* 1226 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                            return null;
                                }
/* 1222 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1273 */                  ((Function1) this.I00iio).invoke(Boolean.valueOf(!O0000Ioio00.I0000O(((OOo0ooi) this.I00ilI0I1).I00iOIl, ((Ol0o1OiOIIIl) obj3).I000iOII())));
/* 1276 */                  return obj2;
                        case 11:
/* 1040 */                  Ol1OIlllo ol1OIlllo = (Ol1OIlllo) obj3;
/* 1044 */                  String str = (String) this.I00iio;
/* 1046 */                  Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 1048 */                  int i17 = this.I00iiI;
/* 1050 */                  if (i17 == 0) {
/* 1068 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1073 */                      GGUFReader gGUFReader2 = new GGUFReader();
/* 1076 */                      this.I00iiO = gGUFReader2;
/* 1078 */                      this.I00iiI = 1;
/* 1084 */                      if (gGUFReader2.load(str, this) == ii0111o12) {
/* 1086 */                          return ii0111o12;
                                }
/* 1089 */                      gGUFReader = gGUFReader2;
                            } else {
/* 1052 */                      if (i17 != 1) {
/* 1062 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                            return null;
                                }
/* 1056 */                      gGUFReader = (GGUFReader) this.I00iiO;
/* 1058 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1111 */                  long j4 = new File(str).length() > 2147483648L ? 4096L : 8192L;
/* 1113 */                  Long contextSize = gGUFReader.getContextSize();
/* 1126 */                  long jMin = Math.min(contextSize != null ? contextSize.longValue() : 2048L, j4);
/* 1130 */                  String chatTemplate = gGUFReader.getChatTemplate();
/* 1134 */                  if (chatTemplate == null) {
/* 1136 */                      chatTemplate = "{% for message in messages %}{% if loop.first and messages[0]['role'] != 'system' %}{{ '<|im_start|>system You are a helpful AI assistant.<|im_end|> ' }}{% endif %}{{'<|im_start|>' + message['role'] + ' ' + message['content'] + '<|im_end|>' + ' '}}{% endfor %}{% if add_generation_prompt %}{{ '<|im_start|>assistant ' }}{% endif %}";
                            }
/* 1138 */                  String str2 = chatTemplate;
/* 1143 */                  SmolLM smolLM = (SmolLM) this.I00ilI0I1;
/* 1148 */                  String str3 = (String) this.I00iio;
/* 1150 */                  float f2 = ol1OIlllo.I00000oIO;
/* 1152 */                  float f3 = ol1OIlllo.I00000oOI;
/* 1154 */                  float f4 = ol1OIlllo.I0000Il00O;
/* 1156 */                  int i18 = ol1OIlllo.I0000O;
/* 1158 */                  float f5 = ol1OIlllo.I0000oI00;
/* 1160 */                  boolean z7 = ol1OIlllo.I0001Ioi1lo;
/* 1162 */                  Long l = ol1OIlllo.I000II;
/* 1164 */                  if (l != null) {
/* 1166 */                      jMin = l.longValue();
                            }
/* 1 */                     smolLM.nativePtr = smolLM.loadModel(str3, f2, f3, f4, i18, f5, z7, jMin, str2, ol1OIlllo.I000O01llI0, ol1OIlllo.I000OOo1O, ol1OIlllo.I000OiO, ol1OIlllo.I000iOII, ol1OIlllo.I000l1, ol1OIlllo.I000lI);
/* 1213 */                  return obj2;
                        case 12:
/* 894 */                   OlI1IliO0I olI1IliO0I = (OlI1IliO0I) obj3;
/* 896 */                   OlO0OIIl1 olO0OIIl13 = olI1IliO0I.I00000oOI;
/* 898 */                   Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 900 */                   int i19 = this.I00iiI;
                            try {
/* 902 */                       if (i19 == 0) {
/* 920 */                           lIoii1l01l0i.I00000oOI(obj);
/* 925 */                           OlI0o1 olI0o1 = (OlI0o1) this.I00iiO;
/* 929 */                           String str4 = (String) this.I00iio;
/* 937 */                           float f6 = ((OlI1Il1) olO0OIIl13.getValue()).I00000oOI;
/* 940 */                           long jNanoTime = System.nanoTime();
/* 946 */                           Context context2 = (Context) this.I00ilI0I1;
/* 952 */                           OlI11I0 olI11I0 = new OlI11I0(i3);
/* 955 */                           olI11I0.I00iiI = olI1IliO0I;
/* 957 */                           VarHandle.storeStoreFence();
/* 960 */                           this.I00iiI = 1;
/* 966 */                           objI0000Il00O3 = olI0o1.I0000Il00O(str4, f6, jNanoTime, context2, olI11I0, this);
/* 970 */                           if (objI0000Il00O3 == ii0111o13) {
/* 972 */                               return ii0111o13;
                                    }
                                } else {
/* 904 */                           if (i19 != 1) {
/* 914 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                                return null;
                                    }
/* 906 */                           lIoii1l01l0i.I00000oOI(obj);
/* 909 */                           objI0000Il00O3 = obj;
                                }
/* 1001 */                      olO0OIIl13.I000lI(null, OlI1Il1.I00000oIO((OlI1Il1) olO0OIIl13.getValue(), null, 0, false, 1.0f, (String) objI0000Il00O3, null, 35));
/* 1039 */                      return obj2;
                            } catch (Throwable th7) {
/* 1036 */                      olO0OIIl13.I000lI(null, OlI1Il1.I00000oIO((OlI1Il1) olO0OIIl13.getValue(), null, 0, false, 0.0f, null, IIl001iO0Io.I000o00OoI0I("Generation failed: ", th7.getMessage()), 27));
/* 1039 */                      return obj2;
                            }
                        case 13:
/* 813 */                   I0IO1io0I i0IO1io0I2 = (I0IO1io0I) obj3;
/* 817 */                   O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00iio;
/* 819 */                   Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 821 */                   int i20 = this.I00iiI;
/* 823 */                   if (i20 == 0) {
/* 842 */                       lIoii1l01l0i.I00000oOI(obj);
/* 847 */                       OlI0iOo olI0iOo2 = new OlI0iOo();
/* 852 */                       Context context3 = (Context) this.I00ilI0I1;
/* 854 */                       this.I00iiO = olI0iOo2;
/* 856 */                       this.I00iiI = 1;
/* 865 */                       objI0000oI009 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new OlI0OO1(olI0iOo2, o1oIOiI11o02, context3, null), this);
/* 869 */                       if (objI0000oI009 == ii0111o14) {
/* 871 */                           return ii0111o14;
                                }
/* 873 */                       olI0iOo = olI0iOo2;
                            } else {
/* 825 */                       if (i20 != 1) {
/* 837 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                            return null;
                                }
/* 829 */                       olI0iOo = (OlI0iOo) this.I00iiO;
/* 831 */                       lIoii1l01l0i.I00000oOI(obj);
/* 834 */                       objI0000oI009 = obj;
                            }
/* 880 */                   if (!((Boolean) objI0000oI009).booleanValue()) {
/* 890 */                       i0IO1io0I2.invoke("Failed to load SoundGen");
/* 893 */                       return obj2;
                            }
/* 882 */                   o1oIOiI11o02.I00IlilI0i0i = olI0iOo;
/* 884 */                   i0IO1io0I2.invoke("");
/* 893 */                   return obj2;
                        case 14:
/* 667 */                   OlI1i0 olI1i0 = (OlI1i0) obj3;
/* 669 */                   OlO0OIIl1 olO0OIIl14 = olI1i0.I00000oOI;
/* 671 */                   Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 673 */                   int i21 = this.I00iiI;
                            try {
/* 675 */                       if (i21 == 0) {
/* 693 */                           lIoii1l01l0i.I00000oOI(obj);
/* 698 */                           OlI0iOo olI0iOo3 = (OlI0iOo) this.I00iiO;
/* 702 */                           String str5 = (String) this.I00iio;
/* 710 */                           float f7 = ((OlI1OoIO0) olO0OIIl14.getValue()).I00000oOI;
/* 713 */                           long jNanoTime2 = System.nanoTime();
/* 719 */                           Context context4 = (Context) this.I00ilI0I1;
/* 725 */                           OlI1OOI1O olI1OOI1O = new OlI1OOI1O(i3);
/* 728 */                           olI1OOI1O.I00iiI = olI1i0;
/* 730 */                           VarHandle.storeStoreFence();
/* 733 */                           this.I00iiI = 1;
/* 739 */                           objI0000Il00O4 = olI0iOo3.I0000Il00O(str5, f7, jNanoTime2, context4, olI1OOI1O, this);
/* 743 */                           if (objI0000Il00O4 == ii0111o15) {
/* 745 */                               return ii0111o15;
                                    }
                                } else {
/* 677 */                           if (i21 != 1) {
/* 687 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                                return null;
                                    }
/* 679 */                           lIoii1l01l0i.I00000oOI(obj);
/* 682 */                           objI0000Il00O4 = obj;
                                }
/* 774 */                       olO0OIIl14.I000lI(null, OlI1OoIO0.I00000oIO((OlI1OoIO0) olO0OIIl14.getValue(), null, 0, false, 1.0f, (String) objI0000Il00O4, null, 35));
/* 812 */                       return obj2;
                            } catch (Throwable th8) {
/* 809 */                       olO0OIIl14.I000lI(null, OlI1OoIO0.I00000oIO((OlI1OoIO0) olO0OIIl14.getValue(), null, 0, false, 0.0f, null, IIl001iO0Io.I000o00OoI0I("Generation failed: ", th8.getMessage()), 27));
/* 812 */                       return obj2;
                            }
                        case 15:
/* 525 */                   I0IO1io0I i0IO1io0I3 = (I0IO1io0I) obj3;
/* 529 */                   Context context5 = (Context) this.I00ilI0I1;
/* 533 */                   O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) this.I00iio;
/* 535 */                   Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 537 */                   int i22 = this.I00iiI;
/* 539 */                   if (i22 == 0) {
/* 559 */                       lIoii1l01l0i.I00000oOI(obj);
/* 564 */                       oliiOI = new OliiOI();
/* 570 */                       oliiOI.I00000oOI = 44100;
/* 574 */                       String strI00000oOI4 = o1oIOiI11o03.I00000oOI(context5, o1oIOiI11o03.I000OiO);
/* 582 */                       String strI000o00OoI0I = I000o00OoI0I(o1oIOiI11o03, context5, "text_encoder", "text_encoder.int8.onnx");
/* 590 */                       String strI000o00OoI0I2 = I000o00OoI0I(o1oIOiI11o03, context5, "duration_predictor", "duration_predictor.int8.onnx");
/* 598 */                       String strI000o00OoI0I3 = I000o00OoI0I(o1oIOiI11o03, context5, "vocoder", "vocoder.int8.onnx");
/* 606 */                       String strI000o00OoI0I4 = I000o00OoI0I(o1oIOiI11o03, context5, "tts_json", "tts.json");
/* 614 */                       String strI000o00OoI0I5 = I000o00OoI0I(o1oIOiI11o03, context5, "unicode_indexer", "unicode_indexer.bin");
/* 622 */                       String strI000o00OoI0I6 = I000o00OoI0I(o1oIOiI11o03, context5, "voice", "voice.bin");
/* 626 */                       this.I00iiO = oliiOI;
/* 628 */                       this.I00iiI = 1;
/* 639 */                       objI0000oI0010 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new I1iIiio(oliiOI, strI000o00OoI0I2, strI000o00OoI0I, strI00000oOI4, strI000o00OoI0I3, strI000o00OoI0I4, strI000o00OoI0I5, strI000o00OoI0I6, null), this);
/* 643 */                       if (objI0000oI0010 == ii0111o16) {
/* 645 */                           return ii0111o16;
                                }
                            } else {
/* 541 */                       if (i22 != 1) {
/* 554 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                            return null;
                                }
/* 545 */                       OliiOI oliiOI3 = (OliiOI) this.I00iiO;
/* 547 */                       lIoii1l01l0i.I00000oOI(obj);
/* 550 */                       oliiOI = oliiOI3;
/* 551 */                       objI0000oI0010 = obj;
                            }
/* 653 */                   if (!((Boolean) objI0000oI0010).booleanValue()) {
/* 663 */                       i0IO1io0I3.invoke("Failed to load Supertonic model");
/* 666 */                       return obj2;
                            }
/* 655 */                   o1oIOiI11o03.I00IlilI0i0i = oliiOI;
/* 657 */                   i0IO1io0I3.invoke("");
/* 666 */                   return obj2;
                        case 16:
/* 359 */                   OliiOI oliiOI4 = (OliiOI) this.I00iiO;
/* 361 */                   Oliii00iliIi oliii00iliIi = (Oliii00iliIi) obj3;
/* 363 */                   OlO0OIIl1 olO0OIIl15 = oliii00iliIi.I00000oOI;
/* 365 */                   Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 367 */                   int i23 = this.I00iiI;
/* 369 */                   if (i23 == 0) {
/* 394 */                       lIoii1l01l0i.I00000oOI(obj);
/* 401 */                       String str6 = (String) this.I00iio;
/* 405 */                       OliiOl0 oliiOl0 = (OliiOl0) this.I00ilI0I1;
/* 407 */                       int i24 = oliiOl0.I0000Il00O;
/* 409 */                       float f8 = oliiOl0.I0000O;
/* 411 */                       this.I00iiI = 1;
/* 413 */                       IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 423 */                       OI1l1l oI1l1l = new OI1l1l(oliiOI4, str6, i24, f8, (IOoil1iiIilo) null);
/* 426 */                       oliiOI2 = oliiOI4;
/* 428 */                       objI0000oI0011 = iOi1II01i0.I0000oI00(iiI0oillOO10, oI1l1l, this);
/* 432 */                       if (objI0000oI0011 != ii0111o17) {
                                }
/* 500 */                       return ii0111o17;
                            }
/* 371 */                   if (i23 != 1) {
/* 373 */                       if (i23 != 2) {
/* 380 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                            return null;
                                }
/* 375 */                       lIoii1l01l0i.I00000oOI(obj);
/* 521 */                       olO0OIIl15.I000lI(null, OliiOl0.I00000oIO((OliiOl0) olO0OIIl15.getValue(), null, false, 0, 0.0f, 0, null, 61));
/* 524 */                       return obj2;
                            }
/* 386 */                   lIoii1l01l0i.I00000oOI(obj);
/* 389 */                   objI0000oI0011 = obj;
/* 391 */                   oliiOI2 = oliiOI4;
/* 435 */                   float[] fArr = (float[]) objI0000oI0011;
/* 437 */                   if (fArr == null) {
/* 459 */                       olO0OIIl15.I000lI(null, OliiOl0.I00000oIO((OliiOl0) olO0OIIl15.getValue(), null, false, 0, 0.0f, 0, "Synthesis failed — check logcat for details", 29));
/* 524 */                       return obj2;
                            }
/* 464 */                   if (fArr.length != 0) {
/* 490 */                       int i25 = oliiOI2.I00000oOI;
/* 492 */                       this.I00iiI = 2;
                                break;
                            } else {
/* 486 */                       olO0OIIl15.I000lI(null, OliiOl0.I00000oIO((OliiOl0) olO0OIIl15.getValue(), null, false, 0, 0.0f, 0, "Synthesis returned empty audio", 31));
                            }
/* 521 */                   olO0OIIl15.I000lI(null, OliiOl0.I00000oIO((OliiOl0) olO0OIIl15.getValue(), null, false, 0, 0.0f, 0, null, 61));
/* 524 */                   return obj2;
                        case 17:
/* 287 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 289 */                   int i26 = this.I00iiI;
/* 291 */                   if (i26 == 0) {
/* 310 */                       lIoii1l01l0i.I00000oOI(obj);
/* 315 */                       Ol010000lo00 ol010000lo002 = (Ol010000lo00) this.I00iiO;
/* 317 */                       this.I00iiI = 1;
/* 323 */                       if (ol010000lo002.I0000O(this) != ii0111o18) {
                                }
/* 336 */                       return ii0111o18;
                            }
/* 293 */                   if (i26 != 1) {
/* 295 */                       if (i26 != 2) {
/* 301 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                            return null;
                                }
/* 297 */                       lIoii1l01l0i.I00000oOI(obj);
/* 346 */                       ((Function1) this.I00iio).invoke((String) this.I00ilI0I1);
/* 351 */                       ((IllOOo00lI) obj3).invoke();
/* 354 */                       return obj2;
                            }
/* 306 */                   lIoii1l01l0i.I00000oOI(obj);
/* 326 */                   this.I00iiI = 2;
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 282 */                   return I00000oIO(obj);
                        case PoseLandmark.LEFT_INDEX:
/* 277 */                   return I000II(obj);
                        case PoseLandmark.RIGHT_INDEX:
/* 272 */                   return I000O01llI0(obj);
                        case PoseLandmark.LEFT_THUMB:
/* 180 */                   I0IO1io0I i0IO1io0I4 = (I0IO1io0I) obj3;
/* 184 */                   O1oIOiI11o0 o1oIOiI11o04 = (O1oIOiI11o0) this.I00iio;
/* 186 */                   Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 188 */                   int i27 = this.I00iiI;
/* 190 */                   if (i27 == 0) {
/* 209 */                       lIoii1l01l0i.I00000oOI(obj);
/* 214 */                       Ool0OI ool0OI2 = new Ool0OI();
/* 217 */                       ool0OI2.I00000oOI = true;
/* 219 */                       VarHandle.storeStoreFence();
/* 228 */                       String strI00000oOI5 = o1oIOiI11o04.I00000oOI((Context) this.I00ilI0I1, o1oIOiI11o04.I000OiO);
/* 232 */                       this.I00iiO = ool0OI2;
/* 234 */                       this.I00iiI = 1;
/* 243 */                       objI0000oI0012 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new Ool0IooI(ool0OI2, strI00000oOI5, null), this);
/* 247 */                       if (objI0000oI0012 == ii0111o19) {
/* 249 */                           return ii0111o19;
                                }
/* 251 */                       ool0OI = ool0OI2;
                            } else {
/* 192 */                       if (i27 != 1) {
/* 204 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                            return null;
                                }
/* 196 */                       ool0OI = (Ool0OI) this.I00iiO;
/* 198 */                       lIoii1l01l0i.I00000oOI(obj);
/* 201 */                       objI0000oI0012 = obj;
                            }
/* 258 */                   if (!((Boolean) objI0000oI0012).booleanValue()) {
/* 268 */                       i0IO1io0I4.invoke("Failed to load upscaling model");
/* 271 */                       return obj2;
                            }
/* 260 */                   o1oIOiI11o04.I00IlilI0i0i = ool0OI;
/* 262 */                   i0IO1io0I4.invoke("");
/* 271 */                   return obj2;
                        case PoseLandmark.RIGHT_THUMB:
/* 175 */                   return I000iOII(obj);
                        case PoseLandmark.LEFT_HIP:
/* 170 */                   return I000lI(obj);
                        case PoseLandmark.RIGHT_HIP:
/* 119 */                   Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 123 */                   if (this.I00iiI != 0) {
/* 127 */                       oI10i0Il = (OI10i0Il) this.I00iiO;
/* 129 */                       lIoii1l01l0i.I00000oOI(obj);
/* 132 */                       objI0000oI0013 = obj;
                            } else {
/* 135 */                       lIoii1l01l0i.I00000oOI(obj);
/* 140 */                       o00i1olooO o00i1olooo = (o00i1olooO) this.I00iio;
/* 142 */                       if (o00i1olooo == null) {
/* 169 */                           return obj2;
                                }
/* 145 */                       OI10i0Il oI10i0Il2 = (OI10i0Il) obj3;
/* 149 */                       ii1iOiO ii1ioio = (ii1iOiO) this.I00ilI0I1;
/* 151 */                       this.I00iiO = oI10i0Il2;
/* 153 */                       this.I00iiI = 1;
/* 155 */                       objI0000oI0013 = ii1ioio.I0000oI00(o00i1olooo, this);
/* 159 */                       if (objI0000oI0013 == ii0111o20) {
/* 168 */                           return ii0111o20;
                                }
/* 161 */                       oI10i0Il = oI10i0Il2;
                            }
/* 164 */                   oI10i0Il.setValue((String) objI0000oI0013);
/* 169 */                   return obj2;
                        case PoseLandmark.LEFT_KNEE:
/* 114 */                   return I00100l0(obj);
                        default:
/* 28 */                    Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 30 */                    int i28 = this.I00iiI;
/* 32 */                    if (i28 != 0) {
/* 34 */                        Object obj7 = this.I00iiO;
/* 36 */                        if (i28 != 1) {
/* 38 */                            lIoii1l01l0i.I00000oOI(obj);
/* 41 */                            return obj7;
                                }
/* 43 */                        map = (Map) obj7;
/* 45 */                        lIoii1l01l0i.I00000oOI(obj);
/* 48 */                        objInvoke2 = obj;
                            } else {
/* 53 */                        lIoii1l01l0i.I00000oOI(obj);
/* 59 */                        map = (Map) this.I00iiO;
/* 63 */                        IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) this.I00iio;
/* 65 */                        this.I00iiO = map;
/* 67 */                        this.I00iiI = 1;
/* 69 */                        objInvoke2 = illiIl1l11O2.invoke(map, this);
/* 73 */                        if (objInvoke2 == ii0111o21) {
/* 113 */                           return ii0111o21;
                                }
                            }
/* 50 */                    Map map2 = map;
/* 77 */                    IOiOol0 iOiOol0 = (IOiOol0) obj3;
/* 82 */                    Context context6 = (Context) this.I00ilI0I1;
/* 84 */                    this.I00iiO = objInvoke2;
/* 86 */                    this.I00iiI = 2;
/* 103 */                   Object objI0000oI0014 = iOi1II01i0.I0000oI00(((IIOlO1ii) iOiOol0.I00ioIO).I00iiI, new OOl11O0ii0II(iOiOol0, context6, map2, null, 9), this);
/* 107 */                   if (objI0000oI0014 == ii0111o21) {
/* 109 */                       obj2 = objI0000oI0014;
                            }
                            return obj2 != ii0111o21 ? objInvoke2 : ii0111o21;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public O1o1iI(OoI0Iio ooI0Iio, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 18;
/* 16 */            this.I00ilO0 = ooI0Iio;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public O1o1iI(Object obj, IOiOol0 iOiOol0, Context context, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 17 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00ilO0 = iOiOol0;
                    this.I00ilI0I1 = context;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public O1o1iI(Object obj, IlliIl1l11O illiIl1l11O, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 18 */            this.I00iOIl = i;
                    this.I00ilI0I1 = obj;
                    this.I00ilO0 = illiIl1l11O;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public O1o1iI(Object obj, O1o1io0oi0ol o1o1io0oi0ol, Bitmap bitmap, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 1;
/* 19 */            this.I00iiO = obj;
                    this.I00ilI0I1 = o1o1io0oi0ol;
                    this.I00ilO0 = bitmap;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 19 */        public O1o1iI(Object obj, Object obj2, Object obj3, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 20 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00ilI0I1 = obj2;
                    this.I00ilO0 = obj3;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 20 */        public O1o1iI(Object obj, Object obj2, Object obj3, Object obj4, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 21 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                    this.I00ilI0I1 = obj3;
                    this.I00ilO0 = obj4;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 21 */        public O1o1iI(Object obj, String str, OooioIIoi0O oooioIIoi0O, Context context, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 22 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iio = str;
                    this.I00ilO0 = oooioIIoi0O;
                    this.I00ilI0I1 = context;
                }
            }
