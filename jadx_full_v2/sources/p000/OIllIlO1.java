            package p000;

            import java.io.ByteArrayOutputStream;
            
/* 8 */     public final class OIllIlO1 implements IIi0O1OOO1i0 {
                public final int I00iOIl = 0;
                public IIOoOiOI I00iiI;

                public OIllIlO1(IIi0io1lIo iIi0io1lIo) {
/* 7 */             this.I00iiI = iIi0io1lIo;
                }

                public byte[] I00000oIO() throws Throwable {
                    Throwable th;
                    IIOooOII iIOooOIII010l1ol111;
                    try {
/* 5 */                 iIOooOIII010l1ol111 = ((IIi0io1lIo) this.I00iiI).I010l1ol111();
                        try {
/* 11 */                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 14 */                    io0iolo.I0000Il00O(iIOooOIII010l1ol111, byteArrayOutputStream);
/* 17 */                    byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 21 */                    iIOooOIII010l1ol111.close();
/* 24 */                    return byteArray;
                        } catch (Throwable th2) {
/* 25 */                    th = th2;
/* 30 */                    if (iIOooOIII010l1ol111 != null) {
/* 32 */                        iIOooOIII010l1ol111.close();
                            }
/* 113 */                   throw th;
                        }
                    } catch (Throwable th3) {
/* 28 */                th = th3;
/* 29 */                iIOooOIII010l1ol111 = null;
                    }
                }

                @Override
                public final IIOoOiOI I00Io1lO() {
                    switch (this.I00iOIl) {
                        case 0:
/* 13 */                    return (IIOoIilO) this.I00iiI;
                        default:
/* 8 */                     return (IIi0io1lIo) this.I00iiI;
                    }
                }

/* 9 */         public OIllIlO1() {
                }
            }
