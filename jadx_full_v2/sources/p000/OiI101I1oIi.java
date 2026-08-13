            package p000;
            
            public final class OiI101I1oIi {
                public final float I00000oIO;
                public final float I00000oOI;
                public final float I0000Il00O;
                public final float I0000O;
                public final long I0000oI00;
                public final long I0001Ioi1lo;
                public final long I000II;
                public final long I000O01llI0;

                static {
/* 7 */             lIooiiO1i.I00000oOI(0.0f, 0.0f, 0.0f, 0.0f, 0L);
                }

                public OiI101I1oIi(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
/* 8 */             this.I0000Il00O = f3;
/* 10 */            this.I0000O = f4;
/* 12 */            this.I0000oI00 = j;
/* 14 */            this.I0001Ioi1lo = j2;
/* 16 */            this.I000II = j3;
/* 18 */            this.I000O01llI0 = j4;
                }

                public final float I00000oIO() {
/* 5 */             return this.I0000O - this.I00000oOI;
                }

                public final float I00000oOI() {
/* 5 */             return this.I0000Il00O - this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 100 */               return true;
                    }
/* 6 */             if (!(obj instanceof OiI101I1oIi)) {
/* 98 */                return false;
                    }
/* 9 */             OiI101I1oIi oiI101I1oIi = (OiI101I1oIi) obj;
                    return Float.compare(this.I00000oIO, oiI101I1oIi.I00000oIO) == 0 && Float.compare(this.I00000oOI, oiI101I1oIi.I00000oOI) == 0 && Float.compare(this.I0000Il00O, oiI101I1oIi.I0000Il00O) == 0 && Float.compare(this.I0000O, oiI101I1oIi.I0000O) == 0 && iioiill1I0.I00000oIO(this.I0000oI00, oiI101I1oIi.I0000oI00) && iioiill1I0.I00000oIO(this.I0001Ioi1lo, oiI101I1oIi.I0001Ioi1lo) && iioiill1I0.I00000oIO(this.I000II, oiI101I1oIi.I000II) && iioiill1I0.I00000oIO(this.I000O01llI0, oiI101I1oIi.I000O01llI0);
                }

                public final int hashCode() {
/* 52 */            return Long.hashCode(this.I000O01llI0) + IIlIOloOOO.I0000O(this.I000II, IIlIOloOOO.I0000O(this.I0001Ioi1lo, IIlIOloOOO.I0000O(this.I0000oI00, OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O), 31), 31), 31);
                }

                public final String toString() {
/* 3 */             String strI00000oIO = ill1O0010.I00000oIO(this.I00000oIO);
/* 9 */             String strI00000oIO2 = ill1O0010.I00000oIO(this.I00000oOI);
/* 15 */            String strI00000oIO3 = ill1O0010.I00000oIO(this.I0000Il00O);
/* 21 */            String strI00000oIO4 = ill1O0010.I00000oIO(this.I0000O);
/* 27 */            StringBuilder sb = new StringBuilder();
/* 30 */            sb.append(strI00000oIO);
/* 35 */            sb.append(", ");
/* 38 */            sb.append(strI00000oIO2);
/* 41 */            sb.append(", ");
/* 44 */            sb.append(strI00000oIO3);
/* 47 */            String strI00100l0 = IIl001iO0Io.I00100l0(sb, ", ", strI00000oIO4);
/* 51 */            long j = this.I0000oI00;
/* 53 */            long j2 = this.I0001Ioi1lo;
/* 55 */            boolean zI00000oIO = iioiill1I0.I00000oIO(j, j2);
/* 63 */            long j3 = this.I000II;
/* 65 */            long j4 = this.I000O01llI0;
/* 67 */            if (zI00000oIO && iioiill1I0.I00000oIO(j2, j3) && iioiill1I0.I00000oIO(j3, j4)) {
/* 85 */                int i = (int) (j >> 32);
/* 96 */                int i2 = (int) (j & 4294967295L);
/* 103 */               if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
/* 115 */                   return Oi010OO0.I001IO000("RoundRect(rect=", strI00100l0, ", radius=", ill1O0010.I00000oIO(Float.intBitsToFloat(i)), ")");
                        }
/* 124 */               String strI00000oIO5 = ill1O0010.I00000oIO(Float.intBitsToFloat(i));
/* 144 */               return IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("RoundRect(rect=", strI00100l0, ", x=", strI00000oIO5, ", y="), ill1O0010.I00000oIO(Float.intBitsToFloat(i2)), ")");
                    }
/* 149 */           String strI00000oOI = iioiill1I0.I00000oOI(j);
/* 153 */           String strI00000oOI2 = iioiill1I0.I00000oOI(j2);
/* 157 */           String strI00000oOI3 = iioiill1I0.I00000oOI(j3);
/* 161 */           String strI00000oOI4 = iioiill1I0.I00000oOI(j4);
/* 169 */           StringBuilder sbI00111O = IIl001iO0Io.I00111O("RoundRect(rect=", strI00100l0, ", topLeft=", strI00000oOI, ", topRight=");
/* 177 */           IIl001iO0Io.I001lIiIIo1O(sbI00111O, strI00000oOI2, ", bottomRight=", strI00000oOI3, ", bottomLeft=");
/* 180 */           return IIl001iO0Io.I00100l0(sbI00111O, strI00000oOI4, ")");
                }
            }
