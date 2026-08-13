            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class II0O0I00oOi {
                public final int[] I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;
                public final List I0000oI00;

                public II0O0I00oOi(int... iArr) {
                    List listI00iIi0i1o;
/* 4 */             this.I00000oIO = iArr;
/* 18 */            Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
/* 28 */            this.I00000oOI = numValueOf != null ? numValueOf.intValue() : -1;
/* 41 */            Integer numValueOf2 = 1 < iArr.length ? Integer.valueOf(iArr[1]) : null;
/* 50 */            this.I0000Il00O = numValueOf2 != null ? numValueOf2.intValue() : -1;
/* 63 */            Integer numValueOf3 = 2 < iArr.length ? Integer.valueOf(iArr[2]) : null;
/* 70 */            this.I0000O = numValueOf3 != null ? numValueOf3.intValue() : -1;
/* 74 */            if (iArr.length <= 3) {
/* 119 */               listI00iIi0i1o = Il01100l.I00iOIl;
                    } else {
/* 79 */                if (iArr.length > 1024) {
/* 115 */                   I000II.I000iOII(Oi010OO0.I001i1lo1io(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
/* 118 */                   throw null;
                        }
/* 83 */                I1Ioli1lO0il i1Ioli1lO0il = new I1Ioli1lO0il();
/* 86 */                i1Ioli1lO0il.I00iOIl = iArr;
/* 88 */                VarHandle.storeStoreFence();
/* 96 */                listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(i1Ioli1lO0il.subList(3, iArr.length));
                    }
/* 121 */           this.I0000oI00 = listI00iIi0i1o;
                }

                public final boolean I00000oIO(int i, int i2, int i3) {
/* 2 */             int i4 = this.I00000oOI;
/* 4 */             if (i4 > i) {
/* 1 */                 return true;
                    }
/* 8 */             if (i4 < i) {
/* 7 */                 return false;
                    }
/* 11 */            int i5 = this.I0000Il00O;
/* 13 */            if (i5 > i2) {
/* 1 */                 return true;
                    }
                    return i5 >= i2 && this.I0000O >= i3;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null || !getClass().equals(obj.getClass())) {
/* 49 */                return false;
                    }
/* 17 */            II0O0I00oOi iI0O0I00oOi = (II0O0I00oOi) obj;
                    return this.I00000oOI == iI0O0I00oOi.I00000oOI && this.I0000Il00O == iI0O0I00oOi.I0000Il00O && this.I0000O == iI0O0I00oOi.I0000O && this.I0000oI00.equals(iI0O0I00oOi.I0000oI00);
                }

                public final int hashCode() {
/* 1 */             int i = this.I00000oOI;
/* 8 */             int i2 = (i * 31) + this.I0000Il00O + i;
/* 14 */            int i3 = (i2 * 31) + this.I0000O + i2;
/* 24 */            return this.I0000oI00.hashCode() + (i3 * 31) + i3;
                }

                public final String toString() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 10 */            for (int i : this.I00000oIO) {
/* 15 */                if (i == -1) {
                            break;
                        }
/* 21 */                arrayList.add(Integer.valueOf(i));
                    }
                    return arrayList.isEmpty() ? "unknown" : IOOi0Ool1i.I00IlilI0i0i(arrayList, ".", null, null, null, 62);
                }
            }
