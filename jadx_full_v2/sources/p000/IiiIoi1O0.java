            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IiiIoi1O0 {
                public final IiiIoIoo I00000oIO;

                static {
/* 6 */             new IiiIoi1O0("", 0, 0);
                }

                public IiiIoi1O0(String str, int i, int i2) {
/* 6 */             IiiIoIoo iiiIoIoo = new IiiIoIoo();
/* 9 */             iiiIoIoo.I00000oIO = str;
/* 11 */            iiiIoIoo.I00000oOI = i;
/* 13 */            iiiIoIoo.I0000Il00O = i2;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            this.I00000oIO = iiiIoIoo;
                }

                public static IiiIoi1O0 I00000oIO(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
                    String string;
/* 5 */             if (z) {
/* 7 */                 int i7 = i / 2;
/* 9 */                 int i8 = i2 / 2;
/* 15 */                StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("M0,", i8, " A", i7, ",");
/* 19 */                sbI0010I0i.append(i8);
/* 24 */                sbI0010I0i.append(" 0 1,1 ");
/* 27 */                sbI0010I0i.append(i);
/* 30 */                sbI0010I0i.append(",");
/* 33 */                sbI0010I0i.append(i8);
/* 36 */                sbI0010I0i.append(" A");
/* 39 */                sbI0010I0i.append(i7);
/* 42 */                sbI0010I0i.append(",");
/* 45 */                sbI0010I0i.append(i8);
/* 50 */                sbI0010I0i.append(" 0 1,1 0,");
/* 53 */                sbI0010I0i.append(i8);
/* 56 */                sbI0010I0i.append(" Z");
/* 59 */                string = sbI0010I0i.toString();
                    } else {
/* 69 */                StringBuilder sb = new StringBuilder("M ");
/* 76 */                int iMin = Math.min(i / 2, i2 / 2);
/* 80 */                int iMin2 = Math.min(iMin, i3);
/* 84 */                int iMin3 = Math.min(iMin, i4);
/* 88 */                int iMin4 = Math.min(iMin, i5);
/* 92 */                int iMin5 = Math.min(iMin, i6);
/* 96 */                sb.append(iMin2);
/* 101 */               sb.append(",0 L ");
/* 106 */               sb.append(i - iMin3);
/* 111 */               sb.append(",0");
/* 118 */               if (iMin3 > 0) {
/* 120 */                   IIlIOloOOO.I001l0I00(sb, " A ", iMin3, ",", iMin3);
/* 123 */                   IIlIOloOOO.I001l0I00(sb, " 0 0,1 ", i, ",", iMin3);
                        }
/* 128 */               sb.append(" L ");
/* 131 */               sb.append(i);
/* 134 */               sb.append(",");
/* 139 */               sb.append(i2 - iMin4);
/* 142 */               if (iMin4 > 0) {
/* 144 */                   IIlIOloOOO.I001l0I00(sb, " A ", iMin4, ",", iMin4);
/* 147 */                   sb.append(" 0 0,1 ");
/* 152 */                   sb.append(i - iMin4);
/* 155 */                   sb.append(",");
/* 158 */                   sb.append(i2);
                        }
/* 161 */               IIlIOloOOO.I001l0I00(sb, " L ", iMin5, ",", i2);
/* 164 */               if (iMin5 > 0) {
/* 166 */                   IIlIOloOOO.I001l0I00(sb, " A ", iMin5, ",", iMin5);
/* 171 */                   sb.append(" 0 0,1 0,");
/* 176 */                   sb.append(i2 - iMin5);
                        }
/* 179 */               if (iMin2 > 0) {
/* 183 */                   IIlIOloOOO.I001l0I00(sb, " L 0,", iMin2, " A ", iMin2);
/* 186 */                   IIlIOloOOO.I001l0I00(sb, ",", iMin2, " 0 0,1 ", iMin2);
/* 189 */                   sb.append(",0");
                        }
/* 192 */               sb.append(" Z");
/* 195 */               string = sb.toString();
                    }
/* 201 */           return new IiiIoi1O0(string, i, i2);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof IiiIoi1O0) {
/* 17 */                return this.I00000oIO.equals(((IiiIoi1O0) obj).I00000oIO);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 3 */             return this.I00000oIO.toString();
                }
            }
