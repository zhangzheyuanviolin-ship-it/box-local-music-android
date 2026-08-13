            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class OoOiIIi01o implements O0O01O0o {
                public final O0IiIl0il I00iOIl;
                public final List I00iiI;
                public final int I00iiO;

                public OoOiIIi01o(O0IiIl0il o0IiIl0il, List list, int i) {
/* 4 */             this.I00iOIl = o0IiIl0il;
/* 6 */             this.I00iiI = list;
/* 8 */             this.I00iiO = i;
                }

                public final String I00000oIO(boolean z) throws IOException {
                    String strI00IlilI0i0i;
/* 1 */             O0IiIl0il o0IiIl0il = this.I00iOIl;
/* 12 */            O0IOli0o0 o0IOli0o0 = o0IiIl0il instanceof O0IOli0o0 ? (O0IOli0o0) o0IiIl0il : null;
/* 17 */            Class clsI001l0I00 = o0IOli0o0 != null ? ((IOIO10iOi1) o0IOli0o0).I001l0I00() : null;
/* 156 */           String string = clsI001l0I00 == null ? o0IiIl0il.toString() : (this.I00iiO & 4) != 0 ? "kotlin.Nothing" : clsI001l0I00.isArray() ? clsI001l0I00.equals(boolean[].class) ? "kotlin.BooleanArray" : clsI001l0I00.equals(char[].class) ? "kotlin.CharArray" : clsI001l0I00.equals(byte[].class) ? "kotlin.ByteArray" : clsI001l0I00.equals(short[].class) ? "kotlin.ShortArray" : clsI001l0I00.equals(int[].class) ? "kotlin.IntArray" : clsI001l0I00.equals(float[].class) ? "kotlin.FloatArray" : clsI001l0I00.equals(long[].class) ? "kotlin.LongArray" : clsI001l0I00.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && clsI001l0I00.isPrimitive()) ? l0O00Ol.I00000oOI((O0IOli0o0) o0IiIl0il).getName() : clsI001l0I00.getName();
/* 160 */           List list = this.I00iiI;
/* 168 */           if (list.isEmpty()) {
/* 166 */               strI00IlilI0i0i = "";
                    } else {
/* 179 */               Oo011oIOO1 oo011oIOO1 = new Oo011oIOO1(21);
/* 182 */               VarHandle.storeStoreFence();
/* 193 */               strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i(list, ", ", "<", ">", oo011oIOO1, 24);
                    }
/* 219 */           return string + strI00IlilI0i0i + (I000lI() ? "?" : "");
                }

                @Override
                public final boolean I000lI() {
                    return (this.I00iiO & 1) != 0;
                }

                @Override
                public final List I00111O() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final O0IiIl0il I001IIilI0O() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final List I001iOo1i0O() {
/* 1 */             return Il01100l.I00iOIl;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OoOiIIi01o)) {
/* 35 */                return false;
                    }
/* 5 */             OoOiIIi01o ooOiIIi01o = (OoOiIIi01o) obj;
                    return O0000Ioio00.I0000O(this.I00iOIl, ooOiIIi01o.I00iOIl) && O0000Ioio00.I0000O(this.I00iiI, ooOiIIi01o.I00iiI) && this.I00iiO == ooOiIIi01o.I00iiO;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.I00iiO) + IIl001iO0Io.I0000oI00(this.I00iOIl.hashCode() * 31, 31, this.I00iiI);
                }

                public final String toString() {
/* 8 */             return I00000oIO(false).concat(" (Kotlin reflection is not available)");
                }
            }
