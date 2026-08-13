            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class IOooiliO0l implements Function1 {
                public final int I00iOIl;
                public Oo0IOoOi01 I00iiI;

                public IOooiliO0l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    OOo0IO oOo0IO;
                    O0iOOo0Ii o0iOOo0IiI0000Il00O;
                    char c;
                    long j;
                    float fIntBitsToFloat;
                    O0iOOo0Ii o0iOOo0IiI0000Il00O2;
                    O0iOOo0Ii o0iOOo0IiI0000Il00O3;
                    O0iOOo0Ii o0iOOo0IiI0000Il00O4;
                    O0iOOo0Ii o0iOOo0IiI0000Il00O5;
/* 3 */             int i = this.I00iOIl;
/* 5 */             Oo0IOoOi01 oo0IOoOi01 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 328 */                   I0IOIo0 i0IOIo0 = new I0IOIo0(7);
/* 331 */                   i0IOIo0.I00000oOI = oo0IOoOi01;
/* 333 */                   VarHandle.storeStoreFence();
/* 336 */                   return i0IOIo0;
                        case 1:
/* 315 */                   oo0IOoOi01.I0010o();
/* 318 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 12 */                    O0iOOo0Ii o0iOOo0Ii = (O0iOOo0Ii) obj;
/* 14 */                    O0oIlOolIO o0oIlOolIO = oo0IOoOi01.I0000O;
/* 16 */                    if (o0oIlOolIO == null) {
/* 291 */                       oOo0IO = OOo0IO.I0000oI00;
                            } else {
/* 20 */                        if (o0oIlOolIO.I00100l0) {
/* 23 */                            o0oIlOolIO = null;
                                }
/* 24 */                        if (o0oIlOolIO != null) {
/* 26 */                            OIOlOI oIOlOI = oo0IOoOi01.I00000oOI;
/* 32 */                            long j2 = oo0IOoOi01.I000l1().I00000oOI;
/* 34 */                            int i2 = Oo0lI00l.I0000Il00O;
/* 40 */                            int iI000o00OoI0I = oIOlOI.I000o00OoI0I((int) (j2 >> 32));
/* 59 */                            int iI000o00OoI0I2 = oo0IOoOi01.I00000oOI.I000o00OoI0I((int) (oo0IOoOi01.I000l1().I00000oOI & 4294967295L));
/* 63 */                            O0oIlOolIO o0oIlOolIO2 = oo0IOoOi01.I0000O;
/* 65 */                            long jI00Iooi00oi = 0;
/* 85 */                            long jI00Iooi00oi2 = (o0oIlOolIO2 == null || (o0iOOo0IiI0000Il00O5 = o0oIlOolIO2.I0000Il00O()) == null) ? 0L : o0iOOo0IiI0000Il00O5.I00Iooi00oi(oo0IOoOi01.I000OiO(true));
/* 86 */                            O0oIlOolIO o0oIlOolIO3 = oo0IOoOi01.I0000O;
/* 88 */                            if (o0oIlOolIO3 != null && (o0iOOo0IiI0000Il00O4 = o0oIlOolIO3.I0000Il00O()) != null) {
/* 101 */                               jI00Iooi00oi = o0iOOo0IiI0000Il00O4.I00Iooi00oi(oo0IOoOi01.I000OiO(false));
                                    }
/* 105 */                           O0oIlOolIO o0oIlOolIO4 = oo0IOoOi01.I0000O;
/* 107 */                           float fIntBitsToFloat2 = 0.0f;
/* 108 */                           if (o0oIlOolIO4 == null || (o0iOOo0IiI0000Il00O3 = o0oIlOolIO4.I0000Il00O()) == null) {
/* 163 */                               c = ' ';
/* 165 */                               j = jI00Iooi00oi;
/* 167 */                               fIntBitsToFloat = 0.0f;
                                    } else {
/* 143 */                               c = ' ';
/* 145 */                               j = jI00Iooi00oi;
/* 158 */                               fIntBitsToFloat = Float.intBitsToFloat((int) (o0iOOo0IiI0000Il00O3.I00Iooi00oi((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(o0oIlOolIO.I0000O() != null ? r15.I00000oIO.I0000Il00O(iI000o00OoI0I).I00000oOI : 0.0f) & 4294967295L)) & 4294967295L));
                                    }
/* 168 */                           O0oIlOolIO o0oIlOolIO5 = oo0IOoOi01.I0000O;
/* 170 */                           if (o0oIlOolIO5 != null && (o0iOOo0IiI0000Il00O2 = o0oIlOolIO5.I0000Il00O()) != null) {
/* 215 */                               fIntBitsToFloat2 = Float.intBitsToFloat((int) (o0iOOo0IiI0000Il00O2.I00Iooi00oi((Float.floatToRawIntBits(0.0f) << c) | (Float.floatToRawIntBits(o0oIlOolIO.I0000O() != null ? r6.I00000oIO.I0000Il00O(iI000o00OoI0I2).I00000oOI : 0.0f) & 4294967295L)) & 4294967295L));
                                    }
/* 221 */                           int i3 = (int) (jI00Iooi00oi2 >> c);
/* 228 */                           int i4 = (int) (j >> c);
/* 287 */                           oOo0IO = new OOo0IO(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (((IiIooOOOI) o0oIlOolIO.I00000oIO.I00iio).I00000oIO() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jI00Iooi00oi2 & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
                                }
                            }
/* 293 */                   O0oIlOolIO o0oIlOolIO6 = oo0IOoOi01.I0000O;
/* 295 */                   if (o0oIlOolIO6 == null || (o0iOOo0IiI0000Il00O = o0oIlOolIO6.I0000Il00O()) == null) {
/* 309 */                       return null;
                            }
/* 304 */                   return iO1I0I0i0Oo.I00000oOI(oOo0IO, o0iOOo0IiI0000Il00O, o0iOOo0Ii);
                    }
                }
            }
