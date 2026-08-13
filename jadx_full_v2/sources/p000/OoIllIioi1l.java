            package p000;

            import java.io.Closeable;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            
/* 47 */    public class OoIllIioi1l implements IliIo0lOI, Closeable {
                public final IoiOloi I00iio;
                public HashMap I00ilI0I1;
                public int I00iOIl = -1;
                public int I00iiI = -1;
                public final HashMap I00iiO = new HashMap();
                public final ArrayList I00ilO0 = new ArrayList();

                public OoIllIioi1l(IoiOloi ioiOloi) {
/* 23 */            this.I00iio = ioiOloi;
                }

                @Override
                public final List I00000oIO() {
/* 12 */            float fI00IoiI = (1000.0f / I00IoiI()) * 0.001f;
/* 46 */            return Arrays.asList(Float.valueOf(fI00IoiI), 0, 0, Float.valueOf(fI00IoiI), 0, 0);
                }

                @Override
                public final II1i0i0ilO I0000Il00O() {
/* 1 */             Io1Iiiii0 io1Iiiii0I001i1lo1io = I001i1lo1io();
/* 5 */             short s = io1Iiiii0I001i1lo1io.I000II;
/* 7 */             short s2 = io1Iiiii0I001i1lo1io.I000OOo1O;
/* 20 */            float fI00IoiI = 1000.0f / I00IoiI();
/* 31 */            return new II1i0i0ilO(s * fI00IoiI, io1Iiiii0I001i1lo1io.I000O01llI0 * fI00IoiI, s2 * fI00IoiI, io1Iiiii0I001i1lo1io.I000OiO * fI00IoiI);
                }

                @Override
                public final boolean I000II(String str) {
                    return I00OIl(str) != 0;
                }

                @Override
                public final float I000O01llI0(String str) {
/* 9 */             return I000l1(I00OIl(str));
                }

                public final int I000l1(int i) {
/* 7 */             IoI1Iii ioI1Iii = (IoI1Iii) I00IOO("hmtx");
/* 9 */             if (ioI1Iii == null) {
/* 30 */                return 250;
                    }
/* 11 */            int[] iArr = ioI1Iii.I0001Ioi1lo;
/* 14 */            if (iArr.length == 0) {
/* 30 */                return 250;
                    }
                    return i < ioI1Iii.I000OOo1O ? iArr[i] : iArr[iArr.length - 1];
                }

                public Io0OiOiol0O I00100l0() {
/* 7 */             return (Io0OiOiol0O) I00IOO("glyf");
                }

                public final Io1Iiiii0 I001i1lo1io() {
/* 7 */             return (Io1Iiiii0) I00IOO("head");
                }

                public final int I001l0I00() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             if (i != -1) {
/* 29 */                return i;
                    }
/* 12 */            O1i0IIiliO1o o1i0IIiliO1o = (O1i0IIiliO1o) I00IOO("maxp");
/* 14 */            if (o1i0IIiliO1o == null) {
/* 22 */                this.I00iOIl = 0;
/* 21 */                return 0;
                    }
/* 16 */            int i2 = o1i0IIiliO1o.I0001Ioi1lo;
/* 18 */            this.I00iOIl = i2;
/* 20 */            return i2;
                }

                public final synchronized OlliIl0 I00IOO(String str) {
                    OlliIl0 olliIl0;
/* 8 */             olliIl0 = (OlliIl0) this.I00iiO.get(str);
/* 10 */            if (olliIl0 != null && !olliIl0.I0000O) {
/* 16 */                I00OOll1(olliIl0);
                    }
/* 23 */            return olliIl0;
                }

                public final synchronized byte[] I00IioO0OiOi(OlliIl0 olliIl0) {
                    byte[] bArrI00100l0;
/* 4 */             long jI000II = this.I00iio.I000II();
/* 12 */            this.I00iio.I00Ol00(olliIl0.I00000oOI);
/* 20 */            bArrI00100l0 = this.I00iio.I00100l0((int) olliIl0.I0000Il00O);
/* 26 */            this.I00iio.I00Ol00(jI000II);
/* 30 */            return bArrI00100l0;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IOOI0i0Io I00Io1lO() {
                    IOOIO1lI1ll iOOIO1lI1ll;
                    Io0OiI0l0Iio io0OiI0l0Iio;
/* 7 */             IOOIOIO iooioio = (IOOIOIO) I00IOO("cmap");
/* 9 */             boolean z = false;
/* 10 */            if (iooioio == null) {
/* 12 */                iOOIO1lI1ll = null;
                    } else {
/* 15 */                IOOIO1lI1ll iOOIO1lI1llI00000oOI = iooioio.I00000oOI(0, 4);
/* 20 */                if (iOOIO1lI1llI00000oOI == null) {
/* 24 */                    iOOIO1lI1llI00000oOI = iooioio.I00000oOI(3, 10);
                        }
/* 28 */                if (iOOIO1lI1llI00000oOI == null) {
/* 30 */                    iOOIO1lI1llI00000oOI = iooioio.I00000oOI(0, 3);
                        }
/* 34 */                if (iOOIO1lI1llI00000oOI == null) {
/* 37 */                    iOOIO1lI1llI00000oOI = iooioio.I00000oOI(3, 1);
                        }
/* 41 */                if (iOOIO1lI1llI00000oOI == null) {
/* 43 */                    iOOIO1lI1llI00000oOI = iooioio.I00000oOI(3, 0);
                        }
/* 47 */                if (iOOIO1lI1llI00000oOI == null) {
/* 49 */                    IOOIO1lI1ll[] iOOIO1lI1llArr = iooioio.I0001Ioi1lo;
/* 57 */                    iOOIO1lI1ll = iOOIO1lI1llArr.length > 0 ? iOOIO1lI1llArr[0] : iOOIO1lI1llI00000oOI;
                        }
                    }
/* 58 */            ArrayList arrayList = this.I00ilO0;
/* 64 */            if (arrayList.isEmpty() || (io0OiI0l0Iio = (Io0OiI0l0Iio) I00IOO("GSUB")) == null) {
/* 113 */               return iOOIO1lI1ll;
                    }
/* 78 */            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
/* 84 */            IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(27, z);
/* 87 */            ioIlOo1o0IIl.I00iiI = iOOIO1lI1ll;
/* 89 */            ioIlOo1o0IIl.I00iiO = io0OiI0l0Iio;
/* 91 */            ioIlOo1o0IIl.I00iio = listUnmodifiableList;
/* 93 */            VarHandle.storeStoreFence();
/* 96 */            return ioIlOo1o0IIl;
                }

                public final int I00IoiI() {
/* 1 */             int i = this.I00iiI;
/* 4 */             if (i != -1) {
/* 29 */                return i;
                    }
/* 6 */             Io1Iiiii0 io1Iiiii0I001i1lo1io = I001i1lo1io();
/* 10 */            if (io1Iiiii0I001i1lo1io == null) {
/* 18 */                this.I00iiI = 0;
/* 17 */                return 0;
                    }
/* 12 */            int i2 = io1Iiiii0I001i1lo1io.I0001Ioi1lo;
/* 14 */            this.I00iiI = i2;
/* 16 */            return i2;
                }

                /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00OIl(String str) throws NumberFormatException {
                    int iCodePointAt;
                    Integer num;
                    synchronized (this) {
                        try {
/* 5 */                     if (this.I00ilI0I1 == null && ((OO1o0oIoil) I00IOO("post")) != null) {
/* 25 */                        String[] strArr = ((OO1o0oIoil) I00IOO("post")).I000II;
/* 27 */                        if (strArr != null) {
/* 35 */                            this.I00ilI0I1 = new HashMap(strArr.length);
/* 39 */                            for (int i = 0; i < strArr.length; i++) {
/* 49 */                                this.I00ilI0I1.put(strArr[i], Integer.valueOf(i));
                                    }
                                } else {
/* 63 */                            this.I00ilI0I1 = new HashMap();
                                }
                            }
                        } finally {
                        }
                    }
/* 66 */            HashMap map = this.I00ilI0I1;
/* 68 */            if (map != null && (num = (Integer) map.get(str)) != null && num.intValue() > 0 && num.intValue() < ((O1i0IIiliO1o) I00IOO("maxp")).I0001Ioi1lo) {
/* 100 */               return num.intValue();
                    }
/* 112 */           if (str.startsWith("uni") && str.length() == 7) {
/* 121 */               int length = str.length();
/* 127 */               StringBuilder sb = new StringBuilder();
/* 130 */               int i2 = 3;
                        while (true) {
/* 131 */                   int i3 = i2 + 4;
/* 133 */                   if (i3 > length) {
                                break;
                            }
                            try {
/* 141 */                       int i4 = Integer.parseInt(str.substring(i2, i3), 16);
/* 148 */                       if (i4 <= 55295 || i4 >= 57344) {
/* 156 */                           sb.append((char) i4);
                                }
/* 159 */                       i2 = i3;
                            } catch (NumberFormatException unused) {
                            }
/* 171 */                   iCodePointAt = -1;
                        }
/* 161 */               String string = sb.toString();
/* 169 */               if (string.length() != 0) {
/* 173 */                   iCodePointAt = string.codePointAt(0);
                        }
                    } else {
/* 171 */               iCodePointAt = -1;
                    }
/* 177 */           if (iCodePointAt > -1) {
/* 183 */               return I00Io1lO().I000II(iCodePointAt);
                    }
/* 4 */             return 0;
                }

                public final void I00OOll1(OlliIl0 olliIl0) {
                    synchronized (this.I00iio) {
/* 6 */                 long jI000II = this.I00iio.I000II();
/* 14 */                this.I00iio.I00Ol00(olliIl0.I00000oOI);
/* 19 */                olliIl0.I00000oIO(this, this.I00iio);
/* 24 */                this.I00iio.I00Ol00(jI000II);
                    }
                }

                @Override
                public final void close() throws IOException {
/* 3 */             this.I00iio.close();
                }

                public final void finalize() throws Throwable {
/* 1 */             super.finalize();
/* 4 */             close();
                }

                @Override
                public final String getName() {
/* 7 */             OI1O0i010o oI1O0i010o = (OI1O0i010o) I00IOO("name");
/* 9 */             if (oI1O0i010o != null) {
/* 11 */                return oI1O0i010o.I000O01llI0;
                    }
/* 14 */            return null;
                }

                public final String toString() {
                    try {
/* 7 */                 OI1O0i010o oI1O0i010o = (OI1O0i010o) I00IOO("name");
                        return oI1O0i010o != null ? oI1O0i010o.I000O01llI0 : "(null)";
                    } catch (IOException e) {
/* 37 */                return "(null - " + e.getMessage() + ")";
                    }
                }

/* 48 */        public void I00Ol00(float f) {
                }
            }
