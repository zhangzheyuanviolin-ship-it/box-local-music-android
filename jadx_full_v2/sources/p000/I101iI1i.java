            package p000;

            import android.view.Choreographer;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class I101iI1i implements Ii00ilI1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public I101iI1i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoil1iiIilo iOoil1iiIilo, Function1 function1) throws Throwable {
                    OO0iOIoI oO0iOIoI;
                    boolean z;
                    Object objI0010I0i;
                    switch (this.I00iOIl) {
                        case 0:
/* 215 */                   I101OO01 i101oo01 = (I101OO01) this.I00iiO;
/* 223 */                   IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iOoil1iiIilo));
/* 226 */                   iIoOoIol0Io0.I00111O();
/* 231 */                   I101Ooio111 i101Ooio111 = new I101Ooio111();
/* 234 */                   i101Ooio111.I00iOIl = iIoOoIol0Io0;
/* 236 */                   i101Ooio111.I00iiI = function1;
/* 238 */                   VarHandle.storeStoreFence();
/* 251 */                   if (O0000Ioio00.I0000O(i101oo01.I00iiI, (Choreographer) this.I00iiI)) {
                                synchronized (i101oo01.I00iio) {
/* 258 */                           i101oo01.I00ilO0.add(i101Ooio111);
/* 263 */                           if (!i101oo01.I00l0I0l0lO1) {
/* 265 */                               i101oo01.I00l0I0l0lO1 = true;
/* 271 */                               i101oo01.I00iiI.postFrameCallback(i101oo01.I00l0OO0IO);
                                    }
                                }
/* 281 */                       I01i01OoI i01i01OoI = new I01i01OoI(3);
/* 284 */                       i01i01OoI.I00iiI = i101oo01;
/* 286 */                       i01i01OoI.I00iiO = i101Ooio111;
/* 288 */                       VarHandle.storeStoreFence();
/* 291 */                       iIoOoIol0Io0.I001IO000(i01i01OoI);
                            } else {
/* 301 */                       ((Choreographer) this.I00iiI).postFrameCallback(i101Ooio111);
/* 307 */                       I01i01OoI i01i01OoI2 = new I01i01OoI(4);
/* 310 */                       i01i01OoI2.I00iiI = this;
/* 312 */                       i01i01OoI2.I00iiO = i101Ooio111;
/* 314 */                       VarHandle.storeStoreFence();
/* 317 */                       iIoOoIol0Io0.I001IO000(i01i01OoI2);
                            }
/* 320 */                   Object objI0010I0i2 = iIoOoIol0Io0.I0010I0i();
/* 324 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 326 */                   return objI0010I0i2;
                        case 1:
/* 164 */                   IIoOoIol0Io0 iIoOoIol0Io02 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iOoil1iiIilo));
/* 167 */                   iIoOoIol0Io02.I00111O();
/* 172 */                   I1ii1o0 i1ii1o0 = (I1ii1o0) this.I00iiO;
/* 176 */                   III10o iII10o = new III10o();
/* 179 */                   iII10o.I00000oIO = iIoOoIol0Io02;
/* 181 */                   iII10o.I00000oOI = function1;
/* 187 */                   IIoi0i iIoi0iI00100l0 = i1ii1o0.I00100l0(iII10o, (OOlol1ilOllO) this.I00iiI);
/* 195 */                   I00iiI i00iiI = new I00iiI(8);
/* 198 */                   i00iiI.I00iiI = iIoi0iI00100l0;
/* 200 */                   VarHandle.storeStoreFence();
/* 203 */                   iIoOoIol0Io02.I001IO000(i00iiI);
/* 206 */                   Object objI0010I0i3 = iIoOoIol0Io02.I0010I0i();
/* 210 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 212 */                   return objI0010I0i3;
                        default:
/* 9 */                     if (iOoil1iiIilo instanceof OO0iOIoI) {
/* 12 */                        oO0iOIoI = (OO0iOIoI) iOoil1iiIilo;
/* 14 */                        int i = oO0iOIoI.I00iio;
/* 20 */                        if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                            oO0iOIoI.I00iio = i - Integer.MIN_VALUE;
                                } else {
/* 28 */                            oO0iOIoI = new OO0iOIoI(this, iOoil1iiIilo);
                                }
                            }
