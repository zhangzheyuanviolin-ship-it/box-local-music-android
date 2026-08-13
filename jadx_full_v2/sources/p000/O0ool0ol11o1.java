            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class O0ool0ol11o1 implements Iterator {
                public CharSequence I00iOIl;
                public O0ooioii0o I00iiI;
                public int I00iiO;
                public O1001lIo I00iio;

                @Override
                public final boolean hasNext() {
                    return this.I00iiO < this.I00iOIl.length();
                }

                @Override
                public final Object next() {
/* 1 */             O0ooioii0o o0ooioii0o = this.I00iiI;
/* 8 */             if (!hasNext()) {
/* 89 */                IoOOl0iOl1io.I00000oOI();
/* 7 */                 return null;
                    }
/* 10 */            O1001lIo o1001lIo = this.I00iio;
/* 13 */            if (o1001lIo == null) {
/* 19 */                if (!o0ooioii0o.hasNext()) {
/* 40 */                    int length = this.I00iOIl.length();
/* 46 */                    int i = this.I00iiO;
/* 48 */                    IIOiiIi iIOiiIi = new IIOiiIi(3);
/* 51 */                    iIOiiIi.I00000oOI = i;
/* 53 */                    iIOiiIi.I0000Il00O = length;
/* 55 */                    VarHandle.storeStoreFence();
/* 58 */                    this.I00iiO = length;
/* 60 */                    return iIOiiIi;
                        }
/* 25 */                if (!o0ooioii0o.hasNext()) {
/* 34 */                    IoOOl0iOl1io.I00000oOI();
/* 7 */                     return null;
                        }
/* 27 */                o1001lIo = o0ooioii0o.I00iiI;
/* 29 */                o0ooioii0o.I00iiI = null;
/* 31 */                this.I00iio = o1001lIo;
                    }
/* 61 */            int i2 = this.I00iiO;
/* 63 */            int i3 = o1001lIo.I00000oOI;
/* 65 */            if (i2 >= i3) {
/* 84 */                this.I00iiO = o1001lIo.I0000Il00O;
/* 86 */                this.I00iio = null;
/* 88 */                return o1001lIo;
                    }
/* 69 */            IIOiiIi iIOiiIi2 = new IIOiiIi(3);
/* 72 */            iIOiiIi2.I00000oOI = i2;
/* 74 */            iIOiiIi2.I0000Il00O = i3;
/* 76 */            VarHandle.storeStoreFence();
/* 79 */            this.I00iiO = i3;
/* 81 */            return iIOiiIi2;
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException("remove");
                }
            }
