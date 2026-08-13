            package p000;

            import java.io.Closeable;
            
            public final class Oi1001l0Il implements Closeable {
                public I0Oi111ii I00iOIl;
                public OOiIO0oi I00iiI;
                public String I00iiO;
                public int I00iio;
                public Io11ol I00ilI0I1;
                public Io1Io0OOi011 I00ilO0;
                public IoiOloi I00io1l;
                public Oi1001l0Il I00ioIO;
                public Oi1001l0Il I00l0I0l0lO1;
                public Oi1001l0Il I00l0OO0IO;
                public long I00li1OI;
                public long I00ll1;
                public IOI0oloi01 I00lli11;
                public IIi100 I00lll10;

                public final Oi10001 I00000oIO() {
/* 3 */             Oi10001 oi10001 = new Oi10001();
/* 8 */             oi10001.I00000oIO = this.I00iOIl;
/* 12 */            oi10001.I00000oOI = this.I00iiI;
/* 16 */            oi10001.I0000Il00O = this.I00iio;
/* 20 */            oi10001.I0000O = this.I00iiO;
/* 24 */            oi10001.I0000oI00 = this.I00ilI0I1;
/* 32 */            oi10001.I0001Ioi1lo = this.I00ilO0.I000OOo1O();
/* 36 */            oi10001.I000II = this.I00io1l;
/* 40 */            oi10001.I000O01llI0 = this.I00ioIO;
/* 44 */            oi10001.I000OOo1O = this.I00l0I0l0lO1;
/* 48 */            oi10001.I000OiO = this.I00l0OO0IO;
/* 52 */            oi10001.I000iOII = this.I00li1OI;
/* 56 */            oi10001.I000l1 = this.I00ll1;
/* 60 */            oi10001.I000lI = this.I00lli11;
/* 113 */           return oi10001;
                }

                @Override
                public final void close() {
/* 1 */             IoiOloi ioiOloi = this.I00io1l;
/* 3 */             if (ioiOloi != null) {
/* 5 */                 ioiOloi.close();
                    } else {
/* 11 */                I000II.I001IO000("response is not eligible for a body and must not be closed");
                    }
                }

                public final String toString() {
/* 52 */            return "Response{protocol=" + this.I00iiI + ", code=" + this.I00iio + ", message=" + this.I00iiO + ", url=" + ((IoOi01OlIl1o) this.I00iOIl.I00iiI) + '}';
                }
            }
