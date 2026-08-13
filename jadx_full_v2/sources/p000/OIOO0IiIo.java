            package p000;

            import p000.O01lo1il;
            
            public final class OIOO0IiIo extends O011ioiO1OI {
                private final O011ioiO1OI delegate;

                public OIOO0IiIo(O011ioiO1OI o011ioiO1OI) {
/* 4 */             this.delegate = o011ioiO1OI;
                }

                public O011ioiO1OI delegate() {
/* 1 */             return this.delegate;
                }

                @Override
                public Object fromJson(O01lo1il o01lo1il) {
                    return o01lo1il.peek() == O01lo1il.I00000oOI.NULL ? o01lo1il.nextNull() : this.delegate.fromJson(o01lo1il);
                }

                @Override
                public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 o01ooIO00oio.nullValue();
                    } else {
/* 9 */                 this.delegate.toJson(o01ooIO00oio, obj);
                    }
                }

                public String toString() {
/* 16 */            return this.delegate + ".nullSafe()";
                }
            }
