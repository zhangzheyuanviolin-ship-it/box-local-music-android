            package p000;

            import java.io.FilterOutputStream;
            import java.io.IOException;
            
            public final class IIi0OI0 extends FilterOutputStream {
                public final IIi0io1lIo I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIi0OI0(IIi0io1lIo iIi0io1lIo, OOl1lI0oI oOl1lI0oI) {
/* 3 */             super(oOl1lI0oI);
/* 1 */             this.I00iOIl = iIi0io1lIo;
                }

                @Override
                public final void close() throws IOException {
/* 1 */             super.close();
/* 4 */             IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I01o00iOi;
/* 6 */             IIi0io1lIo iIi0io1lIo = this.I00iOIl;
/* 13 */            iIi0io1lIo.I010i10l(iIi0I0I0o, (int) iIi0io1lIo.I00iiI.I00iiO);
/* 17 */            iIi0io1lIo.I00iio = false;
                }

                @Override
                public final void write(byte[] bArr, int i, int i2) throws IOException {
/* 3 */             ((FilterOutputStream) this).out.write(bArr, i, i2);
                }
            }
