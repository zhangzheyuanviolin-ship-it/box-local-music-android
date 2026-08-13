            package p000;

            import android.graphics.Shader;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class O0oo1oi0oil extends OioIoiOi implements Iooo0ilooO0 {
                public final List I0000Il00O;
                public final List I0000O;
                public final long I0000oI00;
                public final long I0001Ioi1lo;

                public O0oo1oi0oil(List list, List list2, long j, long j2) {
/* 4 */             this.I0000Il00O = list;
/* 6 */             this.I0000O = list2;
/* 8 */             this.I0000oI00 = j;
/* 10 */            this.I0001Ioi1lo = j2;
                }

                @Override
                public final Object I00000oOI(Object obj, float f) {
/* 1 */             if (obj == null) {
/* 7 */                 obj = new OlI00IIlOO(IOOiio0i.I000lI);
                    }
/* 10 */            boolean z = obj instanceof OlI00IIlOO;
/* 12 */            List list = this.I0000Il00O;
/* 14 */            if (z) {
/* 22 */                ArrayList arrayList = new ArrayList(list.size());
/* 28 */                int size = list.size();
/* 33 */                for (int i = 0; i < size; i++) {
/* 41 */                    long j = ((IOOiio0i) list.get(i)).I00000oIO;
/* 52 */                    arrayList.add(IOOiio0i.I00000oIO(((OlI00IIlOO) obj).I00000oIO));
                        }
/* 66 */                obj = new O0oo1oi0oil(arrayList, this.I0000O, this.I0000oI00, this.I0001Ioi1lo);
                    }
/* 72 */            if (!(obj instanceof O0oo1oi0oil)) {
/* 112 */               return null;
                    }
/* 76 */            O0oo1oi0oil o0oo1oi0oil = (O0oo1oi0oil) obj;
/* 108 */           return new O0oo1oi0oil(iOi110.I00000oIO(list, o0oo1oi0oil.I0000Il00O, f), iOi110.I00000oOI(this.I0000O, o0oo1oi0oil.I0000O, f), iOi110.I0000Il00O(f, this.I0000oI00, o0oo1oi0oil.I0000oI00), iOi110.I0000Il00O(f, this.I0001Ioi1lo, o0oo1oi0oil.I0001Ioi1lo));
                }

                @Override
                public final Shader I0000Il00O(long j) {
/* 3 */             long j2 = this.I0000oI00;
/* 9 */             int i = (int) (j2 >> 32);
/* 18 */            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
/* 22 */                i = (int) (j >> 32);
                    }
/* 23 */            float fIntBitsToFloat = Float.intBitsToFloat(i);
/* 33 */            int i2 = (int) (j2 & 4294967295L);
/* 40 */            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
/* 44 */                i2 = (int) (j & 4294967295L);
                    }
/* 45 */            float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
/* 49 */            long j3 = this.I0001Ioi1lo;
/* 53 */            int i3 = (int) (j3 >> 32);
/* 60 */            if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
/* 64 */                i3 = (int) (j >> 32);
                    }
/* 65 */            float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
/* 70 */            int i4 = (int) (j3 & 4294967295L);
/* 77 */            if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
/* 81 */                i4 = (int) (j & 4294967295L);
                    }
/* 82 */            float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
/* 98 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
/* 113 */           long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L);
/* 115 */           List list = this.I0000Il00O;
/* 117 */           List list2 = this.I0000O;
/* 119 */           iOIo0I10oO11.I00000oIO(list, list2);
/* 122 */           int size = list.size();
/* 126 */           long[] jArr = new long[size];
/* 129 */           for (int i5 = 0; i5 < size; i5++) {
/* 143 */               jArr[i5] = iOIl0I.I00000oOI(((IOOiio0i) list.get(i5)).I00000oIO);
                    }
/* 167 */           return Io0ioo1Iooi1.I00000oIO.I00000oIO(jFloatToRawIntBits, jFloatToRawIntBits2, jArr, list2 != null ? IOOi0Ool1i.I00i0oil(list2) : null, 0);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof O0oo1oi0oil)) {
/* 55 */                return false;
                    }
/* 10 */            O0oo1oi0oil o0oo1oi0oil = (O0oo1oi0oil) obj;
                    return O0000Ioio00.I0000O(this.I0000Il00O, o0oo1oi0oil.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, o0oo1oi0oil.I0000O) && OIOlIiiioi.I0000O(this.I0000oI00, o0oo1oi0oil.I0000oI00) && OIOlIiiioi.I0000O(this.I0001Ioi1lo, o0oo1oi0oil.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.I0000Il00O.hashCode() * 31;
/* 11 */            List list = this.I0000O;
/* 39 */            return Integer.hashCode(0) + IIlIOloOOO.I0000O(this.I0001Ioi1lo, IIlIOloOOO.I0000O(this.I0000oI00, (iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31), 31);
                }

                public final String toString() {
/* 3 */             long j = this.I0000oI00;
/* 41 */            String strI000lI = ((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? IlIi0I0.I000lI("start=", OIOlIiiioi.I000OOo1O(j), ", ") : "";
/* 47 */            long j2 = this.I0001Ioi1lo;
/* 65 */            String strI000lI2 = ((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? IlIi0I0.I000lI("end=", OIOlIiiioi.I000OOo1O(j2), ", ") : "";
/* 73 */            StringBuilder sb = new StringBuilder("LinearGradient(colors=");
/* 78 */            sb.append(this.I0000Il00O);
/* 83 */            sb.append(", stops=");
/* 88 */            sb.append(this.I0000O);
/* 91 */            sb.append(", ");
/* 96 */            return IIlIOloOOO.I0010I0i(sb, strI000lI, strI000lI2, "tileMode=Clamp)");
                }
            }
