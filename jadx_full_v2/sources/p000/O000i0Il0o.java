            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class O000i0Il0o implements O1iOIoOiO0, IoooOl1001li {
                public final IoooOl1001li I00iOIl;
                public final O0iOOoiioO I00iiI;

                public O000i0Il0o(IoooOl1001li ioooOl1001li, O0iOOoiioO o0iOOoiioO) {
/* 4 */             this.I00iOIl = ioooOl1001li;
/* 6 */             this.I00iiI = o0iOOoiioO;
                }

                @Override
                public final float I00000oIO() {
/* 3 */             return this.I00iOIl.I00000oIO();
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
/* 3 */             return this.I00iOIl.I00OIO1(f);
                }

                @Override
                public final float I00Ol00() {
/* 3 */             return this.I00iOIl.I00Ol00();
                }

                @Override
                public final boolean I00OloOo() {
/* 3 */             return this.I00iOIl.I00OloOo();
                }

                @Override
                public final float I00i0ilIl0i(float f) {
/* 3 */             return this.I00iOIl.I00i0ilIl0i(f);
                }

                @Override
                public final int I00iio(long j) {
/* 3 */             return this.I00iOIl.I00iio(j);
                }

                @Override
                public final O1iOIo0o0 I00io1l(int i, int i2, Map map, Function1 function1, Function1 function12) {
/* 1 */             boolean z = false;
/* 2 */             if (i < 0) {
/* 4 */                 i = 0;
                    }
/* 5 */             if (i2 < 0) {
/* 7 */                 i2 = 0;
                    }
/* 13 */            if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
/* 18 */                z = true;
                    }
/* 19 */            if (!z) {
/* 48 */                IolioOO1.I0000Il00O("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
                    }
/* 53 */            I1IOOloiIIO1 i1IOOloiIIO1 = new I1IOOloiIIO1(1);
/* 56 */            i1IOOloiIIO1.I00000oOI = i;
/* 58 */            i1IOOloiIIO1.I0000Il00O = i2;
/* 60 */            i1IOOloiIIO1.I0000O = map;
/* 62 */            i1IOOloiIIO1.I0000oI00 = function1;
/* 64 */            VarHandle.storeStoreFence();
/* 399 */           return i1IOOloiIIO1;
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
/* 1 */             return this.I00iiI;
                }
            }
