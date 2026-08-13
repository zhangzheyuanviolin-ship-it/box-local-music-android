            package p000;

            import java.io.BufferedInputStream;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import javax.crypto.Cipher;
            
            public abstract class OOloOo {
                public OOlo10O1I1IO I00000oIO;
                public final I0ioOiiIO0 I00000oOI;
                public final I0ioOiiIO0 I0000Il00O;
                public final IIloOI I0000O;

                public OOloOo(I0ioOiiIO0 i0ioOiiIO0, I0ioOiiIO0 i0ioOiiIO02, IIloOI iIloOI) {
/* 4 */             this.I00000oOI = i0ioOiiIO0;
/* 6 */             this.I0000Il00O = i0ioOiiIO02;
/* 8 */             this.I0000O = iIloOI;
                }

                public final byte[] I00000oIO(OillOo0 oillOo0) throws IIOlio1ol {
                    try {
/* 7 */                 IIOlo1Ili0 iIOlo1Ili0 = (IIOlo1Ili0) I00000oOI(oillOo0).I00iOIl;
/* 9 */                 int i = IIOo0lIiilo.I00000oIO;
/* 11 */                return lOOllo00lO.I00000oIO(iIOlo1Ili0);
                    } catch (IOException e) {
/* 49 */                throw new IIOlio1ol("unable to parse internal stream: " + e.getMessage(), e);
                    }
                }

                public final Oi00IilOloo0 I00000oOI(OillOo0 oillOo0) {
/* 1 */             I0IIiO0iI i0IIiO0iII0000Il00O = I0000Il00O(oillOo0);
/* 11 */            Oi0Oooi oi0Oooi = (Oi0Oooi) this.I0000O.I00iiI;
/* 13 */            oi0Oooi.getClass();
/* 35 */            IOIIloIooI iOIIloIooI = new IOIIloIooI(new ByteArrayInputStream((byte[]) oi0Oooi.I00iiI), (Cipher) ((IIloOI) i0IIiO0iII0000Il00O.I00iiI).I00iiI);
/* 38 */            Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 54 */            oi00IilOloo0.I00iOIl = new IIOlo1Ili0(new BufferedInputStream(iOIIloIooI, 32768));
/* 186 */           return oi00IilOloo0;
                }

                public abstract I0IIiO0iI I0000Il00O(OillOo0 oillOo0);
            }
