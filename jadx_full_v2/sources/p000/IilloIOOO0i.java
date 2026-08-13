            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.jvm.functions.Function1;
            
            public interface IilloIOOO0i extends IiIooOOOI {
                static void I00111O(IilloIOOO0i iilloIOOO0i, I0oO00o i0oO00o, long j, float f, IOOil0 iOOil0, int i) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 j = 0;
                    }
/* 7 */             long j2 = j;
/* 10 */            if ((i & 4) != 0) {
/* 12 */                f = 1.0f;
                    }
/* 27 */            iilloIOOO0i.I00i0oil(i0oO00o, j2, f, iOOil0, (i & 32) != 0 ? 3 : 0);
                }

                static void I00Io1lO(IilloIOOO0i iilloIOOO0i, I0ol0lI i0ol0lI, long j, Iilloo0IOoIo iilloo0IOoIo, int i) {
/* 3 */             if ((i & 8) != 0) {
/* 5 */                 iilloo0IOoIo = IlIl1I110o0I.I00000oIO;
                    }
/* 7 */             iilloIOOO0i.I00lll10(i0ol0lI, j, iilloo0IOoIo);
                }

                static long I00OIl(long j, long j2) {
/* 17 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
/* 36 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
/* 51 */            return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
                }

                static void I00OIo(IilloIOOO0i iilloIOOO0i, I0ol0lI i0ol0lI, III11l1I iII11l1I, float f, OlOooI0l0011 olOooI0l0011, IOOil0 iOOil0, int i) {
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 f = 1.0f;
                    }
/* 7 */             float f2 = f;
                    Iilloo0IOoIo iilloo0IOoIo = olOooI0l0011;
/* 10 */            if ((i & 8) != 0) {
/* 12 */                iilloo0IOoIo = IlIl1I110o0I.I00000oIO;
                    }
/* 14 */            Iilloo0IOoIo iilloo0IOoIo2 = iilloo0IOoIo;
/* 17 */            if ((i & 16) != 0) {
/* 19 */                iOOil0 = null;
                    }
/* 33 */            iilloIOOO0i.I001IO000(i0ol0lI, iII11l1I, f2, iilloo0IOoIo2, iOOil0, (i & 32) != 0 ? 3 : 0);
                }

                static void I00Ol1ll1(IilloIOOO0i iilloIOOO0i, I0oO00o i0oO00o, long j, long j2, long j3, long j4, float f, IOOil0 iOOil0, int i, int i2) {
/* 66 */            iilloIOOO0i.I00OOll1(i0oO00o, (i2 & 2) != 0 ? 0L : j, j2, (i2 & 8) != 0 ? 0L : j3, (i2 & 16) != 0 ? j2 : j4, (i2 & 32) != 0 ? 1.0f : f, (i2 & Barcode.FORMAT_ITF) != 0 ? null : iOOil0, (i2 & Barcode.FORMAT_UPC_A) != 0 ? 1 : i);
                }

                static void I00iiO(IilloIOOO0i iilloIOOO0i, long j, float f, long j2, Iilloo0IOoIo iilloo0IOoIo, int i) {
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 j2 = iilloIOOO0i.I00lli11();
                    }
/* 9 */             long j3 = j2;
/* 12 */            if ((i & 16) != 0) {
/* 14 */                iilloo0IOoIo = IlIl1I110o0I.I00000oIO;
                    }
