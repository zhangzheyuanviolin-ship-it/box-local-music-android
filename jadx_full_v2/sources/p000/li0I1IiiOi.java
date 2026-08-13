            package p000;
            
            public final class li0I1IiiOi extends li1OooOo0OO {
                public volatile boolean I00ilI0I1;
                public boolean I00ilO0;

                @Override
                public final Object I00000oIO() {
/* 3 */             return Boolean.valueOf(this.I00ilO0);
                }

                @Override
                public final Object I00000oOI(String str) {
/* 5 */             return Boolean.valueOf(Boolean.parseBoolean(str));
                }

                @Override
                public final Object I0000Il00O(Object obj) {
/* 1 */             return (Boolean) obj;
                }

                @Override
                public final Object I0000O() {
/* 3 */             return Boolean.valueOf(this.I00ilI0I1);
                }

                @Override
                public final void I0000oI00(Object obj) {
/* 7 */             this.I00ilI0I1 = ((Boolean) obj).booleanValue();
                }
            }
