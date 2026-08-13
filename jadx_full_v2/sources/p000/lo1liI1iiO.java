            package p000;

            import java.io.FilterOutputStream;
            import java.io.IOException;
            
/* 5 */     public abstract class lo1liI1iiO extends FilterOutputStream {
                @Override
                public void write(byte[] bArr) throws IOException {
/* 3 */             ((FilterOutputStream) this).out.write(bArr);
                }

                @Override
/* 6 */         public void write(byte[] bArr, int i, int i2) throws IOException {
/* 7 */             ((FilterOutputStream) this).out.write(bArr, i, i2);
                }
            }
