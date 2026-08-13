            package p000;

            import android.util.Log;
            import java.io.Serializable;
            import kotlin.jvm.functions.Function1;
            
            public final class IIo10iOO extends Oll0io implements Function1 {
                public final int I00iOIl;
                public final Object I00iiI;
                public final Serializable I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIo10iOO(Object obj, Serializable serializable, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 10 */            super(1, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
/* 5 */             this.I00iiO = serializable;
/* 7 */             this.I00iio = obj2;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iio;
/* 5 */             Serializable serializable = this.I00iiO;
/* 7 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 43 */                    return new IIo10iOO((OOo0ooi) obj2, (OOo0ooi) serializable, (I0lIllO) obj, iOoil1iiIilo, 0);
                        default:
/* 25 */                    return new IIo10iOO((OO01Ol) obj2, (String) serializable, (Function1) obj, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj;
                    switch (i) {
                    }
/* 16 */            return ((IIo10iOO) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 4 */             Object obj2 = this.I00iio;
/* 6 */             Serializable serializable = this.I00iiO;
/* 8 */             Object obj3 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 45 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 47 */                    lIoii1l01l0i.I00000oOI(obj);
/* 52 */                    ((OOo0ooi) obj3).I00iOIl = null;
/* 58 */                    if (((OOo0ooi) serializable).I00iOIl == null) {
/* 3 */                         return null;
                            }
/* 64 */                    Log.e("CXCP", "tryOpenCamera: openCamera() timed out");
/* 69 */                    ((I0lIllO) obj2).I00000oIO();
/* 81 */                    return new OIi0ooOoOOo0(null, IIlOloloOil.I00000oIO(13), 1);
                        default:
/* 13 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 15 */                    lIoii1l01l0i.I00000oOI(obj);
/* 24 */                    OiIIl0O1l0l oiIIl0O1l0lI00000oIO = ((OO01Ol) obj3).I00000oOI.I00000oIO((String) serializable);
                            try {
/* 30 */                        Object objInvoke = ((Function1) obj2).invoke(oiIIl0O1l0lI00000oIO);
/* 34 */                        iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 37 */                        return objInvoke;
                            } catch (Throwable th) {
                                try {
/* 39 */                            throw th;
                                } catch (Throwable th2) {
/* 41 */                            iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, th);
/* 44 */                            throw th2;
                                }
                            }
                    }
                }
            }
