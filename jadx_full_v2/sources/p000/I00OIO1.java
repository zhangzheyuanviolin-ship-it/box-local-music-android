            package p000;

            import java.io.IOException;
            
/* 27 */    public abstract class I00OIO1 extends I00IoO0 {
                public static I00OIO1 I00111O(byte[] bArr) throws IOException {
/* 3 */             I00Io1o110i i00Io1o110i = new I00Io1o110i(bArr);
                    try {
/* 6 */                 I00OIO1 i00oio1I000l1 = i00Io1o110i.I000l1();
/* 14 */                if (i00Io1o110i.available() == 0) {
/* 16 */                    return i00oio1I000l1;
                        }
/* 24 */                throw new IOException("Extra data detected in stream");
                    } catch (ClassCastException unused) {
/* 27 */                IioIoO10iOiI.I000OOo1O("cannot recognise object in stream");
/* 30 */                return null;
                    }
                }

                public abstract boolean I000o00OoI0I(I00OIO1 i00oio1);

                public abstract void I000oI1ioi(O1OIll00i o1OIll00i, boolean z);

                public abstract boolean I00100o1O0lo();

                public abstract int I0010I0i(boolean z);

                public final boolean I0010o(I00OIO1 i00oio1) {
                    return this == i00oio1 || I000o00OoI0I(i00oio1);
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 20 */                return true;
                    }
                    return (obj instanceof I00IO1oi11O) && I000o00OoI0I(((I00IO1oi11O) obj).I0000O());
                }

                @Override
                public abstract int hashCode();

                @Override
/* 28 */        public final I00OIO1 I0000O() {
/* 29 */            return this;
                }

/* 28 */        public I00OIO1 I001IIilI0O() {
/* 29 */            return this;
                }

/* 28 */        public I00OIO1 I001IO000() {
/* 29 */            return this;
                }
            }