/* 31 */                    Object obj = oO0iOIoI.I00iiI;
/* 33 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 35 */                    int i2 = oO0iOIoI.I00iio;
/* 39 */                    if (i2 == 0) {
/* 62 */                        lIoii1l01l0i.I00000oOI(obj);
/* 67 */                        I1ii1l10IO i1ii1l10IO = (I1ii1l10IO) this.I00iiO;
/* 69 */                        oO0iOIoI.I00iOIl = function1;
/* 71 */                        oO0iOIoI.I00iio = 1;
                                synchronized (i1ii1l10IO.I00000oOI) {
/* 76 */                            z = i1ii1l10IO.I00000oIO;
                                }
/* 79 */                        if (z) {
/* 81 */                            objI0010I0i = OoiIlOl1iI.I00000oIO;
                                } else {
/* 90 */                            IIoOoIol0Io0 iIoOoIol0Io03 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(oO0iOIoI));
/* 93 */                            iIoOoIol0Io03.I00111O();
                                    synchronized (i1ii1l10IO.I00000oOI) {
/* 103 */                               ((ArrayList) i1ii1l10IO.I0000Il00O).add(iIoOoIol0Io03);
                                    }
/* 111 */                           I01i01OoI i01i01OoI3 = new I01i01OoI(14);
/* 114 */                           i01i01OoI3.I00iiI = i1ii1l10IO;
/* 116 */                           i01i01OoI3.I00iiO = iIoOoIol0Io03;
/* 118 */                           VarHandle.storeStoreFence();
/* 121 */                           iIoOoIol0Io03.I001IO000(i01i01OoI3);
/* 124 */                           objI0010I0i = iIoOoIol0Io03.I0010I0i();
/* 128 */                           if (objI0010I0i != ii0111o3) {
/* 131 */                               objI0010I0i = OoiIlOl1iI.I00000oIO;
                                    }
                                }
/* 133 */                       if (objI0010I0i != ii0111o3) {
                                }
/* 150 */                       return ii0111o3;
                            }
/* 41 */                    if (i2 != 1) {
/* 43 */                        if (i2 == 2) {
/* 45 */                            lIoii1l01l0i.I00000oOI(obj);
/* 151 */                           return obj;
                                }
/* 51 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                        return null;
                            }
/* 56 */                    function1 = oO0iOIoI.I00iOIl;
/* 58 */                    lIoii1l01l0i.I00000oOI(obj);
/* 138 */                   I101iI1i i101iI1i = (I101iI1i) this.I00iiI;
/* 140 */                   oO0iOIoI.I00iOIl = null;
/* 142 */                   oO0iOIoI.I00iio = 2;
/* 144 */                   Object objI00000oIO = i101iI1i.I00000oIO(oO0iOIoI, function1);
/* 148 */                   if (objI00000oIO != ii0111o3) {
/* 151 */                       return objI00000oIO;
                            }
/* 150 */                   return ii0111o3;
                    }
                }

                @Override
                public final Object I00IoiI(IlliIl1l11O illiIl1l11O, Object obj) {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return illiIl1l11O.invoke(obj, this);
                }

                @Override
                public final Ii00l101O I00OIl(Ii00l0i1loO ii00l0i1loO) {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return iioloI1O1i.I00000oOI(this, ii00l0i1loO);
                }

                @Override
                public final Ii00l101O I00ioIO(Ii00l101O ii00l101O) {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return iiollilo0IO1.I00000oIO(this, ii00l101O);
                }

                @Override
                public final Ii00ilI1 I00lli11(Ii00l0i1loO ii00l0i1loO) {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return iioloI1O1i.I00000oIO(this, ii00l0i1loO);
                }

                @Override
                public Ii00l0i1loO getKey() {
/* 1 */             return loilIl10Ii.I00ilI0I1;
                }
            }
