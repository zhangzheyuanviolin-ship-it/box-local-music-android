            package p000;
            
            public final class i0IOo0liO01I {
                public final Object I00000oIO;
                public final Object I00000oOI;
                public final Object I0000Il00O;

                public i0IOo0liO01I(Object obj, Object obj2, Object obj3) {
/* 4 */             this.I00000oIO = obj;
/* 6 */             this.I00000oOI = obj2;
/* 8 */             this.I0000Il00O = obj3;
                }

                public final IllegalArgumentException I00000oIO() {
/* 3 */             Object obj = this.I00000oIO;
/* 5 */             String strValueOf = String.valueOf(obj);
/* 11 */            String strValueOf2 = String.valueOf(this.I00000oOI);
/* 39 */            return new IllegalArgumentException(IIlIOloOOO.I0010I0i(IIl001iO0Io.I00111O("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.I0000Il00O)));
                }
            }
