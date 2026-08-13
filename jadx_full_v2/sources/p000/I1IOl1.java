            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class I1IOl1 implements I1IOiOI0, O1iOIoOiO0, O1IioilO {
                public final O0iiIiio01I0 I00iOIl;
                public Oiol1OoI I00iiI;
                public boolean I00iiO;

                public I1IOl1(O0iiIiio01I0 o0iiIiio01I0, Oiol1OoI oiol1OoI) {
/* 4 */             this.I00iOIl = o0iiIiio01I0;
/* 6 */             this.I00iiI = oiol1OoI;
                }

                @Override
                public final float I00000oIO() {
/* 3 */             return this.I00iOIl.I00000oIO();
                }

                @Override
                public final O0iOOo0Ii I00000oOI(O0iOOo0Ii o0iOOo0Ii) {
                    O1Iil010i10 o1Iil010i10;
/* 3 */             if (o0iOOo0Ii instanceof O1Iil010i10) {
/* 5 */                 return o0iOOo0Ii;
                    }
/* 8 */             if (o0iOOo0Ii instanceof OIIlIII0Ili) {
/* 13 */                O1IiiOil0o0l o1IiiOil0o0lI01101IOlO = ((OIIlIII0Ili) o0iOOo0Ii).I01101IOlO();
                        return (o1IiiOil0o0lI01101IOlO == null || (o1Iil010i10 = o1IiiOil0o0lI01101IOlO.I00olI) == null) ? o0iOOo0Ii : o1Iil010i10;
                    }
/* 27 */            IolioOO1.I00000oOI("Unsupported LayoutCoordinates");
/* 30 */            IOOlIIilOl0.I0000Il00O();
/* 33 */            return null;
                }

                @Override
                public final long I00100l0(float f) {
/* 3 */             return this.I00iOIl.I00100l0(f);
                }

                @Override
                public final long I00100o1O0lo(long j) {
/* 3 */             return this.I00iOIl.I00100o1O0lo(j);
                }

                @Override
                public final O1iOIo0o0 I001i1lo1io(int i, int i2, Map map, Function1 function1) {
/* 8 */             return this.I00iOIl.I00io1l(i, i2, map, null, function1);
                }

                @Override
                public final float I001lIiIIo1O(long j) {
/* 3 */             return this.I00iOIl.I001lIiIIo1O(j);
                }

                @Override
                public final long I00IioO0OiOi(int i) {
/* 3 */             return this.I00iOIl.I00IioO0OiOi(i);
                }

                @Override
                public final long I00Io1o110i(float f) {
/* 3 */             return this.I00iOIl.I00Io1o110i(f);
                }

                @Override
                public final float I00O0o1oo(int i) {
/* 3 */             return this.I00iOIl.I00O0o1oo(i);
                }

                @Override
                public final float I00OIO1(float f) {
/* 7 */             return f / this.I00iOIl.I00000oIO();
                }

                @Override
                public final float I00Ol00() {
/* 3 */             return this.I00iOIl.I00Ol00();
                }

                @Override
                public final boolean I00OloOo() {
/* 1 */             return false;
                }

                @Override
                public final float I00i0ilIl0i(float f) {
/* 7 */             return this.I00iOIl.I00000oIO() * f;
                }

                @Override
                public final int I00iio(long j) {
/* 3 */             return this.I00iOIl.I00iio(j);
                }

                @Override
                public final O1iOIo0o0 I00io1l(int i, int i2, Map map, Function1 function1, Function1 function12) {
/* 5 */             int i3 = 0;
/* 14 */            if (!((i & (-16777216)) == 0 && ((-16777216) & i2) == 0)) {
/* 43 */                IolioOO1.I0000Il00O("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
                    }
/* 48 */            I1IOio1Ooo11 i1IOio1Ooo11 = new I1IOio1Ooo11(i3);
/* 51 */            i1IOio1Ooo11.I0001Ioi1lo = function12;
/* 53 */            i1IOio1Ooo11.I000II = this;
/* 55 */            i1IOio1Ooo11.I00000oOI = i;
/* 57 */            i1IOio1Ooo11.I0000Il00O = i2;
/* 59 */            i1IOio1Ooo11.I0000O = map;
/* 61 */            i1IOio1Ooo11.I0000oI00 = function1;
/* 63 */            VarHandle.storeStoreFence();
/* 399 */           return i1IOio1Ooo11;
                }

                @Override
                public final int I00l0OO0IO(float f) {
/* 3 */             return this.I00iOIl.I00l0OO0IO(f);
                }

                @Override
                public final long I00oI0i(long j) {
/* 3 */             return this.I00iOIl.I00oI0i(j);
                }

                @Override
                public final float I00oO101o(long j) {
/* 3 */             return this.I00iOIl.I00oO101o(j);
                }

                @Override
                public final O0iOOoiioO getLayoutDirection() {
/* 5 */             return this.I00iOIl.I00oO101o.I00oo1iO0ll;
                }
            }
