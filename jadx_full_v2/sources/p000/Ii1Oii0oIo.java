            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.TimeZone;
            
            public abstract class Ii1Oii0oIo {
                public static final int[] I00000oIO;
                public static final int[] I00000oOI;

                static {
/* 3 */             TimeZone.getTimeZone("GMT");
/* 13 */            I00000oIO = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
/* 20 */            I00000oOI = new int[]{0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
                }

                public static final Ilo0Ooi I00000oIO(Long l) {
                    int i;
                    int i2;
/* 8 */             long jLongValue = l != null ? l.longValue() : System.currentTimeMillis();
/* 14 */            long jFloorDiv = Math.floorDiv(jLongValue, 1000L);
/* 21 */            long jFloorMod = Math.floorMod(jFloorDiv, 86400L);
/* 29 */            int i3 = (int) (jFloorMod % 60);
/* 33 */            int i4 = (int) ((jFloorMod / 60) % 60);
/* 37 */            int i5 = (int) (jFloorMod / 3600);
/* 42 */            int iFloorDiv = (int) Math.floorDiv(jFloorDiv, 86400L);
/* 52 */            i0010oOIlI.I00iOIl.getClass();
/* 61 */            i0010oOIlI i0010ooili = (i0010oOIlI) i0010oOIlI.I00iiO.get(((iFloorDiv % 7) + 10) % 7);
/* 66 */            int i6 = 719468 + iFloorDiv;
/* 70 */            if (i6 >= 0) {
/* 72 */                i = i6 / 146097;
/* 74 */                i2 = i6 % 146097;
                    } else {
/* 80 */                i = (iFloorDiv + 573372) / 146097;
/* 82 */                i2 = i6 - (146097 * i);
                    }
/* 99 */            int i7 = (((i2 / 36524) + (i2 - (i2 / 1460))) - (i2 / 146096)) / 365;
/* 103 */           int i8 = (i * 400) + i7;
/* 112 */           int i9 = i2 - (((i7 / 4) + (i7 * 365)) - (i7 / 100));
/* 117 */           int i10 = ((i9 * 5) + 2) / 153;
/* 127 */           int i11 = (i9 - (((i10 * 153) + 2) / 5)) + 1;
/* 133 */           int i12 = i10 < 10 ? i10 + 2 : i10 - 10;
/* 134 */           if (i12 <= 1) {
/* 136 */               i8++;
                    }
/* 157 */           int i13 = ((i8 % 4 != 0 || (i8 % 100 == 0 && i8 % 400 != 0)) ? I00000oIO : I00000oOI)[i12] + i11;
/* 162 */           OI010IlI.I00iOIl.getClass();
/* 171 */           OI010IlI oI010IlI = (OI010IlI) OI010IlI.I00iiO.get(i12);
/* 173 */           Ilo0Ooi ilo0Ooi = new Ilo0Ooi();
/* 176 */           ilo0Ooi.I00iOIl = i3;
/* 178 */           ilo0Ooi.I00iiI = i4;
/* 180 */           ilo0Ooi.I00iiO = i5;
/* 182 */           ilo0Ooi.I00iio = i0010ooili;
/* 184 */           ilo0Ooi.I00ilI0I1 = i11;
/* 186 */           ilo0Ooi.I00ilO0 = i13;
/* 188 */           ilo0Ooi.I00io1l = oI010IlI;
/* 190 */           ilo0Ooi.I00ioIO = i8;
/* 192 */           ilo0Ooi.I00l0I0l0lO1 = jLongValue;
/* 194 */           VarHandle.storeStoreFence();
/* 966 */           return ilo0Ooi;
                }
            }
