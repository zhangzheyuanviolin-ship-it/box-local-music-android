            package p000;
            
            public final class OoOO010 {
                public final O0IOli0o0 I00000oIO;
                public final O0O01O0o I00000oOI;

                public OoOO010(O0IOli0o0 o0IOli0o0, O0O01O0o o0O01O0o) {
/* 4 */             this.I00000oIO = o0IOli0o0;
/* 6 */             this.I00000oOI = o0O01O0o;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof OoOO010)) {
/* 9 */                 return false;
                    }
/* 11 */            O0O01O0o o0O01O0o = this.I00000oOI;
/* 13 */            if (o0O01O0o == null) {
/* 16 */                OoOO010 ooOO010 = (OoOO010) obj;
/* 20 */                if (ooOO010.I00000oOI == null) {
/* 27 */                    return O0000Ioio00.I0000O(this.I00000oIO, ooOO010.I00000oIO);
                        }
                    }
/* 36 */            return O0000Ioio00.I0000O(o0O01O0o, ((OoOO010) obj).I00000oOI);
                }

                public final int hashCode() {
/* 1 */             O0O01O0o o0O01O0o = this.I00000oOI;
                    return o0O01O0o != null ? o0O01O0o.hashCode() : this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("TypeInfo(");
/* 8 */             Object obj = this.I00000oOI;
/* 10 */            if (obj == null) {
/* 13 */                obj = this.I00000oIO;
                    }
/* 15 */            sb.append(obj);
/* 20 */            sb.append(')');
/* 23 */            return sb.toString();
                }
            }
