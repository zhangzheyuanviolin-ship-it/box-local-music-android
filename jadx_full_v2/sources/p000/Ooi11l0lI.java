            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.EOFException;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            
            public final class Ooi11l0lI {
                public static final Ool0oO1OIi I000iOII;
                public String I00000oIO;
                public boolean I00000oOI;
                public int I0000Il00O;
                public Ooi11o11o I0000O;
                public String I0000oI00;
                public String I0001Ioi1lo;
                public String I000II;
                public List I000O01llI0;
                public Io1O0I1i I000OOo1O;
                public I0IIiO0iI I000OiO;

                static {
/* 3 */             Ooi11l0lI ooi11l0lI = new Ooi11l0lI();
/* 8 */             Ooi11lI0l0.I00000oOI(ooi11l0lI, "http://localhost");
/* 15 */            I000iOII = ooi11l0lI.I00000oOI();
                }

                public Ooi11l0lI() throws EOFException {
/* 3 */             OIol1IIoIOoO.I00000oOI.getClass();
/* 6 */             OIol11 oIol11 = OIol11.I00000oIO;
/* 13 */            this.I00000oIO = "";
/* 16 */            this.I00000oOI = false;
/* 18 */            this.I0000Il00O = 0;
/* 21 */            this.I0000O = null;
/* 23 */            this.I0000oI00 = null;
/* 25 */            this.I0001Ioi1lo = null;
/* 27 */            Set set = IOOIli0I.I00000oIO;
/* 29 */            Charset charset = IO1IOI.I00000oIO;
/* 33 */            StringBuilder sb = new StringBuilder();
/* 40 */            III1oo00i1li iII1oo00i1liI00000oIO = ilI1olO1ol.I00000oIO(charset.newEncoder(), "", 0, 0);
/* 48 */            while (!iII1oo00i1liI00000oIO.I00II0Ol1O0l()) {
/* 54 */                while (!iII1oo00i1liI00000oIO.I00II0Ol1O0l()) {
/* 56 */                    byte b = iII1oo00i1liI00000oIO.readByte();
/* 60 */                    Byte bValueOf = Byte.valueOf(b);
/* 66 */                    if (b == 32) {
/* 70 */                        sb.append("%20");
                            } else if (IOOIli0I.I00000oIO.contains(bValueOf) || IOOIli0I.I0000Il00O.contains(bValueOf)) {
/* 100 */                       sb.append((char) b);
                            } else {
/* 95 */                        sb.append(IOOIli0I.I0001Ioi1lo(b));
                            }
                        }
                    }
/* 108 */           this.I000II = sb.toString();
/* 120 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(Il01100l.I00iOIl, 10));
/* 123 */           Il010loii1OO il010loii1OO = Il010loii1OO.I00iOIl;
/* 125 */           il010loii1OO.getClass();
/* 128 */           this.I000O01llI0 = arrayList;
/* 133 */           Io1O0I1i io1O0I1i = new Io1O0I1i(1);
/* 136 */           il010loii1OO.getClass();
/* 139 */           this.I000OOo1O = io1O0I1i;
/* 148 */           this.I000OiO = new I0IIiO0iI(io1O0I1i, 24);
                }

                public final void I00000oIO() {
/* 7 */             if (this.I00000oIO.length() <= 0 && !I0000O().I00iOIl.equals("file")) {
/* 25 */                Ool0oO1OIi ool0oO1OIi = I000iOII;
/* 29 */                this.I00000oIO = ool0oO1OIi.I00iOIl;
/* 33 */                if (this.I0000O == null) {
/* 37 */                    this.I0000O = ool0oO1OIi.I00ilO0;
                        }
/* 41 */                if (this.I0000Il00O == 0) {
/* 45 */                    I0000oI00(ool0oO1OIi.I00iiI);
                        }
                    }
                }

                public final Ool0oO1OIi I00000oOI() {
                    String strI00000oOI;
                    String strI00000oOI2;
/* 1 */             I00000oIO();
/* 6 */             Ooi11o11o ooi11o11o = this.I0000O;
/* 8 */             String str = this.I00000oIO;
/* 10 */            int i = this.I0000Il00O;
/* 12 */            List list = this.I000O01llI0;
/* 24 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 27 */            Iterator it = list.iterator();
/* 35 */            while (it.hasNext()) {
/* 47 */                arrayList.add(IOOIli0I.I0000Il00O((String) it.next()));
                    }
/* 57 */            li0IoO01I0l0.I00000oIO((Io1O0I1i) this.I000OiO.I00iiI);
/* 64 */            int i2 = 0;
/* 65 */            IOOIli0I.I0000O(0, 0, 15, this.I000II);
/* 68 */            String str2 = this.I0000oI00;
/* 71 */            if (str2 != null) {
/* 73 */                int length = str2.length();
/* 77 */                Charset charset = IO1IOI.I00000oIO;
/* 79 */                strI00000oOI = IOOIli0I.I00000oOI(str2, 0, length, false);
                    } else {
/* 84 */                strI00000oOI = null;
                    }
/* 85 */            String str3 = this.I0001Ioi1lo;
/* 87 */            if (str3 != null) {
/* 89 */                int length2 = str3.length();
/* 93 */                Charset charset2 = IO1IOI.I00000oIO;
/* 95 */                strI00000oOI2 = IOOIli0I.I00000oOI(str3, 0, length2, false);
                    } else {
/* 100 */               strI00000oOI2 = null;
                    }
/* 101 */           String strI0000Il00O = I0000Il00O();
/* 105 */           Ool0oO1OIi ool0oO1OIi = new Ool0oO1OIi();
/* 108 */           ool0oO1OIi.I00iOIl = str;
/* 110 */           ool0oO1OIi.I00iiI = i;
/* 112 */           ool0oO1OIi.I00iiO = strI00000oOI;
/* 114 */           ool0oO1OIi.I00iio = strI00000oOI2;
/* 116 */           ool0oO1OIi.I00ilI0I1 = strI0000Il00O;
/* 118 */           if (i < 0 || i >= 65536) {
/* 177 */               I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
/* 70 */                return null;
                    }
/* 124 */           ool0oO1OIi.I00ilO0 = ooi11o11o;
/* 126 */           if (ooi11o11o == null) {
/* 128 */               ooi11o11o = Ooi11o11o.I00iiO;
                    }
/* 130 */           ool0oO1OIi.I00io1l = ooi11o11o;
/* 134 */           Ool0o101l1 ool0o101l1 = new Ool0o101l1(i2);
/* 137 */           ool0o101l1.I00iiI = ool0oO1OIi;
/* 139 */           VarHandle.storeStoreFence();
/* 147 */           ool0oO1OIi.I00ioIO = new OllO00oiil(ool0o101l1);
/* 152 */           Ool0o101l1 ool0o101l12 = new Ool0o101l1(1);
/* 155 */           ool0o101l12.I00iiI = ool0oO1OIi;
/* 157 */           VarHandle.storeStoreFence();
/* 165 */           ool0oO1OIi.I00l0I0l0lO1 = new OllO00oiil(ool0o101l12);
/* 167 */           VarHandle.storeStoreFence();
/* 170 */           return ool0oO1OIi;
                }

                public final String I0000Il00O() {
/* 1 */             I00000oIO();
/* 8 */             StringBuilder sb = new StringBuilder(Barcode.FORMAT_QR_CODE);
/* 11 */            lOoo111010.I00000oIO(this, sb);
/* 14 */            return sb.toString();
                }

                public final Ooi11o11o I0000O() {
/* 1 */             Ooi11o11o ooi11o11o = this.I0000O;
/* 3 */             if (ooi11o11o != null) {
/* 29 */                return ooi11o11o;
                    }
/* 5 */             Ooi11o11o ooi11o11o2 = Ooi11o11o.I00iiO;
/* 7 */             return Ooi11o11o.I00iiO;
                }

                public final void I0000oI00(int i) {
/* 1 */             if (i < 0 || i >= 65536) {
/* 16 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
                    } else {
/* 7 */                 this.I0000Il00O = i;
                    }
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(Barcode.FORMAT_QR_CODE);
/* 8 */             lOoo111010.I00000oIO(this, sb);
/* 11 */            return sb.toString();
                }
            }
