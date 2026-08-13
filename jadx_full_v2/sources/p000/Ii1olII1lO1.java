            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ii1olII1lO1 implements IoIol1Oli, Ii0110 {
                public final int I00iOIl;
                public IoOIoo I00iiI;
                public IoO0ii1I I00iiO;
                public Ilo0Ooi I00iio;
                public Ilo0Ooi I00ilI0I1;
                public Ii00l101O I00ilO0;
                public IoIlIolo10o I00io1l;
                public Object I00ioIO;
                public Io1IoOi1IOi I00l0I0l0lO1;

                @Override
                public final Ii00l101O I00000oIO() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return this.I00ilO0;
                }

                @Override
                public final Io1IoOi1IOi I00000oOI() {
                    switch (this.I00iOIl) {
                        case 0:
/* 11 */                    return (Io1OIO1) this.I00l0I0l0lO1;
                        default:
/* 6 */                     return this.I00l0I0l0lO1;
                    }
                }

                public final IIIoloiiI1 I0000Il00O() {
                    switch (this.I00iOIl) {
                        case 0:
/* 32 */                    return (IIIoloiiI1) this.I00ioIO;
                        default:
/* 8 */                     byte[] bArr = (byte[]) this.I00ioIO;
/* 10 */                    int length = bArr.length;
/* 13 */                    III1oo00i1li iII1oo00i1li = new III1oo00i1li();
/* 16 */                    iII1oo00i1li.I001l0I00(length, bArr);
/* 21 */                    OlI1il olI1il = new OlI1il();
/* 24 */                    olI1il.I00000oOI = iII1oo00i1li;
/* 26 */                    VarHandle.storeStoreFence();
/* 29 */                    return olI1il;
                    }
                }

                public final IoOIoo I0000O() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return this.I00iiI;
                }

                public final IoIlIolo10o I00iOIl() {
                    switch (this.I00iOIl) {
                        case 0:
/* 11 */                    return this.I00io1l;
                        default:
/* 8 */                     return (OiIl1oI) this.I00io1l;
                    }
                }

                public final String toString() {
/* 36 */            return "HttpResponse[" + io0OoioI0O1.I0000Il00O(this).getUrl() + ", " + I0000O() + ']';
                }
            }
