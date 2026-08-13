            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class O0lOli0Il implements Function1 {
                public final int I00iOIl;
                public long I00iiI;
                public Object I00iiO;

                public O0lOli0Il(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 100 */                   O0lOll0I0o00 o0lOll0I0o00 = (O0lOll0I0o00) this.I00iiO;
/* 124 */                   o0lOll0I0o00.I0010I0i.setValue(IooO0O.I00000oIO(IooO0O.I0000O(((IooO0O) ((I10i01) obj).I0000O()).I00000oIO, this.I00iiI)));
/* 129 */                   o0lOll0I0o00.I0000Il00O.invoke();
/* 132 */                   return ooiIlOl1iI;
                        case 1:
/* 94 */                    IilloIOOO0i.I00ilI0I1((IilloIOOO0i) obj, this.I00iiI, 0L, 0L, lIiioliIlo.I00000oOI(((Number) ((IllOOo00lI) this.I00iiO).invoke()).floatValue(), 0.0f, 1.0f), null, 0, 118);
/* 97 */                    return ooiIlOl1iI;
                        default:
/* 10 */                    Olo0loOlIO olo0loOlIO = (Olo0loOlIO) this.I00iiO;
/* 12 */                    long j = this.I00iiI;
/* 14 */                    Olo0i0 olo0i0 = (Olo0i0) obj;
/* 16 */                    ArrayList arrayList = olo0i0.I00000oIO;
/* 18 */                    ArrayList arrayList2 = olo0i0.I00000oOI;
/* 22 */                    long j2 = olo0loOlIO.I0000Il00O.I00000oIO;
/* 28 */                    if (j2 != 16) {
/* 30 */                        j = j2;
                            }
/* 33 */                    float fFloatValue = olo0loOlIO.I0000O.floatValue();
/* 39 */                    Olo0Ii0oiI olo0Ii0oiI = new Olo0Ii0oiI();
/* 42 */                    olo0Ii0oiI.I00iOIl = arrayList;
/* 44 */                    olo0Ii0oiI.I00iiI = arrayList2;
/* 46 */                    olo0Ii0oiI.I00iiO = j;
/* 48 */                    olo0Ii0oiI.I00iio = fFloatValue;
/* 50 */                    VarHandle.storeStoreFence();
/* 55 */                    return iIO01l11OlO.I00000oIO(O1ooIo101ll.I00000oIO, olo0Ii0oiI);
                    }
                }
            }