/* 20 */            iilloIOOO0i.I00IlilI0i0i(j, f, j3, iilloo0IOoIo);
                }

                static void I00ilI0I1(IilloIOOO0i iilloIOOO0i, long j, long j2, long j3, float f, OlOooI0l0011 olOooI0l0011, int i, int i2) {
/* 9 */             long j4 = (i2 & 2) != 0 ? 0L : j2;
/* 58 */            iilloIOOO0i.I001i1O0Ol(j, j4, (i2 & 4) != 0 ? I00OIl(iilloIOOO0i.I0000oI00(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? IlIl1I110o0I.I00000oIO : olOooI0l0011, (i2 & 64) != 0 ? 3 : i);
                }

                static void I00o0l1o1o0(IilloIOOO0i iilloIOOO0i, long j, long j2, long j3, long j4, Iilloo0IOoIo iilloo0IOoIo, int i) {
/* 27 */            iilloIOOO0i.I00i0O(j, (i & 2) != 0 ? 0L : j2, j3, j4, (i & 16) != 0 ? IlIl1I110o0I.I00000oIO : iilloo0IOoIo);
                }

                static void I00oII(IilloIOOO0i iilloIOOO0i, III11l1I iII11l1I, long j, long j2, float f, Iilloo0IOoIo iilloo0IOoIo, IOOil0 iOOil0, int i, int i2) {
/* 3 */             if ((i2 & 2) != 0) {
/* 5 */                 j = 0;
                    }
/* 7 */             long j3 = j;
/* 64 */            iilloIOOO0i.I00oliIiO01i(iII11l1I, j3, (i2 & 4) != 0 ? I00OIl(iilloIOOO0i.I0000oI00(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? IlIl1I110o0I.I00000oIO : iilloo0IOoIo, (i2 & 32) != 0 ? null : iOOil0, (i2 & 64) != 0 ? 3 : i);
                }

                static void I00ol1(IilloIOOO0i iilloIOOO0i, III11l1I iII11l1I, long j, long j2, long j3, float f, Iilloo0IOoIo iilloo0IOoIo, IOOil0 iOOil0, int i) {
/* 11 */            long j4 = (i & 2) != 0 ? 0L : j;
/* 72 */            iilloIOOO0i.I00o101lO(iII11l1I, j4, (i & 4) != 0 ? I00OIl(iilloIOOO0i.I0000oI00(), j4) : j2, j3, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? IlIl1I110o0I.I00000oIO : iilloo0IOoIo, (i & 64) != 0 ? null : iOOil0, (i & Barcode.FORMAT_ITF) != 0 ? 3 : 0);
                }

                static void I00oli(IilloIOOO0i iilloIOOO0i, long j, long j2, long j3, float f, int i, I0ol1Ioloo i0ol1Ioloo, int i2) {
/* 27 */            iilloIOOO0i.I0010I0i(j, j2, j3, f, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : i0ol1Ioloo);
                }

                default long I0000oI00() {
/* 5 */             return I00iiI().I001iOo1i0O();
                }

                default void I000lI(long j, Io10IOI io10IOI, Function1 function1) {
/* 14 */            io10IOI.I0000oI00(this, getLayoutDirection(), j, new Ii00IiIOOoi0(1, this, function1));
                }

                void I0010I0i(long j, long j2, long j3, float f, int i, I0ol1Ioloo i0ol1Ioloo);

                void I001IO000(I0ol0lI i0ol0lI, III11l1I iII11l1I, float f, Iilloo0IOoIo iilloo0IOoIo, IOOil0 iOOil0, int i);

                void I001i1O0Ol(long j, long j2, long j3, float f, Iilloo0IOoIo iilloo0IOoIo, int i);

                void I00IlilI0i0i(long j, float f, long j2, Iilloo0IOoIo iilloo0IOoIo);

                void I00OOll1(I0oO00o i0oO00o, long j, long j2, long j3, long j4, float f, IOOil0 iOOil0, int i);

                void I00i0O(long j, long j2, long j3, long j4, Iilloo0IOoIo iilloo0IOoIo);

                void I00i0oil(I0oO00o i0oO00o, long j, float f, IOOil0 iOOil0, int i);

                IOO000ilo I00iiI();

                default long I00lli11() {
/* 9 */             return lOIi0i0.I00000oIO(I00iiI().I001iOo1i0O());
                }

                void I00lll10(I0ol0lI i0ol0lI, long j, Iilloo0IOoIo iilloo0IOoIo);

                void I00o101lO(III11l1I iII11l1I, long j, long j2, long j3, float f, Iilloo0IOoIo iilloo0IOoIo, IOOil0 iOOil0, int i);

                void I00oliIiO01i(III11l1I iII11l1I, long j, long j2, float f, Iilloo0IOoIo iilloo0IOoIo, IOOil0 iOOil0, int i);

                void I00oo1iO0ll(long j, float f, float f2, long j2, long j3, Iilloo0IOoIo iilloo0IOoIo);

                O0iOOoiioO getLayoutDirection();
            }
