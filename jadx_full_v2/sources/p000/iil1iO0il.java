            package p000;
            
            public final class iil1iO0il extends iOo1ilioooI0 {
                public Object I00iOIl;

                @Override
                public final Object I00000oIO(Integer num) {
/* 1 */             return this.I00iOIl;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof iil1iO0il) {
/* 11 */                return this.I00iOIl.equals(((iil1iO0il) obj).I00iOIl);
                    }
/* 16 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.I00iOIl.hashCode() + 1502476572;
                }

                public final String toString() {
/* 3 */             String string = this.I00iOIl.toString();
/* 22 */            return IIlIOloOOO.I0010I0i(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
                }
            }
