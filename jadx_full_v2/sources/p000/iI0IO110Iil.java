            package p000;
            
            public final class iI0IO110Iil extends iI01OoiIlOl {
                public iI0o1i0o I00iOIl;

                public final iI0IO110Iil I0000O() {
/* 9 */             return (iI0IO110Iil) this.I00iOIl.get("authToken");
                }

                public final iI0IoOoO0oOI I0000oI00(String str) {
/* 7 */             return (iI0IoOoO0oOI) this.I00iOIl.get(str);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj != this) {
                        return (obj instanceof iI0IO110Iil) && ((iI0IO110Iil) obj).I00iOIl.equals(this.I00iOIl);
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }
            }
