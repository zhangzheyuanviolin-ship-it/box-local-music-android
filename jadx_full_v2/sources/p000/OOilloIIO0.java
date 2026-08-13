            package p000;

            import android.graphics.Shader;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class OOilloIIO0 extends OioIoiOi implements Iooo0ilooO0 {
                public final List I0000Il00O;
                public final List I0000O;
                public final long I0000oI00;
                public final float I0001Ioi1lo;

                public OOilloIIO0(List list, List list2, long j, float f) {
/* 4 */             this.I0000Il00O = list;
/* 6 */             this.I0000O = list2;
/* 8 */             this.I0000oI00 = j;
/* 10 */            this.I0001Ioi1lo = f;
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
/* 66 */                obj = new OOilloIIO0(arrayList, this.I0000O, this.I0000oI00, this.I0001Ioi1lo);
                    }
/* 72 */            if (!(obj instanceof OOilloIIO0)) {
/* 112 */               return null;
                    }
/* 76 */            OOilloIIO0 oOilloIIO0 = (OOilloIIO0) obj;
/* 108 */           return new OOilloIIO0(iOi110.I00000oIO(list, oOilloIIO0.I0000Il00O, f), iOi110.I00000oOI(this.I0000O, oOilloIIO0.I0000O, f), l1ioo00OI0oo.I00000oOI(f, this.I0000oI00, oOilloIIO0.I0000oI00), l1I1Il.I00000oOI(this.I0001Ioi1lo, oOilloIIO0.I0001Ioi1lo, f));
                }

                @Override
                public final Shader I0000Il00O(long j) {
                    float fIntBitsToFloat;
                    float fIntBitsToFloat2;
/* 8 */             long j2 = this.I0000oI00;
/* 27 */            if ((9223372034707292159L & j2) == 9205357640488583168L) {
/* 29 */                long jI00000oIO = lOIi0i0.I00000oIO(j);
/* 36 */                fIntBitsToFloat = Float.intBitsToFloat((int) (jI00000oIO >> 32));
/* 42 */                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI00000oIO & 4294967295L));
                    } else {
/* 49 */                int i = (int) (j2 >> 32);
/* 56 */                if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
/* 60 */                    i = (int) (j >> 32);
                        }
/* 61 */                fIntBitsToFloat = Float.intBitsToFloat(i);
/* 66 */                int i2 = (int) (j2 & 4294967295L);
/* 73 */                if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
/* 77 */                    i2 = (int) (j & 4294967295L);
                        }
/* 78 */                fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
/* 95 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
/* 97 */            float fI0000O = this.I0001Ioi1lo;
/* 101 */           if (fI0000O == Float.POSITIVE_INFINITY) {
/* 109 */               fI0000O = Ol0i1I.I0000O(j) / 2.0f;
                    }
/* 110 */           float f = fI0000O;
/* 111 */           List list = this.I0000Il00O;
/* 113 */           List list2 = this.I0000O;
/* 115 */           iOIo0I10oO11.I00000oIO(list, list2);
/* 118 */           int size = list.size();
/* 122 */           long[] jArr = new long[size];
/* 125 */           for (int i3 = 0; i3 < size; i3++) {
/* 139 */               jArr[i3] = iOIl0I.I00000oOI(((IOOiio0i) list.get(i3)).I00000oIO);
                    }
/* 159 */           return Io0ioo1Iooi1.I00000oIO.I00000oOI(jFloatToRawIntBits, f, jArr, list2 != null ? IOOi0Ool1i.I00i0oil(list2) : null, 0);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof OOilloIIO0)) {
/* 54 */                return false;
                    }
/* 10 */            OOilloIIO0 oOilloIIO0 = (OOilloIIO0) obj;
                    return this.I0000Il00O.equals(oOilloIIO0.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oOilloIIO0.I0000O) && OIOlIiiioi.I0000O(this.I0000oI00, oOilloIIO0.I0000oI00) && this.I0001Ioi1lo == oOilloIIO0.I0001Ioi1lo;
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.I0000Il00O.hashCode() * 31;
/* 11 */            List list = this.I0000O;
/* 39 */            return Integer.hashCode(0) + OooioIOo1.I0000O(IIlIOloOOO.I0000O(this.I0000oI00, (iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31), 31, this.I0001Ioi1lo);
                }

                public final String toString() {
/* 6 */             long j = this.I0000oI00;
/* 16 */            String str = "";
/* 28 */            String strI000lI = (9223372034707292159L & j) != 9205357640488583168L ? IlIi0I0.I000lI("center=", OIOlIiiioi.I000OOo1O(j), ", ") : "";
/* 34 */            float f = this.I0001Ioi1lo;
/* 46 */            if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
/* 61 */                str = "radius=" + f + ", ";
                    }
/* 69 */            StringBuilder sb = new StringBuilder("RadialGradient(colors=");
/* 74 */            sb.append(this.I0000Il00O);
/* 79 */            sb.append(", stops=");
/* 84 */            sb.append(this.I0000O);
/* 87 */            sb.append(", ");
/* 92 */            return IIlIOloOOO.I0010I0i(sb, strI000lI, str, "tileMode=Clamp)");
                }
            }
