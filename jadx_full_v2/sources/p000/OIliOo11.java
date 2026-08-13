            package p000;

            import java.io.Closeable;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Iterator;
            
            public final class OIliOo11 implements Closeable {
                public IIOolO1li I00iOIl;
                public OIliiIOOiI1l I00iiI;
                public OiOOiIO1 I00iiO;
                public HashSet I00iio;
                public IoIlOo1o0IIl I00ilI0I1;

                static {
/* 1 */             OIliI1oooi oIliI1oooi = OIliI1oooi.I00iiI;
/* 3 */             oIliI1oooi.getClass();
/* 6 */             OIlOo1Oil0 oIlOo1Oil0 = oIliI1oooi.I00iOIl;
/* 8 */             OIlOolii0I oIlOolii0I = oIlOo1Oil0.I00000oOI;
/* 10 */            float[] fArr = oIlOo1Oil0.I00000oIO;
/* 12 */            if (oIlOolii0I != null) {
/* 19 */                Arrays.copyOf(fArr, oIlOolii0I.I00000oOI());
                    }
                    try {
/* 24 */                IIi0IoOo.I00l0I0l0lO1(OIllioIilO.I01OO1I);
/* 29 */                IIi0IoOo.I00l0I0l0lO1("1");
                    } catch (IOException unused) {
                    }
                }

                public static OIliOo11 I0000Il00O(InputStream inputStream) throws IOException {
/* 4 */             O1ilIl1l0I o1ilIl1l0I = new O1ilIl1l0I(0);
/* 8 */             o1ilIl1l0I.I00iiI = true;
/* 10 */            VarHandle.storeStoreFence();
/* 15 */            OiOOiI1lllOo oiOOiI1lllOo = new OiOOiI1lllOo(o1ilIl1l0I);
                    try {
/* 20 */                OiOOiIO1 oiOOiIO1 = new OiOOiIO1(oiOOiI1lllOo);
/* 25 */                byte[] bArr = new byte[8192];
                        while (true) {
/* 27 */                    int i = inputStream.read(bArr);
/* 32 */                    if (i <= -1) {
/* 40 */                        oiOOiIO1.I000l1(0L);
/* 45 */                        OIlilIl oIlilIl = new OIlilIl(oiOOiIO1, oiOOiI1lllOo);
/* 48 */                        oIlilIl.I00IioO0OiOi();
/* 51 */                        return oIlilIl.I001lloI();
                            }
/* 34 */                    oiOOiIO1.write(bArr, 0, i);
                        }
                    } catch (IOException e) {
/* 57 */                io0iolo.I00000oOI(oiOOiI1lllOo);
/* 186 */               throw e;
                    }
                }

                public final OIliiIOOiI1l I00000oIO() {
/* 1 */             IIOolO1li iIOolO1li = this.I00iOIl;
/* 3 */             OIliiIOOiI1l oIliiIOOiI1l = this.I00iiI;
/* 5 */             if (oIliiIOOiI1l != null) {
/* 113 */               return oIliiIOOiI1l;
                    }
/* 7 */             IIOoi0ooOoO iIOoi0ooOoO = iIOolO1li.I00iio;
/* 9 */             IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I0II1Il;
/* 11 */            IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoO.I00oII(iIi0I0I0o);
/* 17 */            if (iIOoOiOII00oII instanceof IIOoi0ooOoO) {
/* 23 */                OIliiIOOiI1l oIliiIOOiI1l2 = new OIliiIOOiI1l();
/* 26 */                oIliiIOOiI1l2.I00iiO = this;
/* 28 */                oIliiIOOiI1l2.I00iiI = (IIOoi0ooOoO) iIOoOiOII00oII;
/* 30 */                VarHandle.storeStoreFence();
/* 33 */                this.I00iiI = oIliiIOOiI1l2;
/* 35 */                return oIliiIOOiI1l2;
                    }
/* 38 */            OIliiIOOiI1l oIliiIOOiI1l3 = new OIliiIOOiI1l();
/* 41 */            oIliiIOOiI1l3.I00iiO = this;
/* 45 */            IIOoi0ooOoO iIOoi0ooOoO2 = new IIOoi0ooOoO();
/* 48 */            oIliiIOOiI1l3.I00iiI = iIOoi0ooOoO2;
/* 54 */            iIOoi0ooOoO2.I010iIIOlo(IIi0I0I0o.I0IilI00l, IIi0I0I0o.I010101Oo1lO);
/* 59 */            iIOolO1li.I00iio.I010iIIOlo(iIi0I0I0o, iIOoi0ooOoO2);
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            this.I00iiI = oIliiIOOiI1l3;
/* 113 */           return oIliiIOOiI1l3;
                }

                @Override
                public final void close() throws IOException {
/* 1 */             IIOolO1li iIOolO1li = this.I00iOIl;
/* 5 */             if (iIOolO1li.I00ilO0) {
/* 113 */               return;
                    }
/* 10 */            IOException iOExceptionI00000oIO = io0iolo.I00000oIO(iIOolO1li, "COSDocument", null);
/* 14 */            OiOOiIO1 oiOOiIO1 = this.I00iiO;
/* 16 */            if (oiOOiIO1 != null) {
/* 20 */                iOExceptionI00000oIO = io0iolo.I00000oIO(oiOOiIO1, "RandomAccessRead pdfSource", iOExceptionI00000oIO);
                    }
/* 26 */            Iterator it = this.I00iio.iterator();
/* 34 */            while (it.hasNext()) {
/* 44 */                iOExceptionI00000oIO = io0iolo.I00000oIO((OoIllIioi1l) it.next(), "TrueTypeFont", iOExceptionI00000oIO);
                    }
/* 49 */            if (iOExceptionI00000oIO != null) {
/* 52 */                throw iOExceptionI00000oIO;
                    }
                }
            }
