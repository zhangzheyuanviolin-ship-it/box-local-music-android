            package p000;

            import android.content.Context;
            import android.hardware.camera2.CameraDevice;
            import android.os.SystemClock;
            import android.util.Log;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.WorkSpec;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.concurrent.CountDownLatch;
            
            public final class IIo11l1iO implements i0Ii0I1ll, iOlolIi {
                public Object I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public Object I00ioIO;

                public IIo11l1iO(iOlOi1iIii ioloi1iiii, String str, String str2, iOlOOO1 iolooo1, iOlii1iOOil iolii1iooil, iOliOoiOlI1 ioliooioli1, i1Il01 i1il01) {
/* 4 */             this.I00iiI = ioloi1iiii;
/* 6 */             this.I00iiO = str;
/* 8 */             this.I00iio = str2;
/* 10 */            this.I00ilI0I1 = iolooo1;
/* 12 */            this.I00ilO0 = iolii1iooil;
/* 14 */            this.I00io1l = ioliooioli1;
/* 16 */            this.I00ioIO = i1il01;
                }

                public i01ilO I00000oIO() {
/* 3 */             i01ilO i01ilo = new i01ilO();
/* 8 */             WorkSpec workSpec = (WorkSpec) this.I00ilI0I1;
/* 10 */            i01ilo.I00000oIO = workSpec;
/* 16 */            i01ilo.I00000oOI = (Context) this.I00io1l;
/* 18 */            String str = workSpec.id;
/* 20 */            i01ilo.I0000Il00O = str;
/* 26 */            i01ilo.I0000O = (OlilOlOiI) this.I00ioIO;
/* 32 */            i01ilo.I0000oI00 = (OillOo0) this.I00iiI;
/* 36 */            IOllii iOllii = (IOllii) this.I00iOIl;
/* 38 */            i01ilo.I0001Ioi1lo = iOllii;
/* 42 */            i01ilo.I000II = iOllii.I0000O;
/* 48 */            i01ilo.I000O01llI0 = (OOIo1i0) this.I00iiO;
/* 52 */            WorkDatabase workDatabase = (WorkDatabase) this.I00iio;
/* 54 */            i01ilo.I000OOo1O = workDatabase;
/* 60 */            i01ilo.I000OiO = workDatabase.I001lIiIIo1O();
/* 66 */            i01ilo.I000iOII = workDatabase.I001IIilI0O();
/* 71 */            ArrayList arrayList = (ArrayList) this.I00ilO0;
/* 73 */            i01ilo.I000l1 = arrayList;
/* 100 */           i01ilo.I000lI = IIl001iO0Io.I00100l0(IIlIOloOOO.I001IIilI0O("Work [ id=", str, ", tags={ "), IOOi0Ool1i.I00IlilI0i0i(arrayList, ",", null, null, null, 62), " } ]");
/* 106 */           i01ilo.I000o00OoI0I = l01oO1iOo.I00000oIO();
/* 108 */           VarHandle.storeStoreFence();
/* 245 */           return i01ilo;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00000oOI(String str, int i, long j, IIl0O0iioOO iIl0O0iioOO, I1iIilO0io01 i1iIilO0io01, IOoilo iOoilo) throws Throwable {
                    IIo101i1I iIo101i1I;
                    I1iIilO0io01 i1iIilO0io012;
                    int i2;
                    long j2;
                    String str2;
                    IIl0O0iioOO iIl0O0iioOO2;
/* 9 */             if (iOoilo instanceof IIo101i1I) {
/* 12 */                iIo101i1I = (IIo101i1I) iOoilo;
/* 14 */                int i3 = iIo101i1I.I00ioIO;
/* 20 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 23 */                    iIo101i1I.I00ioIO = i3 - Integer.MIN_VALUE;
                        } else {
/* 28 */                    iIo101i1I = new IIo101i1I(this, iOoilo);
                        }
                    }
/* 31 */            Object objI0000oI00 = iIo101i1I.I00ilO0;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i4 = iIo101i1I.I00ioIO;
/* 39 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 40 */            if (i4 == 0) {
/* 77 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 82 */                IIl0oO iIl0oO = (IIl0oO) this.I00iiI;
/* 84 */                iIo101i1I.I00iOIl = str;
/* 88 */                iIo101i1I.I00iiI = iIl0O0iioOO;
/* 90 */                i1iIilO0io012 = i1iIilO0io01;
/* 92 */                iIo101i1I.I00iiO = i1iIilO0io012;
/* 94 */                i2 = i;
/* 96 */                iIo101i1I.I00iio = i2;
/* 100 */               iIo101i1I.I00ilI0I1 = j;
/* 102 */               iIo101i1I.I00ioIO = 1;
                        synchronized (iIl0oO.I0000oI00) {
/* 113 */                   IIlo0i0ll iIlo0i0ll = (IIlo0i0ll) iIl0oO.I0000oI00.get(str);
/* 132 */                   objI0000oI00 = iIlo0i0ll != null ? iIlo0i0ll : iOi1II01i0.I0000oI00(iIl0oO.I00000oOI.I0000O, new I1iIil1I(iIl0oO, str, iOoil1iiIilo, 8), iIo101i1I);
                        }
/* 136 */               if (objI0000oI00 == ii0111o) {
/* 138 */                   return ii0111o;
                        }
/* 141 */               j2 = j;
/* 143 */               str2 = str;
/* 144 */               iIl0O0iioOO2 = iIl0O0iioOO;
                    } else {
/* 42 */                if (i4 != 1) {
/* 44 */                    if (i4 == 2) {
/* 46 */                        lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 49 */                        return objI0000oI00;
                            }
/* 52 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                    return null;
                        }
/* 56 */                long j3 = iIo101i1I.I00ilI0I1;
/* 58 */                int i5 = iIo101i1I.I00iio;
/* 60 */                I1iIilO0io01 i1iIilO0io013 = iIo101i1I.I00iiO;
/* 62 */                iIl0O0iioOO2 = iIo101i1I.I00iiI;
/* 64 */                str2 = iIo101i1I.I00iOIl;
/* 66 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 69 */                j2 = j3;
/* 71 */                i2 = i5;
/* 72 */                i1iIilO0io012 = i1iIilO0io013;
                    }
/* 74 */            long jElapsedRealtimeNanos = j2;
/* 152 */           Olli1lO0o0i0 olli1lO0o0i0 = (Olli1lO0o0i0) this.I00ilI0I1;
/* 156 */           IIl0l10l iIl0l10l = (IIl0l10l) this.I00iiO;
/* 160 */           IIl10I1 iIl10I1 = (IIl10I1) this.I00iio;
/* 164 */           Oo10IliO00O oo10IliO00O = (Oo10IliO00O) this.I00io1l;
/* 168 */           IIlo110 iIlo110 = (IIlo110) this.I00ilO0;
/* 172 */           CameraDevice.StateCallback stateCallback = iIlo110.I00000oIO;
/* 174 */           I1I0i0Ilo1Oi i1I0i0Ilo1Oi = iIlo110.I00000oOI;
/* 176 */           I0lIllO i0lIllO = new I0lIllO();
/* 179 */           i0lIllO.I00000oIO = str2;
/* 181 */           i0lIllO.I00000oOI = (IIlo0i0ll) objI0000oI00;
/* 183 */           i0lIllO.I0000Il00O = i2;
/* 185 */           i0lIllO.I0000O = jElapsedRealtimeNanos;
/* 187 */           i0lIllO.I0000oI00 = olli1lO0o0i0;
/* 189 */           i0lIllO.I0001Ioi1lo = iIl0l10l;
/* 191 */           i0lIllO.I000II = iIl0O0iioOO2;
/* 193 */           i0lIllO.I000O01llI0 = iIl10I1;
/* 195 */           i0lIllO.I000OOo1O = oo10IliO00O;
/* 197 */           i0lIllO.I000OiO = i1iIilO0io012;
/* 199 */           i0lIllO.I000iOII = stateCallback;
/* 201 */           i0lIllO.I000l1 = i1I0i0Ilo1Oi;
/* 203 */           I1OollilIo i1OollilIo = OoooII0iI.I00000oOI;
/* 205 */           i1OollilIo.getClass();
/* 214 */           i0lIllO.I000lI = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo);
/* 221 */           i0lIllO.I000o00OoI0I = new Object();
/* 229 */           i0lIllO.I00100o1O0lo = new CountDownLatch(1);
/* 237 */           i0lIllO.I00111O = OlO0iOl0il.I00000oIO(IIo1II11.I00000oIO);
/* 259 */           Log.i("CXCP", "Opening " + ((Object) IIllI0o.I0000Il00O(str2)));
/* 263 */           if (i2 != 1) {
/* 266 */               jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    }
/* 270 */           i0lIllO.I0010I0i = jElapsedRealtimeNanos;
/* 272 */           VarHandle.storeStoreFence();
/* 278 */           IIo11OIl1O1O iIo11OIl1O1O = new IIo11OIl1O1O(this, str2, i0lIllO, null);
/* 281 */           iIo101i1I.I00iOIl = null;
/* 283 */           iIo101i1I.I00iiI = null;
/* 285 */           iIo101i1I.I00iiO = null;
/* 288 */           iIo101i1I.I00ioIO = 2;
/* 296 */           OliiiIoillI oliiiIoillI = new OliiiIoillI(iIo101i1I, iIo101i1I.getContext());
/* 300 */           Object objI00000oIO = li0011.I00000oIO(oliiiIoillI, true, oliiiIoillI, iIo11OIl1O1O);
                    return objI00000oIO == ii0111o ? ii0111o : objI00000oIO;
                }

                @Override
                public Object I0000Il00O() {
/* 5 */             Object objI0000Il00O = ((i0IOo0i0) this.I00iOIl).I0000Il00O();
/* 13 */            Object objI0000Il00O2 = ((i0IOo0i0) this.I00iiI).I0000Il00O();
/* 21 */            Object objI0000Il00O3 = ((i0IOo0i0) this.I00iiO).I0000Il00O();
/* 29 */            Object objI0000Il00O4 = ((i0IOo0i0) this.I00iio).I0000Il00O();
/* 43 */            i0IOo0i0 i0ioo0i0 = new i0IOo0i0(liIllOil01.I00000oIO((i0IOo0i0) this.I00ilI0I1));
/* 56 */            i0IOo0i0 i0ioo0i02 = new i0IOo0i0(liIllOil01.I00000oIO((Oi00IilOloo0) this.I00ilO0));
/* 63 */            Object objI0000Il00O5 = ((i0IOo0i0) this.I00io1l).I0000Il00O();
/* 77 */            i0IOo0i0 i0ioo0i03 = new i0IOo0i0(liIllOil01.I00000oIO((i0IOo0i0) this.I00ioIO));
/* 92 */            i0O0il111 i0o0il111 = new i0O0il111();
/* 95 */            i0o0il111.I0001Ioi1lo = i0ioo0i0;
/* 97 */            i0o0il111.I00000oIO = (i0O1I1o) objI0000Il00O;
/* 99 */            i0o0il111.I00000oOI = (i0O0oOiO11) objI0000Il00O2;
/* 101 */           i0o0il111.I0000Il00O = (i0OI1IOoili1) objI0000Il00O3;
/* 103 */           i0o0il111.I0000O = (i0Iooi1oi) objI0000Il00O4;
/* 105 */           i0o0il111.I000II = i0ioo0i02;
/* 107 */           i0o0il111.I0000oI00 = (i0Iio1OiI) objI0000Il00O5;
/* 109 */           i0o0il111.I000O01llI0 = i0ioo0i03;
/* 111 */           VarHandle.storeStoreFence();
/* 245 */           return i0o0il111;
                }

                @Override
                public boolean zzb() {
/* 3 */             i1Il01 i1il01 = (i1Il01) this.I00ioIO;
/* 7 */             boolean z = false;
/* 8 */             iOlOi1iIii ioloi1iiii = new iOlOi1iIii(0);
/* 11 */            ioloi1iiii.I0000O();
                    try {
                        try {
/* 38 */                    this.I00iOIl = ((iOliOoiOlI1) this.I00io1l).I00000oIO((iOlOOO1) this.I00ilI0I1, (iOlii1iOOil) this.I00ilO0, (String) this.I00iiO, (String) this.I00iio);
/* 40 */                    z = true;
                        } catch (iOliOI1lO0i e) {
/* 47 */                    iOlOi1iIii ioloi1iiii2 = (iOlOi1iIii) this.I00iiI;
/* 55 */                    ((lIO0IIo) ioloi1iiii2.I0001Ioi1lo).I000O01llI0(e.I00iOIl);
/* 64 */                    ((lIO0IIo) ioloi1iiii.I0000O).I000O01llI0(e.I00iOIl);
                        }
/* 78 */                return z;
                    } finally {
/* 79 */                ioloi1iiii.I0000Il00O();
/* 82 */                i1il01.getClass();
/* 87 */                i1il01.I0000O(ioloi1iiii, iOIo11i.ACCELERATION_ALLOWLIST_FETCH);
                    }
                }
            }
