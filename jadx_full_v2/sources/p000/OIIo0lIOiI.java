            package p000;

            import p000.O01lo1il;
            
            public final class OIIo0lIOiI extends O011ioiO1OI {
                private final O011ioiO1OI delegate;

                public OIIo0lIOiI(O011ioiO1OI o011ioiO1OI) {
/* 4 */             this.delegate = o011ioiO1OI;
                }

                public O011ioiO1OI delegate() {
/* 1 */             return this.delegate;
                }

                @Override
                public Object fromJson(O01lo1il o01lo1il) {
/* 7 */             if (o01lo1il.peek() != O01lo1il.I00000oOI.NULL) {
/* 11 */                return this.delegate.fromJson(o01lo1il);
                    }
/* 22 */            IoOOl0iOl1io.I000oI1ioi("Unexpected null at ", o01lo1il.getPath());
/* 25 */            return null;
                }

                @Override
                public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) {
/* 1 */             if (obj != null) {
/* 5 */                 this.delegate.toJson(o01ooIO00oio, obj);
                    } else {
/* 15 */                IoOOl0iOl1io.I000oI1ioi("Unexpected null at ", o01ooIO00oio.getPath());
                    }
                }

                public String toString() {
/* 16 */            return this.delegate + ".nonNull()";
                }
            }
